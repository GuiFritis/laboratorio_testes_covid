/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.RelatorioPaciente;

import classes.Coleta;
import classes.Paciente;
import classes.Exame;
import classes.Usuario;
import dao.DAOColeta;
import dao.DAOPaciente;
import dao.DAOExame;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author guilh
 */
public class GerarRelatorioPaciente extends javax.swing.JDialog {

    private ArrayList<Exame> exames;
    private Paciente paciente;
    
    /**
     * Creates new form GerarRelatorio
     */
    public GerarRelatorioPaciente(java.awt.Frame parent, boolean modal) {
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
        loginDuGustin = new javax.swing.JLabel();
        buttonCancelar = new javax.swing.JButton();
        buttonGerar = new javax.swing.JButton();
        nomeP = new javax.swing.JLabel();
        cpfP = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableExames = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        loginDuGustin.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        loginDuGustin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/microscopio.png"))); // NOI18N
        loginDuGustin.setText("DuGustin Clínicas");
        loginDuGustin.setToolTipText("");

        buttonCancelar.setBackground(new java.awt.Color(255, 255, 255));
        buttonCancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonCancelar.setText("Sair");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        buttonGerar.setBackground(new java.awt.Color(255, 255, 255));
        buttonGerar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonGerar.setText("Gerar");
        buttonGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGerarActionPerformed(evt);
            }
        });

        nomeP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nomeP.setText("nome paciente");

        cpfP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cpfP.setText("XXXXXXXXXXX");

        tableExames.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Teste Num", "Exame", "Horário Coleta", "Material Coletado", "Dia da Coleta"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableExames);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(nomeP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cpfP))
                            .addComponent(loginDuGustin, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addComponent(buttonGerar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(loginDuGustin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeP)
                    .addComponent(cpfP))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonGerar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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
        System.exit(0);
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGerarActionPerformed
        // TODO add your handling code here:              
        if(tableExames.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Selecione um linha da tabela!!!");
        } else {
            RelatorioPaciente rp = new RelatorioPaciente(null, true);
            rp.prepara(exames.get(tableExames.getSelectedRow()));
            rp.setVisible(true);
        }                           
        
    }//GEN-LAST:event_buttonGerarActionPerformed

    public void preparar(Paciente paciente){
        
        this.paciente = paciente;            
       
        preparaLabels();
        
        preparaTable();
        
    }
    
    private void preparaLabels(){
        
        cpfP.setText(paciente.getCpf());
        nomeP.setText(paciente.getNome());       
    }
    
    private void preparaTable(){
        try{
            exames = new DAOExame().examesPaciente(paciente.getCpf());
            
            DefaultTableModel e = (DefaultTableModel) tableExames.getModel();

            while(e.getRowCount() > 0){
                e.removeRow(0);
            }
            
            for(Exame exame : exames){
                String[] linha = new String[5];
                linha[0] = String.valueOf(exame.getCodExame());
                linha[1] = exame.getNome();
                linha[2] = exame.getDiaExame();
                linha[3] = exame.getColeta().getTipoMaterial();
                linha[4] = exame.getColeta().getHorarioColeta();
                
                
                
                e.addRow(linha);
            }          
                       
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexão com SQL");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro no driver");
        }
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GerarRelatorioPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerarRelatorioPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerarRelatorioPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerarRelatorioPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GerarRelatorioPaciente dialog = new GerarRelatorioPaciente(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonGerar;
    private javax.swing.JLabel cpfP;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel loginDuGustin;
    private javax.swing.JLabel nomeP;
    private javax.swing.JTable tableExames;
    // End of variables declaration//GEN-END:variables
}
