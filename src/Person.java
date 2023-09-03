public class Person
{
    private String fName;
    private String nName;
    private String dateOfBirth;

    Person(String fName,String nName,String dateOfBirth)
    {
        this.fName = fName;
        this.nName = nName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFName()
    {
        return fName;
    }
    public String getnName()
    {
        return nName;
    }
    public String getDateOfBirth()
    {
        return dateOfBirth;
    }
}
