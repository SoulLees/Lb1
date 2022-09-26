package LB2_Catch;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lb2 {

    public static void main(String[] args) {
       try {
          try {
               Scanner sc = new Scanner(System.in);
               System.out.println("Введите кол-во чисел");
               int size = sc.nextInt();
               byte[] mass = new byte[size];

               System.out.println("Введите 5 чисел в диопозоне от -128 до 127");
               data(mass);

           }catch (NegativeArraySizeException exception){
              System.out.println("Минус убери, умник \uD83E\uDD28");
              main(args);
          }

           } catch (InputMismatchException exception) {
               System.out.println("Вы ввели некоректные данные! Придеться начать с начала...");
               main(args);
           }

    }
        public static void data (byte[] mass){
            Scanner sc = new Scanner(System.in);
            int sum = 0;
            for (int i = 0; i < mass.length; i++) {
                mass[i] = sc.nextByte();
                sum = sum + mass[i];
            }
            System.out.println("числа которые вы ввели: ");
            for (int i = 0; i < mass.length; i++) {
                System.out.println(mass[i]);

            }
            System.out.println("Сумма = " + sum);
        }


    }

