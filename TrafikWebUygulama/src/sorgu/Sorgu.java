package sorgu;

import java.io.File;

import rapor.Ceza;
import rapor.Suclu;
import util.FileUtil;

public class Sorgu {
	public static double borcSorgula(String tcKimlik) throws Exception{
		String vatandaslar = FileUtil.readFile(new File("C:\\Users\\TCHYARICI\\eclipse-workspace\\TrafikWebUygulama\\vatandas.txt"));
		String[] vList = vatandaslar.split("\n");
		String cezaDosyasi = FileUtil.readFile(new File("C:\\Users\\TCHYARICI\\eclipse-workspace\\TrafikWebUygulama\\cezalar.txt"));
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
			if(degerler[0].equals(tcKimlik)){
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
					return toplamborc;
				}else{
					//sucsuz vatandas
					System.out.println("Borcunuz bulunmamaktadir");
					return 0;
				}
			}
		}
		if(!flag){
			System.out.println("Aradiginiz kisi bulunamadi");
			throw new Exception("Aradiginiz kisi bulunamadi");
		}
		return 0;
	}

}
