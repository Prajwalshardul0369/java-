import java.util.Scanner;
public class userInput {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        System.out.println("Addition of a and b");
        int c = a + b;

        System.out.println(c);
    }
}
