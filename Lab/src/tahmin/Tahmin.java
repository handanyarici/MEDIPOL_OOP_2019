package tahmin;

import java.util.Scanner;

public class Tahmin {

	public static void main(String[] args) {
		int sayi = (int) (Math.random() * 101);
		int tahmin = 0;
		while (true) {
			System.out.println("Tahmin giriniz");
			Scanner scanner = new Scanner(System.in);
			tahmin = scanner.nextInt();
			if (tahmin == sayi) {
				System.out.println("Dogru tahmin");
				break;
			} else if (tahmin > sayi) {
				System.out.println("tahminizi azaltin");
			} else {
				System.out.println("tahmininizi arttirin");
			}
		}

	}

}
