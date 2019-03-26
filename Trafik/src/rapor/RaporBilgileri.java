package rapor;

import java.util.Date;

public class RaporBilgileri {
	private String polisAdi;
	private String sucluAdi;
	private String cezaTanimi;
	private double cezaMiktari;
	private Date raporTarihi;
	public String getPolisAdi() {
		return polisAdi;
	}
	public void setPolisAdi(String polisAdi) {
		this.polisAdi = polisAdi;
	}
	public String getSucluAdi() {
		return sucluAdi;
	}
	public void setSucluAdi(String sucluAdi) {
		this.sucluAdi = sucluAdi;
	}
	public String getCezaTanimi() {
		return cezaTanimi;
	}
	public void setCezaTanimi(String cezaTanimi) {
		this.cezaTanimi = cezaTanimi;
	}
	public double getCezaMiktari() {
		return cezaMiktari;
	}
	public void setCezaMiktari(double cezaMiktari) {
		this.cezaMiktari = cezaMiktari;
	}
	public Date getRaporTarihi() {
		return raporTarihi;
	}
	public void setRaporTarihi(Date raporTarihi) {
		this.raporTarihi = raporTarihi;
	}

	@Override
	public String toString() {
		return "RaporBilgileri \n polisAdi=" + polisAdi + ",\n sucluAdi=" + sucluAdi + ",\n cezaTanimi=" + cezaTanimi
				+ ",\n cezaMiktari=" + cezaMiktari + ",\n raporTarihi=" + raporTarihi + "\n\ngecmis olsun";
	}

}
