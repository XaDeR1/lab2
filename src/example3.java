import java.util.InputMismatchException;
import java.util.Scanner;

public class example3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            int num = scan.nextInt();
            System.out.println(num % 4 == 0 && num >=10 ? "True" : "False");
        }catch(InputMismatchException e){
            System.out.println("Неверный формат");
        }
    }
}
