/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author pilotjones
 */

import java.util.Random;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Image;
import javax.swing.ImageIcon;

public class katakanaUI extends javax.swing.JFrame {
    private Hira h = new Hira();
    private Random random = new Random();
    private int nA;
    private String t1,t2,t3,a;
    private int score = 0;
    private boolean check;

    public katakanaUI() {
        h.ganQuestion();
        nA = random.nextInt(1, 4); // Random number between 1 and 3
        t1 = h.getText(); // Text for button 1
        t2 = h.getText2(); // Text for button 2
        t3 = h.getText3(); // Text for button 3
        a = h.getAnswer();// Correct answer text
         
        initComponents();
        Image img = new ImageIcon(this.getClass().getResource("assets/jpnFlag" 
                + ".png")).getImage();
        this.setIconImage(img);
        
        h.getLocation(a);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                h.getLo())));
        nA = random.nextInt(3); // Randomly select 0, 1, or 2

        // Assign correct answer to one of the buttons
        if (nA == 0) {
            jButton1.setText(a); // Correct answer on button 1
            jButton2.setText(t1); // Random incorrect answer on button 2
            jButton3.setText(t2); // Random incorrect answer on button 3
        } else if (nA == 1) {
            jButton1.setText(t1); // Random incorrect answer on button 1
            jButton2.setText(a); // Correct answer on button 2
            jButton3.setText(t2); // Random incorrect answer on button 3
        } else {
            jButton1.setText(t3); // Random incorrect answer on button 1
            jButton2.setText(t2); // Random incorrect answer on button 2
            jButton3.setText(a); // Correct answer on button 3
        }
    
        jLabel2.setText(String.valueOf(score));
    }

    public void hiraganaUI() {
        h.ganQuestion();
        nA = random.nextInt(1, 4); // Random number between 1 and 3
        t1 = h.getText(); // Text for button 1
        t2 = h.getText2(); // Text for button 2
        t3 = h.getText3(); // Text for button 3
        a = h.getAnswer();// Correct answer text
        
        Image img = new ImageIcon(this.getClass().getResource("assets/jpnFlag"  
                + ".png")).getImage();
        this.setIconImage(img);
        
        h.getLocation(a);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                h.getLo())));
        
        nA = random.nextInt(3); // Randomly select 0, 1, or 2

        // Assign correct answer to one of the buttons
        if (nA == 0) {
            jButton1.setText(a); // Correct answer on button 1
            jButton2.setText(t1); // Random incorrect answer on button 2
            jButton3.setText(t2); // Random incorrect answer on button 3
        } else if (nA == 1) {
            jButton1.setText(t1); // Random incorrect answer on button 1
            jButton2.setText(a); // Correct answer on button 2
            jButton3.setText(t2); // Random incorrect answer on button 3
        } else {
            jButton1.setText(t3); // Random incorrect answer on button 1
            jButton2.setText(t2); // Random incorrect answer on button 2
            jButton3.setText(a); // Correct answer on button 3
        }
        
        jLabel2.setText(String.valueOf(score));
    }
    
    public void Time(){
        if(check){
            jPopupMenu1.add("Correct");
            jPopupMenu1.setVisible(true);
        }else{
            jPopupMenu1.add("Wrong");
            jPopupMenu1.setVisible(true);
        }
        Timer timer = new Timer(1500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                jPopupMenu1.setVisible(false);  // Hide the popup
                jPopupMenu1.removeAll();
            }
        });
        
        timer.setRepeats(false);  // Only execute once
        timer.start();  // Start the timer
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        mainPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        backLabel = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        mainSakura = new javax.swing.JLabel();
        bgFade = new javax.swing.JLabel();
        bgColor = new javax.swing.JLabel();

        jPopupMenu1.setDebugGraphicsOptions(javax.swing.DebugGraphics.FLASH_OPTION);
        jPopupMenu1.setLocation(860, 440);
        jPopupMenu1.setInvoker(mainPanel);
        jPopupMenu1.setPopupSize(new java.awt.Dimension(200, 200));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nihon-Go");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        mainPanel.setPreferredSize(new java.awt.Dimension(1280, 720));
        mainPanel.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setToolTipText("");
        mainPanel.add(jLabel1);
        jLabel1.setBounds(520, 110, 200, 200);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        mainPanel.add(jLabel2);
        jLabel2.setBounds(610, 50, 80, 40);

        backLabel.setFont(new java.awt.Font("Manga Temple", 1, 18)); // NOI18N
        backLabel.setForeground(new java.awt.Color(46, 3, 37));
        backLabel.setText("BACK");
        mainPanel.add(backLabel);
        backLabel.setBounds(610, 600, 70, 40);

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
        backButton.setBounds(540, 600, 200, 50);

        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        //if(b1==nA){
            //jButton1.setText(a);
            //}else{
            //jButton1.setText(t1);
            //}
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        mainPanel.add(jButton1);
        jButton1.setBounds(260, 390, 100, 100);

        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        //if(b2==nA){
            //jButton2.setText(a);
            //}else{
            //jButton2.setText(t2);
            //}
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        mainPanel.add(jButton2);
        jButton2.setBounds(570, 390, 100, 100);

        //if(b3==nA){
            //jButton3.setText(a);
            //}else{
            //jButton3.setText(t3);
            //}
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        mainPanel.add(jButton3);
        jButton3.setBounds(880, 390, 100, 100);

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
        newGameUI ngui = new newGameUI();

        ngui.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        if (jButton1.getText().equals(a)){
           jPopupMenu1.isPopupTrigger(evt);
            check = true; 
            Time();
            score++;
            hiraganaUI();  
        } else {
            jPopupMenu1.isPopupTrigger(evt);
            check=false;
            Time();
            score--;
            hiraganaUI();
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        if(jButton2.getText().equals(a)){
            jPopupMenu1.isPopupTrigger(evt);
            check = true;
            Time();
            score++;
            hiraganaUI();  
        } else {
            jPopupMenu1.isPopupTrigger(evt);
            check = false; 
            Time();
            score--;
            hiraganaUI();
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        
        if(jButton3.getText().equals(a)){
            jPopupMenu1.isPopupTrigger(evt);
        check=true; 
        Time();
        score++;
      hiraganaUI();  
            
        }else{
           jPopupMenu1.isPopupTrigger(evt);
        check=false; 
        Time();
        score--;
      hiraganaUI();         
    }//GEN-LAST:event_jButton3MouseClicked
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
            java.util.logging.Logger.getLogger(hiraganaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hiraganaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hiraganaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hiraganaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public  void run() {
                new hiraganaUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel backLabel;
    private javax.swing.JLabel bgColor;
    private javax.swing.JLabel bgFade;
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel mainSakura;
    // End of variables declaration//GEN-END:variables
}
