import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // function to count words
        System.out.println("Please enter your string to be counted:");
        String inputSring = scan.nextLine();
        System.out.println(charCounter.returnCount(inputSring));

    }
}
