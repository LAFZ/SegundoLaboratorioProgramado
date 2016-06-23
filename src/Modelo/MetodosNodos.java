/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Hogar
 */
public class MetodosNodos {

    Nodo principal;

    public MetodosNodos() {

    }

    public void crear(String numeroCedula, String nombre, String edad, String fechaCita, String prioridad) {
        if (principal == null) {
            principal = new Nodo(numeroCedula, nombre, edad, fechaCita, prioridad, null);
        } else {
            if (Integer.parseInt(edad) >= 65) {
                Nodo aux;
                aux = new Nodo(numeroCedula, nombre, edad, fechaCita, prioridad, null);
                aux.siguiente = principal;
                principal = aux;
            } else if (prioridad == "Normal") {
                agregarAlFinal(numeroCedula, nombre, edad, fechaCita, prioridad);
            } else if (prioridad == "Ley 7600") {
                Nodo aux;
                aux = new Nodo(numeroCedula, nombre, edad, fechaCita, prioridad, null);
                aux.siguiente = principal;
                principal = aux;
            }
        }
    }

    public String imprimir() {
        String valores = "";
        Nodo temporal = principal;
        if (principal != null) {
            while (temporal.getSiguiente() != null) {
                valores += "" + temporal.getNumeroCedula() + "\n";
                temporal = temporal.getSiguiente();
            }
        } else {
            valores = "";
        }
        valores += "" + temporal.getNumeroCedula() + "\n";
        return valores;
    }

    public String imprimirCliente() {
        String valores = "";
        String cedula = "";
        String nombre = "";
        String edad = "";
        String fecha = "";
        String prioridad = "";
        int contador = 0;
        Nodo temporal = principal;
        while (temporal != null && contador != 1) {
            contador = 1;
            cedula = "Cedula " + temporal.getNumeroCedula() + "\n";
            nombre = "Nombre " + temporal.getNombre() + "\n";
            edad = "Edad " + temporal.getEdad() + "\n";
            fecha = "Fecha de cita " + temporal.getFechaCita() + "\n";
            prioridad = "Prioridad " + temporal.getPrioridad() + "\n";
            valores = cedula + nombre + edad + fecha + prioridad;
            temporal = temporal.getSiguiente();
        }
        return valores;
    }

    public String imprimirClientes() {
        String valores = "";
        Nodo temporal = principal;
        if (principal != null) {
            if (principal.getSiguiente() == null) {
                valores += "Cedula: " + temporal.getNumeroCedula() + "\n";
                valores += "Nombre: " + temporal.getNombre() + "\n";
                valores += "Edad: " + temporal.getEdad() + "\n";
                valores += "Fecha cita: " + temporal.getFechaCita() + "\n";
                valores += "Prioridad: " + temporal.getPrioridad() + "\n";
                temporal = temporal.getSiguiente();
            } else {
                while (temporal != null) {
                    valores += "\nCedula: " + temporal.getNumeroCedula() + "\n";
                    valores += "Nombre: " + temporal.getNombre() + "\n";
                    valores += "Edad: " + temporal.getEdad() + "\n";
                    valores += "Fecha cita: " + temporal.getFechaCita() + "\n";
                    valores += "Prioridad: " + temporal.getPrioridad() + "\n";
                    temporal = temporal.getSiguiente();
                }
            }
        } else {
            valores = "";
        }

        return valores;
    }

    public void eliminarPrimero() {
        Nodo auxiliar = principal.getSiguiente();
        principal = auxiliar;
    }

    public void agregarAlFinal(String numeroCedula, String nombre, String edad, String fechaCita, String prioridad) {

        if (principal.getSiguiente() == null) {
            Nodo temporal = principal;
            temporal.setSiguiente(new Nodo(numeroCedula, nombre, edad, fechaCita, prioridad, null));
        } else {
            Nodo temporal = devolverUltimoNodo();
            temporal.setSiguiente(new Nodo(numeroCedula, nombre, edad, fechaCita, prioridad, null));
        }
    }

    public Nodo devolverUltimoNodo() {
        Nodo temporal = principal;

        while (temporal.getSiguiente() != null) {
            temporal = temporal.getSiguiente();
        }
        return temporal;
    }

    public void modificar(String[] arreglo) {
        Nodo temporal = principal;
        while (!temporal.getNumeroCedula().equals(arreglo[0])) {
            temporal = temporal.getSiguiente();
        }//numeroCedula, nombre, edad, fechaCita, prioridad,
        temporal.setNombre(arreglo[1]);
        temporal.setEdad(arreglo[2]);
        temporal.setFechaCita(arreglo[3]);
        temporal.setPrioridad(arreglo[4]);
    }

    public void eliminar(String numeroCedulaEliminar) {

        Nodo auxiliar = principal;
        boolean haEliminado = false;
        if (auxiliar.numeroCedula.equals(numeroCedulaEliminar)) {
            auxiliar = principal.siguiente;
            haEliminado = true;
        } else {
            auxiliar = devolverUltimoNodo();
            if (auxiliar.numeroCedula.equals(numeroCedulaEliminar)) {
                auxiliar = devolverAntepenultimoNodo();
                auxiliar.siguiente = null;
                haEliminado = true;
            }
        }
        if (!haEliminado) {
            Nodo temporal;
            auxiliar = devolverNodoAnterior(numeroCedulaEliminar);
            temporal = auxiliar.siguiente.siguiente;
            auxiliar.siguiente = temporal;
        }

    }

    public Nodo devolverAntepenultimoNodo() {
        Nodo auxiliar = principal;
        while (auxiliar.siguiente.siguiente != null) {
            auxiliar = auxiliar.siguiente;
        }
        return auxiliar;
    }

    public Nodo devolverNodoAnterior(String numeroCedulaBuscar) {
        Nodo auxiliar = principal;
        if (auxiliar.siguiente != null) {
            while (auxiliar.siguiente.numeroCedula.equals(numeroCedulaBuscar)) {
                auxiliar = auxiliar.siguiente;
            }
        }
        return auxiliar;
    }

    public void ordenarMayorAMenor() {
        int cantidadNodos = devolverCantidadNodos();
        String numeroCedulaTemporal;
        String nombreTemporal;
        String edadTemporal;
        String fechaTemporal;
        String prioridadTemporal;
        Nodo auxiliar = principal;
        for (int contador = 0; contador < cantidadNodos; contador++) {
            auxiliar = principal;
            while (auxiliar.siguiente != null) {
                if (Integer.parseInt(auxiliar.getEdad()) < Integer.parseInt(auxiliar.siguiente.getEdad())) {
                    numeroCedulaTemporal = auxiliar.numeroCedula;
                    nombreTemporal = auxiliar.nombre;
                    edadTemporal = auxiliar.edad;
                    fechaTemporal = auxiliar.fechaCita;
                    prioridadTemporal = auxiliar.prioridad;
                    auxiliar.numeroCedula = auxiliar.siguiente.numeroCedula;
                    auxiliar.nombre = auxiliar.siguiente.nombre;
                    auxiliar.edad = auxiliar.siguiente.edad;
                    auxiliar.fechaCita = auxiliar.siguiente.fechaCita;

                    auxiliar.siguiente.setDatos(numeroCedulaTemporal, nombreTemporal, edadTemporal, fechaTemporal, prioridadTemporal);
                }
                auxiliar = auxiliar.siguiente;
            }
        }
    }

    public void ordenarMenorAMayor() {
        int cantidadNodos = devolverCantidadNodos();
        String numeroCedulaTemporal;
        String nombreTemporal;
        String edadTemporal;
        String fechaTemporal;
        String prioridadTemporal;
        Nodo auxiliar = principal;
        for (int contador = 0; contador < cantidadNodos; contador++) {
            auxiliar = principal;
            while (auxiliar.siguiente != null) {
                if (Integer.parseInt(auxiliar.getEdad()) > Integer.parseInt(auxiliar.siguiente.getEdad())) {
                    numeroCedulaTemporal = auxiliar.numeroCedula;
                    nombreTemporal = auxiliar.nombre;
                    edadTemporal = auxiliar.edad;
                    fechaTemporal = auxiliar.fechaCita;
                    prioridadTemporal = auxiliar.prioridad;
                    auxiliar.numeroCedula = auxiliar.siguiente.numeroCedula;
                    auxiliar.nombre = auxiliar.siguiente.nombre;
                    auxiliar.edad = auxiliar.siguiente.edad;
                    auxiliar.fechaCita = auxiliar.siguiente.fechaCita;

                    auxiliar.siguiente.setDatos(numeroCedulaTemporal, nombreTemporal, edadTemporal, fechaTemporal, prioridadTemporal);
                }
                auxiliar = auxiliar.siguiente;
            }
        }
    }

    public String promedioEdad() {
        int cantidadNodos = devolverCantidadNodos();
        int sumaEdades = 0;
        int promedio = 0;
        String texto = "";
        Nodo auxiliar = principal;
        for (int contador = 0; contador < cantidadNodos; contador++) {
            auxiliar = principal;
            if (principal.siguiente == null) {
                sumaEdades += Integer.parseInt(auxiliar.getEdad());
            } else {
                while (auxiliar != null) {
                    sumaEdades += Integer.parseInt(auxiliar.getEdad());
                }
            }
        }
        if (sumaEdades != 0) {
            promedio = sumaEdades / cantidadNodos;
        }
        texto = "Promedio de Edades: \n" + promedio;
        return texto;
    }

    public int devolverCantidadNodos() {
        int contador = 1;
        Nodo auxiliar = principal;
        while (auxiliar.siguiente != null) {
            contador++;
            auxiliar = auxiliar.siguiente;
        }

        return contador;
    }
}
