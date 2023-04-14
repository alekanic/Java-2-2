public class Main {
    public static void main(String[] args) {

        int startCapital = 100;
        int add = 300;
        int bonus;

        boolean money = add >= 1000;

        if (money) {
            bonus = add / 100;
            startCapital = startCapital + bonus + add;
        } else {
            startCapital = startCapital + add;
        }

        System.out.println(startCapital);

    }
}