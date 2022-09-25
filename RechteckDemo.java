public class RechteckDemo {
    public static void main(String[] args) {
        byte breite = 23;
        byte laenge = 57;
        int umfang;
        int flaeche;

        umfang = (2*breite) + (2*laenge);

        flaeche =  breite * laenge;

        System.out.println("Wir haben ein Rechteck mit der Breite: " + breite + " und der Länge: " + laenge);
        System.out.println("Der Umfang des Rechtecks ist: " + umfang);
        System.out.println("Die Fläche des Rechtecks lautet: " + flaeche);

    }
}
