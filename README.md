# Modul 2 : Dasar Pemrograman Java

## A. Dasar Teori
#### 1. Keyword Dalam Java

Kata kunci adalah identifier yang telah dipesan untuk  didefinisikan sebelumnya oleh Java untuk tujuan tertentu. Anda tidak  dapat menggunakan keyword sebagai nama variabel, class, method.

#### 2. Tipe Dasar

Java mempunyai 8 tipe dasar, yaitu boolean, char, byte, short, int,  long, float, dan double.

#### 3. Variable

Variabel adalah item yang digunakan data untuk menyimpan  pernyataan objek. Variabel memiliki tipe data dan nama. Tipe data 
7 
menandakan tipe nilai yang dapat dibentuk oleh variabel itu sendiri.  Nama variabel harus mengikuti aturan untuk identifier. 
Berikut Aturan penamaan variable : 

a. Diawali dengan : huruf/abjad atau karakter mata uang atau  underscore ( _ ) 

b. Terdiri dari huruf/abjad, angka dan underscore 

c. Tidak boleh mengandung karakter khusus atau spasi  

d. Tidak boleh diawali dengan angka



#### 4. Casting dan Promotion

Casting diperlukan untuk mengkonversi dari suatu tipe ke tipe  data yang lebih kecil panjang bitnya. Sedangkan promotion terjadi pada  saat mengkonversi dari suatu tipe data ke tipe data yang lebih panjang  bitnya. 
Contoh :

```java
int p = (int) 10L
long i = 10;
```


<hr>

## B. Latihan

### Soal :
1. Menganalisa batasan maksimum dari suatu tipe
2. Anak Ayam
3. A + B - C

### Jawaban :

1. [Jawaban Soal 1](https://github.com/awaqo/20104016_Aqil-Jawadal-Furqon_SE04A_Pemrograman2/blob/modul2/src/modul2/latihan/BigInteger.java)
```java
long p = 2147483648;
```
Syntax diatas akan menampilkan error:

```java
D:\ittp\SEMESTER 3\PRAKTIKUM PEMROGRAMAN\repo\20104016_Aqil-Jawadal-Furqon_SE04A_Pemrograman2\src\modul2\latihan\BigInteger.java:5:18
java: integer number too large: 2147483648
```

Mengapa error itu bisa terjadi padahal daya tampung tipe data long adalah 2^63-1 ? Error tersebut terjadi karena java akan membaca syntax tersebut dengan tipe data integer bukan tipe data long. Jika kita ingin menggunakan tipe data long seperti syntax diatas maka kita harus menambah huruf(suffix) "L" dibelakang angka agar java dapat membaca tipe data yang kita maksud adalah tipe data long.

Contoh:
```java
long p = 2147483648L;
```

2. [Jawaban Soal 2](https://github.com/awaqo/20104016_Aqil-Jawadal-Furqon_SE04A_Pemrograman2/blob/modul2/src/modul2/latihan/AnakAyam.java)
3. [Jawaban Soal 3](https://github.com/awaqo/20104016_Aqil-Jawadal-Furqon_SE04A_Pemrograman2/blob/modul2/src/modul2/latihan/ABC.java)

<hr>

## C. Kesimpulan
Kesimpulan yang dapat saya ambil pada praktikum modul ke-2 ini yaitu saya dapat mengetahui :
- keyword dalam java (identifier) yang nantinya tidak dapat digunakan sebagai nama variable, class, dan method.

- Tipe dasar yang terdiri dari 8 tipe, yaitu boolean, char, byte, short, int, long, float, dan double.

- Variable yang merupakan item untuk menyimpan pernyataan objek. 

- Casting dan Promotion, yang mana casting untuk konversi suatu tipe ke tipe data lebih kecil dan promotion terjadi pada saat mengkonversi dari suatu tipe data ke tipe data yang lebih panjang bitnya.
