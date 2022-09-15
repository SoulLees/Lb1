package primer2LB1;
import java.util.Scanner;

    class Sotrudnik {
        String fam, im, otch, doljnost;
        int oklad;
    }

    public class pr2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введіть кількість співробітників => ");
            int kol = sc.nextInt();
            sc.nextLine(); //очищення буфера після введення числа

            Sotrudnik[]sotr = new Sotrudnik[kol];  //отримано посилання на масив співробітників

            System.out.println("Введіть інформацію про кожного співробітника: ");
            for (int i = 0; i < sotr.length; i++) {
                sotr[i]=new Sotrudnik(); // отримано посилання на i-тий елемент
                // Присвоєння значень полям
                System.out.print("Введіть прізвище " + (i+1) + " співробітника => ");
                sotr [i]. fam = sc.nextLine ();
                System.out.print("Введіть його ім'я => ");
                sotr[i].im=sc.nextLine();
                System.out.print("Введіть його по батькові => ");
                sotr[i].otch=sc.nextLine();
                System.out.print("Введіть його посаду => ");
                sotr[i].doljnost=sc.nextLine();
                System.out.print("Введіть його оклад => ");
                sotr[i].oklad=sc.nextInt();
                sc.nextLine(); //очищення буфера
            } // end for

            // Виведення інформації про співробітників
            System.out.println("\n Співробітники фірми: \n фам \t ім'я \t отч \t посада \t Оклад");
            for (int i = 0; i < sotr.length; i++) {
                Sotrudnik s = sotr[i];
                System.out.println(s.fam + "\t" + s.im + "\t" + s.otch + "\t" + s.doljnost + "\t\t" + s.oklad);
            }
        }
    }
