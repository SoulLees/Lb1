package Lb1_version2;

import java.util.Arrays;
import java.util.Scanner;
public class InfoPeaple {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int r = sc.nextInt();
            Hm[] mass = new Hm[r];

            for (int i = 0; i < mass.length; i++) {
                mass[i] = new Hm();


                System.out.println("Введите Фамилию -> ");
                mass[i].Pri = sc.next();

                System.out.println("Введите Имя -> ");
                mass[i].Im = sc.next();

                System.out.println("Введите отчество  -> ");
                mass[i].Pob = sc.next();

                System.out.println("Введите возраст -> ");
                mass[i].age = sc.nextInt();

                System.out.println("Введите розмер одежды -> ");
                mass[i].size = sc.nextInt();

            }
            System.out.println("наибольший размер ");
            checkingPeople(mass);

            System.out.println("---------------------------------------------------------------");

            System.out.println("средний розмер олюдей от 40 лет  ");
            averageSize(mass);

            System.out.println("---------------------------------------------------------------");

            System.out.println("sortyvanu ");
            sortHm(mass);

            System.out.println("---------------------------------------------------------------");

            System.out.println("searching ");
            search(mass);

            System.out.println("---------------------------------------------------------------");

            System.out.println("изменение ");
            changeInfo(mass);
        }
            //проверки розмера всех  людей
            public static void checkingPeople(Hm[] mass){
            int nm=0;
                double max = mass[nm].size;
                for (int i = 0; i < mass.length; i++)
                    if (max < mass[i].size) {
                        max = mass[i].size;
                    }


                System.out.println(mass[nm].size + mass[nm].Im);
            }

            //Средний размер людей от 40
            public static void averageSize(Hm[] mass) {
                int Chet = 0;
                double sum = 0;
                double Sred = 0;
                for (int i = 0; i < mass.length; i++) {
                    if (mass[i].age >= 40) {

                        Chet = Chet + 1;
                        sum = sum + mass[i].size;

                    }

                }
                Sred = sum / Chet;
                System.out.println(Sred);
            }

            //Сортировка по возр.
             public static void sortHm(Hm[] mass) {
                 Integer[] integerArray = new Integer[mass.length];
                 for (int i = 0; i < mass.length; i++) {
                     integerArray[i] = (int) mass[i].size;
                 }
                 Arrays.sort(integerArray);
                 for (int i = 0; i < integerArray.length; i++) {

                     System.out.println(integerArray[i]);
                 }
             }

    public static void search(Hm[] mass) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int num =-1 ;
           for (int i = 0; i < mass.length; i++)
               if (name.equalsIgnoreCase(String.valueOf(mass[i].Pri))) num = i;

          if (num != -1) {
               System.out.println(mass[num].Pri + " " + mass[num].Im + " " + mass[num].Pob + ", " + (int)mass[num].age + " років, " + "розмір одягу: " + (int)mass[num].size);

           } else {
                System.out.println("Такої людини нема в списку");
            }
      }

        public static void changeInfo(Hm[] mass) {
            Scanner sc = new Scanner(System.in);
            System.out.println("выберите что будете менять");
            System.out.println("1 - Прізвище  ");
            System.out.println("2 - Імя  ");
            System.out.println("3 - По батькові  ");
            int number = sc.nextInt();

            System.out.println("Введіть номер стовбця котрий хочете редагувати (з 0 до ..) - ");
            int nom = sc.nextInt();


            switch (number) {
                case 1:
                    System.out.println("Введіть нове прізвище " );
                    sc.nextLine();
                    mass[nom].Pri = sc.next();
                    System.out.println("Нове прізвище: " );
                    break;
                case 2:
                    System.out.println("Введіть нове імя " );
                    sc.nextLine();
                    mass[nom].Im = sc.next();
                    System.out.println("Нове імя:  " );
                    break;
                case 3:
                    System.out.println("Введіть нове імя по б.  ");
                    sc.nextLine();
                    mass[nom].Pob = sc.next();
                    System.out.println("нове імя по б. : ");


            }
            System.out.println("Новий запис: "+mass[nom].Pri+" "+mass[nom].Im+" "+mass[nom].Pob);
        }
    }









