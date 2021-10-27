package modul2.latihan;

public class AnakAyam {
    public static void main(String[] args) {
        int anakAyam = 10;

        System.out.print("--Lagu Anak Ayam--");
        while (anakAyam !=0) {
            System.out.println(" ");
            System.out.println("Anak Ayam Turun " + anakAyam);
            anakAyam--;

            if (anakAyam == 0) {
                System.out.println("Mati 1 tinggal induknya " + anakAyam);
            } else {
                System.out.println("Mati 1 tinggal " + anakAyam);
            }
        }
    }
}

