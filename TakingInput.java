import java.io.IOException;
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) throws IOException {
        // System.out.println("Enter your name : ");
        // int x = System.in.read();
        // System.out.println(x);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your ID : ");
        int id = scanner.nextInt();

        scanner.nextLine(); // this will eat up the remaining \n
        
        System.out.println("Enter your name : ");
        String name = scanner.nextLine();
        // String name = scanner.next();

        System.out.println("Enter your age : ");
        byte age = scanner.nextByte();

        System.out.println("ID : " + id);
        System.out.println("Hello " + name);
        System.out.println("Age : " + age);
        
        scanner.close();

    }
}
