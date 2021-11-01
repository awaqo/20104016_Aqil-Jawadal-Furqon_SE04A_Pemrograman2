package modul4.percobaan;

public class main {
    public static void main(String[] args) {
        Tabungan t = new Tabungan("Awq", 20104016, 1000000000, 1234);
        System.out.println("Nama \t\t\t : " + t.getNama());
        System.out.println("No Rekening \t : " + t.getNoRekening());
        System.out.println("Saldo \t\t\t : " + t.getSaldo());
        System.out.println("PIN \t\t\t : " + t.getPin());

    }
}
