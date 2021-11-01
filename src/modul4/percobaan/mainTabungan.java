package modul4.percobaan;

public class mainTabungan {
    public static void main(String[] args) {
        Tabungan t = new Tabungan("Awaqo", 51240210);
        Tabungan nt = new Tabungan("wqwq", 91239121, 2400000, 7182);

        t.setSaldo(10000);
        t.setPin(9999);

        System.out.println("Saldo awal saya1 : " + t.getSaldo());
        System.out.println("Saldo awal saya2 : " + nt.getSaldo());
        System.out.println("Nomor pin saya1 : " + t.getPin());
        System.out.println("Nomor pin saya2 : " + nt.getPin());

    }
}
