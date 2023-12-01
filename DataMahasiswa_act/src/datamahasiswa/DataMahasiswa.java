package datamahasiswa;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class DataMahasiswa {
    public static void main(String[] args) {
        List<MahasiswaBaru> daftar = new ArrayList<>();
        Scanner masuk = new Scanner(System.in);
        
        while(true){
            System.out.println("Apakah ingin Menambahkan Data : (Y / N");
            String jawab = masuk.nextLine();
            
            if (!jawab.equalsIgnoreCase("y")) break;
            
            System.out.print("Kode : ");
            String nama = masuk.nextLine();
            System.out.print("Nama : ");
            String nim = masuk.nextLine();
            System.out.print("Harga : ");
            int harga = masuk.nextInt();
            
            masuk.nextLine();
            MahasiswaBaru mahasiswa = new MahasiswaBaru(nama, nim, harga);
            daftar.add(mahasiswa);
        }
        System.out.println("Daftar Mahasiswa : ");
        System.out.println("===============");
        for(MahasiswaBaru mahasiswa : daftar){
            System.out.println(mahasiswa);
            System.out.println("===============");
        }
    }
}
