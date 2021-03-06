/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univel.systemcalcados.Listagem;

import br.univel.systemcalcados.Cadastros.CadastrarContasReceber;
import br.univel.systemcalcados.DAO.ContasReceberDAO;
import br.univel.systemcalcados.Modelos.ContasReceber;
import br.univel.systemcalcados.Relatorios.ContasReceber.Contas_Receber_Relatorio;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author WebSystem
 */
public class ListarContasReceber extends javax.swing.JFrame {

    ModeloContasReceber mcr = new ModeloContasReceber();

    CadastrarContasReceber pai;

    private ContasReceber contasreceber;

    /**
     * Creates new form ListarContasReceber
     */
    public ListarContasReceber(java.awt.Frame parent, boolean modal) {

        pai = (CadastrarContasReceber) parent;
        initComponents();
        this.setLocationRelativeTo(null);
        tbContasReceber.setModel(mcr);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public ListarContasReceber(Object object, boolean b) {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        txfBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbContasReceber = new javax.swing.JTable();
        btnGerarRelatorio = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Listar Contas a Receber");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Buscar");

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBuscar.setText("Pesquisar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tbContasReceber.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbContasReceber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbContasReceberMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbContasReceber);

        btnGerarRelatorio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGerarRelatorio.setText("Gerar Relatório");
        btnGerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarRelatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 15, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnGerarRelatorio)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(btnBuscar)
                    .addComponent(txfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGerarRelatorio)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        mcr.busca(txfBuscar.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tbContasReceberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbContasReceberMouseClicked

        if (evt.getClickCount() == 2) {
            carregaDados(mcr.getContasReceber(tbContasReceber.getSelectedRow()));
            pai.loadContasReceber(getContasReceberSelected());
            dispose();
            //this.setVisible(false);
        }

    }//GEN-LAST:event_tbContasReceberMouseClicked

    private void btnGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarRelatorioActionPerformed
       
        Contas_Receber_Relatorio cr = new Contas_Receber_Relatorio();
        
    }//GEN-LAST:event_btnGerarRelatorioActionPerformed

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
            java.util.logging.Logger.getLogger(ListarContasReceber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarContasReceber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarContasReceber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarContasReceber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ListarContasReceber dialog = new ListarContasReceber(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGerarRelatorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbContasReceber;
    private javax.swing.JTextField txfBuscar;
    // End of variables declaration//GEN-END:variables

    public ContasReceber getConta() {
        ContasReceberDAO dao = new ContasReceberDAO();
        return dao.editarTabela(Integer.parseInt(tbContasReceber.getValueAt(tbContasReceber.getSelectedRow(), 0).toString()));
    }
    
    
     private void carregaDados(ContasReceber contasReceber) {

        this.contasreceber = contasReceber;

    }

    public ContasReceber getContasReceberSelected() {
        return contasreceber;
    }

    class ModeloContasReceber extends AbstractTableModel {

        private String[] colunas = {"Cod", "Nome Cliente ", "Valor", "Vencimento"};
        private List<ContasReceber> receber = new ArrayList<>();
        ContasReceberDAO dao = new ContasReceberDAO();

        public ModeloContasReceber() {
            popularTabela();
        }

        private List<ContasReceber> popularTabela() {
            receber = dao.listar();
            fireTableDataChanged();
            return receber;

        }

        @Override
        public int getRowCount() {
            return receber.size();
        }

        @Override
        public int getColumnCount() {
            return 4;
        }

        @Override
        public String getColumnName(int i) {
            return colunas[i];
        }
        
        public ContasReceber getContasReceber(int index) {
            return receber.get(index);
        }

        @Override
        public Object getValueAt(int i, int i1) {

            ContasReceber conta = (ContasReceber) receber.get(i);

            switch (i1) {
                case 0:
                    return conta.getId();

                case 1:
                    return conta.getNomeCliente();
                case 2:
                    return conta.getValor();
                default:
                    return conta.getVencimento();
            }
        }

        public void busca(String texto) {

            ContasReceberDAO dao = new ContasReceberDAO();
            List<ContasReceber> p = new ArrayList<>();
            p = dao.listar();

            Pattern padrao = Pattern.compile(".*" + texto + ".*", Pattern.CASE_INSENSITIVE); // criou padrao .* e qualquer coisa antes ou depois

            Iterator i = p.iterator();

            while (i.hasNext()) {
                ContasReceber conta = (ContasReceber) i.next();
                Matcher pesquisa = padrao.matcher(conta.getNomeCliente()); // vai comparar com o getnome

                if (!pesquisa.matches()) { // resultado da pesquisa
                    i.remove();             // se nao combimou remove.
                }
            }

            // se caso dar erro ao retornar os registros na busca
            this.receber = p;
            fireTableDataChanged();
        }
    }

}
