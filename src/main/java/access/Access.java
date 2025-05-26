package access;

import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sales.Sales;



public class Access {    
    
    
    /*Contructor*/
    
    public Access() {        
        
   }        

    /*Methods*/
    
    public void checkEntry(DefaultTableModel model, Component frameComponent,String attendeeId, ArrayList<Attendees> list) {
        model.setRowCount(0);
        for(Attendees attendee : list) {
            if (attendeeId.equals(attendee.getId())) { 
                for(Sales purchase : attendee.getPurchasedEntrys()) {
                    model.addRow( new  Object[] {
                        attendee.getId(),
                        attendee.getName(),
                        purchase.getNameEntrySold(),
                        purchase.getQuantitySold(),
                        purchase.getValueEntrySold()*purchase.getQuantitySold()
                    });
                }                
                JOptionPane.showMessageDialog(frameComponent, "Attendee found!");
            }
        }
    }    

    public void genStatistics(JLabel numAttendee, JLabel quantityTicket, JLabel valueSale) {                
        int countTickets = 0;
        double accumulateValue = 0;
        for(Attendees attendee : states.AppState.listAttendees) {
            for(Sales sale : attendee.getPurchasedEntrys()) {
                countTickets = countTickets + sale.getQuantitySold();
                accumulateValue = accumulateValue + (sale.getValueEntrySold() * sale.getQuantitySold());
            }
        }
        numAttendee.setText(Integer.toString(states.AppState.listAttendees.size()));
        quantityTicket.setText(Integer.toString(countTickets));
        valueSale.setText(Double.toString(accumulateValue));
    }
}
