package test;

import java.util.Scanner;

public class DiziAlgoritma {

	public static void main(String[] args) {
		int[] input = new int[5];
		Scanner scanner = new Scanner(System.in);
		for(int i = 0 ;i<5;i++){
			System.out.println("deger giriniz");
			input[i] = scanner.nextInt();
		}
		System.out.println("Ortalama= " + ortalamaHesapla(input));
		System.out.println("Arama yapmak istediginiz degeri girin");
		int deger = scanner.nextInt();
		if(aramaYap(input, deger) == true){
			System.out.println("deger bulundu");
		}else{
			System.out.println("bulunamadi");
		}
		System.out.println("Polindrome icin kelime giriniz");
		String str = scanner.nextLine();
		System.out.println(polindrome(str));
	}

	public static double ortalamaHesapla(int[] dizi){
		int toplam = 0;
		for(int i = 0; i<dizi.length; i++){
			toplam += dizi[i];
		}
		return toplam/dizi.length;
	}

	public static boolean aramaYap(int[] dizi, int input){
		for(int i = 0; i<dizi.length; i++){
			if(input == dizi[i]){
				return true;
			}
		}
		return false;
	}

	public static boolean polindrome(String str){
		char [] p = str.toCharArray();
		int count = p.length -1;
		for(int i = 0; i<p.length/2; i++){
			char start = p[i];
			char end = p[count];
			if(start != end){
				return false;
			}
			count --;
		}
		return true;
	}

}
