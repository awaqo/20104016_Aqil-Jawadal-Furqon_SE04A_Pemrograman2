package modul5.percobaan.sekolah;

import modul5.percobaan.Mahasiswa;

public class Kelas {
    private int kodekelas;
    private String namakelas;
    private Mahasiswa mahassiwa;

    public Kelas(int kode, String nama) {
        this.kodekelas = kode;
        this.namakelas = nama;
    }

    public void setMhs(Mahasiswa mhs) {
        this.mahassiwa = mhs;
    }
}
