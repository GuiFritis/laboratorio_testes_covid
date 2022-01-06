/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Coleta;

import classes.Coleta;
import classes.Recoleta;
import dao.DAOColeta;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import view.Recoleta.AdicionarRecoleta;
import view.Recoleta.AlterarRecoleta;

/**
 *
 * @author guilh
 */
public class Coletas extends javax.swing.JDialog {

    private ArrayList<Coleta> coletas;
    
    /**
     * Creates new form Coletas
     */
    public Coletas(java.awt.Frame parent, boolean modal) {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TFmaterial = new javax.swing.JTextField();
        buttonPesquisar = new javax.swing.JButton();
        buttonVoltar = new javax.swing.JButton();
        buttonAlterar = new javax.swing.JButton();
        buttonAdicionarRecoleta = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableColetas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cuidados-de-saude-e-medicos.png"))); // NOI18N
        jLabel1.setText("Coletas");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Pesquisar pelo Material:");

        TFmaterial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        buttonPesquisar.setBackground(new java.awt.Color(255, 255, 255));
        buttonPesquisar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonPesquisar.setText("Pesquisar");
        buttonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPesquisarActionPerformed(evt);
            }
        });

        buttonVoltar.setBackground(new java.awt.Color(255, 255, 255));
        buttonVoltar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonVoltar.setText("Voltar");
        buttonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarActionPerformed(evt);
            }
        });

        buttonAlterar.setBackground(new java.awt.Color(255, 255, 255));
        buttonAlterar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonAlterar.setText("Alterar Coleta");
        buttonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAlterarActionPerformed(evt);
            }
        });

        buttonAdicionarRecoleta.setBackground(new java.awt.Color(255, 255, 255));
        buttonAdicionarRecoleta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonAdicionarRecoleta.setText("Adicionar Recoleta");
        buttonAdicionarRecoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarRecoletaActionPerformed(evt);
            }
        });

        tableColetas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código de Coleta", "Data da Coleta", "Bem Sucedida", "Paciente", "Material", "Forma de Coleta", "Recoleta"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableColetas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TFmaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonAdicionarRecoleta)
                        .addGap(18, 18, 18)
                        .addComponent(buttonAlterar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFmaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAlterar)
                    .addComponent(buttonVoltar)
                    .addComponent(buttonAdicionarRecoleta))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPesquisarActionPerformed
        // TODO add your handling code here:

        if(TFmaterial.getText().length() >= 30){
            JOptionPane.showMessageDialog(null, "Material excede a quantidade máxima de caracteres");
            return;
        }

        setVisible(false);

        try{
            coletas = new DAOColeta().selectMaterial(TFmaterial.getText());

            preencherColetas();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexão com SQL");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro no driver");
        }
        
        setVisible(true);
        
    }//GEN-LAST:event_buttonPesquisarActionPerformed

    private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_buttonVoltarActionPerformed

    private void buttonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlterarActionPerformed
        // TODO add your handling code here:
        if(tableColetas.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(null, "Selecione 1(uma) linha da tabela!!");
            return;
        }
        if(coletas.get(tableColetas.getSelectedRow()) instanceof Recoleta){
            AlterarRecoleta ar = new AlterarRecoleta(null, true);
            ar.preparar((Recoleta) coletas.get(tableColetas.getSelectedRow()));
            ar.setVisible(true);
        } else {
            AlterarColeta ap = new AlterarColeta(null, true);
            ap.preparar(coletas.get(tableColetas.getSelectedRow()));
            ap.setVisible(true);
        }
        preparar();

    }//GEN-LAST:event_buttonAlterarActionPerformed

    private void buttonAdicionarRecoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarRecoletaActionPerformed
        // TODO add your handling code here:
        if(tableColetas.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(null, "Selecione 1(uma) linha da tabela!!");
            return;
        }        
        Coleta coleta = coletas.get(tableColetas.getSelectedRow());
        
        if(coleta instanceof Recoleta){
            if(!((Recoleta) coleta).isPrimeira()){
                JOptionPane.showMessageDialog(null, "Já realizou duas recoletas, não pode refazer o teste!!");
            }
        }
        
        AdicionarRecoleta ar = new AdicionarRecoleta(null, true);
        ar.preparar(coleta);
        ar.setVisible(true);
        
    }//GEN-LAST:event_buttonAdicionarRecoletaActionPerformed

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
            java.util.logging.Logger.getLogger(Coletas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Coletas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Coletas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Coletas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Coletas dialog = new Coletas(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField TFmaterial;
    private javax.swing.JButton buttonAdicionarRecoleta;
    private javax.swing.JButton buttonAlterar;
    private javax.swing.JButton buttonPesquisar;
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableColetas;
    // End of variables declaration//GEN-END:variables

    public void preparar(){     
                
        try{
            coletas = new DAOColeta().selectAllCR();

            preencherColetas();            
                       
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexão com SQL");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro no driver");
        }
    }
    
    private void preencherColetas(){
        DefaultTableModel tp = (DefaultTableModel) tableColetas.getModel();

            while(tp.getRowCount() > 0){
                tp.removeRow(0);
            }
            
            for(Coleta coleta : coletas){
                String[] linha = new String[7];
                linha[0] = String.valueOf(coleta.getCodColeta());
                linha[1] = coleta.getHorarioColeta();
                linha[2] = coleta.isSucesso()?"Sim":"Não";
                linha[3] = coleta.getPaciente().getCpf();              
                linha[4] = coleta.getTipoMaterial();
                linha[5] = String.valueOf(coleta.getFormaColeta());
                if(coleta instanceof Recoleta){
                    linha[6] = ((Recoleta) coleta).isPrimeira()?"1º":"2º";
                } else {
                    linha[6] = "Não";
                }
                 
                tp.addRow(linha);
            }          
    }
    
    

}
