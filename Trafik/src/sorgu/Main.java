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
		String tckimlik = s.nextLine();
		String vatandaslar = FileUtil.readFile(new File("vatandas.txt"));
		String[] vList = vatandaslar.split("\n");
		String cezaDosyasi = FileUtil.readFile(new File("cezalar.txt"));
		String[] vCezalar = cezaDosyasi.split("\n");
		Ceza[] cezalar = new Ceza[vCezalar.length];
		for(int i = 0; i< vCezalar.length;i++){
			String[] alanlar = vCezalar[i].split(";");
			Ceza ceza = new Ceza();
			ceza.setId(Long.parseLong(alanlar[0]));
			ceza.setCezaMiktari(Double.parseDouble(alanlar[2]));
			ceza.setTanim(alanlar[1]);
			cezalar[i]=ceza;
		}
		boolean flag = false;
		for(String satir:vList){
			String[] degerler = satir.split(";");
			if(degerler[0].equals(tckimlik)){
				flag=true;
				if(degerler.length >= 2){
					//bu bir suclu
					Vatandas suclu = new Suclu(degerler[0]);
					double toplamborc=0;
					String[] kisiCezalari = degerler[1].split(",");
					for(String cezaId:kisiCezalari){
						for(Ceza ceza:cezalar){
							if(ceza.getId() == Long.parseLong(cezaId)){
								toplamborc += ceza.getCezaMiktari();
							}
						}
					}
					System.out.println("Toplam borcunuz:" + toplamborc);
				}else{
					//sucsuz vatandas
					System.out.println("Borcunuz bulunmamaktadir");
				}
			}
		}
		if(!flag){
			System.out.println("Aradiginiz kisi bulunamadi");
		}
	}

}
