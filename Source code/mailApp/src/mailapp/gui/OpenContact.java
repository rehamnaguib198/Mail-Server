/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mailapp.gui;

import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import linkedList.cs45_cs23.LinkedList;
import static mailapp.gui.AddContactGui.nameAddCon2;
import mailapp.logicCode.UserContacts;
import mailapp.logicCode.UserContactsFunctions;

/**
 *
 * @author محمد
 */
public class OpenContact extends javax.swing.JFrame {
    
    int xMouse;
    int yMouse;
    public static String currentUser;
    public static UserContacts uc = new UserContacts();
    public LinkedList emails = new LinkedList();
    ContactsGui showContactsGui;

    //Inbox in2;
    /**
     * Creates new form OpenContact
     */
    public OpenContact(String current, JFrame frame1) {
        
        initComponents();
        showContactsGui = (ContactsGui) frame1;
        //in2=(Inbox)frame2;
        currentUser = current;
        openContactPanel.setVisible(true);
        openContactPanel1.setVisible(false);
        jScrollPane1.getViewport().setOpaque(false);
        jTextArea1.setBackground(new Color(0, 0, 0, 10));
        
    }
    
    private OpenContact() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        openContactPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        nameOpenCont1 = new javax.swing.JLabel();
        nameOpenCont2 = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        dragFrame = new javax.swing.JLabel();
        nameOpenCont = new javax.swing.JLabel();
        composeOpenCont = new javax.swing.JLabel();
        editOpenCon = new javax.swing.JLabel();
        backgroundOpenCont = new javax.swing.JLabel();
        openContactPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nameAddCon3 = new javax.swing.JTextField();
        nameAddCon2 = new javax.swing.JTextField();
        nameEditCont = new javax.swing.JTextField();
        numberEditCont = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        minimize1 = new javax.swing.JLabel();
        exit1 = new javax.swing.JLabel();
        dragFrame1 = new javax.swing.JLabel();
        saveEditContact = new javax.swing.JLabel();
        error = new javax.swing.JLabel();
        backgroundOpenCont1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        openContactPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);
        jScrollPane1.setForeground(new java.awt.Color(0, 51, 102));
        jScrollPane1.setEnabled(false);
        jScrollPane1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jScrollPane1.setOpaque(false);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 51, 102));
        jTextArea1.setRows(5);
        jTextArea1.setBorder(null);
        jTextArea1.setFocusTraversalPolicyProvider(true);
        jTextArea1.setOpaque(false);
        jScrollPane1.setViewportView(jTextArea1);

        openContactPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 430, 210));

        nameOpenCont1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        nameOpenCont1.setForeground(new java.awt.Color(255, 255, 255));
        nameOpenCont1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        openContactPanel.add(nameOpenCont1, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 196, 437, 80));

        nameOpenCont2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        nameOpenCont2.setForeground(new java.awt.Color(255, 255, 255));
        nameOpenCont2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        openContactPanel.add(nameOpenCont2, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 70, 437, 80));

        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        openContactPanel.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(706, 5, 23, 40));

        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        openContactPanel.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(739, 5, 23, 40));

        dragFrame.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        dragFrame.setName(""); // NOI18N
        dragFrame.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                dragFrameMouseDragged(evt);
            }
        });
        dragFrame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dragFrameMousePressed(evt);
            }
        });
        openContactPanel.add(dragFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 2, 770, 45));

        nameOpenCont.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        nameOpenCont.setForeground(new java.awt.Color(255, 255, 255));
        nameOpenCont.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        openContactPanel.add(nameOpenCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 70, 437, 80));

        composeOpenCont.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        composeOpenCont.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                composeOpenContMouseClicked(evt);
            }
        });
        openContactPanel.add(composeOpenCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 594, 175, 65));

        editOpenCon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editOpenCon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editOpenConMouseClicked(evt);
            }
        });
        openContactPanel.add(editOpenCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 594, 150, 65));

        backgroundOpenCont.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mailapp/gui/OpenContact.png"))); // NOI18N
        openContactPanel.add(backgroundOpenCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 680));

        jLayeredPane1.add(openContactPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        openContactPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        openContactPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(656, 518, 82, 43));

        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        openContactPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(652, 428, 88, 44));

        nameAddCon3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        nameAddCon3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nameAddCon3.setBorder(null);
        nameAddCon3.setOpaque(false);
        openContactPanel1.add(nameAddCon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 368, 77, 40));

        nameAddCon2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        nameAddCon2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nameAddCon2.setBorder(null);
        nameAddCon2.setOpaque(false);
        openContactPanel1.add(nameAddCon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 503, 380, 70));

        nameEditCont.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        nameEditCont.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nameEditCont.setBorder(null);
        nameEditCont.setOpaque(false);
        openContactPanel1.add(nameEditCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 72, 443, 73));

        numberEditCont.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        numberEditCont.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numberEditCont.setBorder(null);
        numberEditCont.setOpaque(false);
        numberEditCont.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numberEditContKeyTyped(evt);
            }
        });
        openContactPanel1.add(numberEditCont, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 200, 443, 73));

        jScrollPane2.setBorder(null);
        jScrollPane2.setForeground(new java.awt.Color(0, 51, 102));
        jScrollPane2.setEnabled(false);
        jScrollPane2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jScrollPane2.setOpaque(false);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(0, 51, 102));
        jTextArea2.setRows(5);
        jTextArea2.setBorder(null);
        jTextArea2.setFocusTraversalPolicyProvider(true);
        jTextArea2.setOpaque(false);
        jScrollPane2.setViewportView(jTextArea2);

        openContactPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 370, 140));

        minimize1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimize1MouseClicked(evt);
            }
        });
        openContactPanel1.add(minimize1, new org.netbeans.lib.awtextra.AbsoluteConstraints(706, 5, 23, 40));

        exit1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit1MouseClicked(evt);
            }
        });
        openContactPanel1.add(exit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(739, 5, 23, 40));

        dragFrame1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        dragFrame1.setName(""); // NOI18N
        dragFrame1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                dragFrame1MouseDragged(evt);
            }
        });
        dragFrame1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dragFrame1MousePressed(evt);
            }
        });
        openContactPanel1.add(dragFrame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 2, 770, 45));

        saveEditContact.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveEditContact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveEditContactMouseClicked(evt);
            }
        });
        openContactPanel1.add(saveEditContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 595, 176, 65));

        error.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        error.setForeground(new java.awt.Color(255, 0, 0));
        error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        openContactPanel1.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, 170, 40));

        backgroundOpenCont1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mailapp/gui/EditContacts1.png"))); // NOI18N
        openContactPanel1.add(backgroundOpenCont1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 680));

        jLayeredPane1.add(openContactPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dragFrameMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragFrameMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_dragFrameMouseDragged

    private void dragFrameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragFrameMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_dragFrameMousePressed

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        // TODO add your handling code here:
        this.setState(Inbox.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exitMouseClicked

    private void minimize1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize1MouseClicked
        this.setState(Inbox.ICONIFIED);
    }//GEN-LAST:event_minimize1MouseClicked

    private void exit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit1MouseClicked
        this.dispose();
    }//GEN-LAST:event_exit1MouseClicked

    private void dragFrame1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragFrame1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_dragFrame1MouseDragged

    private void dragFrame1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dragFrame1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_dragFrame1MousePressed

    private void editOpenConMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editOpenConMouseClicked
        openContactPanel.setVisible(false);
        openContactPanel1.setVisible(true);

    }//GEN-LAST:event_editOpenConMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        UserContactsFunctions uc1 = new UserContactsFunctions();
        try {
            if (uc1.removeName(emails, Integer.parseInt(nameAddCon3.getText()))) {
                error.setText("");
                jTextArea2.setText(uc1.showNames(emails));
            } else {
                error.setText("Wrong index");
            }
        } catch (Exception e) {
            error.setText("Wrong index");
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        UserContactsFunctions uc1 = new UserContactsFunctions();
        if (nameAddCon2.getText().length() != 0) {
            try {
                if (uc1.checkExist(emails, nameAddCon2.getText())) {
                    
                    if (uc1.checkEmail(nameAddCon2.getText())) {
                        uc1.addEmails(emails, nameAddCon2.getText());
                        nameAddCon2.setText("");
                        jTextArea2.setText(uc1.showNames(emails));
                    }
                } else {
                    nameAddCon2.setText("Email Doesn't Exist");
                }
            } catch (IOException ex) {
                Logger.getLogger(AddContactGui.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            nameAddCon2.setText("Empty Field");
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void saveEditContactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveEditContactMouseClicked
        UserContactsFunctions uc1 = new UserContactsFunctions();
        UserContacts newU = new UserContacts();
        try {
            if (uc1.CheckUserName(currentUser, nameEditCont.getText()) || nameOpenCont2.getText().equals(nameEditCont.getText())) {
                if (numberEditCont.getText().length() == 7 || numberEditCont.getText().length() == 11) {
                    if (emails.size() != 0) {
                        newU.emails = emails;
                        newU.phoneNumber = numberEditCont.getText();
                        newU.userName = nameEditCont.getText();
                        uc1.editContact(currentUser, newU, uc.userName);
                        this.dispose();
                        uc1.setViewingOptions(currentUser, null, null, false);
                        UserContacts[] allContacts = (UserContacts[]) uc1.listContacts(1);
                        uc1.showContactsInTable(allContacts, showContactsGui.jTable1);
                        showContactsGui.allContacts = allContacts;
                    } else {
                        jTextArea2.setText("Contact must have at least 1 email");
                    }
                } else {
                    numberEditCont.setText("invalid phone number");
                }
            } else {
                nameEditCont.setText("This name is already used");
            }
        } catch (IOException ex) {
            Logger.getLogger(OpenContact.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveEditContactMouseClicked

    private void composeOpenContMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_composeOpenContMouseClicked
        showContactsGui.in.composeOptions.setVisible(true);
        showContactsGui.in.recieversNames.clear();
        while (!emails.isEmpty()) {
            showContactsGui.in.recieversNames.add(emails.get(0));
            emails.remove(0);
        }
        showContactsGui.in.composeCount++;
        showContactsGui.in.jTextArea1.setText("");
        showContactsGui.in.toCompose.setText("");
        showContactsGui.in.subjectCompose1.setText("");
        showContactsGui.dispose();
        this.dispose();
    }//GEN-LAST:event_composeOpenContMouseClicked

    private void numberEditContKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberEditContKeyTyped
        // TODO add your handling code here:
        char txt = evt.getKeyChar();
        if (!Character.isDigit(txt)) {
            evt.consume();
        }
    }//GEN-LAST:event_numberEditContKeyTyped

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
            java.util.logging.Logger.getLogger(OpenContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OpenContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OpenContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OpenContact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OpenContact().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundOpenCont;
    private javax.swing.JLabel backgroundOpenCont1;
    private javax.swing.JLabel composeOpenCont;
    private javax.swing.JLabel dragFrame;
    private javax.swing.JLabel dragFrame1;
    private javax.swing.JLabel editOpenCon;
    private javax.swing.JLabel error;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel exit1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTextArea jTextArea1;
    public static javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel minimize1;
    private javax.swing.JTextField nameAddCon2;
    private javax.swing.JTextField nameAddCon3;
    public static javax.swing.JTextField nameEditCont;
    private javax.swing.JLabel nameOpenCont;
    public static javax.swing.JLabel nameOpenCont1;
    public static javax.swing.JLabel nameOpenCont2;
    public static javax.swing.JTextField numberEditCont;
    private javax.swing.JPanel openContactPanel;
    private javax.swing.JPanel openContactPanel1;
    private javax.swing.JLabel saveEditContact;
    // End of variables declaration//GEN-END:variables
}
