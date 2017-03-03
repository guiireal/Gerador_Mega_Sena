package br.gfrancav.pacotefonte;

import java.util.ArrayList;
import java.util.Collections;

public class JanelaPrincipal extends javax.swing.JFrame {

    /* CONSTRUTOR QUE INVOCA O MÉTODO DE CRIAÇÃO DA JANELA */
    public JanelaPrincipal() {
        initComponents();
        lblNum1.setVisible(false);
        lblNum2.setVisible(false);
        lblNum3.setVisible(false);
        lblNum4.setVisible(false);
        lblNum5.setVisible(false);
        lblNum6.setVisible(false);
    }
    
    /* CÓDIGO GERADO AUTOMATICAMENTE */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imgLogo = new javax.swing.JLabel();
        lblNum1 = new javax.swing.JLabel();
        lblNum2 = new javax.swing.JLabel();
        lblNum3 = new javax.swing.JLabel();
        lblNum4 = new javax.swing.JLabel();
        lblNum5 = new javax.swing.JLabel();
        lblNum6 = new javax.swing.JLabel();
        imgBola2 = new javax.swing.JLabel();
        imgBola1 = new javax.swing.JLabel();
        imgBola4 = new javax.swing.JLabel();
        imgBola3 = new javax.swing.JLabel();
        imgBola6 = new javax.swing.JLabel();
        imgBola5 = new javax.swing.JLabel();
        btnClique = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerador de números da Mega-Sena");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gfrancav/imagens/LogoMegaSena.png"))); // NOI18N
        getContentPane().add(imgLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, -1, -1));

        lblNum1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNum1.setForeground(new java.awt.Color(255, 255, 255));
        lblNum1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNum1.setText("11");
        lblNum1.setToolTipText("");
        getContentPane().add(lblNum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 30, 33));

        lblNum2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNum2.setForeground(new java.awt.Color(255, 255, 255));
        lblNum2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNum2.setText("11");
        lblNum2.setToolTipText("");
        getContentPane().add(lblNum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 40, 30));

        lblNum3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNum3.setForeground(new java.awt.Color(255, 255, 255));
        lblNum3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNum3.setText("11");
        lblNum3.setToolTipText("");
        getContentPane().add(lblNum3, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 130, 20, 27));

        lblNum4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNum4.setForeground(new java.awt.Color(255, 255, 255));
        lblNum4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNum4.setText("11");
        lblNum4.setToolTipText("");
        getContentPane().add(lblNum4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 30, 27));

        lblNum5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNum5.setForeground(new java.awt.Color(255, 255, 255));
        lblNum5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNum5.setText("11");
        lblNum5.setToolTipText("");
        getContentPane().add(lblNum5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 20, 27));

        lblNum6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNum6.setForeground(new java.awt.Color(255, 255, 255));
        lblNum6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNum6.setText("11");
        getContentPane().add(lblNum6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 30, 27));

        imgBola2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gfrancav/imagens/BolaMegaSena.png"))); // NOI18N
        getContentPane().add(imgBola2, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 109, -1, -1));

        imgBola1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gfrancav/imagens/BolaMegaSena.png"))); // NOI18N
        getContentPane().add(imgBola1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 109, -1, -1));

        imgBola4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gfrancav/imagens/BolaMegaSena.png"))); // NOI18N
        getContentPane().add(imgBola4, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 109, -1, -1));

        imgBola3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gfrancav/imagens/BolaMegaSena.png"))); // NOI18N
        getContentPane().add(imgBola3, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 109, -1, -1));

        imgBola6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gfrancav/imagens/BolaMegaSena.png"))); // NOI18N
        imgBola6.setToolTipText("");
        getContentPane().add(imgBola6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 109, -1, -1));

        imgBola5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/gfrancav/imagens/BolaMegaSena.png"))); // NOI18N
        getContentPane().add(imgBola5, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 109, -1, -1));

        btnClique.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnClique.setForeground(new java.awt.Color(0, 153, 0));
        btnClique.setText("GERAR NÚMEROS");
        btnClique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCliqueActionPerformed(evt);
            }
        });
        getContentPane().add(btnClique, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 170, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCliqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCliqueActionPerformed
        
        ArrayList<Integer> numerosAleatorios = new ArrayList<>();
        ArrayList<Integer> numerosOrganizados = new ArrayList<>();
        for(int i = 1; i <= 60; i++) {
            numerosAleatorios.add(i);
        }
        Collections.shuffle(numerosAleatorios);
        for(int i = 0; i < 6; i++) {
            numerosOrganizados.add(numerosAleatorios.get(i));
        }
        Collections.sort(numerosOrganizados);
        lblNum1.setVisible(true);
        lblNum2.setVisible(true);
        lblNum3.setVisible(true);
        lblNum4.setVisible(true);
        lblNum5.setVisible(true);
        lblNum6.setVisible(true);
        lblNum1.setText(Integer.toString(numerosOrganizados.get(0)));
        lblNum2.setText(Integer.toString(numerosOrganizados.get(1)));
        lblNum3.setText(Integer.toString(numerosOrganizados.get(2)));
        lblNum4.setText(Integer.toString(numerosOrganizados.get(3)));
        lblNum5.setText(Integer.toString(numerosOrganizados.get(4)));
        lblNum6.setText(Integer.toString(numerosOrganizados.get(5)));
  
    }//GEN-LAST:event_btnCliqueActionPerformed

    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        /* CRIAÇÃO DA JANELA */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClique;
    private javax.swing.JLabel imgBola1;
    private javax.swing.JLabel imgBola2;
    private javax.swing.JLabel imgBola3;
    private javax.swing.JLabel imgBola4;
    private javax.swing.JLabel imgBola5;
    private javax.swing.JLabel imgBola6;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JLabel lblNum1;
    private javax.swing.JLabel lblNum2;
    private javax.swing.JLabel lblNum3;
    private javax.swing.JLabel lblNum4;
    private javax.swing.JLabel lblNum5;
    private javax.swing.JLabel lblNum6;
    // End of variables declaration//GEN-END:variables
}
