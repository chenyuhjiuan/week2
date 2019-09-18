import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class GuessNum {

    public static void main(String are[]) {
        int a = 6;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type a number less than 10.");

        while (true) {

            int guessno = sc.nextInt();
            if (guessno == 6)
                break;

            System.out.printf("You guess wronly. Please try again.");
        }
        System.out.println("Congratulation! You got it right.");
    }
}