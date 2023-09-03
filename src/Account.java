public class Account extends Person
{
    String iban;
    private Person owner;


    Account(Person person, String iban)
    {
        super(person.getFName(), person.getnName(), person.getDateOfBirth());
        this.iban = iban;
    }
}
