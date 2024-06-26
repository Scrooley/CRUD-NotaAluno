/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author alunos
 */
public class FormAluno extends javax.swing.JFrame {
    
    ControleAluno controle = new ControleAluno();

    /**
     * Creates new form FormAluno
     */
    public FormAluno() {
        controle.Conecta();
        initComponents();
        setLocationRelativeTo(null);
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
        jLabel2 = new javax.swing.JLabel();
        textaluno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textrgm = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textnota1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textnota2 = new javax.swing.JTextField();
        ButCadastrar = new javax.swing.JButton();
        ButConsultar = new javax.swing.JButton();
        ButAlterar = new javax.swing.JButton();
        ButExcluir = new javax.swing.JButton();
        ButListar = new javax.swing.JButton();
        ButMedia = new javax.swing.JButton();
        textmedia = new javax.swing.JTextField();
        ButSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ALUNO");

        jLabel2.setText("nome");

        jLabel3.setText("rgm");

        textrgm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textrgmActionPerformed(evt);
            }
        });

        jLabel4.setText("nota 1");

        textnota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textnota1ActionPerformed(evt);
            }
        });

        jLabel5.setText("nota 2");

        ButCadastrar.setText("CADASTRAR");
        ButCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButCadastrarActionPerformed(evt);
            }
        });

        ButConsultar.setText("CONSULTAR");
        ButConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButConsultarActionPerformed(evt);
            }
        });

        ButAlterar.setText("ALTERAR");
        ButAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButAlterarActionPerformed(evt);
            }
        });

        ButExcluir.setText("EXCLUIR");
        ButExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButExcluirActionPerformed(evt);
            }
        });

        ButListar.setText("LISTAR");
        ButListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButListarActionPerformed(evt);
            }
        });

        ButMedia.setText("MEDIA");
        ButMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButMediaActionPerformed(evt);
            }
        });

        textmedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textmediaActionPerformed(evt);
            }
        });

        ButSair.setText("SAIR");
        ButSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ButSair)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(textnota2))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(textnota1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(textrgm)
                                            .addComponent(textaluno))))
                                .addGap(107, 107, 107))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ButCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ButConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(ButAlterar))
                                .addGap(12, 12, 12)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ButExcluir)
                                .addGap(12, 12, 12)
                                .addComponent(ButListar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textmedia, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(ButMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textrgm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(textaluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(textnota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButMedia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textmedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textnota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButCadastrar)
                    .addComponent(ButConsultar)
                    .addComponent(ButAlterar)
                    .addComponent(ButExcluir)
                    .addComponent(ButListar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(ButSair)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButExcluirActionPerformed
       controle.Excluir(Integer.parseInt(this.textrgm.getText()));
    }//GEN-LAST:event_ButExcluirActionPerformed

    private void ButCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButCadastrarActionPerformed
       int rgm=Integer.parseInt(this.textrgm.getText());
       String nome=this.textaluno.getText();
       double not1=Double.parseDouble(this.textnota1.getText());
       double not2=Double.parseDouble(this.textnota2.getText());
       controle.Cadastrar(rgm, nome, not1, not2);
       this.textrgm.setText("");
       this.textaluno.setText("");
       this.textnota1.setText("");
       this.textnota2.setText("");
        
    }//GEN-LAST:event_ButCadastrarActionPerformed

    private void ButListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButListarActionPerformed
        controle.Listar();
    }//GEN-LAST:event_ButListarActionPerformed

    private void ButConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButConsultarActionPerformed
        
        String info=controle.Consultar(Integer.parseInt(this.textrgm.getText()));
        if (!info.equals("")){
           String vetor[]=info.split(";");
           this.textaluno.setText(vetor[1]);
           this.textnota1.setText(vetor[2]);
           this.textnota2.setText(vetor[3]);
        }
        else{
            this.textrgm.setText("");
        }
    }//GEN-LAST:event_ButConsultarActionPerformed

    private void textrgmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textrgmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textrgmActionPerformed

    private void ButAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButAlterarActionPerformed
        controle.Alterar(Integer.parseInt(this.textrgm.getText()),this.textaluno.getText(),
                Double.parseDouble(this.textnota1.getText()),
                Double.parseDouble(this.textnota2.getText()));
    }//GEN-LAST:event_ButAlterarActionPerformed

    private void ButMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButMediaActionPerformed
        double n1=Double.parseDouble(this.textnota1.getText());
        double n2=Double.parseDouble(this.textnota2.getText());
        this.textmedia.setText(""+controle.CalcMedia(n1,n2));
    }//GEN-LAST:event_ButMediaActionPerformed

    private void ButSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ButSairActionPerformed

    private void textnota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textnota1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textnota1ActionPerformed

    private void textmediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textmediaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textmediaActionPerformed

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
            java.util.logging.Logger.getLogger(FormAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButAlterar;
    private javax.swing.JButton ButCadastrar;
    private javax.swing.JButton ButConsultar;
    private javax.swing.JButton ButExcluir;
    private javax.swing.JButton ButListar;
    private javax.swing.JButton ButMedia;
    private javax.swing.JButton ButSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField textaluno;
    private javax.swing.JTextField textmedia;
    private javax.swing.JTextField textnota1;
    private javax.swing.JTextField textnota2;
    private javax.swing.JTextField textrgm;
    // End of variables declaration//GEN-END:variables
}
