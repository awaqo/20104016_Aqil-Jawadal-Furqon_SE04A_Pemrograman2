package modul2.latihan;

import java.util.Scanner;

public class ABC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kasus, hasil, a, b, c;

        System.out.print("Kasus yang akan dihitung : ");
        kasus = input.nextInt();

        for (int i = 1; i <= kasus; i++) {
            System.out.print("Masukan nilai A" +i+ " = ");
            a = input.nextInt();
            System.out.print("Masukan nilai B" +i+ " = ");
            b = input.nextInt();
            System.out.print("Masukan nilai C" +i+ " = ");
            c = input.nextInt();
            hasil = a + b - c;
            System.out.print("Hasil Dari A " +i+ "+ B " +i+ "- C " +i+ "adalah = " +hasil);
            System.out.println();
        }
    }
}
