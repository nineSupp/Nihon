
import java.awt.Image;
import javax.swing.ImageIcon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author pilotjones
 */
public class creditUI extends javax.swing.JFrame {

    /**
     * Creates new form creditUI
     */
    public creditUI() {
        initComponents();
        Image img = new ImageIcon(this.getClass().getResource("assets/jpnFlag"
                + ".png")).getImage();
        this.setIconImage(img);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        stu1 = new javax.swing.JLabel();
        stu2 = new javax.swing.JLabel();
        stu3 = new javax.swing.JLabel();
        stu4 = new javax.swing.JLabel();
        stu5 = new javax.swing.JLabel();
        backLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        mainSakura = new javax.swing.JLabel();
        bgFade = new javax.swing.JLabel();
        bgColor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nihon-Go");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        mainPanel.setPreferredSize(new java.awt.Dimension(1280, 720));
        mainPanel.setLayout(null);

        title.setFont(new java.awt.Font("Manga Temple", 1, 48)); // NOI18N
        title.setForeground(new java.awt.Color(46, 3, 37));
        title.setText("Group 1");
        mainPanel.add(title);
        title.setBounds(520, 110, 250, 70);

        stu1.setFont(new java.awt.Font("Manga Temple", 1, 24)); // NOI18N
        stu1.setForeground(new java.awt.Color(46, 3, 37));
        stu1.setText("hassadapong songraksa 2420210045");
        mainPanel.add(stu1);
        stu1.setBounds(340, 210, 600, 70);

        stu2.setFont(new java.awt.Font("Manga Temple", 1, 24)); // NOI18N
        stu2.setForeground(new java.awt.Color(46, 3, 37));
        stu2.setText("paing myo han kyaw 2420210284");
        mainPanel.add(stu2);
        stu2.setBounds(370, 270, 530, 70);

        stu3.setFont(new java.awt.Font("Manga Temple", 1, 24)); // NOI18N
        stu3.setForeground(new java.awt.Color(46, 3, 37));
        stu3.setText("suppatouch srinual 2420210037");
        mainPanel.add(stu3);
        stu3.setBounds(370, 390, 530, 70);

        stu4.setFont(new java.awt.Font("Manga Temple", 1, 24)); // NOI18N
        stu4.setForeground(new java.awt.Color(46, 3, 37));
        stu4.setText("narak intawong 2420210060");
        mainPanel.add(stu4);
        stu4.setBounds(400, 450, 460, 70);

        stu5.setFont(new java.awt.Font("Manga Temple", 1, 24)); // NOI18N
        stu5.setForeground(new java.awt.Color(46, 3, 37));
        stu5.setText("tanyalak thongkhao 2420210136");
        mainPanel.add(stu5);
        stu5.setBounds(360, 330, 530, 70);

        backLabel.setFont(new java.awt.Font("Manga Temple", 1, 18)); // NOI18N
        backLabel.setForeground(new java.awt.Color(46, 3, 37));
        backLabel.setText("BACK");
        mainPanel.add(backLabel);
        backLabel.setBounds(610, 620, 70, 40);

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/button.png"))); // NOI18N
        backButton.setBorder(null);
        backButton.setBorderPainted(false);
        backButton.setContentAreaFilled(false);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        mainPanel.add(backButton);
        backButton.setBounds(540, 620, 200, 50);

        mainSakura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/mainSakura.png"))); // NOI18N
        mainPanel.add(mainSakura);
        mainSakura.setBounds(0, 0, 1280, 720);

        bgFade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/fade.png"))); // NOI18N
        mainPanel.add(bgFade);
        bgFade.setBounds(0, 0, 1280, 720);

        bgColor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/bgColor.png"))); // NOI18N
        mainPanel.add(bgColor);
        bgColor.setBounds(0, 0, 1280, 720);

        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        mainUI mui = new mainUI();

        mui.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(creditUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(creditUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(creditUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(creditUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new creditUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel backLabel;
    private javax.swing.JLabel bgColor;
    private javax.swing.JLabel bgFade;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel mainSakura;
    private javax.swing.JLabel stu1;
    private javax.swing.JLabel stu2;
    private javax.swing.JLabel stu3;
    private javax.swing.JLabel stu4;
    private javax.swing.JLabel stu5;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
