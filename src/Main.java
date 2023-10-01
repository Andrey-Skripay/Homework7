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




    }
}