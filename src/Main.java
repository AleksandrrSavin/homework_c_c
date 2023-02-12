public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        int amount = 1_000_000;
        int months = 24;
        double monthlyInterestRate = (9.99 / 12 / 100);

        double annuityRatio = service.calculate(months, monthlyInterestRate);
        int payment = (int) (annuityRatio * amount);
        System.out.println(payment + " рублей в месяц");


    }
}