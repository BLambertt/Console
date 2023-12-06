import java.time.LocalTime;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        demarrage();

        String s;
        do {
            Scanner sc = new Scanner(System.in);

            System.out.println("Testez vos palindromes ! Ou tapez \"1\"pour sortir.");
            s = sc.nextLine();
            if (!s.equals("1") && isPalidnrome(s)){
                System.out.println("Bien joué !");
            }else {
                System.out.println(retourner(s));
            }
        } while (!s.equals("1"));


    }

    private static void demarrage() {
        if (LocalTime.now().isBefore(LocalTime.of(17, 30, 0)) && LocalTime.now().isAfter(LocalTime.of(6, 0, 0))) {
            System.out.println("Bonjour");
        } else if (LocalTime.now().isBefore(LocalTime.of(21, 30, 0)) && LocalTime.now().isAfter(LocalTime.of(17, 30, 0))) {
            System.out.println("Bonsoir");
        } else {
            System.out.println("Bonne nuit");
        }
    }

    private static StringBuilder retourner(String s) {
        StringBuilder reverseS = new StringBuilder();
        reverseS.append(s);
        return  reverseS.reverse();
    }

    private static boolean isPalidnrome(String s) {
        int i = 0, j = s.length() - 1;


        while (i < j) {


            if (s.charAt(i) != s.charAt(j))
                return false;

            i++;
            j--;
        }
        return true;
    }
}