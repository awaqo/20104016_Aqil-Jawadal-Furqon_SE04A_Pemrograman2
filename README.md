# Modul 9 : Exception


<hr>


## A. Dasar Teori
Exception merupakan suatu kondisi abnormal yang terjadi saat menjalankan suatu program. Agar tidak terjadi error, java memiliki teknik yang disebut exception handling, karena dalam java segala sesuatu merupakan objek, maka exception juga diorepresentasikan dalam sebuah objek yang menjelaskan tentang exception tersebut. Contohnya adalah pembagian suatu bilangan dengan 0, pengisian elemen array diluar ukuran array tersebut, kegagalan disaat menyambungan dengan database, dan lainnya. Terdapat dua cara dalam penganganan excception, yaitu:

- Menangani sendiri exception tersebut
- Meneruskan ke luar dengan cara membuat suatu objek tentang exception tersbut dan melemparkannya keluar agar ditangani oleh kode yang memanggil method yang didalamnya terdapat exception

Terdapat 5 keyword yang digunakan oleh Java dalam menangani exception, yaitu:

1. Try
2. Catch
3. Finaly
4. Throw
5. Throws

Try - Catch merupakan keyword yang digunakan dengan cara memasukan kode yang kemungkinan terjadinya exception kedalam TRY lalu masukan jenis exception kedalam CATCH. Contoh try dan catch:

```java
public class Percobaan2 {
    public static void main(String[] args) { 
    int a[] = new int[5];
        try{
            a[5] = 100 ;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Indeks Array melebihi batas");
        }
        System.out.println("Setelah blok try-catch"); 
    }
}

// Hasil running
// Terjadi exception karena Indeks Array melebihi batas Setelah blok try-catch
```

Finaly digunakan ketika kode kemungkinan terjadi atau tidak terjadi exception, contohnya ketika kita membuka file, hal ini memiliki kemungkinan terjadinya exception yaitu file tidak ada atau file tidak bisa dibuka atau sebaliknya. Contoh:

```java
public class Percobaan2 {
    public static void main(String[] args) {
        int a[] = new int[5];
        try{
            a[5] = 100 ;
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Terjadi exception karena Indeks Array melebihi batas");
        } finally{
            System.out.println("Selalu Dijalankan");
        } System.out.println("Setelah blok try-catch");
    }
}
```

Throw dan Throws secara eskplisit, kita melempar suatu exception dari program menggunakan keyword throw. Jika exception tersebut checked exception maka pada method harus ditambahkan throws. Jika exception tersebut adalah unchecked exception, maka pada method tidak perlu ditambahkan throws.

```java
public class Percobaan6 {
    public static void method1() throws
            FileNotFoundException { 
        throw new FileNotFoundException("File Tidak Ada");
    } public static void main(String[] args) {
        try {
            method1(); 
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());}
    }
}
```


<hr>

## B. Percobaan
Membuat 5 class : <br>
1. ExcepTest
2. Exception
3. Percobaan2
4. Percobaan4
5. Percobaan22

<br>Semua file program percobaan di atas dapat dibuka disini<br>
[Source Code](https://github.com/awaqo/20104016_Aqil-Jawadal-Furqon_SE04A_Pemrograman2/tree/modul9/src/modul9/percobaan)

<hr>

## C. Latihan
1. Method yang melempar checked exeception

```java
File Tidak Ada

Process finished with exit code 0
```

2. Method yang melempar unchecked exception

```java
Masukan Angka : 100
Angka lebih dari 10
Selesai

Process finished with exit code 0
```

3. Menggunakan konsep Inheritance untuk membuat superclass dan subclass exception. Program menangani exception dengan menangkap subclass exception dengan superclass.
<br>
![image](https://user-images.githubusercontent.com/37984552/147717639-7f41129a-217e-424a-a042-7173d357eb21.png)

<br>
<br>Semua file program percobaan di atas dapat dibuka disini<br>
[Source Code](https://github.com/awaqo/20104016_Aqil-Jawadal-Furqon_SE04A_Pemrograman2/tree/modul9/src/modul9/latihan)

<hr>

## D. Kesimpulan
Pada praktikum modul 9 ini, materi yang saya dapat dan saya pahami yaitu mengenai Exception Handling yaitu suatu fitur pada pemerograman yang akan sangat penting karena di dalam exception handling ini kita dapat menuliskan dengan lebih jelas mengapa program yang kita buat error.
