public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        int amount = 1_000_000;
        int months = 24;
        double percent = 9.99;

        double i = percent / 12 / 100;
        double k = (i * (Math.pow ((1 + i),months))) / ((Math.pow ((1 + i),months) - 1));

        double payment = service.calculate(k, amount);
        System.out.println(payment);


    }
}