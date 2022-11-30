import java.util.InputMismatchException;
import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            int num = scan.nextInt();
            System.out.println(num % 5 == 2 && num % 7 == 1 ? "True" : "False");
        }catch(InputMismatchException e){
            System.out.println("Неверный формат");
        }
    }
}

