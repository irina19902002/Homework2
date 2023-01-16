import java.util.Scanner;

public class Massiv_zikl_uslov {
    public static void main(String[] args) {
//Составить программу, которая уменьшает первое введенное число в два раза, если оно больше второго введенного числа по абсолютной величине.
        System.out.println("Введите 2 числа");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (Math.abs(x) > Math.abs(y)) {
            System.out.println(x / 2.0);
        }
//Напечатать числа с помощью цикла for следующим образом:
//	10 10.4
//	11 11.4
//	...
//	25 25.4
        int i = 10;
        for (i = 10; i < 26; i++) {
            System.out.println(i + "\t" + i + ".4");
        }
// Найти максимальное из натуральных чисел, не превышающих 5000, которое нацело делится на 39. Используйте цикл с пост- или предусловием
        int z = 0;
        int t = 39;
        while (t <= 5000) {
            if (t % 39 == 0) {
                z = t;
            }
            t++;
        }
        System.out.println("Наибольшее натуральное число,которое не превышает 5000 и делится нацело на 39: " + z);

// Заполнить массив из десяти элементов значениями, вводимыми с клавиатуры в ходе выполнения программы.
        int c; //schetchik
        int r; //schetchik
        double[] num = new double[10];
        for (c = 0; c < 10; c++) {
            System.out.println("Введите значение элемента массива: ");
            num[c] = sc.nextDouble();
        }
        for (r = 0; r < 10; r++)//vivod masssiva dlya proverki
        {
            System.out.println(num[r]);

        }

//Задачка со звездочкой:Гражданин 1 марта открыл счет в банке, вложив 1000 руб. Через каждый месяц размер вклада увеличивается на 2% от имеющейся суммы. Определить:
// за какой месяц величина ежемесячного увеличения вклада превысит 30 руб.;
// через сколько месяцев размер вклада превысит 1200 руб.
        double telovklada = 1000;
        double uvelichenie = 30;
        int nummes;
        int mes = 0;
        int mesU = 0;
        String[] meses = {"Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь", "Январь", "Февраль"};
        do {
            mes++;
            uvelichenie = telovklada * 2.0 / 100;
            telovklada = telovklada + uvelichenie;
            if (uvelichenie > 30) {
                mesU = mes;
            }

        }
        while (telovklada <= 1200);
        System.out.println("Вклад превысит 1200 через " + mes + " месяцев");
        if (uvelichenie <= 30) {
            do {
                mes++;
                uvelichenie = telovklada * 2.0 / 100;
                telovklada = telovklada + uvelichenie;

            }
            while (uvelichenie <= 30);
            mesU = mes;
        }
        if (mesU > 12) {
            nummes = (mesU % 12 - 1);
            System.out.println("величина ежемесячного увеличения вклада превысит 30 руб за " + meses[nummes] + " месяц");
            System.out.println("Прошло с начала вклада " + mesU + " месяцa");
        } else {
            System.out.println("величина ежемесячного увеличения вклада превысит 30 руб за " + meses[mes - 1] + " месяц");
            System.out.println("Прошло с начала вклада " + mesU + " месяцa");
        }

    }

}






