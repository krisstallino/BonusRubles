public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int refill = 2150;
        int bonus = (refill) / 100;
        if (refill > 1000) {
            System.out.println("Баланс вашего счета: " + (balance + refill + bonus) + " руб");
            System.out.println("Включая " + bonus + " бонусных рублей");
        } else {
            System.out.println("Баланс вашего счета: " + (balance + refill) + " руб.");
        }

    }
}
