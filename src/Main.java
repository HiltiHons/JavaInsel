import java.io.*;
import java.util.Scanner;

public class Main
{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Hello");

        String name = "Herbert Fasching";
/*        String[]myName = name.split(" ");
        System.out.println(myName[0]);
        System.out.println(myName[1]); */

        String myName = scanner.nextLine();
        String[] arrName = myName.split(" ");





        Person person = new Person(arrName[0], arrName[1], arrName[2]);
        System.out.println(person.getFName());
        System.out.println(person.getnName());
        System.out.println(person.getDateOfBirth());

    }
}