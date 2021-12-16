# Modul 8 : Polimorphism


<hr>


## A. Dasar Teori
Polymorphism dalam bahasa inggir merupakan sebuah prinsip dalam biologi di mana organisme atau spesies memiliki banyak bentuk atau tahapan. Sehingga dapat diartikan dalam pemrograman java, polimorfisme adalah sebuah prinsip di mana class memiliki banyak bentuk method yang berbeda-beda meskipun nama method nya sama. <br>Cara pemanggilan:
```java
//<nama class> <variable bebas> = new <kontruktor>();
Employee employee=new Manager();
```

Virtual Method Invocation (VMI) terjadi ketika polimorfisme dan overriding dilakukan. Ketika objek yang telah dibuat memanggil overridding method pada parrent class nya, compiler akan melakukan pemanggilan terhadap overriding method yang terdapat pada subclass, yang seharusnya dipanggil overriding method. <br>Contoh terjadi VMI:
```java
class Parent {
  int x = 5;
  public void Info() {
    System.out.println(“Ini class Parent”);
  }
}
class Child extends Parent {
  int x = 10;
  public void Info() {
    System.out.println(“Ini class Child”);
  }
}
public class Tes {
  public static void main(String args[]) {
    Parent tes = new Child();
    System.out.println(“Nilai x = “+tes.x);
    tes.Info();
  }
}

// Hasil running
// Nilai x = 5
// Ini class Child
```

Polimorphic arguments merupakan tipe paramater yang dapat menerima nilai bertipe dari subclass-nya. <br>Contoh:
```java
class Pegawai {
  …}
class Manajer extends Pegawai {
  …}
public class Tes {
  public static void Proses(Pegawai peg) {
    …}
  public static void main(String args[]) {
    Manajer man = new
    Manajer();
    Proses(man);
  } 
```

Instaneceof sangat berguna dalam mengetahui tipe asal dari suatu polymotphic arguments. Misalnya dari contoh polimorphic arguments, kita modifikasi pada class Tes dan ditambah sebuah class baru Kurir:
```java
…
class Kurir extends Pegawai {
  …}
public class Tes {
  public static void Proses(Pegawai peg) {
    if (peg instanceof Manajer) {
      …
      lakukan tugas - tugas manajer…
    } else if (peg instanceof Kurir) {
      …
      lakukan tugas - tugas kurir…
    } else {
      …
      lakukan tugas - tugas lainnya…
    }
  }
  public static void main(String args[]) {
    Manajer man =
      new
    Manajer();
    Kurir kur = new Kurir();
    Proses(man);
    Proses(kur);
  }
}
```

Pemakaian instanceof sering diikuti dengan casting object dari tipe paramater ke tipe asal. Misalnya program sebelumnya pada saat setelah melakukan instanceof dari tipe Manajer, kita melakukan casting objek ke tipe asalnya, yaitu Manajer. <br>Caranya sebagai berikut:
```java
…
if (peg instanceof Manajer) {
  Manajer man = (Manajer) peg;…
  lakukan tugas - tugas manajer…
}
```


<hr>

## B. Percobaan
Membuat 3 class : <br>
1. Pegawai
2. Gaji
3. VirtualDemo

<br>Semua file program percobaan di atas dapat dibuka disini<br>
[Source Code](https://github.com/awaqo/20104016_Aqil-Jawadal-Furqon_SE04A_Pemrograman2/tree/modul7/src/modul8/percobaan)

<br>
### Analisa
Ketika program dieksekusi, program akan menjalankan Gaji dengan paramater yang telah ditentukan yaitu sebanyak 2 kali dengan langkah-langkah berikut:

- Program memanggil class Gaji method Gaji dimana didalam method Gaji memanggil:
  - super(name, address, number) Pada method Gaji, program memanggil super(name, address, number) yang berarti program memanggil Class parent yaitu Pegawai method Pegawai dengan paramater yang telah ditentukan.
  - setSalary(salary) Lalu program memanggil setSalary dimana method ini berada pada class Gaji.
- Program melakukan output "Memanggil mailCheck Berdasarkan Referensi Gaji --"
- Program memanggil s.mailCheck() yang berarti program memanggil method mailCheck() yang berada di dalam class Gaji.
- Program melakukan output "\nMemanggil mailCheck Berdasarkan Referensi Pegawai--"
- Program memanggil s.mailCheck() yang berarti program memanggil method mailCheck() yang berada di dalam class Gaji.

<hr>

## C. Kesimpulan
Pada praktikum modul 8 ini, materi yang saya dapat dan saya pahami yaitu mengenai Polymorfisme yaitu kemampuan untuk mempunyai
beberapa bentuk class yang berbeda. Polimorfisme ini terjadi pada saat suatu
obyek bertipe parent class, akan tetapi pemanggilan constructornya melalui
subclass.
