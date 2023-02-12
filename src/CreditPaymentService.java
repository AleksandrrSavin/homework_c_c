public class CreditPaymentService {

    public double calculate(double amount,double k) {



        double result;
        result = (int) (k * amount);

        return result;
    }
}
