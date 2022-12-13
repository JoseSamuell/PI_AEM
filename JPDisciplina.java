/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package telas;

import classes.Disciplina;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import repositorio.RepDisciplina;

/**
 *
 * @author Aluno
 */
public class JPDisciplina extends javax.swing.JDialog {
    
    RepDisciplina repdisciplina = new RepDisciplina();
    
    public JPDisciplina(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        preecherTable();
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
            java.util.logging.Logger.getLogger(JPDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JPDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JPDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JPDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JPDisciplina dialog = new JPDisciplina(new javax.swing.JFrame(), true);
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
    public void preecherTable(){
         
        DefaultTableModel modelo = (DefaultTableModel) jTableListadis.getModel();
        modelo.setNumRows(0);
        
        for(Disciplina c : repdisciplina.retornar()){
            modelo.addRow(new Object[]{
                
                //aqui vao ficar as colunas
                
                c.getIddisciplina(),
                c.getSerie(),
                c.getTurno(),
                c.getTurma(),
                c.getProfessorid(),
                c.getEscolaid(),
                c.getAlunoid()
                    
           });
        }
    }

    /**
     * Creates new form JPDisciplina
     */
    public JPDisciplina() {
        initComponents();
        preecherTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListadis = new javax.swing.JTable();
        jButtonSalvar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldIdDisciplina = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldSerie = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldTurno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldTurma = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldProfessorId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldAlunoId = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldEscolaId = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jButtonNovoDis = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setText("Cadastro de Disciplina");

        jTableListadis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID ", "Serie", "turno", "Turma", "Professor ID", "Aluno Id", "Escola ID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableListadis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableListadisMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableListadis);

        jButtonSalvar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonAlterar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jButtonAlterar.setText("Alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonExcluir.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jLabel2.setText("ID Disciplina:");

        jTextFieldIdDisciplina.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Serie:");

        jLabel4.setText("Turno:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Turma:");

        jLabel6.setText("Professor ID:");

        jLabel7.setText("Aluno ID:");

        jLabel8.setText("Escola ID:");

        jLabel9.setText("Pesquisar:");

        jButtonBuscar.setText("Buscar");

        jButtonNovoDis.setText("Novo");
        jButtonNovoDis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoDisActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonCancelar)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonNovoDis)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonSalvar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldEscolaId, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextFieldIdDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel3))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextFieldTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addComponent(jLabel6)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTextFieldSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel4))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTextFieldProfessorId)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel7)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldTurno, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                            .addComponent(jTextFieldAlunoId)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonBuscar))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel1)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldIdDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)
                                .addComponent(jTextFieldSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addComponent(jTextFieldTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextFieldTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jTextFieldProfessorId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldAlunoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(jLabel8))
                    .addComponent(jTextFieldEscolaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonAlterar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonNovoDis)
                    .addComponent(jButtonCancelar))
                .addGap(14, 14, 14))
        );

        setSize(new java.awt.Dimension(627, 579));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        // TODO add your handling code here:
        
        //verificar campo obrigatorio
        if(jTextFieldSerie.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Preecha o campo Serie");
            jTextFieldSerie.requestFocus();
        }
        else if(jTextFieldTurma.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor, Preecha o campo Turma" );
            jTextFieldTurma.requestFocus();
        }else{
            //criar o objeto
            Disciplina disciplina = new Disciplina();
            
            //Preecha os dados no objeto
            disciplina.setSerie(jTextFieldSerie.getText());
            disciplina.setTurma(jTextFieldTurma.getText());
            disciplina.setTurno(jTextFieldTurno.getText());
            disciplina.setAlunoid(Integer.parseInt(jTextFieldAlunoId.getText()));
            disciplina.setProfessorid(Integer.parseInt(jTextFieldProfessorId.getText()));
            disciplina.setEscolaid(Integer.parseInt(jTextFieldEscolaId.getText()));
            
            //se o codigo for fazio de um INSERT
            if(jTextFieldIdDisciplina.getText().equals("")){
                //inserir no banco de dados
            if(repdisciplina.inserir(disciplina)==true){
                JOptionPane.showMessageDialog(null,"Executado com Sucesso");
                limparCampos();
                preecherTable();
            }else{
                JOptionPane.showMessageDialog(null,"Falha ao executar");
            }
            }else{
                //se o código existir entção é um update
                disciplina.setIddisciplina(Integer.parseInt(jTextFieldIdDisciplina.getText()));
                if(repdisciplina.atualizar(disciplina)==true){
                
                    JOptionPane.showMessageDialog(null, "Executado com sucesso");
                limparCampos();
                preecherTable();
                
            }else{
                
             JOptionPane.showMessageDialog(null,"Falha ao executar");
             
               }
            }
          
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jTableListadisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableListadisMouseClicked
        // TODO add your handling code here:
        if(jTableListadis.getSelectedRow() != - 1){
            jTextFieldIdDisciplina.setText(jTableListadis.getValueAt(jTableListadis.getSelectedRow(), 0).toString());
            jTextFieldSerie.setText(jTableListadis.getValueAt(jTableListadis.getSelectedRow(), 1).toString());
            jTextFieldTurno.setText(jTableListadis.getValueAt(jTableListadis.getSelectedRow(), 2).toString());
            jTextFieldTurma.setText(jTableListadis.getValueAt(jTableListadis.getSelectedRow(), 3).toString());
            jTextFieldProfessorId.setText(jTableListadis.getValueAt(jTableListadis.getSelectedRow(), 4).toString());
            jTextFieldEscolaId.setText(jTableListadis.getValueAt(jTableListadis.getSelectedRow(), 5).toString());
            jTextFieldAlunoId.setText(jTableListadis.getValueAt(jTableListadis.getSelectedRow(), 6).toString());
            
        }
    }//GEN-LAST:event_jTableListadisMouseClicked

    private void jButtonNovoDisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoDisActionPerformed
        // TODO add your handling code here:
        
         zerarCampos();
        habilitaCampos(true);
        jTextFieldSerie.requestFocus();
    }//GEN-LAST:event_jButtonNovoDisActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        zerarCampos();
        habilitaCampos(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        // TODO add your handling code here:
         habilitaCampos(true);
        jTextFieldSerie.requestFocus();
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        // TODO add your handling code here:
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja Realmente Excluir?", "Aviso", JOptionPane.YES_NO_OPTION);
        
        if (resposta == JOptionPane.YES_OPTION){ 
        //Usuário clicou em sim
        repdisciplina.excluir(Integer.parseInt(jTextFieldIdDisciplina.getText()));
        preecherTable();
        } else if (resposta == JOptionPane.NO_OPTION){ 
        //Usuário clicou em não
        } 
    }//GEN-LAST:event_jButtonExcluirActionPerformed
               public void limparCampos(){
                   jTextFieldSerie.setText("");
                   jTextFieldTurno.setText("");
                   jTextFieldTurma.setText("");
                   jTextFieldProfessorId.setText("");
                   jTextFieldAlunoId.setText("");
                   jTextFieldEscolaId.setText("");
                   
              }
               
                public void habilitaCampos(boolean valor){
        
        jTextFieldSerie.setEnabled(valor);
        jTextFieldTurno.setEnabled(valor);
        jTextFieldTurma.setEnabled(valor);
        jTextFieldProfessorId.setEnabled(valor);
        jTextFieldEscolaId.setEnabled(valor);
        jTextFieldAlunoId.setEnabled(valor);
    }
    
     public void zerarCampos(){
        
        jTextFieldSerie.setText("");
        jTextFieldTurno.setText("");
        jTextFieldTurma.setText("");
        jTextFieldProfessorId.setText("");
        jTextFieldEscolaId.setText("");
        jTextFieldAlunoId.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovoDis;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListadis;
    private javax.swing.JTextField jTextFieldAlunoId;
    private javax.swing.JTextField jTextFieldEscolaId;
    private javax.swing.JTextField jTextFieldIdDisciplina;
    private javax.swing.JTextField jTextFieldPesquisar;
    private javax.swing.JTextField jTextFieldProfessorId;
    private javax.swing.JTextField jTextFieldSerie;
    private javax.swing.JTextField jTextFieldTurma;
    private javax.swing.JTextField jTextFieldTurno;
    // End of variables declaration//GEN-END:variables
}
