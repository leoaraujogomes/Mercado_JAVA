
package Classes;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class frmConsultarPedido extends javax.swing.JFrame {

    public frmConsultarPedido(ArrayList<Pedido> pedd) {
        initComponents();
        listaPedidos = pedd;
    }

    ArrayList<Pedido> listaPedidos;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        txtNumeroCadastro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
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
        jLabel2 = new javax.swing.JLabel();
        txtTotalPedido = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableProdutos = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableIngredientes = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableManufatura = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        txtDtPedido = new javax.swing.JFormattedTextField();
        btnConsultarPedido = new javax.swing.JButton();
        btnVoltarPedido = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(null);
        jPanel3.add(txtNumeroCadastro);
        txtNumeroCadastro.setBounds(80, 40, 90, 24);

        jLabel3.setText("Número:");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(20, 30, 60, 40);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(null);

        jLabel4.setText("Nome:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(11, 22, 60, 16);

        txtNomeCliente.setEditable(false);
        jPanel1.add(txtNomeCliente);
        txtNomeCliente.setBounds(77, 18, 332, 25);

        jLabel5.setText("Data de nasc.:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(11, 52, 100, 16);

        txtDtNascCliente.setEditable(false);
        try {
            txtDtNascCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDtNascCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtDtNascCliente);
        txtDtNascCliente.setBounds(117, 50, 80, 25);

        jLabel6.setText("Idade:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(260, 50, 40, 16);

        txtIdadeCliente.setEditable(false);
        jPanel1.add(txtIdadeCliente);
        txtIdadeCliente.setBounds(308, 48, 101, 25);

        jLabel7.setText("CPF:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(11, 78, 100, 20);

        txtCpfCliente.setEditable(false);
        try {
            txtCpfCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpfCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtCpfCliente);
        txtCpfCliente.setBounds(117, 78, 105, 25);

        jPanel3.add(jPanel1);
        jPanel1.setBounds(10, 80, 420, 120);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));
        jPanel2.setToolTipText("");
        jPanel2.setLayout(null);

        txtEstadoCliente.setEditable(false);
        jPanel2.add(txtEstadoCliente);
        txtEstadoCliente.setBounds(77, 18, 90, 24);

        jLabel8.setText("Estado:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(11, 22, 60, 16);

        jLabel9.setText("Bairro:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(11, 52, 60, 16);

        txtBairroCliente.setEditable(false);
        jPanel2.add(txtBairroCliente);
        txtBairroCliente.setBounds(77, 48, 90, 24);

        txtNumeroCliente.setEditable(false);
        jPanel2.add(txtNumeroCliente);
        txtNumeroCliente.setBounds(77, 78, 90, 24);

        jLabel10.setText("Número:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(11, 82, 60, 16);

        jLabel11.setText("Cidade:");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(185, 22, 60, 16);

        txtCidadeCliente.setEditable(false);
        jPanel2.add(txtCidadeCliente);
        txtCidadeCliente.setBounds(251, 18, 158, 24);

        jLabel12.setText("Rua:");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(185, 52, 60, 16);

        txtRuaCliente.setEditable(false);
        jPanel2.add(txtRuaCliente);
        txtRuaCliente.setBounds(251, 48, 158, 24);

        jPanel3.add(jPanel2);
        jPanel2.setBounds(10, 200, 420, 120);

        jLabel2.setText("Total do pedido:");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(200, 30, 100, 40);

        txtTotalPedido.setEditable(false);
        jPanel3.add(txtTotalPedido);
        txtTotalPedido.setBounds(300, 40, 130, 24);

        tableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome do Produto", "Custo"
            }
        ));
        tableProdutos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tableProdutos);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(440, 90, 340, 70);

        tableIngredientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ingrediente", "Unidade", "Fornecedor", "Preço", "Qtde"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableIngredientes.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tableIngredientes);

        jPanel3.add(jScrollPane3);
        jScrollPane3.setBounds(440, 170, 340, 80);

        tableManufatura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Processo", "Custo/H", "Operador", "Equipamento"
            }
        ));
        tableManufatura.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableManufatura);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(440, 260, 340, 80);

        jLabel13.setText("Data do Pedido:");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(470, 40, 100, 20);

        txtDtPedido.setEditable(false);
        try {
            txtDtPedido.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDtPedido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(txtDtPedido);
        txtDtPedido.setBounds(580, 40, 80, 25);

        btnConsultarPedido.setText("Consultar");
        btnConsultarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarPedidoActionPerformed(evt);
            }
        });
        jPanel3.add(btnConsultarPedido);
        btnConsultarPedido.setBounds(320, 350, 100, 32);

        btnVoltarPedido.setText("Voltar");
        btnVoltarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarPedidoActionPerformed(evt);
            }
        });
        jPanel3.add(btnVoltarPedido);
        btnVoltarPedido.setBounds(440, 350, 90, 32);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 808, 416);

        setSize(new java.awt.Dimension(808, 416));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarPedidoActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarPedidoActionPerformed
    
    private void btnConsultarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarPedidoActionPerformed
        Pessoa cliente;
        Endereco endereco;
        
        for (int i = 0; i < listaPedidos.size(); i++){
            if (String.valueOf(listaPedidos.get(i).getNumero()).equals(txtNumeroCadastro.getText())){
                txtTotalPedido.setText(String.valueOf(listaPedidos.get(i).getTotalPedido()));
                txtDtPedido.setText(listaPedidos.get(i).getData().getDia()+""+listaPedidos.get(i).getData().getMes()+""+listaPedidos.get(i).getData().getAno());
                cliente = listaPedidos.get(i).getCliente();
                txtNomeCliente.setText(cliente.getNome());
                txtIdadeCliente.setText(cliente.getIdade());
                txtCpfCliente.setText(cliente.getCpf());
                txtDtNascCliente.setText(cliente.getDataNasc().getDia()+""+cliente.getDataNasc().getMes()+""+cliente.getDataNasc().getAno());
                endereco = cliente.getEndereço();
                txtEstadoCliente.setText(endereco.getEstado());
                txtBairroCliente.setText(endereco.getBairro());
                txtNumeroCliente.setText(String.valueOf(endereco.getNumero()));
                txtCidadeCliente.setText(endereco.getCidade());
                txtRuaCliente.setText(endereco.getRua());
                
                
                
            DefaultTableModel tabelaprd = (DefaultTableModel)tableProdutos.getModel();
            DefaultTableModel tabelaingr = (DefaultTableModel)tableIngredientes.getModel();
            DefaultTableModel tabelamnf = (DefaultTableModel)tableManufatura.getModel();
            
            tabelaprd.setNumRows(0);
            tabelaingr.setNumRows(0);
            tabelamnf.setNumRows(0);
            
            for (int j = 0; j < listaPedidos.get(i).getProdutos().size(); j++){
                ArrayList<Produto> produto = listaPedidos.get(i).getProdutos();
                tabelaprd.addRow(new String[] {produto.get(j).getNome(),
                String.valueOf(produto.get(j).getCusto())});
                
                for (int k = 0; k < produto.get(j).getIngredientes().size(); k++){
                    ArrayList<Ingrediente> ingredientes = produto.get(j).getIngredientes();
                    tabelaingr.addRow(new String[] {ingredientes.get(k).getMateriaPrima().getNome(),
                    ingredientes.get(k).getMateriaPrima().getUnidade(),
                    ingredientes.get(k).getMateriaPrima().getFornecedor(),
                    String.valueOf(ingredientes.get(k).getMateriaPrima().getPreco()),
                    String.valueOf(ingredientes.get(k).getQtde())});
                }
                
                for (int l = 0; l < produto.get(j).getManufatura().size(); l++){
                    ArrayList<Manufatura> manufatura = produto.get(j).getManufatura();
                    tabelamnf.addRow(new String[] {manufatura.get(l).getProcesso().getNome(),
                    String.valueOf(manufatura.get(l).getProcesso().getCustoHora()),
                    manufatura.get(l).getProcesso().getOperador().getNome(),
                    manufatura.get(l).getProcesso().getEquipamento().getNome()});
                }
            }
                
            }
            
            
        }
    }//GEN-LAST:event_btnConsultarPedidoActionPerformed
    
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
            java.util.logging.Logger.getLogger(frmConsultarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmConsultarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmConsultarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmConsultarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmConsultarPedido(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultarPedido;
    private javax.swing.JButton btnVoltarPedido;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tableIngredientes;
    private javax.swing.JTable tableManufatura;
    private javax.swing.JTable tableProdutos;
    private javax.swing.JTextField txtBairroCliente;
    private javax.swing.JTextField txtCidadeCliente;
    private javax.swing.JFormattedTextField txtCpfCliente;
    private javax.swing.JFormattedTextField txtDtNascCliente;
    private javax.swing.JFormattedTextField txtDtPedido;
    private javax.swing.JTextField txtEstadoCliente;
    private javax.swing.JTextField txtIdadeCliente;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtNumeroCadastro;
    private javax.swing.JTextField txtNumeroCliente;
    private javax.swing.JTextField txtRuaCliente;
    private javax.swing.JTextField txtTotalPedido;
    // End of variables declaration//GEN-END:variables
}
