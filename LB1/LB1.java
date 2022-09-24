package LB1;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class LB1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Hm[] Mass = new Hm[3];
        Hm[] Che = new Hm[3];

        Mass[0] = new Hm(); // первый человек
        Che[0] = new Hm();
        Mass[0].Pri = "Волкова";
        Mass[0].Im = "Наташа";
        Mass[0].Pob = "Бримовна";
        Mass[0].age = 40 + Math.random() * 40;
        Che[0].size = 15 + Math.random() * 35;
        System.out.println("Прізвище: " + Mass[0].Pri);
        System.out.println("Імя: " + (Mass[0].Im));
        System.out.println("По-батькові: " + Mass[0].Pob);
        System.out.println("Вік: " + (int) Mass[0].age);
        System.out.println("Розмір Одягу: " + (int) Che[0].size);


        System.out.println("......................................................................");


        Mass[1] = new Hm(); // второй человек
        Che[1] = new Hm();
        Mass[1].Pri = "Лені";
        Mass[1].Im = "Игнат";
        Mass[1].Pob = "Тарасович";
        Mass[1].age = 40 + Math.random() * 69;
        Che[1].size = 20 + Math.random() * 35;
        System.out.println("Прізвище: " + Mass[1].Pri);
        System.out.println("Імя: " + (Mass[1].Im));
        System.out.println("По-батькові: " + Mass[1].Pob);
        System.out.println("Вік: " + (int) Mass[1].age);
        System.out.println("Розмір Одягу: " + (int) Che[1].size);


        System.out.println("......................................................................");

        Mass[2] = new Hm(); // третий человек
        Che[2] = new Hm();
        Mass[2].Pri = "Тагір";
        Mass[2].Im = "Сергій";
        Mass[2].Pob = "Алукардовіч";
        Mass[2].age = 40 + Math.random() * 30;
        Che[2].size = 13 + Math.random() * 35;
        System.out.println("Прізвище: " + Mass[2].Pri);
        System.out.println("Імя: " + (Mass[2].Im));
        System.out.println("По-батькові: " + Mass[2].Pob);
        System.out.println("Вік: " + (int) Mass[2].age);
        System.out.println("Розмір Одягу: " + (int) Che[2].size);

        //проверки розмера всех  людей

            double max = Che[0].size;
            for (int i = 0; i < Che.length; i++) {
                if (max < Che[i].size) {
                    max = Che[i].size;
                }
            }

        //Средний размер людей от 40
        int Chet = 0;
        double sum = 0;
        double Sred = 0;
        for (int i = 0; i <= 2; i++) {
            if (Mass[i].age >= 40) {

                Chet = Chet + 1;
                sum = sum + Che[i].size;

            }

        }

        System.out.println("---------------------------------------------------------------");

        //вывод максимума с именем
        for (int i = 0; i < Che.length; i++) {
            if (max == Che[i].size) {
                System.out.println("Людина з найбільшим розміром одягу: " + Mass[i].Im + " розмір: " + (int) max);
            }

        }
        System.out.println("---------------------------------------------------------------");

        //вывод среднего размера
        Sred = sum / Chet;
        System.out.println("Середній розмір одягу для людей віком від 40 років: " + (int) Sred);


        //Сортировка по возр.
        System.out.println("---------------------------------------------------------------");

        System.out.println("Сортування розмірів одягу людей за зростанням");
        Integer[] integerArray = new Integer[Che.length];
        for (int i = 0; i < Che.length; i++) {
            integerArray[i] = (int) Che[i].size;
        }
        Arrays.sort(integerArray);
        for (int i = 0; i < integerArray.length; i++) {

            System.out.println(integerArray[i]);
        }


        System.out.println("Введіть прізвище людини яку шукаєте - ");
        String name= sc.nextLine();
        int num = -1;

        for (int i = 0; i < Mass.length; i++)
            if (name.equalsIgnoreCase(String.valueOf(Mass[i].Pri))) num = i;

        if (num != -1) {
            System.out.println(Mass[num].Pri + " " + Mass[num].Im + " " + Mass[num].Pob + ", " + (int)Mass[num].age + " років, " + "розмір одягу: " + (int)Che[num].size);

        } else {
            System.out.println("Такої людини нема в списку");
        }
        changeInfo(Mass);
    }

    public static void changeInfo(Hm[] Mass) {
        Scanner sc = new Scanner(System.in);
        System.out.println("выберите что будете менять");
        System.out.println("1 - имя  ");
        System.out.println("2 - фамилия  ");
        System.out.println("3 - отчество  ");
        int number = sc.nextInt();

        System.out.println("Введіть номер стовбця котрий хочете редагувати (з 0 до ..) - ");
        int nom = sc.nextInt();


        switch (number) {
            case 1:
                System.out.println("Введіть нове прізвище " + Mass[nom].Pri);
                sc.nextLine();
                Mass[nom].Pri = sc.next();
                System.out.println("Нове прізвище: " + Mass[nom].Pri);
                break;
            case 2:
                System.out.println("Введіть нове імя " + Mass[nom].Im);
                sc.nextLine();
                Mass[nom].Im = sc.next();
                System.out.println("Нове імя:  " + Mass[nom].Im);
                break;
            case 3:
                System.out.println("Введіть нове імя по б.  " + Mass[nom].Pob);
                sc.nextLine();
                Mass[nom].Pob = sc.next();
                System.out.println("нове імя по б. : " + Mass[nom].Pob);


        }
        System.out.println("Змінена строчка: "+Mass[nom].Pri+" "+Mass[nom].Im+" "+Mass[nom].Pob);
    }
}














