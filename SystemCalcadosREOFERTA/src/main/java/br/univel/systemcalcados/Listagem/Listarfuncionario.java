/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univel.systemcalcados.Listagem;

import br.univel.systemcalcados.Cadastros.CadastrarFuncionario;
import br.univel.systemcalcados.DAO.FuncionarioDAO;
import br.univel.systemcalcados.Modelos.Funcionario;
import br.univel.systemcalcados.Relatorios.Funcionario.Funcionario_Relatorio;
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
public class Listarfuncionario extends javax.swing.JFrame {

    CadastrarFuncionario pai;

    private Funcionario funcionario;

    ModeloFuncionario modelo = new ModeloFuncionario();

    /**
     * Creates new form Listarfuncionario
     */
    public Listarfuncionario(java.awt.Frame parent, boolean modal) {
        //super(parent, modal);
        pai = (CadastrarFuncionario) parent;
        initComponents();
        this.setLocationRelativeTo(null);
        tbFuncionarios.setModel(modelo);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public Listarfuncionario(Object object, boolean b) {

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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txfBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbFuncionarios = new javax.swing.JTable();
        btnGerarRelatorio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Listar Funcionarios");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Buscar");

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBuscar.setText("Pesquisar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        tbFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbFuncionariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbFuncionarios);

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGerarRelatorio, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGerarRelatorio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        modelo.busca(txfBuscar.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

    // mouseClick
    private void tbFuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbFuncionariosMouseClicked

        if (evt.getClickCount() == 2) {
            carregaDados(modelo.getFuncionario(tbFuncionarios.getSelectedRow()));
            pai.loadFuncionario(getFuncionarioSelected());
            dispose();
            //this.setVisible(false);
        }
    }//GEN-LAST:event_tbFuncionariosMouseClicked

    private void btnGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarRelatorioActionPerformed

        
        Funcionario_Relatorio func = new Funcionario_Relatorio();
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
            java.util.logging.Logger.getLogger(Listarfuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Listarfuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Listarfuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Listarfuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Listarfuncionario dialog = new Listarfuncionario(new javax.swing.JFrame(), true);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbFuncionarios;
    private javax.swing.JTextField txfBuscar;
    // End of variables declaration//GEN-END:variables

    public Funcionario getFuncionario() {

        FuncionarioDAO fl = new FuncionarioDAO();
        return fl.editarTabela(Integer.parseInt(tbFuncionarios.getValueAt(tbFuncionarios.getSelectedRow(), 0).toString()));

    }

    public Funcionario getFuncionarioSelected() {
        return funcionario;
    }

    private void carregaDados(Funcionario funcionario) {
        this.funcionario = funcionario;

    }

    class ModeloFuncionario extends AbstractTableModel {

        private String[] colunas = {"Cod", "Nome ", "Sobrenome"};
        private List<Funcionario> funcionarios = new ArrayList<>();
        FuncionarioDAO fDao = new FuncionarioDAO();

        public ModeloFuncionario() {
            popularTabela();
        }

        private List<Funcionario> popularTabela() {
            funcionarios = fDao.listar();
            fireTableDataChanged();
            return funcionarios;

        }

        @Override
        public int getRowCount() {
            return funcionarios.size();
        }

        @Override
        public int getColumnCount() {
            return 3;
        }

        @Override
        public String getColumnName(int i) {
            return colunas[i];
        }
        
          public Funcionario getFuncionario(int index) {
            return funcionarios.get(index);
        }


        @Override
        public Object getValueAt(int i, int i1) {

            Funcionario funcionario = (Funcionario) funcionarios.get(i);

            switch (i1) {
                case 0:
                    return funcionario.getId();

                case 1:
                    return funcionario.getNome();

                case 2:
                    return funcionario.getSobrenome();

                case 3:
                    return funcionario.getEndereco();

            }
            return null;
        }

        public void busca(String texto) {

            FuncionarioDAO clienteDao = new FuncionarioDAO();
            List<Funcionario> cl = new ArrayList<>();
            cl = clienteDao.listar();

            Pattern padrao = Pattern.compile(".*" + texto + ".*", Pattern.CASE_INSENSITIVE); // criou padrao .* e qualquer coisa antes ou depois

            Iterator i = cl.iterator();

            while (i.hasNext()) {
                Funcionario funcionario = (Funcionario) i.next();
                Matcher pesquisa = padrao.matcher(funcionario.getNome()); // vai comparar com o getnome

                if (!pesquisa.matches()) { // resultado da pesquisa
                    i.remove();             // se nao combimou remove.
                }
            }

            // se caso dar erro ao retornar os registros na busca
            this.funcionarios = cl;
            fireTableDataChanged();
        }
    }

}
