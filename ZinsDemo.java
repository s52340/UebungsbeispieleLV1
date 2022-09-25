public class ZinsDemo {
    public static void main(String[] args) {

        int kontostand = 1000;
        double zinsen = 2.25;
        byte prozent = 100;

        double ergebnisZinsen1 = ergebnisZinsenEins(kontostand, zinsen, prozent);
        System.out.println( "Am Ende der Laufzeit erhalten sie " + ergebnisZinsen1 + " € Zinsen.");


        double ergebnisZinsen3 = ergebnisZinsenDrei( kontostand, zinsen, prozent);
        System.out.println("Nach 3 Jahren Laufzeit erhalten Sie: " + ergebnisZinsen3 + " €.");

        double ergebnisZinsen5 = ergebnisZinsenFünf(kontostand, zinsen, prozent);
        System.out.println("Nach 5 Jahren Laufzeit erhalten Sie: " + ergebnisZinsen5 + " €.");

    }

    public static double ergebnisZinsenEins(int kontostand, double zinsen, byte prozent) {
        double ergebnisZinsen1 = (zinsen / prozent) * kontostand;
        return  ergebnisZinsen1;
    }

     public static double ergebnisZinsenDrei(int kontostand, double zinsen, byte prozent) {
         double ergebnisZinsen3 =  (zinsen / prozent) * kontostand * 3;
         return ergebnisZinsen3;
    }

    public static double ergebnisZinsenFünf(int kontostand, double zinsen, byte prozent) {
        double ergebnisZinsen5 = (zinsen / prozent) * kontostand * 5;
        return ergebnisZinsen5;
    }





}
