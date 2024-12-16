package Model;

public class Customer {
    private String id;
    private String nama;
    private String email;
    private String alamat;
    private String hp;

    public Customer(String id, String nama, String email, String alamat, String hp) {
        this.id = id;
        this.nama = nama;
        this.email = email;
        this.alamat = alamat;
        this.hp = hp;
    }

    public Customer() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getHp() {
        return hp;
    }

	public String getnoHP() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setId(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setNama(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setAlamat(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setNoHP(String string) {
		// TODO Auto-generated method stub
		
	}
}
