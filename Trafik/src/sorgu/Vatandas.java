package sorgu;

public class Vatandas {
	private String tcKimlik;
	private String isim;

	public Vatandas(String tcKimlik, String isim) {
		super();
		this.tcKimlik = tcKimlik;
		this.isim = isim;
	}

	public Vatandas(String tcKimlik) {
		super();
		this.tcKimlik = tcKimlik;
	}

	public String getTcKimlik() {
		return tcKimlik;
	}
	public void setTcKimlik(String tcKimlik) {
		this.tcKimlik = tcKimlik;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}

}
