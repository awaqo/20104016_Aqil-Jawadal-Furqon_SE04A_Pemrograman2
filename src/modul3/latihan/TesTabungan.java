package modul3.latihan;

public class TesTabungan {
    public static void main(String[] args) {
        boolean status;
        Tabungan tabungan = new Tabungan(10000);
        System.out.print("Saldo awal : " + tabungan.getSaldo());
        int simpan1 = 8000;
        tabungan.simpanUang(simpan1);
        System.out.println("\nJumlah uang yang disimpan : " + simpan1);
        System.out.println("Saldo Sekarang : " + tabungan.getSaldo());

        int ambil1 = 7000;
        status=tabungan.ambilUang(ambil1);
        System.out.print("Jumlah uang yang diambil : " + ambil1);
        if (status)
            System.out.println("  ok");
        else
            System.out.println("  gagal");

        System.out.println("Saldo Sekarang : " + tabungan.getSaldo());

        int simpan2 = 1000;
        tabungan.simpanUang(simpan2);
        System.out.println("\nJumlah uang yang disimpan : " + simpan2);
        System.out.println("Saldo Sekarang : " + tabungan.getSaldo());

        int ambil2 = 10000;
        status=tabungan.ambilUang(ambil2);
        System.out.print("Jumlah uang yang diambil : " + ambil2);
        if (status)
            System.out.println("  ok");
        else
            System.out.println("  gagal");

        System.out.println("Saldo Sekarang : " + tabungan.getSaldo());

        int ambil3 = 2500;
        status=tabungan.ambilUang(ambil3);
        System.out.print("Jumlah uang yang diambil : " + ambil3);
        if (status)
            System.out.println("  ok");
        else
            System.out.println("  gagal");

        System.out.println("Saldo Sekarang : " + tabungan.getSaldo());

        int simpan3 = 2000;
        tabungan.simpanUang(simpan3);
        System.out.println("\nJumlah uang yang disimpan : " + simpan3);

        System.out.println("Saldo Sekarang : " + tabungan.getSaldo());
    }
}
