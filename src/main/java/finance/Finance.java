package finance;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import sales.Sales;

public class Finance {
    private double eventBudget;    
    private double expenses;            
    
    /*Contructor*/
    
    public Finance() {
        
    }
    
    public Finance(double expenses, double eventBudget) {
        this.expenses = expenses;
        this.eventBudget = eventBudget;
    }
    
    /*Getters and Setters*/

    public double getEventBudget() {
        return eventBudget;
    }

    public void setEventBudget(double eventBudget) {
        this.eventBudget = eventBudget;
    }

    public double getExpenses() {
        return expenses;
    }

    public void setExpenses(double expenses) {
        this.expenses = expenses;
    }
    
    /*Methods*/  
    
    public void expensesHistory() {
        if(states.AppState.listExpenses.isEmpty()) {
            System.out.println("Empty expenses list.");
        } else {
            System.out.println("Expenses list: ");
            for (double oneExpenses : states.AppState.listExpenses) {
                System.out.println(oneExpenses);
            }
        }
    }
    
    public void registerExpenses() {        
        states.AppState.listExpenses.add(getExpenses());
        System.out.println("Registered expenses.");
    }
    
    public void registerBudget() {
        states.AppState.eventBudget = getEventBudget();
        System.out.println("Registered Budget.");
    }    
    
    public void listTableIncome(DefaultTableModel model, JLabel labelTotal, ArrayList<Sales> list) {
        model.setRowCount(0);
        double incomeTotal = 0.0;
        for(Sales sale : list) {            
            incomeTotal = incomeTotal + (sale.getValueEntrySold()*sale.getQuantitySold());
            model.addRow(new Object[] {
                sale.getValueEntrySold()*sale.getQuantitySold()
            });
        }
        labelTotal.setText(Double.toString(incomeTotal));
    }
    
    public void listTableExpenses(DefaultTableModel model, JLabel labelTotal, ArrayList<Double> list) {
        model.setRowCount(0);
        double expenseTotal = 0.0;
        for(Double expense : list) {            
            expenseTotal = expenseTotal + expense;
            model.addRow(new Object[] {
                expense
            });
        }
        labelTotal.setText(Double.toString(expenseTotal));
    }
}
