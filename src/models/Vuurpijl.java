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
    private int[] kleurverhouding = new int[3];
    
    public Vuurpijl(double hoogte, int[] kleurverhouding, String naam, double prijs, Instructie instructie) {
        super(naam, prijs, instructie);
        this.hoogte = hoogte;
        this.kleurverhouding = kleurverhouding;
        
        if (correcteKleurverhouding(kleurverhouding) == false) {
            this.kleurverhouding = new int[]{100, 0, 0};
        } 
    }
    
    @Override
    public boolean isLegaal() {
        if (instructie == null || instructie.getLeeftijd() < 16) {
            return (super.isLegaal() && false);
                    } else {
            return (super.isLegaal() && true);
        }
    }
    
    private boolean correcteKleurverhouding(int[] kleurverhouding) {
        int som = 0;
        for (int i = 0; i < kleurverhouding.length; i++) {
            som = som + kleurverhouding[i];
        }
        return (som == 100);
    }
    
    @Override
    public String toString() {
        return super.toString() + "\n  hoogte: " + hoogte + "\n  kleuren: " + 
                "\n\tROOD: " + kleurverhouding[0] + "%" +
                "\n\tGROEN: " + kleurverhouding[1] + "%" +
                "\n\tBLAUW: " + kleurverhouding[2]+ "%";
    }
}
