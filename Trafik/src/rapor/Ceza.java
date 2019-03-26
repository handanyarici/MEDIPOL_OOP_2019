package rapor;

public class Ceza {
	private long id;
	private String tanim;
	private double cezaMiktari;

	public double getCezaMiktari() {
		return cezaMiktari;
	}

	public void setCezaMiktari(double cezaMiktari) {
		this.cezaMiktari = cezaMiktari;
	}

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

}
