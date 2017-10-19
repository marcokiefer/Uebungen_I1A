
/**
 * Beschreiben Sie hier die Klasse Heizung.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Heizung    // Definiert die Klasse Heizung
{
    private int temperatur;     // Datenfeld temperatur erstellt
    private int min;
    private int max;
    private int schrittweite;
    
        public Heizung (int min, int max) {
        this.min = min;
        this.max = max;
        this.schrittweite = 5;
        this.temperatur = 15;
    }
    
    public void waermer() {
        int neueTemperatur = this.temperatur + this.schrittweite;
        if(neueTemperatur <= this.max){
            this.temperatur = neueTemperatur;
        } else {
            this.temperatur = this.max;
        }
    }
    
    public void kuehler() {
        int neueTemperatur = this.temperatur - this.schrittweite;
        if(neueTemperatur >= this.min){
            this.temperatur = neueTemperatur;
        } else {
            this.temperatur = this.min;
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
