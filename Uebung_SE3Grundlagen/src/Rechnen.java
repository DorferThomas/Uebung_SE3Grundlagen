public class Rechnen {
    public static void main(String[] args)
    {
        //Neue Instatnz von Rechnen wird erstellt, damit man auf die "non Static Methoden" zugriff hat.
        Rechnen rechnen = new Rechnen();
        //Bei beiden Methoden werden (a&b) übergeben und man erhält das Ergebnis der Rechnung retout, welches
        //mit "sout" ausgegeben wird.
        System.out.println("Dies ist die Int Rechnung: " + rechnen.add(12,24));
        System.out.println("Dies ist die Double Rechnung: " + rechnen.add(12.32,24.23));
    }
    public int add(int a, int b)
    {
        return a+b;
    }
    public double add(double a, double b)
    {
        return a+b;
    }
}
