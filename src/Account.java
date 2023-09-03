public class Account extends Person
{
    String iban;



    Account(Person person, String iban)
    {
        super(person.getFName(), person.getnName(), person.getDateOfBirth());
        this.iban = iban;
    }
}
