
public class Main {
    public static void main(String[] args) {

        //Task 1
        System.out.println("Task 1");

        int moneyPerMouth = 15000;
        int currentMoney = 0;
        int total = 2_459_000;
        int month = 0;

            while (currentMoney <= total) {
                currentMoney += moneyPerMouth;
                ++month;

                System.out.println("Месяц " + month + ", сумма накомлений равная " + currentMoney + " рублей." );

        }
            //Task 2
        System.out.println("Task 2");


            int number = 1;
            while (number <= 10){
                System.out.print(number + " ");
                number++;
            }
            System.out.println();

            for ( int i = 10; i>= 1; i--) {
                System.out.print(i + " ");
            }
            System.out.println();

            // Task 3
        System.out.println("Task 3");

        int birthRate = 17;
        int deathRate = 8;
        int population = 12_000_000;

        for (int i = 1; i <= 10; i++ ){
            population = population / 1000 * (birthRate-deathRate);
            System.out.println("Год" + i + ", численность населения составляет " + population);
        }

        // Task 4
        System.out.println("Task 4");

        currentMoney = 15000;
        total = 12_000_000;
        month = 0;

        while (currentMoney <= total) {
            currentMoney *= 1.07;

            ++month;

            System.out.println("Месяц " + month + ", сумма накомлений равная " + currentMoney + " рублей." );

        }

        //Task 5
        System.out.println("Task 5");

        currentMoney = 15000;
        total = 12_000_000;
        month = 0;

        while (currentMoney <= total) {
            currentMoney *= 1.07;

            ++month;
                if (month % 6 == 0)
            System.out.println("Месяц " + month + ", сумма накомлений равная " + currentMoney + " рублей." );
            }

        //Task 6
        System.out.println("Task 6");

        currentMoney = 15000;
        for ( int i = 1; i <= 9 * 12; i++) {
            currentMoney *= 1.07;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накомлений равная " + currentMoney + " рублей.");
            }
        }

        //Task 7
        System.out.println("Task 7");
         int friday = 4;
         int daysPerWeek = 7;
         while (friday <=31){
             System.out.println("Сегодня пятница,"+ friday + "-е число. Необходимо подготовить отчет");
             friday += daysPerWeek;
         }

         //Task 8
        System.out.println("Task 8");

         int currentYear = 2024;
         int startYear = currentYear - 200;
         int finishYear = currentYear + 100;

         for (int i = startYear; i <= finishYear; i++ ){
             if (i % 79 == 0){
                 System.out.println(i);
             }
         }


    }
}