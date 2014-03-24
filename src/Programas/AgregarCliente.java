/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Programas;

import Clases.ConeccionBD;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.KeyEvent;
import Programas.Cliente;


/**
 *
 * @author Ruben
 */
public class AgregarCliente extends javax.swing.JDialog {
private ConeccionBD bd;
  private ResultSet rs;
   private boolean error;
   private Cliente cliente;
    /**
     * Creates new form AgregarCliente
     */
    public AgregarCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        txtnroSocio.setEnabled(false);
        txtnroSocio.setOpaque(false);
        genCod();
        
        bd = new ConeccionBD();
           if (bd.estaConectado()) {

             
            
    }else{
            JOptionPane.showMessageDialog(null,"Hubo un problema con la conexión ","Bienvenido",JOptionPane.INFORMATION_MESSAGE);
        
        
        
    }
        
        
        ocultarAvisosDeError();
        habilitarboton();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlblErrorAgregarCI1 = new javax.swing.JLabel();
        jlblErrorAgregarCI2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtcedula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtnombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtapellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbsocios = new javax.swing.JComboBox();
        cmbsexo = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jlblErrorAgregarCI = new javax.swing.JLabel();
        jlblErrorAgregarNombres = new javax.swing.JLabel();
        jlblErrorAgregarApellido = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        txtnroSocio = new javax.swing.JTextField();

        jlblErrorAgregarCI1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlblErrorAgregarCI1.setForeground(new java.awt.Color(255, 0, 0));
        jlblErrorAgregarCI1.setText("* Este campo no puede dejarse en blanco");

        jlblErrorAgregarCI2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlblErrorAgregarCI2.setForeground(new java.awt.Color(255, 0, 0));
        jlblErrorAgregarCI2.setText("* Este campo no puede dejarse en blanco");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Imagenes/icon_45.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSeparator1.setBackground(new java.awt.Color(255, 153, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 153, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        txtcedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcedulaActionPerformed(evt);
            }
        });
        txtcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcedulaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcedulaKeyTyped(evt);
            }
        });

        jLabel3.setText("Cedula Cliente");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setMinimumSize(new java.awt.Dimension(100, 10));

        jLabel4.setText("Nombre Cliente");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setMinimumSize(new java.awt.Dimension(100, 10));

        jLabel5.setText("Apellido Cliente");

        cmbsocios.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Socios", "No Socios" }));

        cmbsexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Femenino" }));

        jLabel6.setText("Tipo de Cliente");

        jLabel7.setText("Sexo CLiente");

        jlblErrorAgregarCI.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlblErrorAgregarCI.setForeground(new java.awt.Color(255, 0, 0));
        jlblErrorAgregarCI.setText("* Este campo no puede dejarse en blanco");

        jlblErrorAgregarNombres.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlblErrorAgregarNombres.setForeground(new java.awt.Color(255, 0, 0));
        jlblErrorAgregarNombres.setText("*Este campo no puede dejarse en blanco");

        jlblErrorAgregarApellido.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlblErrorAgregarApellido.setForeground(new java.awt.Color(255, 0, 0));
        jlblErrorAgregarApellido.setText("*Este campo no puede dejarse en blanco");

        jLabel8.setText("Direccion");

        jLabel9.setText("Telefono");

        jLabel10.setText("Correo");

        btnguardar.setBackground(new java.awt.Color(0, 204, 204));
        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Imagenes/Save.png"))); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btncancelar.setBackground(new java.awt.Color(255, 0, 51));
        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Imagenes/Back.png"))); // NOI18N
        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        txtnroSocio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtnroSocio.setBorder(javax.swing.BorderFactory.createTitledBorder("N° Socio"));
        txtnroSocio.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtnroSocio)
                                .addGap(462, 462, 462)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblErrorAgregarNombres)
                            .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 14, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(93, 93, 93)
                                .addComponent(jLabel7)
                                .addGap(61, 61, 61))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(cmbsocios, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cmbsexo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtapellido)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jlblErrorAgregarApellido))
                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                .addGap(32, 32, 32))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnguardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtcorreo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdireccion))
                        .addGap(32, 32, 32))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel10))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlblErrorAgregarCI)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtnroSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel3)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtcedula, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                    .addComponent(jlblErrorAgregarCI, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtapellido, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtnombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblErrorAgregarNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblErrorAgregarApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbsexo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbsocios, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
if (!existeCamposObligatoriosDeAgregarClienteEnBlanco()) {
                if (existeCedulaCliente()) {
                JOptionPane.showMessageDialog(null, "Ya existe un cliente registrado con el mismo número de Cedula: "
                        + "" + this.txtcedula.getText(), "Error", 2);
            } else {
                    
           int cedula = Integer.parseInt(txtcedula.getText());
           if (cedula>=100000 && cedula <=9000000 ){
             agregar();
           
             this.dispose();
             
        
             
           }
            else {
           JOptionPane.showMessageDialog(null, "El numero de cedula es invalido");
           txtcedula.requestFocus();
      }
            
            }
            } 
        
    }//GEN-LAST:event_btnguardarActionPerformed

    private void txtcedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcedulaActionPerformed
txtnombre.requestFocus(); 
 btnguardar.setEnabled(true);        // TODO add your handling code here:
    }//GEN-LAST:event_txtcedulaActionPerformed

    private void txtcedulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedulaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcedulaKeyPressed

    private void txtcedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedulaKeyTyped
//char car = evt.getKeyChar();
  //  String Caracteres1= txtcedula.getText();
   // int cara = Integer.parseInt(this.txtCedulaAgre.getText());
    // int Caracteres = Integer.parseInt(txtCedulaAgre.getText()); 
         
//if((car<'0' || car>'9')){
  //  evt.consume();
    ////getToolkit().beep();
//}
char car = evt.getKeyChar();
if(txtcedula.getText().length()>=7) evt.consume();
if((car<'0' || car>'9')) evt.consume();

//if(Caracteres1.length()>7){ 
  // evt.consume(); 
 
//}// TODO add your handling code here:
    }//GEN-LAST:event_txtcedulaKeyTyped

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
this.dispose();

// TODO add your handling code here:
    }//GEN-LAST:event_btncancelarActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AgregarCliente dialog = new AgregarCliente(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JComboBox cmbsexo;
    private javax.swing.JComboBox cmbsocios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel jlblErrorAgregarApellido;
    private javax.swing.JLabel jlblErrorAgregarCI;
    private javax.swing.JLabel jlblErrorAgregarCI1;
    private javax.swing.JLabel jlblErrorAgregarCI2;
    private javax.swing.JLabel jlblErrorAgregarNombres;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnroSocio;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables

private void ocultarAvisosDeError() {
        this.jlblErrorAgregarCI.setVisible(false);
        this.jlblErrorAgregarNombres.setVisible(false);
        this.jlblErrorAgregarApellido.setVisible(false);

    }
private void habilitarboton(){
    btnguardar.setEnabled(false);
    btncancelar.setEnabled(true);
    txtcedula.requestFocus();
}
private void agregar(){
     
        //try {
           
        JOptionPane optionPane=new JOptionPane();
                     Object[] opciones =  {"Si","No"};
                      int ret=JOptionPane.showOptionDialog(null,"Desea guardar?","pregunta",JOptionPane.YES_NO_OPTION,
                           JOptionPane.QUESTION_MESSAGE,null,opciones,opciones[0]);
                       if(ret==JOptionPane.YES_OPTION) 
                if(bd.insertarRegistro("clientes","nro_cliente,  ci_cliente,NombreCliente,ApellidoCliente,DireccionCliente, "
                        + "TelefonoCliente,CorreoCliente,tipoCliente,sexoCliente "
                        + "","'"+ txtnroSocio.getText()+"','"+ txtcedula.getText()+"','"+
                       txtnombre.getText()+"','"+ txtapellido.getText()+"','"+ txtdireccion.getText()+"', "
                        + "'"+ txttelefono.getText()+"','"+ txtcorreo.getText()+"', "
                        + "'"+ cmbsocios.getSelectedItem()+"', '"+ cmbsexo.getSelectedItem()+"'")){
                   //error =false;
        
            //rs.close();
                     JOptionPane.showMessageDialog(null, "Los datos se han guardado correctamente");
            
            
           
                
           // }
            
           // } catch (SQLException ex) {
              //  Logger.getLogger(AgregarCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
      
    }
private boolean existeCamposObligatoriosDeAgregarClienteEnBlanco() {
        boolean existe = false;
        if (this.txtcedula.getText().length() == 0) {
            this.jlblErrorAgregarCI.setVisible(true);
            existe = true;
        }
        if (this.txtnombre.getText().length() == 0) {
            this.jlblErrorAgregarNombres.setVisible(true);
            existe = true;
        }
        if (this.txtapellido.getText().length() == 0) {
            this.jlblErrorAgregarApellido.setVisible(true);
            existe = true;
        }
        return existe;
    }
private boolean existeCedulaCliente() {
        boolean existe = false;
        if (bd.existeCedulaCliente(this.txtcedula.getText())) {
            existe = true;
        }
        return existe;
    }
private void genCod(){
    try{
             ConeccionBD z = new ConeccionBD();
             Connection cn = z.conectar();
           
            Statement stmt = cn.createStatement();
            rs = stmt.executeQuery("SELECT IFNULL(MAX(nro_cliente),0)+1 AS codigo FROM clientes ");
            rs.next();
            txtnroSocio.setText(rs.getString("codigo"));
        }catch (SQLException exceptionSql){
            JOptionPane.showMessageDialog(null, exceptionSql.getMessage(), "Error de Conexion con la Base de Datos", JOptionPane.ERROR_MESSAGE);
		System.exit(0);
        }
}


}
