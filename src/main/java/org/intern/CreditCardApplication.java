package org.intern;

import java.math.BigDecimal;

public class CreditCardApplication {
    String firstName;
    String lastName;
    Integer age;
    Integer creditScore;
    boolean appAccepted;

    public CreditCardApplication(String firstName, String lastName, Integer age, Integer creditScore) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.creditScore = creditScore;
    }

    public boolean getAccepted() {
        if (age <= 18) {
            return false;
        } else if (creditScore < 780) {
            return false;
        } else {
            return true;
        }
    }

    {

    }
}
