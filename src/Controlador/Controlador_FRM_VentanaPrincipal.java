package Controlador;

import Modelo.MetodosNodos;
import Vista.FRM_VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador_FRM_VentanaPrincipal implements ActionListener {

    FRM_VentanaPrincipal ventana;
    MetodosNodos metodos;

    public Controlador_FRM_VentanaPrincipal(FRM_VentanaPrincipal ventana) {
        this.ventana = ventana;
        metodos = new MetodosNodos();

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Entregar ficha")) {
            this.metodos.crear(this.ventana.devolverCedulaCita(), this.ventana.devolverNombre(), this.ventana.devolverEdad(), this.ventana.devolverFecha(), this.ventana.devolverPrioridad());
            this.ventana.imprimirEnEntregarFicha(this.metodos.imprimir());
            System.out.println("" + this.ventana.devolverPrioridad());
            this.ventana.imprimirEnPromedioEdadDeLaCola(this.metodos.promedioEdad());
            this.ventana.imprimirEnInformacionDeLaCola(this.metodos.imprimirClientes());
        }
        if (e.getActionCommand().equals("Llamar Cliente")) {
            System.out.println("Llamar Cliente");
            this.ventana.imprimirEnLlamarCliente(this.metodos.imprimirCliente());
            this.metodos.eliminarPrimero();
            this.ventana.imprimirEnEntregarFicha(this.metodos.imprimir());
        }
        if (e.getActionCommand().equals("Cancelar")) {
            this.metodos.eliminar(this.ventana.devolverCedulaAEliminar());
            this.ventana.imprimirEnEntregarFicha(this.metodos.imprimir());
            this.ventana.imprimirEnInformacionDeLaCola(this.metodos.imprimirClientes());
        }
        if (e.getActionCommand().equals("Modificar")) {
            System.out.println("Modificar");
            this.metodos.modificar(this.ventana.devolverArreglo());
            this.ventana.imprimirEnInformacionDeLaCola(this.metodos.imprimirClientes());
        }
        if (e.getActionCommand().equals(">")) {
            System.out.println(">");
            this.metodos.ordenarMayorAMenor();
            this.ventana.imprimirEnEntregarFicha(this.metodos.imprimir());
            this.ventana.imprimirEnInformacionDeLaCola(this.metodos.imprimirClientes());
        }
        if (e.getActionCommand().equals("<")) {
            System.out.println("<");
            this.metodos.ordenarMenorAMayor();
            this.ventana.imprimirEnEntregarFicha(this.metodos.imprimir());
            this.ventana.imprimirEnInformacionDeLaCola(this.metodos.imprimirClientes());
        }
    }

}
