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
public class Vuurwerk extends Product {
    
    private Instructie instructie;  
    
    public Vuurwerk(String naam, double prijs, Instructie instructie) {
        super(naam, prijs);
        this.instructie = instructie;
    }
    
    public boolean isLegaal() {
        if () {
            
        }
        return true;
    }
    
    public String toString() {
        return "";
    }
    
}
