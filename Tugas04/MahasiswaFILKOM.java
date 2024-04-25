package Tugas04;


    public class MahasiswaFILKOM extends Manusia {
        private String nim;
        private double ipk;
    
        // Membuat Constructor
        public MahasiswaFILKOM(String nim, double ipk, String nama, String nik, boolean jenisKelamin, boolean menikah) {
            super(nama, jenisKelamin, nik, menikah);
            this.nim = nim;
            this.ipk = ipk;
        }
    
        // Getter and Setter methods
        public String getNim() {
            return nim;
        }
        public void setNim(String nim) {
            this.nim = nim;
        }
        public double getIpk() {
            return ipk;
        }
        public void setIpk(double ipk) {
            this.ipk = ipk;
        }
        public String getStatus(){
            String angkatan = nim.substring(0, 2);
            String prodi = nim.substring(6, 7);
            if(prodi == "2"){
                return "Teknik Informatika, " + "20" + angkatan;
            }
            else if(prodi.equals("3")){
                return "Teknik Komputer, " + "20" + angkatan;
            }
            else if(prodi.equals("4")){
                return "Sistem Informasi, " + "20" + angkatan;
            }
            else if(prodi.equals("6")){
                return "Pendidikan Teknologi Informasi, " + "20" + angkatan;
            }
            else {
                return "Teknologi Informasi, " + "20" + angkatan;
            }
        }
    
    
        // Method untuk mendapat beasiswa
        public double getBeasiswa() {
            if (ipk >= 3.0 && ipk <= 3.5) {
                return 50;
            } else if (ipk > 3.5 && ipk <= 4.0) {
                return 75;
            } else {
                return 0;
            }
        }
        public double getPendapatan(){
            return super.getPendapatan() + getBeasiswa();
        }
        public String toString(){
            return String.format("Nama          : %s\nNIK           : %s\nJenis Kelamin : %s\nPendapatan    : $%.1f\nNIM           : %s\nIPK           : %.2f\nStatus        : %s\n", getNama(), getNik(), getJenisKelamin(), getPendapatan(), getNim(), getIpk(), getStatus());
        }
    }