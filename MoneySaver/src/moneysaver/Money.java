/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moneysaver;

/**
 *
 * @author Admin
 */
public class Money {
    private String name;
    private double income;
    private double outcome;
    private String date;
    private Double saving;
    

    /**
     * @return the income
     */
    public double getIncome() {
        return income;
    }

    /**
     * @param income the income to set
     */
    public void setIncome(double income) {
        this.income = income;
    }

    /**
     * @return the outcome
     */
    public double getOutcome() {
        return outcome;
    }

    /**
     * @param outcome the outcome to set
     */
    public void setOutcome(double outcome) {
        this.outcome = outcome;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the saving
     */
    public Double getSaving() {
        return saving;
    }

    /**
     * @param saving the saving to set
     */
    public void setSaving(Double saving) {
        this.saving = saving;
    }
    
    
}
