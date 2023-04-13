public class Main {
    public static void main(String[] args) {

    int start_capital = 100;
    int add = 300;
    int bonus;

    boolean money = add >= 1000;

        if (money) {
            bonus = add / 100;
            start_capital = start_capital + bonus + add;
        } else {
            start_capital = start_capital + add;
        }

    System.out.println(start_capital);

    }
}