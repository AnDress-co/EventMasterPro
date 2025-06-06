/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI.eventFrames;

import event.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import location.*;

/**
 *
 * @author stive
 */
public class ModifyEvent extends javax.swing.JFrame {
    LocationManager locationManager = new LocationManager(states.AppState.locationsList);
    EventManager eventManager =  new EventManager(states.AppState.eventList);
    /**
     * Creates new form ModifyEvent
     */
    public ModifyEvent() {
        initComponents();
        locationManager.locationListBox(eventLocation);
        
        eventType.removeAllItems();
        eventType.addItem("Concert");
        eventType.addItem("Conference");
        eventType.addItem("Stand Up");
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
        jLabel3 = new javax.swing.JLabel();
        eventId = new javax.swing.JTextField();
        btnSearchEvent = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        eventName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        eventDate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        eventLocation = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        eventDesc = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        eventType = new javax.swing.JComboBox<>();
        btnSaveChanges = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(603, 565));
        setResizable(false);
        setSize(new java.awt.Dimension(603, 565));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Event details");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Modify Event Screen");

        jLabel3.setText("Event ID");

        eventId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                eventIdKeyTyped(evt);
            }
        });

        btnSearchEvent.setBackground(new java.awt.Color(0, 153, 102));
        btnSearchEvent.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSearchEvent.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchEvent.setText("Search event");
        btnSearchEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchEventActionPerformed(evt);
            }
        });

        jLabel4.setText("Name");

        jLabel5.setText("Event Date (yyyy-MM-dd HH:mm)");

        jLabel6.setText("Location");

        eventLocation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setText("Description");

        jLabel8.setText("Event Type");

        eventType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnSaveChanges.setBackground(new java.awt.Color(0, 153, 102));
        btnSaveChanges.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSaveChanges.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveChanges.setText("Save changes");
        btnSaveChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveChangesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSaveChanges)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 269, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addComponent(eventId)
                    .addComponent(jSeparator1)
                    .addComponent(eventName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(eventDate)
                    .addComponent(eventLocation, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eventDesc)
                    .addComponent(jLabel8)
                    .addComponent(btnSearchEvent)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(eventType, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eventId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearchEvent)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eventName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eventDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eventLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eventDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eventType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnSaveChanges))
                    .addComponent(jLabel2))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveChangesActionPerformed
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            LocalDateTime date = LocalDateTime.parse(eventDate.getText(), formatter);

            String locIdText = (String) eventLocation.getSelectedItem();
            int locationId = Integer.parseInt(locIdText.split(" ")[0]);
            Location locationSelected = locationManager.getLocationById(locationId);

            eventManager.updateEvent(Integer.parseInt(eventId.getText()), eventName.getText(), date, locationSelected, eventDesc.getText(), (String) eventType.getSelectedItem());
            locationManager.deleteAvailableDate(date.toLocalDate(), locationSelected);
            JOptionPane.showMessageDialog(this, "Updated Event!");
        } catch (java.lang.NullPointerException e) {
            JOptionPane.showMessageDialog(this, "[ERROR]" + " The location cannot be null!", "error", JOptionPane.ERROR_MESSAGE);
        } catch (java.time.format.DateTimeParseException e) {
            JOptionPane.showMessageDialog(this, "[ERROR]" + " Invalid date!", "error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "[ERROR]" + e.getMessage(), "error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSaveChangesActionPerformed

    private void btnSearchEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchEventActionPerformed
        if ("".equals(eventId.getText()) || eventId.getText() == null) {
            JOptionPane.showMessageDialog(this, "No event found with ID " + eventId.getText() + "!");
        } else {
            String eventCategory = eventManager.getEventById(Integer.parseInt(eventId.getText())).getTypeEvent();
            
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            
            if ("Concert".equals(eventCategory)) {
                ConcertEvent concert = (ConcertEvent) eventManager.getEventById(Integer.parseInt(eventId.getText()));
                eventName.setText(concert.getName());
                
                String formattedDate = concert.getDate().format(formatter);
                eventDate.setText(formattedDate);
                
                eventDesc.setText(concert.getDescription());
            } else if ("Conference".equals(eventCategory)) {
                ConferenceEvent conference = (ConferenceEvent) eventManager.getEventById(Integer.parseInt(eventId.getText()));
                eventName.setText(conference.getName());
                
                String formattedDate = conference.getDate().format(formatter);
                eventDate.setText(formattedDate);
                
                eventDesc.setText(conference.getDescription());
            } else {
                StandUpEvent standUp = (StandUpEvent) eventManager.getEventById(Integer.parseInt(eventId.getText()));
                eventName.setText(standUp.getName());
                
                String formattedDate = standUp.getDate().format(formatter);
                eventDate.setText(formattedDate);
                
                eventDesc.setText(standUp.getDescription());
            }
        }
    }//GEN-LAST:event_btnSearchEventActionPerformed

    private void eventIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eventIdKeyTyped
        char key = evt.getKeyChar();
        if (!Character.isDigit(key)) {
            evt.consume();
        }
    }//GEN-LAST:event_eventIdKeyTyped

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
            java.util.logging.Logger.getLogger(ModifyEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModifyEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModifyEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModifyEvent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifyEvent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveChanges;
    private javax.swing.JButton btnSearchEvent;
    private javax.swing.JTextField eventDate;
    private javax.swing.JTextField eventDesc;
    private javax.swing.JTextField eventId;
    private javax.swing.JComboBox<String> eventLocation;
    private javax.swing.JTextField eventName;
    private javax.swing.JComboBox<String> eventType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
