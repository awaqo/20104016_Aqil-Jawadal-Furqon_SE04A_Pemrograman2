package modul3.percobaan;

public class tesTabungan {
    public static void main(String[] args) {
        Tabungan t = new Tabungan(5000);
        System.out.println("Saldo awal tabungan Anda : " + t.saldo);
        int wd = 1500;
        t.ambilUang(wd);
        System.out.println("Jumlah uang yang diambil : " + wd);
        System.out.println("Saldo tabungan Anda sekarang adalah : " + t.saldo);
    }
}
