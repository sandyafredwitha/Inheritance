package Tugas04;
import java.time.LocalDate;

public class Manager extends Pekerja {
    private String departemen;

    public Manager(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate  tahunMasuk , int jumlahAnak, String departemen) {
        super(nama, jenisKelamin, nik, menikah, gaji, tahunMasuk, jumlahAnak);
        this.departemen = departemen;
    }
    public double getPendapatan(){
        return super.getPendapatan() + (super.getGaji() * 0.1);
    }
    public String toString(){
        return String.format("Nama          : %s\nNIK           : %s\nJenis Kelamin : %s\nPendapatan    : $%.1f\nTahun Masuk   : %s\nJumlah Anak   : %d\nGaji          : $%.1f\nDepartemen    : %s\n", getNama(), getNik(), (isJenisKelamin() ? "Laki-laki" : "Perempuan"), getPendapatan(), getTahunMasuk(), getJumlahAnak(), getGaji(), getDepartemen());
    }
    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }
    public String getDepartemen() {
        return departemen;
    }


}

