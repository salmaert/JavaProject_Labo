package labo;

import java.util.Objects;

public class chercheur {
private String id;
private String nom;
private String prenom;
private int H_index;

public chercheur(String id,String nom,String prenom,int H_index){
    this.id=id;
    this.nom=nom;
    this.prenom=prenom;
    this.H_index=H_index;
}

    public String getId() {
        return id;
    }

    // Setter pour l'identifiant
    public void setId(String id) {
        this.id = id;
    }

    // Getter pour le nom
    public String getNom() {
        return nom;
    }

    // Setter pour le nom
    public void setNom(String nom) {
        this.nom = nom;
    }

    // Getter pour le prénom
    public String getPrenom() {
        return prenom;
    }

    // Setter pour le prénom
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    // Getter pour l'indice H
    public int getH_index() {
        return H_index;
    }

    // Setter pour l'indice H
    public void setH_index(int H_index) {
        this.H_index = H_index;
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        chercheur chercheur=(chercheur) o;
        return H_index == chercheur.H_index && id.equals(chercheur.id) && nom.equals(chercheur.nom) && prenom.equals(chercheur.prenom);
    }



    public int hashCode() {
        return Objects.hash(id, nom, prenom, H_index);
    }


    @Override
    public String toString() {
        return "Chercheur{" +
                "id='" + id + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", H_index=" + H_index +
                '}';
    }







}









