package imusic;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.net.URL;

public class iMusic extends javax.swing.JFrame {

    private URL breaking_bad = getClass().getResource("breaking.mp3");
    private URL knows = getClass().getResource("");
    private URL holmes = getClass().getResource("");
    private URL vikings = getClass().getResource("");
    private URL grimm = getClass().getResource("");
    private URL grimm_creditos = getClass().getResource("grimm_creditos.mp3");
    
    AudioClip bad = Applet.newAudioClip(breaking_bad);
    AudioClip everybody = Applet.newAudioClip(knows);
    AudioClip sherlock = Applet.newAudioClip(holmes);
    AudioClip vikings_sound = Applet.newAudioClip(vikings);
    AudioClip grimm_sound = Applet.newAudioClip(grimm);
    AudioClip grimm_creditos_sound = Applet.newAudioClip(grimm_creditos);
    
    public iMusic() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnPrincipal = new javax.swing.JPanel();
        lbl_breaking = new javax.swing.JLabel();
        lbl_everybody = new javax.swing.JLabel();
        lbl_sherlock = new javax.swing.JLabel();
        lbl_vikings = new javax.swing.JLabel();
        lbl_grimm = new javax.swing.JLabel();
        lbl_grimm_creditos = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnPrincipal.setBackground(new java.awt.Color(0, 0, 0));

        lbl_breaking.setFont(new java.awt.Font("Anonymous Pro", 0, 14)); // NOI18N
        lbl_breaking.setForeground(new java.awt.Color(255, 255, 255));
        lbl_breaking.setText("Breaking Bad");
        lbl_breaking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_breakingMouseClicked(evt);
            }
        });

        lbl_everybody.setFont(new java.awt.Font("Anonymous Pro", 0, 14)); // NOI18N
        lbl_everybody.setForeground(new java.awt.Color(255, 255, 255));
        lbl_everybody.setText("Everybody Knows");
        lbl_everybody.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_everybodyMouseClicked(evt);
            }
        });

        lbl_sherlock.setFont(new java.awt.Font("Anonymous Pro", 0, 14)); // NOI18N
        lbl_sherlock.setForeground(new java.awt.Color(255, 255, 255));
        lbl_sherlock.setText("Sherlock Holmes");
        lbl_sherlock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_sherlockMouseClicked(evt);
            }
        });

        lbl_vikings.setFont(new java.awt.Font("Anonymous Pro", 0, 14)); // NOI18N
        lbl_vikings.setForeground(new java.awt.Color(255, 255, 255));
        lbl_vikings.setText("Vikings soundtrack");
        lbl_vikings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_vikingsMouseClicked(evt);
            }
        });

        lbl_grimm.setFont(new java.awt.Font("Anonymous Pro", 0, 14)); // NOI18N
        lbl_grimm.setForeground(new java.awt.Color(255, 255, 255));
        lbl_grimm.setText("Grimm soundtrack");
        lbl_grimm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_grimmMouseClicked(evt);
            }
        });

        lbl_grimm_creditos.setFont(new java.awt.Font("Anonymous Pro", 0, 14)); // NOI18N
        lbl_grimm_creditos.setForeground(new java.awt.Color(255, 255, 255));
        lbl_grimm_creditos.setText("Grimm - creditos");
        lbl_grimm_creditos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_grimm_creditosMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Anonymous Pro", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("jLabel7");

        jLabel8.setFont(new java.awt.Font("Anonymous Pro", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("jLabel8");

        jLabel9.setFont(new java.awt.Font("Anonymous Pro", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("jLabel9");

        jLabel10.setFont(new java.awt.Font("Anonymous Pro", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("jLabel10");

        jLabel11.setFont(new java.awt.Font("Anonymous Pro", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("jLabel11");

        javax.swing.GroupLayout pnPrincipalLayout = new javax.swing.GroupLayout(pnPrincipal);
        pnPrincipal.setLayout(pnPrincipalLayout);
        pnPrincipalLayout.setHorizontalGroup(
            pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_breaking)
                    .addComponent(lbl_everybody)
                    .addComponent(lbl_sherlock)
                    .addComponent(lbl_vikings)
                    .addComponent(lbl_grimm)
                    .addComponent(lbl_grimm_creditos)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addContainerGap(618, Short.MAX_VALUE))
        );
        pnPrincipalLayout.setVerticalGroup(
            pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_breaking)
                .addGap(12, 12, 12)
                .addComponent(lbl_everybody)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_sherlock)
                .addGap(12, 12, 12)
                .addComponent(lbl_vikings)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_grimm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_grimm_creditos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addContainerGap(222, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_everybodyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_everybodyMouseClicked
        lbl_everybody.setForeground(Color.GREEN);
        everybody.loop();
    }//GEN-LAST:event_lbl_everybodyMouseClicked

    private void lbl_sherlockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_sherlockMouseClicked
        lbl_sherlock.setForeground(Color.GREEN);
        sherlock.loop();
    }//GEN-LAST:event_lbl_sherlockMouseClicked

    private void lbl_vikingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_vikingsMouseClicked
        lbl_vikings.setForeground(Color.GREEN);
        vikings_sound.loop();
    }//GEN-LAST:event_lbl_vikingsMouseClicked

    private void lbl_grimmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_grimmMouseClicked
        lbl_grimm.setForeground(Color.GREEN);
        grimm_sound.loop();
    }//GEN-LAST:event_lbl_grimmMouseClicked

    private void lbl_grimm_creditosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_grimm_creditosMouseClicked
        lbl_grimm_creditos.setForeground(Color.GREEN);
        grimm_creditos_sound.loop();
    }//GEN-LAST:event_lbl_grimm_creditosMouseClicked

    private void lbl_breakingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_breakingMouseClicked
        lbl_breaking.setForeground(Color.GREEN);
        bad.loop();
    }//GEN-LAST:event_lbl_breakingMouseClicked

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
            java.util.logging.Logger.getLogger(iMusic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(iMusic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(iMusic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(iMusic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new iMusic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbl_breaking;
    private javax.swing.JLabel lbl_everybody;
    private javax.swing.JLabel lbl_grimm;
    private javax.swing.JLabel lbl_grimm_creditos;
    private javax.swing.JLabel lbl_sherlock;
    private javax.swing.JLabel lbl_vikings;
    private javax.swing.JPanel pnPrincipal;
    // End of variables declaration//GEN-END:variables
}
