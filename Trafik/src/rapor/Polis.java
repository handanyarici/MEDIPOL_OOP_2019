package rapor;

public class Polis {
	private long id;
	private String isim;
	private int derece;

	public Polis(String isim) {
		super();
		this.isim = isim;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getDerece() {
		return derece;
	}

	public void setDerece(int derece) {
		this.derece = derece;
	}

}
