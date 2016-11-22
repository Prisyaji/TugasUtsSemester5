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
