public class Main {
    public static void main(String[] args) {
        int initialAmount = 25;
        int refill = 50000;
        int limit = 1000;
        int bonus;
        if (refill >= limit) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        int sum = initialAmount + refill + bonus;
        System.out.println("Общая сумма на вашем счёте = " + sum);
        System.out.println("Из них начислено бонусом = " + bonus);
    }
}
