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
                int i, Ang, Call;
                    System.out.println("# Level " + OutLevel);
                    int HasilO=OutLevel-1;    
                    Call=OutLevel*100; // Menaikan Nilai dan Angka Random pada tiap level
                    System.out.println("Silahkan Tebak Antara 1 s/d " + Call);
                    System.out.println("Anda mempunyai kesempatan menebak 5 kali.");
                    int TestAcak=angkaRandom.nextInt(Call); 
                    
                    for(i=0;i<=5;i++){
                        if(i==5){ 
                            System.out.println("GAMEOVER! Anda Gagal");
                            Berakhir++; 
                        }
                        else{  
                            System.out.println("Tebakan Anda ? " );
                            int Coba=input2.nextInt(); 
                            int Kurang=4-i;
                            if(Coba==TestAcak){ 
                                if(i==0){
                                    OutputJalan=OutLevel*100; 
                                }
                                else if(i==1){
                                    OutputJalan=OutLevel*70; 
                                }
                                else if(i==2){
                                    OutputJalan=OutLevel*50; 
                                }
                                else if(i==3){
                                    OutputJalan=OutLevel*30; 
                                }
                                else{
                                    OutputJalan=0; 
                                }
                                // Informasi Tebakan
                                int Info=i+1;
                                
                                // Konfirmasi Tebakan Berhasil :)
                                System.out.println("Selamat Anda berhasil menebak Angka dalam " + Info + " kali tebakan. Sekor anda adalah " + OutputJalan);
                                break;

                