/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Coleta;

import classes.Coleta;
import classes.EFormaColeta;
import classes.Paciente;
import dao.DAOColeta;
import dao.DAOPaciente;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author guilh
 */
public class AdicionarColeta extends javax.swing.JDialog {

    private ArrayList<Paciente> pacientes;
    
    /**
     * Creates new form AdicionarColeta
     */
    public AdicionarColeta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
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
        adicionarPaciente = new javax.swing.JLabel();
        buttonCancelar = new javax.swing.JButton();
        buttonConcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePacientes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TFresponsavel = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TFmaterial = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TFcidade = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TFhora = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TFdia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TFobservacoes = new javax.swing.JTextArea();
        dropFormaColeta = new javax.swing.JComboBox<>();
        checkSucesso = new javax.swing.JCheckBox();
        TFmes = new javax.swing.JTextField();
        TFano = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        TFminuto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        adicionarPaciente.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        adicionarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cuidados-de-saude-e-medicos.png"))); // NOI18N
        adicionarPaciente.setText("Cadastrar Coleta");
        adicionarPaciente.setToolTipText("");

        buttonCancelar.setBackground(new java.awt.Color(255, 255, 255));
        buttonCancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonCancelar.setText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        buttonConcluir.setBackground(new java.awt.Color(255, 255, 255));
        buttonConcluir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonConcluir.setText("Concluir");
        buttonConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConcluirActionPerformed(evt);
            }
        });

        tablePacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome Paciente", "CPF"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablePacientes);

        jLabel1.setText("Paciente:");

        jLabel2.setText("Profissional:");

        jLabel3.setText("Cidade:");

        jLabel4.setText("Material Coletado:");

        jLabel5.setText("Forma de Coleta:");

        jLabel6.setText("Horário da Coleta:");

        TFhora.setText("HH");
        TFhora.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TFhoraFocusGained(evt);
            }
        });

        jLabel7.setText("Data da Coleta:");

        TFdia.setText("DD");
        TFdia.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TFdiaFocusGained(evt);
            }
        });

        jLabel8.setText("Observações:");

        TFobservacoes.setColumns(20);
        TFobservacoes.setRows(5);
        jScrollPane2.setViewportView(TFobservacoes);

        dropFormaColeta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        checkSucesso.setBackground(new java.awt.Color(255, 255, 255));
        checkSucesso.setText("Sucesso na Coleta");

        TFmes.setText("MM");
        TFmes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TFmesFocusGained(evt);
            }
        });

        TFano.setText("AAAA");
        TFano.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TFanoFocusGained(evt);
            }
        });

        jLabel12.setText("/");

        jLabel13.setText("/");

        jLabel14.setText(":");

        TFminuto.setText("mm");
        TFminuto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TFminutoFocusGained(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel5)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(192, 192, 192)
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dropFormaColeta, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(TFcidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                            .addComponent(TFmaterial, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TFresponsavel))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(checkSucesso))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel7)
                                                    .addComponent(jLabel6))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(TFdia, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                                                    .addComponent(TFhora))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(TFmes)
                                                    .addComponent(TFminuto, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                                                .addGap(5, 5, 5)
                                                .addComponent(jLabel13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TFano, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(buttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(buttonConcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adicionarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adicionarPaciente)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TFano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(TFresponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(TFdia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(TFmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TFcidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFhora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel14)
                    .addComponent(TFminuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TFmaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkSucesso))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dropFormaColeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonConcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConcluirActionPerformed
        // TODO add your handling code here:
        if(TFcidade.getText().isEmpty() || TFdia.getText().isEmpty() || TFmes.getText().isEmpty() ||
            TFano.getText().isEmpty() || TFhora.getText().isEmpty() || TFminuto.getText().isEmpty() || 
            TFmaterial.getText().isEmpty() || TFresponsavel.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Todos os campos precisam ser preenchidos!!");
            return;
        } 
        else if(tablePacientes.getSelectedRowCount() != 1){
            JOptionPane.showMessageDialog(null, "Selecione 1(uma) linha da tabela!!");
            return;
        }
        else if(TFobservacoes.getText().length() >= 255){
            JOptionPane.showMessageDialog(null, "Texto em observação excede a\nquantidade máxima de caracteres!!");
            return;
        }
        
        String horario = TFano.getText() + "-" + TFmes.getText() + "-" + TFdia.getText() 
                + " " + TFhora.getText() + ":" + TFminuto.getText() + ":00";
        
        try {
            Coleta coleta = new Coleta(1, 
            TFresponsavel.getText(), 
            TFcidade.getText(), 
            TFmaterial.getText(), 
            pacientes.get(tablePacientes.getSelectedRow()), 
            horario, 
            EFormaColeta.valueOf(dropFormaColeta.getSelectedItem().toString()),
            checkSucesso.isSelected(),
            TFobservacoes.getText());

            new DAOColeta().insert(coleta);

            JOptionPane.showMessageDialog(null, "Salvo com sucesso");

            setVisible(false);

        } catch (ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Erro no drive.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar com SQL.");
        }

    }//GEN-LAST:event_buttonConcluirActionPerformed

    private void TFdiaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TFdiaFocusGained
        // TODO add your handling code here:
        TFdia.setText("");
    }//GEN-LAST:event_TFdiaFocusGained

    private void TFmesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TFmesFocusGained
        // TODO add your handling code here:
        TFmes.setText("");
    }//GEN-LAST:event_TFmesFocusGained

    private void TFanoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TFanoFocusGained
        // TODO add your handling code here:
        TFano.setText("");
    }//GEN-LAST:event_TFanoFocusGained

    private void TFhoraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TFhoraFocusGained
        // TODO add your handling code here:
        TFhora.setText("");
    }//GEN-LAST:event_TFhoraFocusGained

    private void TFminutoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TFminutoFocusGained
        // TODO add your handling code here:
        TFminuto.setText("");
    }//GEN-LAST:event_TFminutoFocusGained

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
            java.util.logging.Logger.getLogger(AdicionarColeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdicionarColeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdicionarColeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdicionarColeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AdicionarColeta dialog = new AdicionarColeta(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField TFano;
    private javax.swing.JTextField TFcidade;
    private javax.swing.JTextField TFdia;
    private javax.swing.JTextField TFhora;
    private javax.swing.JTextField TFmaterial;
    private javax.swing.JTextField TFmes;
    private javax.swing.JTextField TFminuto;
    private javax.swing.JTextArea TFobservacoes;
    private javax.swing.JTextField TFresponsavel;
    private javax.swing.JLabel adicionarPaciente;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonConcluir;
    private javax.swing.JCheckBox checkSucesso;
    private javax.swing.JComboBox<String> dropFormaColeta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablePacientes;
    // End of variables declaration//GEN-END:variables

public void preparar(){
    
    preencherFormaColeta();
    
    preencherPacientes();

}

private void preencherFormaColeta(){
    
    DefaultComboBoxModel dfc = (DefaultComboBoxModel) dropFormaColeta.getModel();
    
    dfc.removeAllElements();
            
    for(int i = 0; i < EFormaColeta.values().length; i++){
        dfc.addElement(EFormaColeta.values()[i]);
    }
    
}

private void preencherPacientes(){   
    try{
            pacientes = new DAOPaciente().selectAll();
            
            DefaultTableModel tp = (DefaultTableModel) tablePacientes.getModel();

            while(tp.getRowCount() > 0){
                tp.removeRow(0);
            }
            
            for(Paciente paciente : pacientes){
                String[] linha = new String[2];
                linha[0] = paciente.getNome();
                linha[1] = paciente.getCpf();
                
                tp.addRow(linha);
            }          
                       
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexão com SQL");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro no driver");
        }
    
}

}