package interfaces;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/**
 *
 * @author usuar
 */
public class Clientes extends javax.swing.JFrame {

    /**
     * Creates new form clientes
     */
    public Clientes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
//    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();
        Registro = new javax.swing.JLabel();
        IdClientes = new javax.swing.JLabel();
        ColocarCLiente = new javax.swing.JTextField();
        cedula = new javax.swing.JLabel();
        ingrecedula = new javax.swing.JTextField();
        Nombre = new javax.swing.JLabel();
        INgresarnombre = new javax.swing.JTextField();
        Apellido = new javax.swing.JLabel();
        Ingresarapellido = new javax.swing.JTextField();
        Direccion = new javax.swing.JLabel();
        ingresardireccion = new javax.swing.JTextField();
        telefono = new javax.swing.JLabel();
        Ingresarteléfono = new javax.swing.JTextField();
        ingresar = new javax.swing.JButton();
        GUARDAR = new javax.swing.JButton();
        ACTUALIZAR = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Salir.setBackground(new java.awt.Color(255, 0, 0));
        Salir.setText("X");
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, -1, -1));

        Registro.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Registro.setForeground(new java.awt.Color(255, 255, 255));
        Registro.setText("Registro De Clientes");
        getContentPane().add(Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 250, 30));

        IdClientes.setBackground(new java.awt.Color(51, 255, 255));
        IdClientes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        IdClientes.setForeground(new java.awt.Color(255, 255, 255));
        IdClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IdClientes.setText("IDClientes");
        getContentPane().add(IdClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 70, 20));
        getContentPane().add(ColocarCLiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 320, 20));

        cedula.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cedula.setForeground(new java.awt.Color(255, 255, 255));
        cedula.setText("Cédula");
        getContentPane().add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 60, 20));
        getContentPane().add(ingrecedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 320, 20));

        Nombre.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Nombre.setForeground(new java.awt.Color(255, 255, 255));
        Nombre.setText("Nombre");
        getContentPane().add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 60, 20));
        getContentPane().add(INgresarnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 320, 20));

        Apellido.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Apellido.setForeground(new java.awt.Color(255, 255, 255));
        Apellido.setText("Apellido");
        getContentPane().add(Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 60, 20));
        getContentPane().add(Ingresarapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 320, 20));

        Direccion.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Direccion.setForeground(new java.awt.Color(255, 255, 255));
        Direccion.setText("Dirección");
        getContentPane().add(Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 70, 20));
        getContentPane().add(ingresardireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 320, 20));

        telefono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        telefono.setForeground(new java.awt.Color(255, 255, 255));
        telefono.setText("Teléfono");
        getContentPane().add(telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 70, 20));
        getContentPane().add(Ingresarteléfono, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 320, -1));

        ingresar.setBackground(new java.awt.Color(51, 255, 0));
        ingresar.setText("INGRESAR");
        getContentPane().add(ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 90, 50));

        GUARDAR.setBackground(new java.awt.Color(102, 0, 255));
        GUARDAR.setText("GUARDAR");
        getContentPane().add(GUARDAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 90, 50));

        ACTUALIZAR.setBackground(new java.awt.Color(0, 51, 255));
        ACTUALIZAR.setText("ACTUALIZAR");
        getContentPane().add(ACTUALIZAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 90, 50));

        Eliminar.setBackground(new java.awt.Color(255, 0, 0));
        Eliminar.setText("ELIMINAR");
        getContentPane().add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 90, 50));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clienteeesssss.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 545, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
////
     * @param args */
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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ACTUALIZAR;
    private javax.swing.JLabel Apellido;
    private javax.swing.JTextField ColocarCLiente;
    private javax.swing.JLabel Direccion;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton GUARDAR;
    private javax.swing.JTextField INgresarnombre;
    private javax.swing.JLabel IdClientes;
    private javax.swing.JTextField Ingresarapellido;
    private javax.swing.JTextField Ingresarteléfono;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Registro;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel cedula;
    private javax.swing.JLabel fondo;
    private javax.swing.JTextField ingrecedula;
    private javax.swing.JButton ingresar;
    private javax.swing.JTextField ingresardireccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel telefono;
    // End of variables declaration//GEN-END:variables
}
