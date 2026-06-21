/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagian2.arraylist;

import java.util.ArrayList;

public class Latihan3 {
    public static void main(String[] args) {
    // Membuat ArrayList kosong yang menampung String
    ArrayList<String> mahasiswa = new ArrayList<>();
    
    // add() menambah elemen di akhir
    mahasiswa.add("Andi");
    mahasiswa.add("Budi");
    mahasiswa.add("Citra");
    
    System.out.println("Isi list : " + mahasiswa);
    System.out.println("Jumlah : " + mahasiswa.size());
    System.out.println("Index 1 : " + mahasiswa.get(1));
   }
}