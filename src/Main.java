public class Main {
    public static void main(String[] args) {
        // вводные
        int balance = 100;
        int insert = 1100;
        int part = 100;


        // логика
        int bonus;
        if (insert > 1000) {
            bonus = insert / part;
        } else {
            bonus = 0;
        }
        int sum = balance + insert + bonus;
        System.out.println(sum);
    }
}
