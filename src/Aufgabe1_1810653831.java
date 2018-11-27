import javax.swing.*;

public class Aufgabe1_1810653831 {
    public static void main(String[] args)
    {
        String eingabe = JOptionPane.showInputDialog("Geben sie Ihr alter ein: ");
        int alter = 24;

        //Die Switch Anweisung gleicht die "eingabe" mit allen case fällen.
        //Wichtig nach jeder Anweisung ein "break" hinzufügen, weil man ansonsten in die nächste Anweisung hüpft.
        switch(eingabe){
            case "20":
                int ganzzahl = Integer.parseInt(eingabe);

                JOptionPane.showMessageDialog(null,"Das Ergebnis =  " + (ganzzahl*alter) );
                break;
            case "Peter Pan":
                JOptionPane.showMessageDialog(null,"Bangarang");
                break;
                default:JOptionPane.showMessageDialog(null,"System Error");
        }
    }
}
