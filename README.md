# Modul 3 : Dasar Pemrograman Berorientasi Objek

## A. Dasar Teori
#### 1. Information Hiding 

yaitu menyembunyikan atribut dan method suatu objek dari objek lain. Informasi dari suatu class disembunyikan agar anggota - anggota tersebut tidak dapat diakses dari luar. Cara melakukannya cukup dengan memberikan akses control private ketika mendeklarasikan suatu atribut atau method. Contoh :
```java
private int nilai;
```

#### 2. Encapsulation

merupakan suatu cara untuk menyembunyikan implementasi detail dari suatu class. Enkapsulasi memiliki 2 hal mendasar, yaitu :

a) Information hiding

b) Menyediakan suatu perantara (method) untuk pengaksesan data.

Contoh
```java
public class Siswa {  
    private int nilai;
    public void setNilai(int n) {
        nilai = n;
    }
}
```


#### 3. Constructor

adalah suatu method yang pertama kali
dijalankan pada saat pembuatan suatu obyek. Konstruktor ini merupakan
method yang berfungsi untuk menginisialisasi variabel-variabel instans yang
akan di miliki oleh objek. Konstruktor dipanggil pada saat proses instansiasi
kelas menjadi objek. Beberapa karakteristik yang dimiliki oleh constructor :

a) Method constructor harus memiliki nama yang sama dengan nama
class.

b) Tidak mengembalikan suatu nilai (tidak ada keyword return).

c) Satu class memiliki lebih dari satu constructor (overloading
constructor).

d) Dapat ditambah access modifier public, private, protected maupun
default.

e) Suatu constructor bisa dipanggil oleh constructor lain dalam satu class.

Struktur dari konstruktor yaitu :

```java
Class nama_class {
    nama_class() {
      [isi constructor]
    }
    [isi class]
} 
```
Contoh : 
```java
public class Siswa {
    private int nilai;
    private String nama;
    public Siswa(int n, String m){
        nilai = n;
        nama = m;
    }
}
```

#### 4. Overloading Constructor

merupakan suatu class yang mempunyai
lebih dari 1 constructor dengan syarat daftar parameternya tidak boleh ada
yang sama. 
Contoh : 
```java
private int nilai;
public Siswa() {
    nilai=0;
}
public Siswa(int n) {
    nilai=n;}
}
```
Constructor tidak dapat dipanggil secara langsung, namun harus dipanggil
dengan menggunakan operator new pada pembentukan sebuah class. 


<hr>

## B. Latihan
Membuat class StudentRecord & StudentRecordExample, run lalu analisis, tentukan konsep yang dipakai, dan mengapa hasil run seperti yang ada di modul

Jawaban : 
[Source Code 1](https://github.com/awaqo/20104016_Aqil-Jawadal-Furqon_SE04A_Pemrograman2/blob/modul4/src/modul4/latihan/StudentRecord.java)
[Source Code 2](https://github.com/awaqo/20104016_Aqil-Jawadal-Furqon_SE04A_Pemrograman2/blob/modul4/src/modul4/latihan/StudentRecordExample.java)

Analisis :

Konsep yang dipakai pada program latihan ini yaitu menggunakan encapsulation pada atribut name yang ditandai dengan penggunaan
```java
private String name;
```
pada pendefinisiannya. Lalu pengaksesan atribut private dengan menggunakan
```java
public String getName(){
        return name;
    }
```
dan agar kita dapat menambahkan data ke dalam atribut private tersebut maka kita harus menggunakan syntax berikut
```java
public void setName(String temp){
        name = temp;
    }
```

Output dari program ini yaitu
```java
Wahyu
Hitung = 0
```
Mengapa hasil akhirnya seperti di atas?

Hal ini dikarenakan pada program StudentRecordExample, terdapat syntax pendefinisian objek baru dan pemanggilannya
```java
  StudentRecord wahyu = new StudentRecord();
  StudentRecord ini = new StudentRecord();
  StudentRecord nama = new StudentRecord();

  wahyu.setName("Wahyu");
  ini.setName("Ini");
  nama.setName("Nama");
  System.out.println( wahyu.getName() );
  System.out.println("Hitung = " + StudentRecord.getStudentCount());
```
Pada code di atas, objek yang dipanggil yaitu wahyu.getName() maka dari itu outputnya akan menampilkan ouput nama "Wahyu".

Lalu mengapa output baris kedua "Hitung = 0", dikarenakan pada program tidak menginputkan nilai pada mathGrade, scienceGrade, englishGrade.

<hr>

## C. Kesimpulan
Pada praktikum modul 4 ini, materi yang saya dapat dan saya pahami yaitu mengenai dasar pada PBO. Pada modul ini materi yang dibahas yaitu mengenai Encapsulation, setelah menyelesaikan modul ini saya dapat mengetahui, memahami dan mengimplementasikan encapsulation pada program java yang menggunakan PBO.

