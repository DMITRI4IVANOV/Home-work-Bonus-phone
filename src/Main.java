public class Main {
    public static void main(String[] args) {
        // входные данные:
        // баланс
        int balance;
        balance = 1999;
        // вводим переменную "бонус"
        int bonus;
        int rub = 100;
        if (balance > 1000) {
            bonus = balance / rub;
        } else {
            bonus = 0;
        }
        // итоговый баланс
        int cash;
        cash = balance + bonus;
        System.out.println("Ваш начисленный бонус: " + bonus);
        System.out.println("Ваш баланс: " + cash);
    }
}
