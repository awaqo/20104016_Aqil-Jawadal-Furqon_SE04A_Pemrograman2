# Modul 6 : Konsep Inheritance


<hr>


## A. Dasar Teori
Dengan konsep inheritance, sebuah class dapat mempunyai class  turunan. Suatu class yang mempunyai class turunan dinamakan parent class atau base class. Sedangkan class turunan itu sendiri seringkali disebut  subclass atau child class. Suatu subclass dapat mewarisi apa-apa yang  dipunyai oleh parent class-nya. Kesimpulannya, boleh dikatakan bahwa suatu  subclass adalah tidak lain hanya memperluas (extend) parent class-nya. 
Di dalam Java untuk mendeklarasikan suatu class sebagai subclass  dilakukan dengan cara menambahkan kata kunci extends setelah deklarasi  nama class, kemudian diikuti dengan nama parent class-nya. 
<br>Berikut adalah  contoh deklarasi inheritance.
<br>Contoh :
```java
public class B extends A { 
    <isi class>
}
```
<br>Contoh diatas memberitahukan kompiler Java bahwa kita ingin meng extend class A ke class B. Dengan kata lain, class B adalah subclass (class  turunan) dari class A, sedangkan class A adalah parent class dari class B. 
<br><br>Java hanya memperkenankan adanya single inheritance. Konsep single  inheritance hanya memperbolehkan suatu sublass mempunyai satu parent  class. Dengan konsep single inheritance ini, masalah pewarisan akan dapat  diamati dengan mudah. 
<br><br>Suatu parent class dapat tidak mewariskan sebagian member-nya  kepada subclass-nya. Sejauh mana suatu member dapat diwariskan ke class  lain, ataupun suatu member dapat diakses dari class lain, sangat berhubungan  dengan access control (kontrol pengaksesan). 

Kata kunci super dipakai untuk merujuk pada member dari parent class,  sebagaimana kata kunci this yang dipakai untuk merujuk pada member dari class itu sendiri. 
Ada beberapa hal yang harus diingat ketika menggunakan pemanggil  constuktor super: 

1. Pemanggil super() <b>HARUS DIJADIKAN PERNYATAAN PERTAMA  DALAM</b> constructor. 
2. Pemanggil super() hanya dapat digunakan dalam definisi constructor. 
3. Termasuk constructor this() dan pemanggil super() <b>TIDAK BOLEH  TERJADI DALAM</b> constructor <b>YANG SAMA.</b>

<br>Contoh :
```java
public class Siswa { 
    private int nilai; 
    public setNilai(int nilai) { 
        this.nilai=nilai; 
    } 
}
```

<hr>

## B. Percobaan
1. Menggunakan kata kunci super
2. Mendefinisikan Superclass dan Subclass
3. Kontrol pengaksesan
4. Konstruktor tidak diwariskan

<br>Semua file program percobaan di atas dapat dibuka disini
[Source Code](https://github.com/awaqo/20104016_Aqil-Jawadal-Furqon_SE04A_Pemrograman2/tree/modul6/src/modul6/percobaan)

<hr>

## C. Kesimpulan
Pada praktikum modul 6 ini, materi yang saya dapat dan saya pahami yaitu mengenai Konsep Inheritanee di Java. Pada modul ini materi yang dibahas yaitu mengenai konsep inheritance, sebuah class dapat mempunyai class  turunan. Suatu class yang mempunyai class turunan dinamakan parent class atau base class. Sedangkan class turunan itu sendiri seringkali disebut  subclass atau child class.
