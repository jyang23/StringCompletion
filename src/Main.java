import java.util.Scanner;

public class Main
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        String name;
        String breed;
        String age;

        System.out.print( "Greetings. What is your pet's name? " );
        name = keyboard.next();

        System.out.print( "What kind of animal is " + name + "? " );
        breed = keyboard.next();

        System.out.print( "How old is " + name + "? ");
        age = keyboard.next();

        System.out.println( name + " is your " + breed + " and it is " + age );
    }
}