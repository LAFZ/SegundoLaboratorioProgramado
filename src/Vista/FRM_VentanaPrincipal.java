/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador_FRM_VentanaPrincipal;

public class FRM_VentanaPrincipal extends javax.swing.JFrame {

    Controlador_FRM_VentanaPrincipal controlador;

    public FRM_VentanaPrincipal() {
        initComponents();
        this.controlador = new Controlador_FRM_VentanaPrincipal(this);
        agregarEventos();
        cargarPrioridad();
    }

    public void agregarEventos() {
        this.jb_EntregarFicha.addActionListener(controlador);
        this.jb_LlamarCliente.addActionListener(controlador);
        this.jb_Cancelar.addActionListener(controlador);
        this.jb_MayorAMenor.addActionListener(controlador);
        this.jb_MenorAMayor.addActionListener(controlador);
        this.jb_Modificar.addActionListener(controlador);
    }

    public void limpiarInterfaz() {
        this.jtf_Edad.setText("");
        this.jtf_Nombre.setText("");
        this.jtf_Cedula.setText("");
    }

    public void cargarPrioridad() {
        this.jcb_Prioridad.removeAllItems();
        this.jcb_Prioridad.addItem("Normal");
        this.jcb_Prioridad.addItem("Ley 7600");
    }

    public String devolverEdad() {
        return this.jtf_Edad.getText();
    }

    public String devolverNombre() {
        return this.jtf_Nombre.getText();
    }

    public String devolverCedulaCita() {
        return this.jtf_Cedula.getText();
    }

    public String devolverCedulaAEliminar() {
        return this.jtf_cedulaCancelar.getText();
    }

    public String devolverCedulaAModificar() {
        return this.jtf_cedulaModificar.getText();
    }

    public String devolverPrioridad() {
        String valor;
        if (this.jcb_Prioridad.getSelectedIndex() == 0) {
            valor = "Normal";
        } else {
            valor = "Ley 7600";
        }
        return valor;
    }

    public String[] devolverArreglo() {
        //numeroCedula, nombre, edad, fechaCita, prioridad,
        String[] arreglo;
        arreglo = new String[5];
        arreglo[0] = this.devolverCedulaAModificar();
        arreglo[1] = this.devolverNombre();
        arreglo[2] = this.devolverEdad();
        arreglo[3] = this.devolverFecha();
        arreglo[4] = this.devolverPrioridad();

        return arreglo;
    }

    public String devolverFecha() {
        return this.jt_FechaCita.getText();
    }

    public void imprimirEnEntregarFicha(String texto) {
        this.jta_CantidadPersonasEnCola.setText(texto);
    }

    public void imprimirEnLlamarCliente(String texto) {
        this.jta_LlamarCliente.setText(texto);
    }

    public void imprimirEnInformacionDeLaCola(String texto) {
        this.jta_InformacionDeLaCola.setText(texto);
    }

    public void imprimirEnPromedioEdadDeLaCola(String texto) {
        this.jta_PromedioEdad.setText(texto);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtf_Edad = new javax.swing.JTextField();
        jtf_Nombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtf_cedulaModificar = new javax.swing.JTextField();
        jtf_cedulaCancelar = new javax.swing.JTextField();
        jtf_Cedula = new javax.swing.JTextField();
        jcb_Prioridad = new javax.swing.JComboBox();
        jb_MenorAMayor = new javax.swing.JButton();
        jb_MayorAMenor = new javax.swing.JButton();
        jb_LlamarCliente = new javax.swing.JButton();
        jb_EntregarFicha = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jta_PromedioEdad = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jta_InformacionDeLaCola = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jta_LlamarCliente = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta_CantidadPersonasEnCola = new javax.swing.JTextArea();
        jt_FechaCita = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jb_Modificar = new javax.swing.JButton();
        jb_Cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(820, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel2.setText("Edad:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel3.setText("Fecha de cita:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel4.setText("Prioridad:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel5.setText("Numero de cedula:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));
        getContentPane().add(jtf_Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 230, -1));
        getContentPane().add(jtf_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 230, -1));

        jLabel7.setText("Cita a modificar:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, -1));
        getContentPane().add(jtf_cedulaModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 170, -1));
        getContentPane().add(jtf_cedulaCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 170, -1));
        getContentPane().add(jtf_Cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 230, -1));

        jcb_Prioridad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jcb_Prioridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 230, -1));

        jb_MenorAMayor.setText("Ordenar Menor a Mayor");
        jb_MenorAMayor.setActionCommand("<");
        getContentPane().add(jb_MenorAMayor, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, -1, -1));

        jb_MayorAMenor.setText("Ordenar Mayor a Menor");
        jb_MayorAMenor.setActionCommand(">");
        getContentPane().add(jb_MayorAMenor, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, -1, -1));

        jb_LlamarCliente.setText("Llamar Cliente");
        getContentPane().add(jb_LlamarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, -1));

        jb_EntregarFicha.setText("Entregar ficha");
        getContentPane().add(jb_EntregarFicha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jta_PromedioEdad.setColumns(20);
        jta_PromedioEdad.setRows(5);
        jScrollPane4.setViewportView(jta_PromedioEdad);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, 180, 140));

        jta_InformacionDeLaCola.setColumns(20);
        jta_InformacionDeLaCola.setRows(5);
        jScrollPane3.setViewportView(jta_InformacionDeLaCola);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 180, 140));

        jta_LlamarCliente.setColumns(20);
        jta_LlamarCliente.setRows(5);
        jScrollPane2.setViewportView(jta_LlamarCliente);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 180, 140));

        jta_CantidadPersonasEnCola.setColumns(20);
        jta_CantidadPersonasEnCola.setRows(5);
        jScrollPane1.setViewportView(jta_CantidadPersonasEnCola);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 180, 140));
        getContentPane().add(jt_FechaCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 230, -1));

        jLabel6.setText("Cita a cancelar:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, -1, -1));

        jb_Modificar.setText("Modificar");
        getContentPane().add(jb_Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 80, -1, -1));

        jb_Cancelar.setText("Cancelar");
        getContentPane().add(jb_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FRM_VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton jb_Cancelar;
    private javax.swing.JButton jb_EntregarFicha;
    private javax.swing.JButton jb_LlamarCliente;
    private javax.swing.JButton jb_MayorAMenor;
    private javax.swing.JButton jb_MenorAMayor;
    private javax.swing.JButton jb_Modificar;
    private javax.swing.JComboBox jcb_Prioridad;
    private javax.swing.JTextField jt_FechaCita;
    private javax.swing.JTextArea jta_CantidadPersonasEnCola;
    private javax.swing.JTextArea jta_InformacionDeLaCola;
    private javax.swing.JTextArea jta_LlamarCliente;
    private javax.swing.JTextArea jta_PromedioEdad;
    private javax.swing.JTextField jtf_Cedula;
    private javax.swing.JTextField jtf_Edad;
    private javax.swing.JTextField jtf_Nombre;
    private javax.swing.JTextField jtf_cedulaCancelar;
    private javax.swing.JTextField jtf_cedulaModificar;
    // End of variables declaration//GEN-END:variables
}