public class CreditPaymentService {

    public double calculate(double months, double monthlyInterestRate) {

        double result;
        result = (monthlyInterestRate * (Math.pow((1 + monthlyInterestRate), months))) / ((Math.pow((1 + monthlyInterestRate), months) - 1));

        return result;
    }
}
