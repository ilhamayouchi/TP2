package ma.projet;

public class Salle {
    private int id;
	private String code;
    private String libelle;
    
    private static int comp = 0; 
    
    public Salle(String code, String libelle) {
    	
		this.id = comp++;
		this.code = code;
		this.libelle = libelle;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@Override
	public String toString() {
		return "Salle" +id+ ":" + libelle+ "(" + code+ ")" ;
	}

	
	
}
