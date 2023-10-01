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
        for (; start1 >= 1;) {
            System.out.print (" " + start1);
            start1 = start1 - 1;
        }

        //Задача 3
        System.out.println(" ");
        int population = 12_000_000;
        int fertility = (population / 1000) * 17 ; // Расчет рождаемости насления на 1000 человек
        int mortality = (population / 1000) * 8; // Расчет смертность насления на 1000 человек
        int years = 0;
        for (; years < 10;) {
            population = population + fertility - mortality;
            years = years + 1;
            System.out.println("Год " + years+ " ,численность населения составляет " + population );

        }
    }
}
