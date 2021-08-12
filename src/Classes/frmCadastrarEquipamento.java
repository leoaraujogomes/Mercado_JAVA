/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import javax.swing.JOptionPane;

/**
 *
 * @author leoar
 */
public class frmCadastrarEquipamento extends javax.swing.JFrame {

    /**
     * Creates new form frmCadastrarEquipamento
     */
    
    
    public frmCadastrarEquipamento(Manufatura manft) {
        initComponents();
        mnft = manft;
    }
    Manufatura mnft;
    
    public static void infoBox(String infoMessage, String titleBar){
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
    
    public Data montaDtFbEquipamento(String data){
        Equipamento e = new Equipamento();
        Data d = new Data();
        d.setDia(Integer.parseInt(data.substring(0,2)));
        d.setMes(Integer.parseInt(data.substring(3,5)));
        d.setAno(Integer.parseInt(data.substring(6,10)));
        e.setDataFabricacao(d);
        return d;
    }
    
    public Equipamento formataEquipamento(){
        Equipamento eqp = new Equipamento();
        eqp.setNome(txtNomeEquipamento.getText());
        eqp.setFabricante(txtFabricanteEquipamento.getText());
        eqp.setDepreciacaoHora(Float.parseFloat(txtDepreciacaoEquipamento.getText()));
        eqp.setDataFabricacao(montaDtFbEquipamento(txtDtFbEquipamento.getText()));
        return eqp;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNomeEquipamento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFabricanteEquipamento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDtFbEquipamento = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDepreciacaoEquipamento = new javax.swing.JTextField();
        btnCadastrarEquipamento = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Equipamento");
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);
        jPanel1.add(txtNomeEquipamento);
        txtNomeEquipamento.setBounds(70, 30, 160, 25);

        jLabel3.setText("Nome:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 20, 50, 40);
        jPanel1.add(txtFabricanteEquipamento);
        txtFabricanteEquipamento.setBounds(330, 30, 130, 25);

        jLabel2.setText("Fabricante:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(260, 20, 70, 40);

        try {
            txtDtFbEquipamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDtFbEquipamento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtDtFbEquipamento);
        txtDtFbEquipamento.setBounds(140, 70, 90, 25);

        jLabel5.setText("Data de Fabricação:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 60, 120, 40);

        jLabel4.setText("Depreciação:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 100, 80, 40);
        jPanel1.add(txtDepreciacaoEquipamento);
        txtDepreciacaoEquipamento.setBounds(140, 110, 90, 25);

        btnCadastrarEquipamento.setText("Cadastrar");
        btnCadastrarEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarEquipamentoActionPerformed(evt);
            }
        });
        jPanel1.add(btnCadastrarEquipamento);
        btnCadastrarEquipamento.setBounds(190, 150, 87, 32);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 476, 212);

        setSize(new java.awt.Dimension(476, 212));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarEquipamentoActionPerformed
        if(!"".equals(txtNomeEquipamento.getText()) && !"".equals(txtDtFbEquipamento.getText()) && !"".equals(txtDepreciacaoEquipamento.getText()) && !"".equals(txtFabricanteEquipamento.getText())){
        mnft.getProcesso().setEquipamento(formataEquipamento());
        this.dispose();
        }else{
            this.setAlwaysOnTop(false);
            infoBox("Há campos em branco, preencha-os!", "Campos em branco");
        }
    }//GEN-LAST:event_btnCadastrarEquipamentoActionPerformed

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
            java.util.logging.Logger.getLogger(frmCadastrarEquipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCadastrarEquipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCadastrarEquipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCadastrarEquipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCadastrarEquipamento(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarEquipamento;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtDepreciacaoEquipamento;
    private javax.swing.JFormattedTextField txtDtFbEquipamento;
    private javax.swing.JTextField txtFabricanteEquipamento;
    private javax.swing.JTextField txtNomeEquipamento;
    // End of variables declaration//GEN-END:variables
}
