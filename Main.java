package Tugas5;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Contoh Student
        System.out.println("Masukkan Nama Mahasiswa : ");
        String mahasiswaNama = scanner.nextLine();
        System.out.println("Masukkan Alamat Mahasiswa : ");
        String mahasiswaAlamat = scanner.nextLine();
        System.out.println("Masukkan Mata Kuliah yang Diambil : ");
        String mahasiswaMataKuliah = scanner.nextLine();
        System.out.println("Masukkan Nilai Mata Kuliah : ");
        int mahasiswaNilai = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Masukkan Nama Dosen Pengampu : ");
        String dosenNama = scanner.nextLine();
        
        //Output Student
        System.out.println("----------Mahasiswa----------");
        System.out.println("Nama : " + mahasiswaNama);
        System.out.println("Alamat : " + mahasiswaAlamat);
        System.out.println("Mata Kuliah : " + mahasiswaMataKuliah);
        System.out.println("Nilai : " + mahasiswaNilai);
        System.out.println("Dosen Pengampu : " + dosenNama);
        
        System.out.println("------------------------------------");

        //Contoh Teacher
        System.out.println("Masukkan Nama Dosen : ");
        String dosenNamaDosen = scanner.nextLine();
        System.out.println("Masukkan Alamat Dosen : ");
        String dosenAlamatDosen = scanner.nextLine();
        System.out.println("Masukkan Mata Kuliah yang Diampu : ");
        String dosenMataKuliah = scanner.nextLine();
        
        //Menambhakan Course baru
        System.out.println("Masukan Course baru : ");
        String courseBaru = scanner.nextLine();

        //Output Teacher
        System.out.println("-------------Dosen-------------");
        System.out.println("Nama : " + dosenNamaDosen);
        System.out.println("Mata Kuliah yang Diampu : " + dosenMataKuliah);
        System.out.println("Alamat : " + dosenAlamatDosen);
        System.out.println("Course Baru : " + courseBaru);

        scanner.close();
    }
}