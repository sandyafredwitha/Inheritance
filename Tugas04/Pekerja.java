package Tugas04;
import java.time.LocalDate;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    // Membuat Constructor
    public Pekerja(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMasuk, int jumlahAnak) {
        super(nama, jenisKelamin, nik, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }
    // Getter and Setter 
    public double getGaji() {
        return gaji;
    }
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }
    public void setTahunMasuk(LocalDate tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }
    public int getJumlahAnak() {
        return jumlahAnak;
    }
    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public double getBonus(){
        int tahun = LocalDate.now().getYear() - tahunMasuk.getYear();
        if (tahun > 10){
            return 0.15 * gaji;
        }
        else if (tahun > 5 && tahun <= 10){
            return 0.10 * gaji;
        }
        else if (tahun >= 0 && tahun <= 5){
            return 0.05 * gaji ;
        }
        else {
            return 0;
        }
    }

    // Method untuk menghitung total gaji
    public double totalGaji() {
        double tunjanganAnak = 20.0 * jumlahAnak;
        return gaji + getBonus() + tunjanganAnak;
    }
    public double getPendapatan(){
        return super.getPendapatan() + getGaji() + getBonus() + (getJumlahAnak() * 20);
    }
    public String toString(){
        return String.format("Nama          : %s\nNIK           : %s\nJenis Kelamin : %s\nPendapatan    : $%.1f\nTahun Masuk   : %s\nJumlah Anak   : %d\nGaji          : $%.1f\n", getNama(), getNik(), (isJenisKelamin() ? "Laki-laki" : "Perempuan"), getPendapatan(), getTahunMasuk(), getJumlahAnak(), getGaji());
    } 
}
