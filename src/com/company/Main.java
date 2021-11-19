package com.company;

public class Main {

    public static void main(String[] args) {
        // Task 1

        byte test1 = 10;
        short test2 = 16388;
        int test3 = 333;
        long test4 = 555L;
        float test5 = 1.5f;
        double test6 = 1.4444;

        boolean test7 = true;
        var test8 = -1;

        // Task 2

        float weight1 = 78.2f;
        float weight2 = 82.7f;

        float sumWeight = weight1 + weight2;
        System.out.println("Общий вес бойцов: " + sumWeight + " кг");

        float weightDifferent = weight2 % weight1;
        System.out.println("Разница между бойцами: " + weightDifferent + " кг \n");

        // Task 3

        // Count
        byte nBananas = 5;
        short nMilk = 200;
        byte nIceCream = 2;
        byte nEggs = 4;

        // Mass
        byte bananaWeight = 80;
        byte milkWeightPer100 = 105;
        byte iceCreamWeight = 100;
        byte eggWeight = 70;

        int bananasResult = nBananas * bananaWeight;
        int milkResult = nMilk * milkWeightPer100 / 100;
        int iceCreamResult = nIceCream * iceCreamWeight;
        int eggsResult = nEggs * eggWeight;

        int breakfast = bananasResult + milkResult + iceCreamResult + eggsResult;

        System.out.println("Общий вес коктейля = " + breakfast + " грамм ( " + (breakfast / 1000.0f) + "кг )\n");

        // Task 4

        int targetCommon = 7; // кг
        int targetPerDay1 = 250; // грамм
        int targetPerDay2 = 500; // грамм

        int targetInGramms = targetCommon * 1000;
        int nDays1 = targetInGramms / targetPerDay1;
        int nDaysPart1 = targetInGramms % targetPerDay1;
        int nDays2 = targetInGramms / targetPerDay2;
        int nDaysPart2 = targetInGramms % targetPerDay2;

        System.out.println("Количество дней в первом варианте: " + nDays1 + "." + nDaysPart1);
        System.out.println("Количество дней во втором варианте: " + nDays2 + "." + nDaysPart2);

        int nAverage = (nDays1 + nDays2) / 2;
        System.out.println("Количество дней в среднем: " + nAverage + "\n");

        // Task 5

        int mashaSalary = 67_760;
        int denisSalary = 83_690;
        int kristinaSalary = 76_230;

        int mashaSalaryPerYear = 12 * mashaSalary;
        int denisSalaryPerYear = 12 * denisSalary;
        int kristinaSalaryPerYear = 12 * kristinaSalary;

        System.out.println("Маша получала " + mashaSalaryPerYear + " руб. в год");
        System.out.println("Денис получал " + denisSalaryPerYear + " руб. в год");
        System.out.println("Кристина получала " + kristinaSalaryPerYear + " руб. в год");

        float increaseCount = 10.0f / 100.0f;
        float mashasIncrease = mashaSalary * increaseCount;
        float denisesIncrease = denisSalary * increaseCount;
        float kristinasIncrease = kristinaSalary * increaseCount;

//        System.out.println("Прибавка к зарплате Маше " + mashasIncrease + " руб.");
//        System.out.println("Прибавка к зарплате Денису " + denisIncrease + " руб.");
//        System.out.println("Прибавка к зарплате Кристине " + kristinaIncrease + " руб.");

        mashaSalary += mashasIncrease;
        denisSalary += denisesIncrease;
        kristinaSalary += kristinasIncrease;

        System.out.println("Теперь Маша получает " + mashaSalary + " руб. в месяц");
        System.out.println("Теперь Денис получает " + denisSalary + " руб. в месяц");
        System.out.println("Теперь Кристина получает " + kristinaSalary + " руб. в месяц");

        int mashaSalaryPerYearNew = 12 * mashaSalary;
        int denisSalaryPerYearNew = 12 * denisSalary;
        int kristinaSalaryPerYearNew = 12 * kristinaSalary;

        int mashasDifference = mashaSalaryPerYearNew - mashaSalaryPerYear;
        int denisesDifference = denisSalaryPerYearNew - denisSalaryPerYear;
        int kristinasDifference = kristinaSalaryPerYearNew - kristinaSalaryPerYear;

        System.out.println("Годовой доход Маши возрос на " + mashasDifference + " руб.");
        System.out.println("Годовой доход Дениса возрос на " + denisesDifference + " руб.");
        System.out.println("Годовой доход Кристины возрос на " + kristinasDifference + " руб.");

        System.err.println("Итог: Ну как бы у всех годовой доход возрос на 10%, все верно :))");

        System.out.println("\n\nЗадачи повышеной сложности :)");
        // Task 6
        {
            int a = 12;
            int b = 27;
            int c = 44;
            int d = 15;
            int e = 9;

            int result = a * (b + (c - d) * e);
            result = -result;

            System.out.println("Result = " + result);
        }

        // Task 7
        {
            int a = 5;
            int b = 7;

            a = a + b;
            b = a - b;
            a = a - b;

            System.out.println("a = " + a + ", b = " + b);
        }

        // Task 8
        {
            int a = 120;
            int b = a / 10;
            b = b % 10;

            System.out.println("Result is " + b);
        }
    }
}
