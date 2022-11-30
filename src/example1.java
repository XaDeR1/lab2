import java.util.InputMismatchException;
import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println(scan.nextInt() % 3 == 0 ? "Делится" : "Не делится");
        }catch(InputMismatchException e){
            System.out.println("Неверный формат");
        }
    }
}
