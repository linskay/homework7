public class Main {
    public static void main(String[] args) {
        System.out.println("Привет, наставник!:)!");
        System.out.println("Task 1");
        int deposit = 15000;
        int start = 0;
        int mounth = 0;
        while (start < 2_459_000) {
            start = start + start / 100;
            start = deposit + start;
            mounth = mounth + 1;
            System.out.println("Месяц " + mounth + ", сумма накоплений равна " + start + " рублей");
        }
        System.out.println("Task 2");
        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(number + " ");
        }
        System.out.println();
        for (number = 10; number > 0; number--) {
            System.out.print(number + " ");
        }
        System.out.println();
        System.out.println("Task 3");
        int countryY = 12_000_000;
        double death = 0.008;
        double birthRate = 0.017;
        for (int i = 1; i <= 10; i++) {
            int population = (int) ((birthRate - death) * countryY);
            countryY += population;
            System.out.println("Год " + i + ", численность население составляет " + countryY);
        }
        System.out.println("Task 4");
        int depositVasiliy = 15000;
        int totalVasiliy = 0;
        for (int mounthVasya = 1; totalVasiliy < 12_000_000; mounthVasya++) {
            totalVasiliy = (int) (totalVasiliy + totalVasiliy * 0.07);
            totalVasiliy = depositVasiliy + totalVasiliy;
            System.out.println("Месяц " + mounthVasya + ", накопления = " + totalVasiliy);
        }
        System.out.println("Task 5");
        int depositVasiliyTask5 = 15000;
        int totalVasiliyTask5 = 0;
        for (int mounthVasyaTask5 = 1; totalVasiliyTask5 < 12_000_000; mounthVasyaTask5++) {
            totalVasiliyTask5 = (int) (totalVasiliyTask5 + totalVasiliyTask5 * 0.07);
            totalVasiliyTask5 = depositVasiliyTask5 + totalVasiliyTask5;
            if (mounthVasyaTask5 % 6 == 0)
                System.out.println("Месяц " + mounthVasyaTask5 + ", накопления = " + totalVasiliyTask5);
        }
        System.out.println("Task 6");
        int depositVasiliyTask6 = 15000;
        int totalVasiliyTask6 = 0;
        for (int mounthVasyaTask6 = 1; mounthVasyaTask6 <= 9 * 12; mounthVasyaTask6++) {
            totalVasiliyTask6 = (int) (totalVasiliyTask6 + totalVasiliyTask6 * 0.07);
            totalVasiliyTask6 = depositVasiliyTask6 + totalVasiliyTask6;
            if (mounthVasyaTask6 % 6 == 0)
                System.out.println("Месяц " + mounthVasyaTask6 + ", накопления = " + totalVasiliyTask6);
        }
        System.out.println("Task 7");
        int friday = 7;
        for (int day = 1; day <= 31; day++) {
            if (friday % 7 == day % 7)

                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
        }
        System.out.println("Task 7.2");
        int friday2 = 3;
        int day2 = friday2;
        do {
            System.out.println("Сегодня пятница, " + day2 + "-е число. Необходимо подготовить отчет");
            day2 += 7;
        } while (day2 <= 31);
        System.out.println("Task 8");
        int yearAfter = 2024 + 100;
        int yearBefore = 2024 - 200;
        for (int i = 0; i < yearAfter; i++) {
            if (i > yearBefore && i % 79 == 0)
                System.out.println(i);
        }
    }
}

