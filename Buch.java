
/**
 * Beschreiben Sie hier die Klasse Buch.
 * 
 * @author (Marco Kiefer) 
 * @version (17.10.2017)
 */
public class Buch {
   private String titel;
   private double preis;
   
   // Konstruktor
   public Buch() {
       titel = "-kein Titel vorhanden-";
       preis = 0.0;
   }
   public Buch(String titel) {
       this.titel = titel;
       this.preis = 0.0;
   }
   public Buch(double preis) {
       this.preis = preis;
       this.titel = "-kein Titel vorhanden-";
   }
   public Buch(String titel, double preis) {
       this.titel = titel;
       this.preis = preis;
   }
   
   // Getter
   public String getTitel() {
       return titel;
   }
   public double getPreis() {
       return preis;
   }
   
}
