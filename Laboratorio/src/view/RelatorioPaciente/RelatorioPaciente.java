/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.RelatorioPaciente;

import classes.Coleta;
import classes.Paciente;
import classes.Exame;

/**
 *
 * @author guilh
 */
public class RelatorioPaciente extends javax.swing.JDialog {

    Exame exame;
    Coleta coleta;
    Paciente paciente;
    
    /**
     * Creates new form RelatorioPaciente
     */
    public RelatorioPaciente(java.awt.Frame parent, boolean modal) {
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
        microscopio = new javax.swing.JLabel();
        duGustinClinicas = new javax.swing.JLabel();
        preto = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pacienteP = new javax.swing.JLabel();
        nascP = new javax.swing.JLabel();
        cpfP = new javax.swing.JLabel();
        profissionalP = new javax.swing.JLabel();
        sexoP = new javax.swing.JLabel();
        municipioP = new javax.swing.JLabel();
        horarioP = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        exameP = new javax.swing.JLabel();
        materialP = new javax.swing.JLabel();
        metodoP = new javax.swing.JLabel();
        resultadoP = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        obsCoP = new javax.swing.JLabel();
        obsTeP = new javax.swing.JLabel();
        buttonVoltar = new javax.swing.JButton();
        numTesteP = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        microscopio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/microscopio (1).png"))); // NOI18N

        duGustinClinicas.setBackground(new java.awt.Color(0, 0, 0));
        duGustinClinicas.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        duGustinClinicas.setText("DU GUSTIN CL??NICAS");
        duGustinClinicas.setToolTipText("");

        preto.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pretoLayout = new javax.swing.GroupLayout(preto);
        preto.setLayout(pretoLayout);
        pretoLayout.setHorizontalGroup(
            pretoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pretoLayout.setVerticalGroup(
            pretoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Paciente:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Nascimento:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("CPF: ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Profissional:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Inicio dos Sintomas:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Sexo:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Hor??rio da Coleta:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Munic??pio:");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        pacienteP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pacienteP.setText("XXXXXXXXX");

        nascP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nascP.setText("XX/XX/XXXX");

        cpfP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cpfP.setText("XXXXXXXXXXX");

        profissionalP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        profissionalP.setText("XXXXXXXXXXXXXXX");

        sexoP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sexoP.setText("XXXXXXXXX");

        municipioP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        municipioP.setText("XXXXXXXXXXXX");

        horarioP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        horarioP.setText("XX/XX/XXXX  XX:XX:XX");

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        exameP.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        exameP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exameP.setText("Exame: XXXXXXXXXXXXXXXXXXXX");

        materialP.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        materialP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        materialP.setText("Material: XXXXXXXXXXX");
        materialP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        metodoP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        metodoP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        metodoP.setText("M??todo: XXXXXXXXXXXXXXXXXXXXXXXXXX");
        metodoP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        resultadoP.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        resultadoP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultadoP.setText("Resultado do Teste: XXXXXXXXXXXXX");
        resultadoP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Observa????es: ");

        obsCoP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        obsCoP.setText("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXx");
        obsCoP.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        obsTeP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        obsTeP.setText("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXx");
        obsTeP.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        buttonVoltar.setText("Voltar");
        buttonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarActionPerformed(evt);
            }
        });

        numTesteP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        numTesteP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numTesteP.setText("N??mero do Teste: XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sexoP)
                            .addComponent(pacienteP)
                            .addComponent(cpfP)
                            .addComponent(nascP))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(municipioP)
                            .addComponent(horarioP)
                            .addComponent(profissionalP))
                        .addGap(65, 65, 65))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(exameP, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                            .addComponent(materialP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(metodoP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(resultadoP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numTesteP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(198, 198, 198))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(obsTeP, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(obsCoP, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addGap(81, 81, 81))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(microscopio)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(duGustinClinicas)
                                        .addGap(0, 279, Short.MAX_VALUE))
                                    .addComponent(preto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buttonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(duGustinClinicas)
                        .addGap(18, 18, 18)
                        .addComponent(preto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(microscopio))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel3)
                            .addComponent(pacienteP))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(nascP)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(horarioP)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(municipioP)
                            .addComponent(jLabel10))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(cpfP)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(profissionalP)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(sexoP))
                .addGap(33, 33, 33)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(exameP)
                .addGap(18, 18, 18)
                .addComponent(materialP)
                .addGap(30, 30, 30)
                .addComponent(metodoP)
                .addGap(31, 31, 31)
                .addComponent(numTesteP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resultadoP)
                .addGap(29, 29, 29)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(obsCoP, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(obsTeP, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(buttonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_buttonVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(RelatorioPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatorioPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatorioPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatorioPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RelatorioPaciente dialog = new RelatorioPaciente(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JLabel cpfP;
    private javax.swing.JLabel duGustinClinicas;
    private javax.swing.JLabel exameP;
    private javax.swing.JLabel horarioP;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel materialP;
    private javax.swing.JLabel metodoP;
    private javax.swing.JLabel microscopio;
    private javax.swing.JLabel municipioP;
    private javax.swing.JLabel nascP;
    private javax.swing.JLabel numTesteP;
    private javax.swing.JLabel obsCoP;
    private javax.swing.JLabel obsTeP;
    private javax.swing.JLabel pacienteP;
    private javax.swing.JPanel preto;
    private javax.swing.JLabel profissionalP;
    private javax.swing.JLabel resultadoP;
    private javax.swing.JLabel sexoP;
    // End of variables declaration//GEN-END:variables

    public void prepara(Exame exame){
        
            this.exame = exame;
            
            coleta = exame.getColeta();
            paciente = coleta.getPaciente();
            preencherLabels();      
                
    }
    
    private void preencherLabels(){
        cpfP.setText(paciente.getCpf());
        pacienteP.setText(paciente.getNome());
        sexoP.setText(paciente.getSexo());
        nascP.setText(paciente.getDataNasc());
        
        horarioP.setText(coleta.getHorarioColeta());
        municipioP.setText(coleta.getCidade());
        profissionalP.setText(coleta.getProfissional());
        
        exameP.setText("Exame: " + exame.getNome());
        materialP.setText("Material: " + coleta.getTipoMaterial());
        metodoP.setText("M??todo de Coleta: " + coleta.getFormaColeta());
        numTesteP.setText("N??mero do Teste: " + exame.getTeste().getNumTeste());
        resultadoP.setText("Resultado do Teste: " + exame.getResultado());
        obsCoP.setText("Coleta: " + coleta.getObservacao());
        obsTeP.setText("Teste: " + exame.getObservacao());
        
    }

}
