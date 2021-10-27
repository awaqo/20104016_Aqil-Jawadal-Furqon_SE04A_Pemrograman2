package modul3.latihan;

public class Tabungan {
    int saldo;

    Tabungan(int initSaldo){
        this.saldo = initSaldo;
    }

    public int getSaldo(){
        return this.saldo;
    }

    public void simpanUang(int jumlah){
        this.saldo = this.saldo + jumlah;
    }

    public boolean ambilUang(int saldo){
        if (saldo < this.saldo){
            this.saldo = this.saldo - saldo;
            return true;
        }
        else {
            return false;
        }
    }
}
