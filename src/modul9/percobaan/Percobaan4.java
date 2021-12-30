package modul9.percobaan;

public class Percobaan4 {
    public static void main(String[] args) {
        int bil = 10 ;
        try {
            System.out.println(bil/0);
        } catch(ArithmeticException e) {
            System.out.println("Terjadi exception karena tidak boleh membagi bilangan dengan 0");
        } catch(Exception e) {
            System.out.println("Error");
        }
    }
}
