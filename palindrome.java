import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        String s;

        // Taking input using Scanner Class
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Number = ");
        // Storing the the input value in s
        s = in.nextLine();

        // Length of the String
        int n = s.length();
        String rev = "";

        for (int i = n - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

        System.out.println("Reverse Number = " + rev);

        // Checking Palindrome
        if (s.equals(rev))
            System.out.println("Palindrome = Yes");
        else
            System.out.println("Palindrome = No");
    }
}
