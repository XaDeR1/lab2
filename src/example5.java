import java.util.InputMismatchException;
import java.util.Scanner;

public class example5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println(scan.nextInt()/1000);
        }catch(InputMismatchException e){
            System.out.println("Неверный формат");
        }
    }
}
