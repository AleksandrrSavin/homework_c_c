public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        int amount = 1_000_000;
        int months = 12;
        double monthlyInterestRate = (9.99 / 12 / 100);

        double annuityRatio = service.calculate(months, monthlyInterestRate, amount);
        int payment = (int) (annuityRatio * amount);
        System.out.println(payment + " рублей в месяц");


    }
}