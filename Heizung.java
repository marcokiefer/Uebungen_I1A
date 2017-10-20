
/**
 * Beschreiben Sie hier die Klasse Heizung.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Heizung    // Definiert die Klasse Heizung
{
    private int temperatur;     // Datenfeld temperatur erstellt
    private int min;            // Datenfeld min erstellt
    private int max;            // Datenfeld max erstellt
    private int schrittweite;   // Datenfeld schrittweite
    
        public Heizung (int min, int max) {         // Kontstruktor erstellt; 
        this.min = min;                             // Default werte gesetzt: schrittweite 5;   
        this.max = max;                             // Default temperatur auf 15 gesetzt;
        this.schrittweite = 5;                      
        this.temperatur = 15;
    }
    
    public void waermer() {
        int neueTemperatur = this.temperatur + this.schrittweite;
        if(neueTemperatur <= this.max){
            this.temperatur = neueTemperatur;
        } else {
            this.temperatur = this.max;
            System.out.println("Maximaltemperatur erreicht");
        }
    }
    
    public void kuehler() {
        int neueTemperatur = this.temperatur - this.schrittweite;
        if(neueTemperatur >= this.min){
            this.temperatur = neueTemperatur;
        } else {
            this.temperatur = this.min;
            System.out.println("Minimaltemperatur erreicht");
        }
    }
    
    public int getTemperatur() {
        return temperatur;
    }
    
    public void setzeSchrittweite(int neueSchrittweite) {
        if (neueSchrittweite > 0) {
            this.schrittweite = neueSchrittweite;
        } else {
            System.out.println("Bitte keine negative Schrittweite angeben");
        }
    }
}
