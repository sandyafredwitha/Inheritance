package Tugas04;
import java.time.LocalDate;
public class MainProgram {
 
    public static void main(String[] args) {
        
        System.out.println("=============\n" + "Kelas Manusia" + "\n=============");
        Manusia manusia1 = new Manusia("Zahra", true, "123456789", true);
        System.out.println(manusia1);
        Manusia manusia2 = new Manusia("Stephanie", false, "987654321", true);
        System.out.println(manusia2);
        Manusia manusia3 = new Manusia("Kayla", true, "456789123", false);
        System.out.println(manusia3);

        System.out.println("=====================\n" + "Kelas MahasiswaFILKOM" + "\n=====================");
        MahasiswaFILKOM mahasiswa1 = new MahasiswaFILKOM("235150401111042", 3.8, "Ego", "1651501000", true, false);
        System.out.println(mahasiswa1);
        MahasiswaFILKOM mahasiswa2 = new MahasiswaFILKOM("235150401111041", 3.9, "Sandya", "1651502000", false, false);
        System.out.println(mahasiswa2);
        MahasiswaFILKOM mahasiswa3 = new MahasiswaFILKOM("235150401111040", 3.8, "Dandi", "1651503000", true, false);
        System.out.println(mahasiswa3);

        System.out.println("=============\n" + "Kelas Pekerja" + "\n=============");
        Pekerja pekerja1 = new Pekerja("Caca", true, "111111111", true, 5000, LocalDate.of(2022, 1, 1), 2);
        System.out.println(pekerja1);
        Pekerja pekerja2 = new Pekerja("Yano", false, "222222222", true, 7000, LocalDate.of(2015, 1, 1), 0);
        System.out.println(pekerja2);
        Pekerja pekerja3 = new Pekerja("Henry", false, "333333333", true, 9000, LocalDate.of(2004, 1, 1), 10);
        System.out.println(pekerja3);
        
        System.out.println("=============\n" + "Kelas Manager" + "\n=============");
        Manager manager = new Manager("Kevin", true, "444444444", true, 7500, LocalDate.of(2009, 1, 1), 0, "IT");
        System.out.println(manager);


    }
}
