package com.mu.app12141375;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author AJI
 */
public class Tebakan {
public static void main(String[] args) {
        ArrayList <String> player = new ArrayList<>(); // Membuat array untuk si Pemain
        ArrayList <Integer> score = new ArrayList<>(); // Membuat array score bagi si Pemain
        Scanner input = new Scanner(System.in); 
        Scanner input2= new Scanner(System.in); 
        Random angkaRandom=new Random(); // ini untuk mengacak angka
        String cariY; 
do{
            System.out.println("Masukkan 'Nama' anda atau tekan 'y' untuk keluar, kemudian tekan enter = ");
            System.out.println("");
            cariY=input.nextLine();
            System.out.println("");
            player.add(cariY);
            int x = 0; // implementasi Variabel untuk nilai 
            int Berakhir=0; // untuk mengecek apakah berakhir. bernilai 1 jika permainan berakhir
            
            int Level[]= new int[6]; 
            int OutputJalan=0; 
            // Ready For The Game
            if(!("y").equals(cariY)){  
               
                String Tingkatan; 
                int OutLevel=1;    
                System.out.println("Selamat Datang " + cariY); 
                do{