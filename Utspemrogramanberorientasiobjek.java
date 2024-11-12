/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utspemrogramanberorientasiobjek;

/**
 *
 * @author erinda aurelia
 */
class buku{ //class
    String judul;
    String pengarang;
    String penerbit;
}
public class Utspemrogramanberorientasiobjek { 
    public static void main(String[] args) {   // metode
        buku bukuku = new buku(); //instansiasi
        bukuku.judul = "laskar_pelangi";
        bukuku.pengarang = "andrea_hirata";
        bukuku.penerbit = "bintang_pustaka";
        
        System.out.println ("judul"+bukuku.judul);
        System.out.println ("pengarang"+bukuku.pengarang);
        System.out.println ("penerbit"+bukuku.penerbit);
        
    }
    
}
