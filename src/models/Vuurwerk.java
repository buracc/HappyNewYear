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

    Instructie instructie;

    public Vuurwerk(String naam, double prijs, Instructie instructie) {
        super(naam, prijs); //neem de variabelen naam en prijs mee van superklasse Product
        this.instructie = instructie;
    }

    public boolean isLegaal() {
        if (instructie != null) { //als instructie niet null is
            return instructie.isNederlandstalig(); //return de boolean isNederlandstalig()
        } else {
            return false;
        }
    }
    
    //methode om instructie te returnen voor stap 5 om te checken of instructie aanwezig is
    public Instructie getInstructie() {
        return instructie;
    }
  

    public String toString() {
        if (instructie == null) { //als er geen instructie aanwezig is:
            
        return super.toString() //print:
             + "\n  Instructie: Ontbreekt" 
             + "\n  Legaal: " + isLegaal();
        
        } else { //als er wel een aanwezig is:

        return super.toString() //print deze shit
             + "\n  Instructie: " + instructie
             + "\n  Legaal: " + isLegaal();

        }

    }
    
}
