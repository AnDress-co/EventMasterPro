package sales;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;



public class TypeEntry extends Entry{    
    
    /*Contructor*/
    public TypeEntry() {
        
    }

    public TypeEntry(String name, double price) {
        super(name, price);        
    }
            
    /*Getters and Setters*/          
          
    
    /*Methods*/
    
    public void addEntryType() {                
        states.AppState.typeEntry.put(this.getName().toLowerCase(), this.getPrice());        
    }
    
    public void entryTypeTable(DefaultTableModel model, HashMap<String, Double> typeEntryList) {
        model.setRowCount(0);
        for (Map.Entry<String, Double> entry : states.AppState.typeEntry.entrySet()) {            
            if(entry.getKey() != null && entry.getValue() != null){
                model.addRow(new Object[] {
                    entry.getKey(),
                    entry.getValue()
                });
            }
        }
    }
    
    public void entryTypeListBox(JComboBox<String> typeEntrySelection) {
        if(states.AppState.typeEntry.isEmpty()){
            typeEntrySelection.addItem("No ticket type registered!");
        } else {
            typeEntrySelection.removeAllItems();
            for (Map.Entry<String, Double> entry : states.AppState.typeEntry.entrySet()) {
                typeEntrySelection.addItem(entry.getKey());
            }
        }        
    }
    
    public void setPriceLabel (JLabel ticketPrice, String nameTicket) {
        for (Map.Entry<String, Double> entry : states.AppState.typeEntry.entrySet()) {
            if(entry.getKey().equals(nameTicket)){                
                ticketPrice.setText(Double.toString(entry.getValue()));
            }
        }
    }
}
