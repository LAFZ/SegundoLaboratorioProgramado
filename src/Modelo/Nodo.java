package Modelo;

public class Nodo {

    String numeroCedula;
    String edad;
    String fechaCita;
    String prioridad;
    Nodo siguiente;
    String nombre;

    public Nodo(String numeroCedula, String nombre, String edad, String fechaCita, String prioridad, Nodo siguiente) {
        this.numeroCedula = numeroCedula;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaCita = fechaCita;
        this.prioridad = prioridad;
        this.siguiente = siguiente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroCedula() {
        return numeroCedula;
    }

    public void setNumeroCedula(String numeroCedula) {
        this.numeroCedula = numeroCedula;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(String fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public void setDatos(String numeroCedula, String nombre, String edad, String fechaCita, String prioridad) {
        this.numeroCedula = numeroCedula;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaCita = fechaCita;
        this.prioridad = prioridad;
    }
}
