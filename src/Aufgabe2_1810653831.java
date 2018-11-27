public class Aufgabe2_1810653831 {
    public static void main(String[] args)
    {
        //Wenn man "i+=2" anstatt i++ verwendet, wirt die Zahl um 2 erhöht, wesshalb die
        //For Schleife nur 2 mal wiederholt wird, anstatt 3 mal.
        for (int i = 0;i<3;i+=2)
        {
            printName();
        }

        printAge(24);
        for (int j = 0;j<5;j++)
        {
            printName();
            printAge(24+j);
        }


    }
    public static void printName()
    {
        String name = "Thomas Dorfer";
        System.out.println(name);
    }
    public static void printAge(int age)
    {
        System.out.println((age));
    }
}
