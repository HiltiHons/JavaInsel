import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
        List<Person> newPerson = new ArrayList<Person>();
        newPerson.add(person);
        System.out.println(newPerson);

        System.out.println(newPerson.get(0).getnName());
        Account account = new Account(newPerson.get(0), "123455123");
        HashMap<Person, Account> hashMap = new HashMap<>();
        hashMap.put(newPerson.get(0), account);
        System.out.println("Bitte Namen eingeben");
        String myInput = scanner.nextLine();
        String[] newInput = myInput.split(" ");
        System.out.println(hashMap.get("Herbert"));
            if(hashMap.containsKey("Herbert Fasching Ich"))
            {
                System.out.println("Hallo " + newPerson.get(0).getnName());
                System.out.println(hashMap.get(account.iban));
            }

        else
        {
            System.out.println("Falscher Input");
        }

    }
}