package modul0;
import java.util.Scanner;

public class InputKeyboard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int var_a;
        int var_b;
        System.out.println("Masukkan nilai var_a : ");
        var_a = input.nextInt();
        System.out.println("Masukkan nilai var_b : ");
        var_b = input.nextInt();
        System.out.println("Variable yang terdapat dalam program");
        System.out.println("var_a : " + var_a);
        System.out.println("var_b : " + var_b);
    }
}
