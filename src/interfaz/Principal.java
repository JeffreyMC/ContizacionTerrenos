/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import javax.swing.JOptionPane;
import Clases.Cliente;

/**
 *
 * @author jeff
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
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
        identificacion = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        edad = new javax.swing.JLabel();
        salario = new javax.swing.JLabel();
        idText = new javax.swing.JTextField();
        nombreText = new javax.swing.JTextField();
        edadText = new javax.swing.JTextField();
        salarioText = new javax.swing.JTextField();
        calcularBtn = new javax.swing.JButton();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("CÁLCULO DE PRECIO DE TERRENOS");

        identificacion.setText("Identificación");

        nombre.setText("Nombre completo");

        edad.setText("Edad");

        salario.setText("Salario");

        idText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextActionPerformed(evt);
            }
        });

        nombreText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTextActionPerformed(evt);
            }
        });

        edadText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edadTextActionPerformed(evt);
            }
        });

        salarioText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salarioTextActionPerformed(evt);
            }
        });

        calcularBtn.setText("Calcular");
        calcularBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(calcularBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(identificacion)
                            .addComponent(nombre)
                            .addComponent(edad)
                            .addComponent(salario))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombreText, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(edadText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(salarioText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel1)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(identificacion)
                    .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edadText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edad))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salarioText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salario))
                .addGap(59, 59, 59)
                .addComponent(calcularBtn)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    

    private void idTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextActionPerformed
      
    }//GEN-LAST:event_idTextActionPerformed

    private void nombreTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTextActionPerformed

    private void edadTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edadTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edadTextActionPerformed

    private void salarioTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salarioTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salarioTextActionPerformed

    private void calcularBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularBtnActionPerformed
        
        
        if(!verificaCampos()){
            String id = idText.getText();
            String nombreCompleto = nombreText.getText();
            int edad = 0; 
            double salario = 0.0;
            
            try{
                edad = Integer.parseInt(edadText.getText());
                salario = Double.parseDouble(salarioText.getText());
                
                if(id.length() > 10){
                    JOptionPane.showMessageDialog(this, "La identificación debe tener un máximo de 10 caracteres", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
                else if(nombreCompleto.length() > 50){
                    JOptionPane.showMessageDialog(this, "El nombre debe contener un máximo de 50 caracteres", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            
                else if(edad < 18 || edad > 120){
                    
                    JOptionPane.showMessageDialog(this, "La edad no cumple con los requerimientos (18-120)", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    //se crear el objeto cliente
                    try{
                     //se capturan los datos
                      Cliente cliente = new Cliente(id, nombreCompleto, edad, salario);
            
                      Calculos cal = new Calculos(cliente);
                      cal.setVisible(true);
                      this.setVisible(false);
                     }
                     catch(Exception e){
                        JOptionPane.showMessageDialog(this, "Error enviando datos a calcular", "ERROR", JOptionPane.ERROR_MESSAGE);
                       }
                    }
                }
            
                catch(Exception e){
                    JOptionPane.showMessageDialog(this, "Los últimos dos campos deben contener solo números", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

        }
        else{
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_calcularBtnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened
    
    public boolean verificaCampos(){
        
        if(idText.getText().equals("") || nombreText.getText().equals("") ||
                edadText.getText().equals("") || salarioText.getText().equals(""))
            return true;
        else
            return false;
    }
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcularBtn;
    private javax.swing.JLabel edad;
    private javax.swing.JTextField edadText;
    private javax.swing.JTextField idText;
    private javax.swing.JLabel identificacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nombre;
    private javax.swing.JTextField nombreText;
    private javax.swing.JLabel salario;
    private javax.swing.JTextField salarioText;
    // End of variables declaration//GEN-END:variables
}
