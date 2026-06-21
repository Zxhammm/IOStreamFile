/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagian2.arraylist;

import java.util.ArrayList;

public class Latihan4 {
    public static void main(String[] args) {
    ArrayList<String> buah = new ArrayList<>();
    buah.add("Apel");
    buah.add("Mangga");
    buah.add("Jeruk");
    System.out.println("Awal : " + buah);
    
    buah.add(1, "Pisang"); // sisip di indeks 1
    System.out.println("Sisip : " + buah);

    buah.set(0, "Anggur"); // ganti indeks 0
    System.out.println("Ganti : " + buah);

    buah.remove("Jeruk"); // hapus berdasarkan nilai
    System.out.println("Hapus : " + buah);

    System.out.println("Ada Apel?: " + buah.contains("Apel"));
    System.out.println("Jumlah : " + buah.size());
   }
}
