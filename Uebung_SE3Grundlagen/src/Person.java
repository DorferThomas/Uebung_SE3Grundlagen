
public class Person {

    //Wenn man die Variable als static deklariert, kann man von allen auch von der Main darauf zugreifen.

    //static
    int age = 24;
    //static
    String name = "Thomas Dorfer";

    //Variante1:
    public  void printPerson()
    {
        System.out.println("Ausgabe von Name: " + name + "  und Alter: " + age + " in der Variante1.");
    }

    //Variante2:
    public static void printPerson2(int alter,String vname)
    {
        System.out.println("Ausgabe von Name: " + vname + "  und Alter: " + alter + " in der Variante2.");
    }
}