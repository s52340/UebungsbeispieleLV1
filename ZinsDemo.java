public class ZinsDemo {
    public static void main(String[] args) {

        int kontostand = 1000;
        double zinsen = 2.25;
        byte prozent = 100;
        double ergebnisZinsen;

        ergebnisZinsen =  (zinsen / prozent) * kontostand;

        System.out.println( "Am Ende der Laufzeit erhalten sie " + ergebnisZinsen + " Euro Zinsen.");





    }
}
