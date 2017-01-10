/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author burak
 */
public class Knaller extends Vuurwerk {
    
    private int aantalKnallen;
    private int decibel;
    
    public Knaller(int aantalKnallen , int decibel, String naam, double prijs, Instructie instructie) {
        super(naam, prijs, instructie); //neem de variabelen mee van superklasse Vuurwerk
        this.aantalKnallen = aantalKnallen;
        this.decibel = decibel;
    }
    
    public int getDecibel() {
        return decibel;
    }
    
    @Override
    public boolean isLegaal() {
        if (decibel > 120) {
            return (super.isLegaal() && false);
        } else {
            return (super.isLegaal() && true);
        }
        
    }
    
    public String toString() {
        return super.toString() + "\n  aantalKnallen: " + aantalKnallen 
                + "\n  decibel: " +
                decibel;
    }
}
