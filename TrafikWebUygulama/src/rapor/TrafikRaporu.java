package rapor;

import java.util.Date;

public class TrafikRaporu {
	private long id;
	private String tanim;
	private Date raporTarihi;
	private Ceza[] cezalar;
	private Suclu suclu;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTanim() {
		return tanim;
	}
	public void setTanim(String tanim) {
		this.tanim = tanim;
	}
	public Date getRaporTarihi() {
		return raporTarihi;
	}
	public void setRaporTarihi(Date raporTarihi) {
		this.raporTarihi = raporTarihi;
	}
	public Ceza[] getCezalar() {
		return cezalar;
	}
	public void setCezalar(Ceza[] cezalar) {
		this.cezalar = cezalar;
	}
	public Suclu getSuclu() {
		return suclu;
	}
	public void setSuclu(Suclu suclu) {
		this.suclu = suclu;
	}






}
