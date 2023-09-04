import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFiles
{

    private File file;
    private Scanner fileReader;
    int name, date, checkingAccount, creditAccount, savingsAccount;
    boolean firstOrLastName;
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    //Checks the head of the file for <"Codersbay">
    //If the file exists, and on top we have <"Codersbay">,
    //we search in a loop for the header and get the index for all the information
    //That way, the program can handle the file in any order, and we get
    //<Firstname> and <Lastname> in the right order
    public ReadFiles(String filename) throws FileNotFoundException
    {
        file = new File(filename);
        fileReader = new Scanner(file);

        if (fileReader.nextLine().equals("CODERSBAY"))
        {
            String myHeader = fileReader.nextLine();
            String[] myHeaderSplit = myHeader.split("\\s*,\\s*");

            for (int i = 0; i < myHeaderSplit.length; i++)
            {
                try
                {
                    switch (myHeaderSplit[i])
                    {
                        case "Firstname Lastname", "Lastname Firstname" ->
                        {
                            name = i;
                            if (myHeaderSplit[i].startsWith("F"))
                            {
                                firstOrLastName = true;
                            } else if (myHeaderSplit[i].startsWith("L"))
                            {
                                firstOrLastName = false;
                            }
                        }
                        case "Date of Birth" -> date = i;
                        case "CheckingAccount" -> checkingAccount = i;
                        case "CreditAccount" -> creditAccount = i;
                        case "SavingsAccount" -> savingsAccount = i;
                    }
                } catch (NullPointerException e)
                {
                    System.out.println("Filereader : null");
                } catch (Exception e)
                {
                    System.out.println("Failed");
                } finally
                {

                }

            }
            while (fileReader.hasNextLine())
            {
                String myHeaderFinRead = fileReader.nextLine();
                String[] myHeaderSplit2 = myHeaderFinRead.trim().split("\\s*,\\s*");
                LocalDate dateFormat = LocalDate.parse(myHeaderSplit2[date], dateTimeFormatter);

                String fName;
                String lName;
                if (firstOrLastName)
                {
                    String[] nameArr = myHeaderSplit2[name].split(" ");
                    fName = nameArr[0];
                    lName = nameArr[1];
                } else
                {
                    String[] nameArr = myHeaderSplit2[name].split(" ");
                    fName = nameArr[1];
                    lName = nameArr[0];
                }
            }
        }
    }

    public Scanner getFileReader()
    {
        return fileReader;
    }

    public boolean read()
    {
        return true;
    }


}
