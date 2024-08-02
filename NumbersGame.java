import java.util.*;

public class NumbersGame {

    public static void guess(int n) {
        Scanner in = new Scanner(System.in);
        int t = 5;
        int x = 0;
        System.out.println("Lets Begin!");
        System.out.println("Note: YOU HAVE ONLY 5 TURNS TO GUESS THE NUMBER.");
        for (int i = 1; i <= t; i++) {
            System.out.println("Chance " + i + ":");
            System.out.print("Enter number :");
            x = in.nextInt();
            if (x == n) {
                System.out.println("Congratulations! You did it.");
                break;
            } else if (x != n && i == t) {
                System.out.println("Sorry, you missed it.Better Luck Next Time!");
            } else if (x > n && ((x - 2) == n || (x - 1) == n)) {
                System.out.println("You are near the number,Guess a bit smaller number.");
            } else if (x < n && ((x + 2) == n || (x + 1) == n)) {
                System.out.println("You are near the number,Guess a bit larger number.");
            } else if (x > n && ((x - 2) > n)) {
                System.out.println("Too high number,Guess smaller number.");
            } else if (x < n && ((x + 2) < n)) {
                System.out.println("Too low number,Guess larger number.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int flag = 0;
        int i, j, n = 0;
        char c;
        while (flag == 0) {
            System.out.println("Enter lower range:");
            i = sc.nextInt();
            System.out.println("Enter upper range:");
            j = sc.nextInt();
            n = rand.nextInt(j - i + 1) + i;
            guess(n);
            System.out.println("Want to play again? (y/n)");
            c = sc.next().charAt(0);
            if (c == 'y') {
                flag = 0;
            } else if (c == 'n') {
                flag = 1;
            } else {
                System.out.println("Invalid input");
                break;
            }

        }
        System.out.println("Thank you!");
    }
}
