import java.text.DecimalFormat;
import java.util.Scanner;

public class LSA {

    double loanAmount;
    int creditScore;
    int payTerm;

    public LSA(double amount, int score, int term) {
        loanAmount = amount;
        creditScore = score;
        payTerm = term;
    }

    public void loanApp() {
        double interestRate;
        if (creditScore <= 350) {
            interestRate = 11.9;
        } else if (creditScore <= 500) {
            interestRate = 9.8;
        } else if (creditScore <= 650) {
            interestRate = 7.7;
        } else if (creditScore <= 750) {
            interestRate = 6.5;
        } else {
            interestRate = 4.9;
        }

        double monthlyPay = loanAmount * (1 + (interestRate/100))/ payTerm;

        DecimalFormat LAformat = new DecimalFormat("#.00");
        DecimalFormat MPformat = new DecimalFormat("#.##");

            System.out.println("Here is your Loan Offer:");
            System.out.println("Loan Amount: $" + LAformat.format(loanAmount));
            System.out.println("Interest Rate: " + interestRate + "%");
            System.out.println("Repayment Term: " + payTerm + " months");
            System.out.println("Monthly Payment: $" + MPformat.format(monthlyPay));
    }

    public static void main(String[] args){
        Scanner loanAmt = new Scanner(System.in);
        Scanner cScore = new Scanner(System.in);
        Scanner pTerm = new Scanner(System.in);

        System.out.println("Loan Submission Application:");
        System.out.println("Please enter your Loan Amount ($):");
        double lAmount = loanAmt.nextDouble();
        System.out.println("What is your credit score (0-850):");
        int creditS = cScore.nextInt();
        System.out.println("What is your payment term in months (0-72):");
        int payTm = pTerm.nextInt();

        LSA loanApp1 = new LSA(lAmount,creditS,payTm);
        loanApp1.loanApp();
    }
}