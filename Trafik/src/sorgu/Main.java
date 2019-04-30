package sorgu;

import java.io.File;
import java.util.Scanner;

import rapor.Ceza;
import rapor.Suclu;
import util.FileUtil;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("tc kimlik no giriniz");
		String tcKimlik = s.nextLine();
		try {
			double borc= Sorgu.borcSorgula(tcKimlik);
			System.out.println("Toplam borcunuz: " + borc);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
