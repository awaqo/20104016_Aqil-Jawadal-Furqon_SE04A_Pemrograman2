# Modul 3 : Pengenalan Pemrograman Berorientasi Objek

## A. Dasar Teori
1. Pemrograman Berorientasi Objek 

Pemrograman Berorientasi Objek (Object Oriented  
Programming/OOP) merupakan pemrograman yang berorientasikan kepada objek, dimana semua data dan fungsi dibungkus dalam class class atau object-object.  
PBO memiliki beberapa karakteristik mendasar, antara lain  
adalah abstraksi, encapculation (pembungkusan), inheritance  
(pewarisan), dan polymorphism.

2. Mendeklarasikan Suatu Class

Class adalah wadah yang berisi abstraksi (pemodelan) dari suatu  fungsi objek (benda), yang mendeskripsikan data (sifat karakteristik) dan fungsi yang dimiliki oleh objek tersebut. 
Deklarasi class dapat dilakukan dengan sintaks sebagai berikut:
```java
<modifier> class <nama_class> {  
    [isi class] 
}
```
contoh : 
```java
public class Mobil{ }
```

3. Mendeklarasikan Suatu Atribut

Attributes merupakan nilai (type) data yang terdapat pada suatu object  yang berasal dari class. Attributes merepresentasikan karakteristik dari  suatu object.  
Deklarasi atribut dapat dilakukan dengan sintaks sebagai berikut:
```java
<modifier> <tipe> <nama_atribut> ; 
```
Contoh : 
```java
public String warna;
```

4. Mendeklarasikan suatu metode

Metode/method adalah sesuatu yang dapat dilakukan oleh objek.  Method dalam implementasi program ditulis dalam bentuk fungsi.  Metode menentukan apa yang terjadi ketika objek itu dibuat serta berbagai operasi yang dapat dilakukan objek. 
Deklarasi metode dapat dilakukan dengan sintaks sebagai berikut: 
```java
<modifier> <return_type> <nama_metode>  
    ([daftar_argumen]) 
    [<statement>] 
}
```
Contoh : 
```java
public void info(){ 
  System.out.println(warna);
}
```

6. Mengakses anggota suatu objek

Untuk dapat mengakses anggota-anggota dari suatu obyek, maka  harus dibuat instance dari class tersebut terlebih dahulu. Berikut ini  adalah contoh pengaksesan anggota-anggota dari class Mobil: 
```java
public class Mobil { 
  public static void main(String args[]){ 
    Mobil m=new Mobil(); 
    m.warna=”hitam”;  
    m.no_Plat=”KT 2837 UE”;  
    m.info(); 
  } 
}
```

<hr>

## B. Latihan
Mengimplementasikan UML class diagram dalam program untuk  class Tabungan

Jawaban : [Source Code](https://github.com/awaqo/20104016_Aqil-Jawadal-Furqon_SE04A_Pemrograman2/tree/modul3/src/modul3/latihan)


<hr>

## C. Kesimpulan
Pada praktikum modul 3 ini, materi yang saya dapat dan saya pahami yaitu mengenai pengenalan PBO dengan diawali membuat atau mendeklarasikan sebuah class, mendeklarasikan atribut dari class yang telah dibuat, mendeklarasikan metode dari class tersebut, lalu mengakses anggota dari suatu objek dengan cara membuat instance dari class yang telah dibuat.

