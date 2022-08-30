package org.intern;

public class main
{
    public static void main( String[] args )
    {
        //create instances for all three applicants
        CreditCardApplication c1 = new CreditCardApplication("Bob", "Kins", 30, 650);
        CreditCardApplication c2 = new CreditCardApplication("Bobina", "Morris", 18, 788);
        CreditCardApplication c3 = new CreditCardApplication("Mark", "Park", 31, 790);

        //checks the applicants against the approval criteria
        System.out.println(c1.firstName + " " + c1.lastName + " was accepted: " + c1.getAccepted());
        System.out.println(c2.firstName + " " + c2.lastName + " was accepted: " + c2.getAccepted());
        System.out.println(c3.firstName + " " + c3.lastName + " was accepted: " + c3.getAccepted());

    }
}
