package ma.projet;

public class Specialiste {
    private int id;
    private String code;
    private String libelle;
    private static int cont = 0; // Static pour un ID unique

    public Specialiste(String code, String libelle) {
        this.id = cont++;
        this.code = code;
        this.libelle = libelle;
    }

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public String getLibelle() {
        return libelle;
    }

    @Override
    public String toString() {
        return "Specialiste [id=" + id + ", code=" + code + ", libelle=" + libelle + "]";
    }
}
