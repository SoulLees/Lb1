package LB2_Catch;

public class PrimerCatch {

    // створений клас
    public class Primer2 {

        // головний метод Main для опрацювання програми
        public static void main(String[] args) {

            // визначає блок коду, в якому може статися виняток
            try  {

                // висновок данних
                System.out.println("0");
                throw new RuntimeException("Неперевірина помилка"); // спадкування

            } catch (RuntimeException e) { // виняток перехоплено
                System.out.println("1" + e); // виняток опрацьовано
            }
            System.out.println("2"); // висновок данних
        }
    }
}
