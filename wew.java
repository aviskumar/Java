import java.util.Scanner;

public class wew
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Prime number");
        System.out.println("2. Palindrome number");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        switch (choice) {
            case 1:
            int c = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    c++;
                }
            }
            if (c == 2) 
                System.out.println(num + " is Prime");
            else
                System.out.println(num + " is not Prime");
            break;

            case 2:
            int copyNum = num;
            int revNum = 0;

            while(copyNum != 0) {
                int digit = copyNum % 10;
                copyNum /= 10;
                revNum = revNum * 10 + digit;
            }

            if (revNum == num) 
                System.out.println(num + " is palindrome");
            else
                System.out.println(num + " is not palindrome");
            break;
        }
    }
}