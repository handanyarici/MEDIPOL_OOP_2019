package sorgu;

import java.io.File;
import java.util.Scanner;

import rapor.Suclu;
import util.FileUtil;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("tc kimlik no giriniz");
		String tckimlik = s.nextLine();
		String vatandaslar = FileUtil.readFile(new File("vatandas.txt"));
		System.out.println(vatandaslar);
		String[] vList = vatandaslar.split("\n");
		for(String satir:vList){
			String[] degerler = satir.split(";");
			if(degerler.length >= 2){
				//bu bir suclu
				Vatandas suclu = new Suclu(degerler[0]);
			}else{
				//sucsuz vatandas
				System.out.println("Borcunuz bulunmamaktadir");
			}
		}
		String cezalar = FileUtil.readFile(new File("cezalar.txt"));
		System.out.println("------------------------------------------");
		System.out.println(cezalar);
	}

}
