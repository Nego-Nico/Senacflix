package br.com.motta.senacflix.Janelas;

import br.com.motta.senacflix.Classes.Podcast;
import br.com.motta.senacflix.Classes.PodcastDAO;
import br.com.motta.senacflix.Classes.Usuario;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

public class Listagem extends javax.swing.JFrame {

    public Listagem() {

    }

    public Listagem(Usuario u) {
        initComponents();

        if (u.getNivel().equalsIgnoreCase("Administrador")) {
            bntCadastrar.setEnabled(true);
            bntExcluir.setEnabled(true);
        } else if (u.getNivel().equalsIgnoreCase("Operador")) {

            bntExcluir.setVisible(false);
        } else {
            //AdicionarBotao.setEnabled(false);
            bntCadastrar.setVisible(false);
            //ExcluirBotao.setEnabled(false);
            bntExcluir.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        bntCadastrar = new javax.swing.JButton();
        bntExcluir = new javax.swing.JButton();
        scListagem = new javax.swing.JScrollPane();
        tblListagem = new javax.swing.JTable();
        bntPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jLabel1.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        jLabel1.setText("SENACFLIX");

        jLabel2.setText("Pesquisar podcast por produtora:");

        bntCadastrar.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        bntCadastrar.setText("Cadastrar");
        bntCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCadastrarActionPerformed(evt);
            }
        });

        bntExcluir.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        bntExcluir.setText("Excluir");
        bntExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntExcluirActionPerformed(evt);
            }
        });

        DefaultTableModel tabela = montarTabela(PodcastDAO.listar());
        tblListagem.setModel(tabela);
        tblListagem.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tblListagemPropertyChange(evt);
            }
        });
        scListagem.setViewportView(tblListagem);

        bntPesquisar.setText("Pesquisar");
        bntPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bntPesquisar)
                                .addGap(0, 111, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(bntExcluir)
                                .addGap(18, 18, 18)
                                .addComponent(bntCadastrar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scListagem)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scListagem, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntCadastrar)
                    .addComponent(bntExcluir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        DefaultTableModel tabela = montarTabela(PodcastDAO.listar());
        tblListagem.setModel(tabela);
        scListagem.setViewportView(tblListagem);
    }//GEN-LAST:event_formWindowGainedFocus

    private void tblListagemPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tblListagemPropertyChange
        tblListagem.getModel().addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                if (e.getType() == TableModelEvent.UPDATE) {
                    int row = e.getFirstRow();
                    int collum = e.getColumn();
                    TabelaEditavel model = (TabelaEditavel) e.getSource();

                    String idString = (String) model.getValueAt(row, 0);
                    int id = Integer.parseInt(idString);
                    String produtor = (String) model.getValueAt(row, 1);
                    String nome_do_ep = (String) model.getValueAt(row, 2);
                    String nEpString = (String) model.getValueAt(row, 3);
                    int nep = Integer.parseInt(nEpString);
                    String duracao = (String) model.getValueAt(row, 4);
                    String url_repo = (String) model.getValueAt(row, 5);

                    Podcast p = new Podcast(id, produtor, nome_do_ep, nep, duracao, url_repo);
                }
            }
        });
    }//GEN-LAST:event_tblListagemPropertyChange

    private void bntCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCadastrarActionPerformed
        CadastrarPodcast cPodcast = new CadastrarPodcast();
        cPodcast.setVisible(true);
        dispose();
    }//GEN-LAST:event_bntCadastrarActionPerformed

    private void bntPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntPesquisarActionPerformed
        List<Podcast> lista = PodcastDAO.buscar(txtPesquisar.getText());
        DefaultTableModel tabela = montarTabela(lista);
        tblListagem.setModel(tabela);
        scListagem.setViewportView(tblListagem);
    }//GEN-LAST:event_bntPesquisarActionPerformed

    private void bntExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntExcluirActionPerformed
        PodcastDAO.excluir(Integer.parseInt(getId()));

        JOptionPane.showMessageDialog(null, "Registro excluido com sucesso!");

        DefaultTableModel tabela = montarTabela(PodcastDAO.listar());
        tblListagem.setModel(tabela);
        scListagem.setViewportView(tblListagem);
    }//GEN-LAST:event_bntExcluirActionPerformed

    private TabelaEditavel montarTabela(List<Podcast> lista) {
        String[] colunas = {"ID", "Produtor", "Nome do episódio", "N⁰ Episódio", "Duração", "URL de repo"};

        TabelaEditavel tabela = new TabelaEditavel();
        tabela.setColumnIdentifiers(colunas);

        for (int i = 0; i < lista.size(); i++) {
            Podcast p = lista.get(i);

            String[] linha = {
                Integer.toString(p.getId()),
                p.getProdutor(),
                p.getNome_do_episodio(),
                Integer.toString(p.getnEpisodio()),
                p.getDuracao(),
                p.getUrl_do_repositorio()};

            tabela.addRow(linha);

        }
        return tabela;
    }

    private String getId() {
        int posicao = tblListagem.getSelectedRow();
        if (posicao == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um item da tabela.");
        }

        return (String) tblListagem.getValueAt(posicao, 0);
    }

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
            java.util.logging.Logger.getLogger(Listagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Listagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Listagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Listagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Listagem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCadastrar;
    private javax.swing.JButton bntExcluir;
    private javax.swing.JButton bntPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane scListagem;
    private javax.swing.JTable tblListagem;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
