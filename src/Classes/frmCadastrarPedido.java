/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author leoar
 */
public class frmCadastrarPedido extends javax.swing.JFrame {

    /**
     * Creates new form frmCadastrarPedido
     */
    
    public frmCadastrarPedido(ArrayList<Pedido> pedd) {
        initComponents();
        listaPedidos = pedd;
    }
    
    ArrayList<Pedido> listaPedidos;
    
    Pedido ped = new Pedido();
    
    public void calculaCusto(){
        txtTotalPedido.setText(String.valueOf(ped.calculaPedido()));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtNumeroCadastro = new javax.swing.JTextField();
        txtTotalPedido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDataPedido = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtNomeCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDtNascCliente = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        txtIdadeCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCpfCliente = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        txtEstadoCliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtBairroCliente = new javax.swing.JTextField();
        txtNumeroCliente = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCidadeCliente = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtRuaCliente = new javax.swing.JTextField();
        btnCadastrarPedido = new javax.swing.JButton();
        btnCadastrarProduto = new javax.swing.JButton();
        btnVoltarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Pedido");
        getContentPane().setLayout(null);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(null);

        jLabel3.setText("Número:");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(20, 30, 60, 40);
        jPanel3.add(txtNumeroCadastro);
        txtNumeroCadastro.setBounds(80, 40, 120, 25);

        txtTotalPedido.setEditable(false);
        jPanel3.add(txtTotalPedido);
        txtTotalPedido.setBounds(330, 40, 130, 25);

        jLabel2.setText("Total do pedido:");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(230, 30, 100, 40);

        try {
            txtDataPedido.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataPedido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(txtDataPedido);
        txtDataPedido.setBounds(120, 90, 80, 25);

        jLabel1.setText("Data do pedido:");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(20, 80, 100, 40);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Cliente"));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(null);

        jLabel4.setText("Nome:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(11, 22, 60, 16);
        jPanel1.add(txtNomeCliente);
        txtNomeCliente.setBounds(119, 18, 290, 25);

        jLabel5.setText("Data de nasc.:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(11, 52, 100, 16);

        try {
            txtDtNascCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDtNascCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDtNascCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDtNascClienteFocusLost(evt);
            }
        });
        jPanel1.add(txtDtNascCliente);
        txtDtNascCliente.setBounds(117, 50, 80, 25);

        jLabel6.setText("Idade:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(268, 52, 34, 16);

        txtIdadeCliente.setEditable(false);
        jPanel1.add(txtIdadeCliente);
        txtIdadeCliente.setBounds(308, 48, 101, 25);

        jLabel7.setText("CPF:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(11, 78, 100, 20);

        try {
            txtCpfCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpfCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtCpfCliente);
        txtCpfCliente.setBounds(117, 78, 105, 25);

        jPanel3.add(jPanel1);
        jPanel1.setBounds(20, 130, 440, 110);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setToolTipText("");
        jPanel2.setLayout(null);
        jPanel2.add(txtEstadoCliente);
        txtEstadoCliente.setBounds(77, 18, 90, 24);

        jLabel8.setText("Estado:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(11, 22, 60, 16);

        jLabel9.setText("Bairro:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(11, 52, 60, 16);
        jPanel2.add(txtBairroCliente);
        txtBairroCliente.setBounds(77, 48, 90, 24);
        jPanel2.add(txtNumeroCliente);
        txtNumeroCliente.setBounds(77, 78, 90, 24);

        jLabel10.setText("Número:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(11, 82, 60, 16);

        jLabel11.setText("Cidade:");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(185, 22, 60, 16);
        jPanel2.add(txtCidadeCliente);
        txtCidadeCliente.setBounds(251, 18, 158, 24);

        jLabel12.setText("Rua:");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(185, 52, 60, 16);
        jPanel2.add(txtRuaCliente);
        txtRuaCliente.setBounds(251, 48, 158, 24);

        jPanel3.add(jPanel2);
        jPanel2.setBounds(20, 240, 440, 110);

        btnCadastrarPedido.setText("Cadastrar Pedido");
        btnCadastrarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarPedidoActionPerformed(evt);
            }
        });
        jPanel3.add(btnCadastrarPedido);
        btnCadastrarPedido.setBounds(30, 360, 130, 32);

        btnCadastrarProduto.setText("Cadastrar Produto");
        btnCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarProdutoActionPerformed(evt);
            }
        });
        jPanel3.add(btnCadastrarProduto);
        btnCadastrarProduto.setBounds(180, 360, 140, 32);

        btnVoltarCliente.setText("Voltar");
        btnVoltarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarClienteActionPerformed(evt);
            }
        });
        jPanel3.add(btnVoltarCliente);
        btnVoltarCliente.setBounds(390, 360, 64, 32);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 476, 416);

        setSize(new java.awt.Dimension(476, 416));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public static void infoBox(String infoMessage, String titleBar){
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
    private void btnCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarProdutoActionPerformed
        
        frmCadastrarProduto frmproduto = new frmCadastrarProduto(ped, this);
        this.setAlwaysOnTop(false);
        frmproduto.setUndecorated(true);
        frmproduto.setVisible(true);
        
    }//GEN-LAST:event_btnCadastrarProdutoActionPerformed
    public Endereco montaEnderecoCliente(){
        Endereco end = new Endereco();
        end.setRua(txtRuaCliente.getText());
        end.setBairro(txtBairroCliente.getText());
        end.setNumero(Integer.parseInt(txtNumeroCliente.getText()));
        end.setCidade(txtCidadeCliente.getText());
        end.setEstado(txtEstadoCliente.getText());
        return end;
    }
    public Data montaData(String data){
        Data d = new Data();
        d.setDia(Integer.parseInt(data.substring(0,2)));
        d.setMes(Integer.parseInt(data.substring(3,5)));
        d.setAno(Integer.parseInt(data.substring(6,10)));
        return d;
    }
    public Pessoa formataCliente(){
        Pessoa p = new Pessoa();
        p.setNome(txtNomeCliente.getText());
        p.setCpf(txtCpfCliente.getText());
        p.setIdade(txtIdadeCliente.getText());
        p.setEndereço(montaEnderecoCliente());
        p.setDataNasc(montaData(txtDtNascCliente.getText()));
        return p;
    }
    private void btnCadastrarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarPedidoActionPerformed
        if(ped.getProdutos().size()>0){
            if(!"".equals(txtNumeroCadastro.getText()) &&
                    !"".equals(txtDataPedido.getText()) &&
                    !"".equals(txtTotalPedido.getText()) &&
                    !"".equals(txtNomeCliente.getText()) &&
                    !"".equals(txtDtNascCliente.getText()) &&
                    !"".equals(txtIdadeCliente.getText()) &&
                    !"".equals(txtCpfCliente.getText()) &&
                    !"".equals(txtEstadoCliente.getText()) &&
                    !"".equals(txtCidadeCliente.getText()) &&
                    !"".equals(txtBairroCliente.getText()) &&
                    !"".equals(txtRuaCliente.getText()) &&
                    !"".equals(txtNumeroCliente.getText())){
        ped.setCliente(formataCliente());
        ped.setData(montaData(txtDataPedido.getText()));
        ped.setNumero(Integer.parseInt(txtNumeroCadastro.getText()));
        ped.setTotalPedido(Float.parseFloat(txtTotalPedido.getText()));
        listaPedidos.add(ped);
        
        for(int i = 0; i < listaPedidos.size(); i++){
            String a = String.valueOf(listaPedidos.get(i).getProdutos().get(0).getNome());
            System.out.println(a);
        }
        
        this.dispose();
            }else{
                infoBox("Há campos em branco, preencha-os!", "Campos em branco");
            }
        }else{
            infoBox("Lista de produtos vazia, cadastre um produto!", "Sem produtos");
        }
    }//GEN-LAST:event_btnCadastrarPedidoActionPerformed

    private void btnVoltarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarClienteActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarClienteActionPerformed
        public Data calculaIdadePessoa(String data){
        Pessoa p = new Pessoa();
        Data d = new Data();
        d.setDia(Integer.parseInt(data.substring(0,2)));
        d.setMes(Integer.parseInt(data.substring(3,5)));
        d.setAno(Integer.parseInt(data.substring(6,10)));
        p.setDataNasc(d);
        txtIdadeCliente.setText(p.calculaIdade());
        return d;
    }
    private void txtDtNascClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDtNascClienteFocusLost
        calculaIdadePessoa(txtDtNascCliente.getText());
    }//GEN-LAST:event_txtDtNascClienteFocusLost

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
            java.util.logging.Logger.getLogger(frmCadastrarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCadastrarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCadastrarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCadastrarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmCadastrarPedido frmpd = new frmCadastrarPedido(null);
                frmpd.setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarPedido;
    private javax.swing.JButton btnCadastrarProduto;
    private javax.swing.JButton btnVoltarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtBairroCliente;
    private javax.swing.JTextField txtCidadeCliente;
    private javax.swing.JFormattedTextField txtCpfCliente;
    private javax.swing.JFormattedTextField txtDataPedido;
    private javax.swing.JFormattedTextField txtDtNascCliente;
    private javax.swing.JTextField txtEstadoCliente;
    private javax.swing.JTextField txtIdadeCliente;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtNumeroCadastro;
    private javax.swing.JTextField txtNumeroCliente;
    private javax.swing.JTextField txtRuaCliente;
    private javax.swing.JTextField txtTotalPedido;
    // End of variables declaration//GEN-END:variables
}
