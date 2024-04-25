package Tugas04;

    public class Manusia {
        private String nama;
        private boolean jenisKelamin; // true: laki-laki, false: perempuan
        private String nik;
        private boolean menikah;
    
        // Membuat Construktor
        public Manusia(String nama, boolean jenisKelamin, String nik, boolean menikah) {
            this.nama = nama;
            this.jenisKelamin = jenisKelamin;
            this.nik = nik;
            this.menikah = menikah;
        }
    
        // Getter and Setter 
        public String getNama() {
            return nama;
        }
        public void setNama(String nama) {
            this.nama = nama;
        }
        public boolean isJenisKelamin() {
            return jenisKelamin;
        }
        public String getJenisKelamin(){
            if (jenisKelamin) {
                return "Laki-laki";
            }
            else {
                return "Perempuan";
            }
        }
        public void setJenisKelamin(boolean jenisKelamin) {
            this.jenisKelamin = jenisKelamin;
        } 
        public String getNik() {
            return nik;
        }  
        public void setNik(String nik) {
            this.nik = nik;
        } 
        public boolean isMenikah() {
            return menikah;
        }   
        public void setMenikah(boolean menikah) {
            this.menikah = menikah;
        }
    
        public double getTunjangan() {
            if (menikah == true && jenisKelamin == false) {
                return 20;
            }
            else if(menikah == true && jenisKelamin == true) {
                return 25;
            }
            else {
                return 15;
            }
        }
        public double getPendapatan() {
            return getTunjangan();
        }
        public String toString(){
            return String.format("Nama          : %s\nNIK           : %s\nJenis Kelamin : %s\nPendapatan    : $%.1f\n", getNama(), getNik(), getJenisKelamin(), getPendapatan());
        }
    }