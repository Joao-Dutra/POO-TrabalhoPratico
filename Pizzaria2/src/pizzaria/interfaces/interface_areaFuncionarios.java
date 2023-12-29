/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pizzaria.interfaces;

import java.awt.Color;

/**
 *
 * @author usuario
 */
public class interface_areaFuncionarios extends javax.swing.JFrame {

    /**
     * Creates new form interface_areafuncionarios
     */
    public interface_areaFuncionarios() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        b_gerencia = new javax.swing.JButton();
        b_cozinha = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        b_retornar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        titulo_listafuncionarios = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(850, 790));

        jPanel1.setBackground(new java.awt.Color(147, 26, 37));
        jPanel1.setPreferredSize(new java.awt.Dimension(845, 885));

        jPanel2.setBackground(new java.awt.Color(85, 0, 0));

        b_gerencia.setBackground(new java.awt.Color(233, 113, 113));
        b_gerencia.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        b_gerencia.setForeground(new java.awt.Color(245, 239, 239));
        b_gerencia.setText("Acessar Gerência");
        b_gerencia.setBorderPainted(false);
        b_gerencia.setFocusPainted(false);
        b_gerencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b_gerenciaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b_gerenciaMouseExited(evt);
            }
        });
        b_gerencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_gerenciaActionPerformed(evt);
            }
        });

        b_cozinha.setBackground(new java.awt.Color(233, 113, 113));
        b_cozinha.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        b_cozinha.setForeground(new java.awt.Color(245, 239, 239));
        b_cozinha.setText("Acessar Cozinha");
        b_cozinha.setBorderPainted(false);
        b_cozinha.setFocusPainted(false);
        b_cozinha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b_cozinhaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b_cozinhaMouseExited(evt);
            }
        });
        b_cozinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cozinhaActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaria.icons/Cozinha.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaria.icons/Gerente.png"))); // NOI18N

        b_retornar.setBackground(new java.awt.Color(85, 0, 0));
        b_retornar.setForeground(new java.awt.Color(245, 239, 239));
        b_retornar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaria.icons/saida.png"))); // NOI18N
        b_retornar.setBorderPainted(false);
        b_retornar.setFocusPainted(false);
        b_retornar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                b_retornarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                b_retornarMouseExited(evt);
            }
        });
        b_retornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_retornarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(b_retornar)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(b_cozinha, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel2))
                            .addComponent(b_gerencia, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(71, 71, 71))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(90, 90, 90))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(b_retornar)
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(b_gerencia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(b_cozinha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jPanel3.setBackground(new java.awt.Color(85, 0, 0));

        titulo_listafuncionarios.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 48)); // NOI18N
        titulo_listafuncionarios.setForeground(new java.awt.Color(245, 239, 239));
        titulo_listafuncionarios.setText("Funcionários Ativos:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo_listafuncionarios)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(titulo_listafuncionarios))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    }// </editor-fold>//GEN-END:initComponents

    private void b_retornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_retornarActionPerformed
        interface_entrada i_entrada = new interface_entrada();
        i_entrada.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_b_retornarActionPerformed

    private void b_retornarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_retornarMouseEntered
        b_retornar.setBackground(new Color(55, 0, 0));
    }//GEN-LAST:event_b_retornarMouseEntered

    private void b_retornarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_retornarMouseExited
        b_retornar.setBackground(new Color(85, 0, 0));
    }//GEN-LAST:event_b_retornarMouseExited

    private void b_gerenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_gerenciaActionPerformed
        interface_gerencia i_gerencia = new interface_gerencia();
        i_gerencia.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_b_gerenciaActionPerformed

    private void b_gerenciaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_gerenciaMouseEntered
        b_gerencia.setBackground(new Color(233, 143, 143));
    }//GEN-LAST:event_b_gerenciaMouseEntered

    private void b_gerenciaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_gerenciaMouseExited
        b_gerencia.setBackground(new Color(233, 113, 113));
    }//GEN-LAST:event_b_gerenciaMouseExited

    private void b_cozinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cozinhaActionPerformed
        interface_cozinha i_cozinha = new interface_cozinha();
        i_cozinha.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_b_cozinhaActionPerformed

    private void b_cozinhaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_cozinhaMouseEntered
        b_cozinha.setBackground(new Color(233, 143, 143));
    }//GEN-LAST:event_b_cozinhaMouseEntered

    private void b_cozinhaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_cozinhaMouseExited
        b_cozinha.setBackground(new Color(233, 113, 113));
    }//GEN-LAST:event_b_cozinhaMouseExited

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
            java.util.logging.Logger.getLogger(interface_areaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interface_areaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interface_areaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interface_areaFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interface_areaFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_cozinha;
    private javax.swing.JButton b_gerencia;
    private javax.swing.JButton b_retornar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel titulo_listafuncionarios;
    // End of variables declaration//GEN-END:variables
}
