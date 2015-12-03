package br.univel.systemcalcados.Cadastros;

import br.univel.systemcalcados.DAO.NovaVendaDAO;
import br.univel.systemcalcados.Listagem.ListarNovaVenda;
import br.univel.systemcalcados.Modelos.Cliente;
import br.univel.systemcalcados.Modelos.CondicoesPagamento;
import br.univel.systemcalcados.Modelos.FormasPagamento;
import br.univel.systemcalcados.Modelos.NovaVenda;
import br.univel.systemcalcados.Modelos.Produto;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author WebSystem
 */
public class CadastrarNovaVenda extends javax.swing.JFrame {

    NovaVenda nova_venda;

    /**
     * @wbp.parser.constructor
     */
    public CadastrarNovaVenda(java.awt.Frame parent, boolean modal) {

        initComponents();
        // super(parent, modal);
        this.setLocationRelativeTo(null);

    }

        public CadastrarNovaVenda(Object object, boolean b) {

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txfCod = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbxCliente = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        cbxNomeProduto = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        txfQuantidade = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbxFormaPagamento = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        cbxCondicoesPagamento = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        txfPrecoTotal = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnNovo = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        cbxValorProduto = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Cadastrar Nova Venda");

        jLabel2.setText("Cod");

        txfCod.setEditable(false);

        jLabel3.setText("Cliente");

        cbxCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxClienteActionPerformed(evt);
            }
        });

        jLabel4.setText("Produto");

        jLabel5.setText("Quantidade");

        jLabel6.setText("Forma de Pgto.");

        jLabel7.setText("Condições Pgto.");

        jLabel9.setText(" Total R$");

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jLabel11.setText("Valor Produto Unitário");

        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/univel/systemcalcados/Icon/calculator.png"))); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(222, 222, 222))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnNovo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCadastrar)
                                .addGap(18, 18, 18)
                                .addComponent(btnEditar)
                                .addGap(18, 18, 18)
                                .addComponent(btnListar)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluir))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txfCod, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cbxFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cbxNomeProduto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cbxCondicoesPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(txfPrecoTotal))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cbxValorProduto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(cbxValorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txfPrecoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cbxCondicoesPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCalcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnExcluir)
                    .addComponent(btnListar)
                    .addComponent(btnEditar)
                    .addComponent(btnCadastrar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // btn Cadastrar
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        Cliente cliente = (Cliente) cbxCliente.getSelectedItem();
        FormasPagamento forma_pagamento = (FormasPagamento) cbxFormaPagamento.getSelectedItem();
        CondicoesPagamento condicao_pagamento = (CondicoesPagamento) cbxCondicoesPagamento.getSelectedItem();
        Produto produto = (Produto) cbxNomeProduto.getSelectedItem();
        double precototal = Double.parseDouble(txfPrecoTotal.getText());
        int quantidade = Integer.parseInt(txfQuantidade.getText());
        double valorproduto = Double.parseDouble(cbxValorProduto.getSelectedItem().toString());
        //    double valorproduto = Double.parseDouble(txfValorProduto.getSelectedText());

        NovaVenda nv1 = new NovaVenda(cliente, forma_pagamento, condicao_pagamento, produto, precototal, quantidade, valorproduto);

        NovaVendaDAO dao = new NovaVendaDAO();

        JOptionPane.showMessageDialog(null, dao.inserir(nv1));


    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void cbxClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxClienteActionPerformed

    }//GEN-LAST:event_cbxClienteActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

        if (cbxCliente.getSelectedItem() == null) {
            NovaVendaDAO dao = new NovaVendaDAO();
            List<Cliente> lista = dao.buscaCliente();
            for (Cliente list : lista) {
                cbxCliente.addItem(list);

            }
        }

        if (cbxNomeProduto.getSelectedItem() == null) {
            NovaVendaDAO dao = new NovaVendaDAO();
            List<Produto> lista = dao.buscaProduto();
            for (Produto list : lista) {
                cbxNomeProduto.addItem(list);

            }
        }

        if (cbxFormaPagamento.getSelectedItem() == null) {
            NovaVendaDAO dao = new NovaVendaDAO();
            List<FormasPagamento> lista = dao.buscaForma();
            for (FormasPagamento list : lista) {
                cbxFormaPagamento.addItem(list);

            }
        }
        if (cbxCondicoesPagamento.getSelectedItem() == null) {
            NovaVendaDAO dao = new NovaVendaDAO();
            List<CondicoesPagamento> lista = dao.buscaCond();
            for (CondicoesPagamento list : lista) {
                cbxCondicoesPagamento.addItem(list);

            }
        }

        if (cbxValorProduto.getSelectedItem() == null) {
            NovaVendaDAO dao = new NovaVendaDAO();
            List<String> lista = dao.buscaValorProduto();
            for (String list : lista) {
                cbxValorProduto.addItem(list);

            }
        }
    }//GEN-LAST:event_formWindowActivated

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed

        try {
            int qtd = Integer.parseInt(txfQuantidade.getText());
            //   String aux1 = txfPrecoTotal.getText();
            double valorproduto = Double.parseDouble(cbxValorProduto.getSelectedItem().toString());

            double total = qtd * valorproduto;
            String texto = Double.toString(total);

            txfPrecoTotal.setText(texto);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Valores Inválidos");
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed

        limpar();

    }//GEN-LAST:event_btnNovoActionPerformed

    //btn Editar
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        try {
            Cliente cliente = (Cliente) cbxCliente.getSelectedItem();
            FormasPagamento forma_pagamento = (FormasPagamento) cbxFormaPagamento.getSelectedItem();
            CondicoesPagamento condicao_pagamento = (CondicoesPagamento) cbxCondicoesPagamento.getSelectedItem();
            Produto produto = (Produto) cbxNomeProduto.getSelectedItem();
            double precototal = Double.parseDouble(txfPrecoTotal.getText());
            int quantidade = Integer.parseInt(txfQuantidade.getText());
            double valorproduto = Double.parseDouble(cbxValorProduto.getSelectedItem().toString());
            //    double valorproduto = Double.parseDouble(txfValorProduto.getSelectedText());

            NovaVenda nv1 = new NovaVenda(cliente, forma_pagamento, condicao_pagamento, produto, precototal, quantidade, valorproduto);
            NovaVendaDAO dao = new NovaVendaDAO();
            //   JOptionPane.showMessageDialog(null, dao.altera(nv1, id));
            limpar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Verifique se os campos estão digitados corretamente");
        }


    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed

        ListarNovaVenda NV = new ListarNovaVenda(this, true);
        NV.setVisible(true);


    }//GEN-LAST:event_btnListarActionPerformed

    //btn excluir
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        NovaVendaDAO dao = new NovaVendaDAO();
        try {
            int op = JOptionPane.showConfirmDialog(null, "Deseja Remover " + txfCod.getText() + "?");

            if (op == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, dao.Excluir(Integer.parseInt(txfCod.getText())));
                limpar();
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Selecione um id Venda na lista");
        }


    }//GEN-LAST:event_btnExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarNovaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarNovaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarNovaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarNovaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastrarNovaVenda dialog = new CadastrarNovaVenda(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        //  System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JComboBox cbxCliente;
    private javax.swing.JComboBox cbxCondicoesPagamento;
    private javax.swing.JComboBox cbxFormaPagamento;
    private javax.swing.JComboBox cbxNomeProduto;
    private javax.swing.JComboBox cbxValorProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txfCod;
    private javax.swing.JTextField txfPrecoTotal;
    private javax.swing.JTextField txfQuantidade;
    // End of variables declaration//GEN-END:variables

    private void limpar() {

        txfQuantidade.setText("");

        txfPrecoTotal.setText("");

    }

    public void loadNova_Venda(NovaVenda nova_vendaSelected) {

        nova_venda = nova_vendaSelected;

        try {

            nova_venda = nova_vendaSelected;
            
            txfCod.setText(Integer.toString(nova_venda.getId()));

            cbxCliente.setSelectedItem(nova_venda.getCliente().getNome() + " " + nova_venda.getCliente().getSobrenome());
            cbxFormaPagamento.setSelectedItem(nova_venda.getForma_pgto().getFormaPagamento());
            cbxCondicoesPagamento.setSelectedItem(nova_venda.getCondicao_pgto().getCondicao());
            cbxNomeProduto.setSelectedItem(nova_venda.getProduto().getNome());
            //  txfPrecoTotal.setText(Double.parseDouble(nova_venda.getProduto().getValorVenda()));
            txfPrecoTotal.setText(Double.toString(nova_venda.getPrecoTotal()));

            //   double precototal = Double.parseDouble(txfPrecoTotal.getText());
            txfQuantidade.setText(Integer.toString(nova_venda.getQuantidade()));

            //   int quantidade = Integer.parseInt(txfQuantidade.getText());
            cbxValorProduto.setSelectedItem(nova_venda.getProduto().getValorVenda());

            //  double valorproduto = Double.parseDouble(cbxValorProduto.getSelectedItem().toString());
        } catch (Exception e) {
        }

    }
}
