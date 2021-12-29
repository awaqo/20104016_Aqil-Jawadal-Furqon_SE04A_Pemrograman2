package modul9.percobaan;

public class Percobaan2 {
    public static void main(String[] args) {
        int a[] = new int[5];
        try {
            a[5] = 100;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index array melebihi batas");
        }
    }
}
