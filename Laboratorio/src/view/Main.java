/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import classes.Paciente;
import classes.Usuario;
import dao.DAOPaciente;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import view.Coleta.AdicionarColeta;
import view.Coleta.Coletas;
import view.Paciente.AdicionarPaciente;
import view.RelatorioPaciente.GerarRelatorioPaciente;
import view.Paciente.Pacientes;
import view.Exame.AdicionarExame;
import view.Teste.RelatorioSupervisor.GerarRelatorioSupervisor;
import view.Exame.Exames;
import view.Exame.ValidarExames;
import view.Testes.Testes;

/**
 *
 * @author guilh
 */
public class Main extends javax.swing.JFrame {

    private Usuario user;
    
    /**
     * Creates new form Main
     */
    public Main() {
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
        nomeUsuario = new javax.swing.JLabel();
        buttonRelatorioSupervisor = new javax.swing.JButton();
        buttonAdicionarColeta = new javax.swing.JButton();
        buttonTestes = new javax.swing.JButton();
        buttonPacientes = new javax.swing.JButton();
        buttonAdicionarPaciente = new javax.swing.JButton();
        Paciente = new javax.swing.JLabel();
        Coleta = new javax.swing.JLabel();
        Teste = new javax.swing.JLabel();
        buttonColetas = new javax.swing.JButton();
        buttonValidarExame = new javax.swing.JButton();
        buttonSair = new javax.swing.JButton();
        Teste1 = new javax.swing.JLabel();
        buttonExames = new javax.swing.JButton();
        buttonAdicionarExames = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        microscopio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/microscopio (1).png"))); // NOI18N

        duGustinClinicas.setBackground(new java.awt.Color(0, 0, 0));
        duGustinClinicas.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        duGustinClinicas.setText("DU GUSTIN CLÍNICAS");
        duGustinClinicas.setToolTipText("");

        preto.setBackground(new java.awt.Color(0, 0, 0));

        nomeUsuario.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        nomeUsuario.setForeground(new java.awt.Color(255, 255, 255));
        nomeUsuario.setText("Usuário");

        javax.swing.GroupLayout pretoLayout = new javax.swing.GroupLayout(preto);
        preto.setLayout(pretoLayout);
        pretoLayout.setHorizontalGroup(
            pretoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pretoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nomeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pretoLayout.setVerticalGroup(
            pretoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nomeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        buttonRelatorioSupervisor.setBackground(new java.awt.Color(255, 255, 255));
        buttonRelatorioSupervisor.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        buttonRelatorioSupervisor.setText("Relatório Supervisor");
        buttonRelatorioSupervisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRelatorioSupervisorActionPerformed(evt);
            }
        });

        buttonAdicionarColeta.setBackground(new java.awt.Color(255, 255, 255));
        buttonAdicionarColeta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buttonAdicionarColeta.setText("Adicionar Coleta");
        buttonAdicionarColeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarColetaActionPerformed(evt);
            }
        });

        buttonTestes.setBackground(new java.awt.Color(255, 255, 255));
        buttonTestes.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buttonTestes.setText("Testes");
        buttonTestes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTestesActionPerformed(evt);
            }
        });

        buttonPacientes.setBackground(java.awt.Color.white);
        buttonPacientes.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buttonPacientes.setText("Pacientes");
        buttonPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPacientesActionPerformed(evt);
            }
        });

        buttonAdicionarPaciente.setBackground(new java.awt.Color(255, 255, 255));
        buttonAdicionarPaciente.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buttonAdicionarPaciente.setText("Adicionar Paciente");
        buttonAdicionarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarPacienteActionPerformed(evt);
            }
        });

        Paciente.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Paciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nerd.png"))); // NOI18N
        Paciente.setText("Paciente");

        Coleta.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Coleta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cuidados-de-saude-e-medicos.png"))); // NOI18N
        Coleta.setText("Coleta");

        Teste.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Teste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bacterias (1).png"))); // NOI18N
        Teste.setText("Teste");

        buttonColetas.setBackground(new java.awt.Color(255, 255, 255));
        buttonColetas.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buttonColetas.setText("Coletas");
        buttonColetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonColetasActionPerformed(evt);
            }
        });

        buttonValidarExame.setBackground(new java.awt.Color(255, 255, 255));
        buttonValidarExame.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buttonValidarExame.setText("Validar Exame");
        buttonValidarExame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonValidarExameActionPerformed(evt);
            }
        });

        buttonSair.setBackground(new java.awt.Color(255, 255, 255));
        buttonSair.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buttonSair.setForeground(new java.awt.Color(255, 51, 51));
        buttonSair.setText("Sair");
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });

        Teste1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Teste1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/microscopio.png"))); // NOI18N
        Teste1.setText("Exame");

        buttonExames.setBackground(new java.awt.Color(255, 255, 255));
        buttonExames.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buttonExames.setText("Exames");
        buttonExames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExamesActionPerformed(evt);
            }
        });

        buttonAdicionarExames.setBackground(new java.awt.Color(255, 255, 255));
        buttonAdicionarExames.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        buttonAdicionarExames.setText("Adicionar Exame");
        buttonAdicionarExames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarExamesActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(buttonColetas, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonAdicionarColeta, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Paciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonPacientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(buttonAdicionarPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(Coleta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(buttonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(124, 124, 124)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonTestes, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Teste, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Teste1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(buttonRelatorioSupervisor, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonValidarExame, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonExames, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buttonAdicionarExames, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(44, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(microscopio)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(preto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(duGustinClinicas, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addComponent(buttonAdicionarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Coleta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonColetas))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Paciente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonPacientes)))
                        .addGap(18, 18, 18)
                        .addComponent(buttonAdicionarColeta)
                        .addGap(39, 39, 39)
                        .addComponent(buttonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(Teste)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonTestes)
                        .addGap(18, 18, 18)
                        .addComponent(Teste1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonExames)
                        .addGap(18, 18, 18)
                        .addComponent(buttonAdicionarExames)
                        .addGap(18, 18, 18)
                        .addComponent(buttonValidarExame, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonRelatorioSupervisor, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    private void buttonRelatorioSupervisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRelatorioSupervisorActionPerformed
        // TODO add your handling code here:
        if(buttonRelatorioSupervisor.getBackground() == Color.gray){
            JOptionPane.showMessageDialog(this, "Você não tem permissão para isso!");
        } else {
             setVisible(false);
            
             GerarRelatorioSupervisor grs = new GerarRelatorioSupervisor(this, true);             
             grs.preparar();             
             grs.setVisible(true);           
                          
             setVisible(true); 
             
        }
    }//GEN-LAST:event_buttonRelatorioSupervisorActionPerformed

    private void buttonAdicionarColetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarColetaActionPerformed
        // TODO add your handling code here:
        if(buttonAdicionarColeta.getBackground() == Color.gray){
            JOptionPane.showMessageDialog(this, "Você não tem permissão para isso!");
        } else {
            setVisible(false);
            
             AdicionarColeta addColeta = new AdicionarColeta(this, true);             
             addColeta.preparar();             
             addColeta.setVisible(true);           
                          
             setVisible(true);        
        }
    }//GEN-LAST:event_buttonAdicionarColetaActionPerformed

    private void buttonTestesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTestesActionPerformed
        // TODO add your handling code here:
        if(buttonTestes.getBackground() == Color.gray){
            JOptionPane.showMessageDialog(this, "Você não tem permissão para isso!");
        } else {
            setVisible(false);
            
            Testes testes = new Testes(this, true);
            testes.preparar();
            testes.setVisible(true);
            
            setVisible(true);
        }        

    }//GEN-LAST:event_buttonTestesActionPerformed

    private void buttonPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPacientesActionPerformed
        // TODO add your handling code here:
        if(buttonPacientes.getBackground() == Color.gray){
            JOptionPane.showMessageDialog(this, "Você não tem permissão para isso!");
        } else {
             setVisible(false);
             
             Pacientes p = new Pacientes(this, true);
             p.preparar();
             p.setVisible(true);
             
             setVisible(true);
        }
    }//GEN-LAST:event_buttonPacientesActionPerformed

    private void buttonAdicionarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarPacienteActionPerformed
        // TODO add your handling code here:
        if(buttonAdicionarPaciente.getBackground() == Color.gray){
            JOptionPane.showMessageDialog(this, "Você não tem permissão para isso!");
        } else {
            setVisible(false);
        
            AdicionarPaciente addp = new AdicionarPaciente(this, true);        
            addp.setVisible(true);
        
            setVisible(true);
        }      
                
    }//GEN-LAST:event_buttonAdicionarPacienteActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        setVisible(false);
        
        Login login = new Login(this, true);
        login.setVisible(true);
                
        user = login.getUser();
        
        preparaMain();
        
        setVisible(true);
        
        
    }//GEN-LAST:event_formWindowOpened

    private void buttonColetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonColetasActionPerformed
        // TODO add your handling code here:
        if(buttonColetas.getBackground() == Color.gray){
            JOptionPane.showMessageDialog(this, "Você não tem permissão para isso!");
        } else {
            setVisible(false);
            
            Coletas c = new Coletas(this, true);
            c.preparar();
            c.setVisible(true);
            
            setVisible(true);
            
        }
    }//GEN-LAST:event_buttonColetasActionPerformed

    private void buttonValidarExameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonValidarExameActionPerformed
        // TODO add your handling code here:
        if(buttonValidarExame.getBackground() == Color.gray){
            JOptionPane.showMessageDialog(this, "Você não tem permissão para isso!");
        } else {
            
            setVisible(false);
            
            ValidarExames vt = new ValidarExames(this, true);            
            vt.preparar();            
            vt.setVisible(true);
            
            setVisible(true);
            
        }
    }//GEN-LAST:event_buttonValidarExameActionPerformed

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_buttonSairActionPerformed

    private void buttonExamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExamesActionPerformed
        // TODO add your handling code here:
        if(buttonExames.getBackground() == Color.gray){
            JOptionPane.showMessageDialog(this, "Você não tem permissão para isso!");
        } else {
            setVisible(false);
                
            Exames exames = new Exames(this, true);
            exames.preparar();
            exames.setVisible(true);
            
             setVisible(true);
        } 
    }//GEN-LAST:event_buttonExamesActionPerformed

    private void buttonAdicionarExamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarExamesActionPerformed
        // TODO add your handling code here:
        if(buttonAdicionarExames.getBackground() == Color.gray){
            JOptionPane.showMessageDialog(this, "Você não tem permissão para isso!");
        } else {
            setVisible(false);
                
            AdicionarExame adde = new AdicionarExame(this, true);
            adde.preparar();
            adde.setVisible(true);
            
            setVisible(true);
        } 
    }//GEN-LAST:event_buttonAdicionarExamesActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Coleta;
    private javax.swing.JLabel Paciente;
    private javax.swing.JLabel Teste;
    private javax.swing.JLabel Teste1;
    private javax.swing.JButton buttonAdicionarColeta;
    private javax.swing.JButton buttonAdicionarExames;
    private javax.swing.JButton buttonAdicionarPaciente;
    private javax.swing.JButton buttonColetas;
    private javax.swing.JButton buttonExames;
    private javax.swing.JButton buttonPacientes;
    private javax.swing.JButton buttonRelatorioSupervisor;
    private javax.swing.JButton buttonSair;
    private javax.swing.JButton buttonTestes;
    private javax.swing.JButton buttonValidarExame;
    private javax.swing.JLabel duGustinClinicas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel microscopio;
    private javax.swing.JLabel nomeUsuario;
    private javax.swing.JPanel preto;
    // End of variables declaration//GEN-END:variables

    private void preparaMain(){
        nomeUsuario.setText(user.getUser().toUpperCase());
        switch(user.getUser()){
            case "cadastro":
                preparaCadastro();
                break;
            case "responsavel":
                preparaResponsavel();
                break;
            case "supervisor":
                preparaSupervisor();
                break;
            default:
                preparaPaciente();
                break;
        }      
    }
    
    private void preparaCadastro(){
        buttonRelatorioSupervisor.setBackground(Color.gray);
        buttonValidarExame.setBackground(Color.gray);
        buttonExames.setBackground(Color.gray);
        buttonAdicionarExames.setBackground(Color.gray);
    }
    
    private void preparaResponsavel(){
        buttonAdicionarPaciente.setBackground(Color.gray);
        buttonPacientes.setBackground(Color.gray);
        buttonAdicionarColeta.setBackground(Color.gray);
        buttonColetas.setBackground(Color.gray);
        buttonValidarExame.setBackground(Color.gray);
        buttonRelatorioSupervisor.setBackground(Color.gray);
        buttonTestes.setBackground(Color.gray);
    }
    
    private void preparaSupervisor(){
        buttonAdicionarPaciente.setBackground(Color.gray);
        buttonPacientes.setBackground(Color.gray);
        buttonAdicionarColeta.setBackground(Color.gray);
        buttonColetas.setBackground(Color.gray);
        buttonTestes.setBackground(Color.gray); 
        buttonExames.setBackground(Color.gray);
        buttonAdicionarExames.setBackground(Color.gray);
    }
    
    private void preparaPaciente(){
        setVisible(false);
        
        GerarRelatorioPaciente gr = new GerarRelatorioPaciente(this, true);
        
        try{
            Paciente paciente = new DAOPaciente().selectPk(user.getUser());
            gr.preparar(paciente);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexão com SQL");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro no driver");
        }           
        
        gr.setVisible(true);
        
        setVisible(true);
    }


}