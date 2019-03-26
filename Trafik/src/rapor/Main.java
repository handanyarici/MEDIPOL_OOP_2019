package rapor;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		TrafikPolisi trafikPolisi = new TrafikPolisi("Dervis");
		///////////////////////////////////////
		Suclu suclu = new Suclu();
		suclu.setId(100);
		suclu.setIsim("Kemal");
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
		raporHazirla(ceza1.getCezaMiktari(), ceza1.getTanim(), trafikPolisi.getIsim(), trafikRaporu.getRaporTarihi(),suclu.getIsim());
	}

	private static void raporHazirla(double cezaMiktari, String cezaTanimi, String polisAdi, Date raporTarihi, String sucluAdi) {
		RaporBilgileri kemalinRaporu = new RaporBilgileri();
		kemalinRaporu.setCezaMiktari(cezaMiktari);
		kemalinRaporu.setCezaTanimi(cezaTanimi);
		kemalinRaporu.setPolisAdi(polisAdi);
		kemalinRaporu.setRaporTarihi(raporTarihi);
		kemalinRaporu.setSucluAdi(sucluAdi);
		System.out.println(kemalinRaporu.toString());
	}

}
