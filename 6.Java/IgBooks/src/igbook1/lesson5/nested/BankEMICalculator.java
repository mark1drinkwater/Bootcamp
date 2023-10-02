package igbook1.lesson5.nested;

public class BankEMICalculator {
    private String CustomerName;
    private String AccountNo;
    private double loanAmount;
    private double monthlyPayment;
    private EMICalculatorHelper helper = new EMICalculatorHelper();

    public BankEMICalculator(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double calcMonthlyPayment() {
        return helper.calcMonthlyPayment(loanAmount);
    }

    public static void main(String[] args) {
        BankEMICalculator calculator = new BankEMICalculator(4000);
        System.out.println(calculator.calcMonthlyPayment());
    }

    // Setters and Getters
    private class EMICalculatorHelper {
        int loanTerm = 60;
        double interestRate = 0.9;
        double interestPerMonth = interestRate/loanTerm;

        protected double calcMonthlyPayment(double loanAmount) {
            double EMI = (loanAmount * interestPerMonth) / ((1.0) - ((1.0) / Math.pow(1.0 + interestPerMonth, loanTerm)));
            return( Math.round(EMI) );
        }

    }

}
