package rapor;

import java.io.File;
import java.util.Date;

import util.FileUtil;

public class Main {

	public static void main(String[] args) {
		TrafikPolisi trafikPolisi = new TrafikPolisi("Dervis");
		///////////////////////////////////////
		Suclu suclu = new Suclu("143423423423","Kemal");
		suclu.setId(100);
		//////////////////////////
		Ceza ceza1 = new Ceza();
		ceza1.setId(1);
		ceza1.setTanim("Radar cezasi");
		ceza1.setCezaMiktari(240);
		///////////////////////////

		TrafikRaporu trafikRaporu = new TrafikRaporu();
		trafikRaporu.setCezalar(new Ceza[] { ceza1 });
		trafikRaporu.setId(1);
		trafikRaporu.setSuclu(suclu);
		trafikRaporu.setRaporTarihi(new Date());
		trafikRaporu.setTanim("Radar Raporlari");
		String rapor = raporHazirla(ceza1.getCezaMiktari(), ceza1.getTanim(), trafikPolisi.getIsim(), trafikRaporu.getRaporTarihi(),suclu.getIsim());
		File file = new File("C:\\Users\\TCHYARICI\\Desktop\\rapor.txt");
		FileUtil.writeFile(rapor, file);
		String dosyaIcerigi = FileUtil.readFile(file);
		System.out.println(dosyaIcerigi);
	}

	private static String raporHazirla(double cezaMiktari, String cezaTanimi, String polisAdi, Date raporTarihi, String sucluAdi) {
		RaporBilgileri kemalinRaporu = new RaporBilgileri();
		kemalinRaporu.setCezaMiktari(cezaMiktari);
		kemalinRaporu.setCezaTanimi(cezaTanimi);
		kemalinRaporu.setPolisAdi(polisAdi);
		kemalinRaporu.setRaporTarihi(raporTarihi);
		kemalinRaporu.setSucluAdi(sucluAdi);
		//System.out.println(kemalinRaporu.toString());
		return kemalinRaporu.toString();
	}

}
