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
public class Vuurpijl extends Vuurwerk {
    
    private double hoogte;
    private int[] kleurverhouding = new int[3]; //er kunnen maar 3 waardes in, rood groen blauw
    
    public Vuurpijl(double hoogte, int[] kleurverhouding, String naam, double prijs, Instructie instructie) {
        super(naam, prijs, instructie); //neem de variabelen mee van superklasse Vuurwerk
        this.hoogte = hoogte;
        this.kleurverhouding = kleurverhouding;
        
        if (correcteKleurverhouding(kleurverhouding) == false) { //als de methode correcteKleurverhouding false returnt:
            this.kleurverhouding = new int[]{100, 0, 0}; //maak de verhouding rood, dus {100, 0, 0}
        } 
    }
    
    @Override
    public boolean isLegaal() {
        if (instructie == null || instructie.getLeeftijd() < 16) { //als er een instructie ontbreekt, of leeftijd is onder de 16
            return (super.isLegaal() && false); //return de isLegaal methode van super klasse, en false
                    } else {
            return (super.isLegaal() && true); //zelfde, maar true
        }
    }
    
    //deze methode returnt true als som == 100 voor i
    private boolean correcteKleurverhouding(int[] kleurverhouding) {
        int som = 0;
        for (int i = 0; i < kleurverhouding.length; i++) { //loop door array kleurverhouding
            som = som + kleurverhouding[i]; //som (0) + kleurverhouding[i] (x, x, x) = som
        }
        return (som == 100); //als bovenstaande som 100 is, return true
    }
    
    @Override
    public String toString() { //spreekt voor zich
        return super.toString() + "\n  hoogte: " + hoogte + "\n  kleuren: " + 
                "\n\tROOD: " + kleurverhouding[0] + "%" +
                "\n\tGROEN: " + kleurverhouding[1] + "%" +
                "\n\tBLAUW: " + kleurverhouding[2]+ "%";
    }
}
