package ma.projet;

public class Professeur {
    private int id;
    private String nom;
    private String prenom;
    private String telephone;
    private String email;
    private static int count = 0; // Static pour un ID unique

    public Professeur(String nom, String prenom, String telephone, String email) {
        this.id = count++;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Professeur [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", telephone=" + telephone + ", email=" + email + "]";
    }
}
