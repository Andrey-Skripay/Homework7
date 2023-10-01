public class Main {
    public static void main(String[] args) {
        //Задача 1

        int savings = 15_000; // Переменная сумма вклада
        int total = 0; // Переменная сумма накопления
        int month = 0;
        while (total  < 2_459_000){
            total = total + total/100;
            total = total + savings;
            month = total / savings;

            System.out.println("Месяц " + month + " Итого " + total);
        }

        // Задача 2

        int start = 1;
        while (start <= 10) {
            System.out.print (" " + start);
            start = start + 1;
        }
        System.out.println(" ");
        int start1 = 10;
        for (; start1 >= 1;){
            System.out.print (" " + start1);
            start1 = start1 - 1;
        }





    }
}