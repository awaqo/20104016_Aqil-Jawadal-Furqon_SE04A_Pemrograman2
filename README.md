# Modul 7 : Overloading dan Overriding


<hr>


## A. Dasar Teori
1. Overloading
<br>Overloading adalah suatu keadaan dimana ada beberapa method dengan nama yang sama pada suatu class tetapi dengan parameter yang  berbeda (mempunyai implementasi dan return value). Tujuan dibuatnya overloading yaitu memudahkan pengguna method dengan fungsi yang hampir sama. <br>Contoh : 
```java
public void print( String temp ){  
    System.out.println("Name:" + name);  
    System.out.println("Address:" + address); System.out.println("Age:" + age); 
} 

public void print(double eGrade, double mGrade, double sGrade){
    System.out.println("Name:" + name);  
    System.out.println("Math Grade:" + mGrade);  
    System.out.println("English Grade:" + eGrade);  
    System.out.println("Science Grade:" + sGrade); 
}
```
Overloading ini dapat terjadi pada class yang sama atau pada suatu  parent class dan subclass-nya. Overloading mempunyai ciri-ciri sebagai berikut :
- Nama Method harus sama
- Daftar parameter harus berbeda
- Return type boleh sama,juga boleh berbeda
<br><br>

2. Overriding
DOverriding tidak sama dengan overloading, Overriding merupakan  mekanisme dimana sebuah metode dapat dideklarasikan ulang pada kelas  turunannya. Overriding mempunyai ciri-ciri sebagai berikut :
- Nama Method harus sama 
- Daftar parameter harus sama  
- Return type harus sama 
Berikut ini contoh terjadinya overriding dimana method RupiahVsDolar() pada class Sekarang meg-override method  RupiahVsDolar() pada class Dulu. 
```java
class Dulu { 
    public String RupiahVsDolar() {  
        System.out.println(“Rp 10.000”); 
    } 
} 

class Sekarang extends Dulu { 
    public String RupiahVsDolar() { 
        System.out.println(“Rp 14.000”); 
    } 
}
```
<br>Method yang terkena override (overiden method) diharuskan tidak  boleh mempunyai modifier yang lebih luas aksesnya dari method yang meng overide (overriding method).

<hr>

## B. Percobaan
1. Melakukan Overloading pada method
- Class Overload
```java
package modul7.percobaan;

public class Overload {
    void myOverload(A a) {
        System.out.println("Overload.myOverload(A a)");
    }

    void myOverload(B b) {
        System.out.println("Overload.myOverload(B b)");
    }

    public static void main(String[] args) {
        Overload o = new Overload();
        C c = new C();

        o.myOverload(c);
    }
}
```

- Class Overload1
```java
package modul7.percobaan;

public class Overload1 {
    void myMethod(short s) {
        System.out.println("short");
    }

    void myMethod(int i) {
        System.out.println("int");
    }

    void myMethod(long l) {
        System.out.println("long");
    }

    public static void main(String[] args) {
        Overload1 o = new Overload1();
        byte b = 1;

        o.myMethod(b);
    }
}
```

<br><br>
2. Melakukan Overriding
- Class Burung
```java
package modul7.percobaan;

public class Burung {
    public void terbang() {
        System.out.println("Aku terbang!");
    }
}
```

- Class Penguin
```java
package modul7.percobaan;

public class Penguin extends Burung {
    @Override
    public void terbang(){
        System.out.println("Aku tidak bisa terbang!");
    }
}
```

- Class Overriding
```java
package modul7.percobaan;

public class Overriding {
    public static void main(String[] args) {
        Burung burung = new Burung();
        Penguin penguin = new Penguin();

        burung.terbang();
        penguin.terbang();
    }
}
```

<br>Semua file program percobaan di atas dapat dibuka disini<br>
[Source Code](https://github.com/awaqo/20104016_Aqil-Jawadal-Furqon_SE04A_Pemrograman2/tree/modul7/src/modul7/percobaan)

<hr>

## C. Kesimpulan
Pada praktikum modul 7 ini, materi yang saya dapat dan saya pahami yaitu mengenai Overloading dan Overriding yang mana perbedaan diantara keduanya yaitu :
- pada Overloading, nama method yang dibuat sama namun setiap methodnya harus memiliki parameter yang berbeda
- pada Overriding, yang membedakan yaitu tidak memiliki parameter, isi dari method bisa sama ataupun berbeda sesuai kebutuhan
