package models;

/**
 *
 * @author odepj
 */
public class Instructie {

    private boolean nederlandstalig;
    private int leeftijd;
    private String omschrijving;

    /**
     * Construeert een instantie van type Instructie.
     *
     * @param nederlandstalig geeft aan of de handleiding in het nederlands is
     * @param leeftijd minimumleeftijd van vuurwerk
     * @param omschrijving de omschrijving die het vuurwerk bevat
     */
    public Instructie(boolean nederlandstalig, int leeftijd, String omschrijving) {
        this.nederlandstalig = nederlandstalig;
        this.leeftijd = leeftijd;
        this.omschrijving = omschrijving;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public boolean isNederlandstalig() {
        return nederlandstalig;
    }

    /**
     * Zet een instructie om in een string.
     *
     * @return Beschrijving van de instructie.
     */
    @Override
    public String toString() {
        return "Nederlandstalig=" + nederlandstalig + ", leeftijd=" + leeftijd + ", omschrijving=" + omschrijving;
    }
}
