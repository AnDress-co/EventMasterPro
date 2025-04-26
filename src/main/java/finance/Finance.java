package finance;

import java.util.ArrayList;

/**
 *
 * @author MarlonG
 */

public class Finance {
    private double eventBudget;
    private double income;
    private double expenses;
    
    private static ArrayList<Double> listIncome = new ArrayList<>();
    private static ArrayList<Double> listExpenses = new ArrayList<>();
    
    /*Contructor Finance*/
    
    public Finance() {
        
    }
    
    public Finance(double income, double expenses, double eventBudget) {
        this.income = income;
        this.expenses = expenses;
        this.eventBudget = eventBudget;
    }
    
    /*Getters and Setters Finance*/

    public double getEventBudget() {
        return eventBudget;
    }

    public void setEventBudget(double eventBudget) {
        this.eventBudget = eventBudget;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getExpenses() {
        return expenses;
    }

    public void setExpenses(double expenses) {
        this.expenses = expenses;
    }
    
    /*Methods Finance*/               
    
    public void incomeHistory() {
        if(listIncome.isEmpty()) {
            System.out.println("Empty income list.");
        } else {
            for (double oneIncome : listIncome) {
                System.out.println(oneIncome);
            }
        }
    }
    
    public void registerIncome() {
        listIncome.add(this.income);
        System.out.println("Registered income.");
    }
    
    public void expensesHistory() {
        if(listExpenses.isEmpty()) {
            System.out.println("Empty expenses list.");
        } else {
            for (double oneExpenses : listExpenses) {
                System.out.println(oneExpenses);
            }
        }
    }
    
    public void registerExpenses() {        
        listExpenses.add(this.expenses);
        System.out.println("Registered expenses.");
    }
}
