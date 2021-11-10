# Modul 5 : Mengelola Class

## A. Dasar Teori
#### 1. Package 
Package adalah suatu cara untuk memenej class-class yang kita  buat pakage akan sangat bermanfaat jika class-class yang kita buat  sangat banyak sehingga perlu dikelompokan berdasarkan kategori  tertentu. Yang harus diperhatikan adalah biasanya nama class utama  harus sama dengan nama package. Berikut ini adalah sintak pernyataan package untuk meletakkan hasil kompilasi sebuah kelas ke dalam paket  : 
```java
package nama-paket; 
<identifier> class <nama_class sama dengan package> 
```
Contoh :
```java
package Utama; 
public class Utama{ 
}
```

#### 2. Import Class

Perintah import digunakan untuk memberitahukan kepada  program untuk mengacu pada class-class yang terdapat dalam package  tertentu, buka menjalankan class-class tersebut.

Deklarasi import class :
```java
import <nama_package>.*; 
```
Contoh : 
```java
import matematik.*; 
```
Sedangkan untuk mengimpor class tertentu anda dapat 
menuliskan nama class setelah nama package. 

Deklarasi import : 
```java
import <nama_package>.<nama_class>; 
import matematik.bilangan; 
```

Contoh penggunaan import (dengan implementasinya): 
```java
import matematik.bilangan; 
class Utama { 
    public static void main(String[] args) { 
        Bilangan x = new Bilangan(); x.setDesimal(-44); 
        System.out.println("Bilangan biner dari "+ x.getDesimal() + " adalah "+ x.biner()); 
    }
}
```

#### 3. Kata kunci this

Kata kunci ini digunakan dalam sebuah kelas untuk menyatakan  
object sekarang. Kata kunci this sangat berguna untuk menunjukkan  suatu member dalam class-nya sendiri. this dapat digunakan baik untuk data member maupun untuk function member, serta dapat juga digunakan untuk konstruktor. Adapun format penulisannya adalah:
```java
this.data_member        ||  merujuk pada data member
this.function_member()  ||  merujuk pada function member
this()                  ||  merujuk pada konstruktor
```


<hr>

## B. Latihan
Mengimplementasikan UML class diagram dalam program untuk  package perbankan 
Transformasikan class diagram diatas ke dalam bentuk program!

Jawaban : 

[Source Code](https://github.com/awaqo/20104016_Aqil-Jawadal-Furqon_SE04A_Pemrograman2/tree/modul5/src/modul5/latihan)

Output dari program ini yaitu
```java
Nasabah atas nama Agus Daryanto
Saldo awal : 5000
Jumlah uang yang disimpan 3000
Jumlah uang yang diambil 6000 OK
Jumlah uang yang disimpan 3500
Jumlah uang yang diambil 4000 OK
Jumlah uang yang diambil 1600 Gagal
Jumlah uang yang disimpan 2000
Saldo sekarang = 3500

Process finished with exit code 0
```


<hr>

## C. Kesimpulan
Pada praktikum modul 5 ini, materi yang saya dapat dan saya pahami yaitu mengenai Pengelolaan Class di Java. Pada modul ini materi yang dibahas yaitu mengenai Package, Import Class, dan penggunaan kata kunci this.

