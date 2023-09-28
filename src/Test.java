import java.io.File;
import java.io.IOException;

public class Test
{
    public void getIbanAndTransfer(String incommingIban) throws IOException
    {
        File file = new File("files/" + incommingIban + ".txt");

        if (!file.exists())
        {
            try
            {
                file.createNewFile();
            } catch (IOException e)
            {
                e.printStackTrace();
            }

        }
    }

}
