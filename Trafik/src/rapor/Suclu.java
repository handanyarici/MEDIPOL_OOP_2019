package rapor;

import sorgu.Vatandas;

public class Suclu extends Vatandas{

	private Ceza[] cezalar;
	private long id;

	public Suclu(String tcKimlik, String isim) {
		super(tcKimlik, isim);
		// TODO Auto-generated constructor stub
	}


	public Suclu(String tcKimlik) {
		super(tcKimlik);
		// TODO Auto-generated constructor stub
	}




	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


	public Ceza[] getCezalar() {
		return cezalar;
	}


	public void setCezalar(Ceza[] cezalar) {
		this.cezalar = cezalar;
	}

}
