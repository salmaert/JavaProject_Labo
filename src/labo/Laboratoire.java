package labo;

import java.util.ArrayList;

public class Laboratoire {
    private String nom;
    private ArrayList<chercheur> chercheurs;
    private int lab_Hindex;
    private char categorie;


    private char mettreAjourCategorie() {
        if (this.lab_Hindex < 40 && this.lab_Hindex >= 0)
            return 'D';
        else if (this.lab_Hindex < 60 && this.lab_Hindex >= 40)
            return 'C';
        else if (this.lab_Hindex < 80 && this.lab_Hindex >= 60)
            return 'B';
        else
            return 'A';

    }

    public Laboratoire(String nom) {
        this.nom = nom;
        this.chercheurs = new ArrayList<>();
        this.lab_Hindex = 0;
        this.categorie = 'D';

    }

    public Laboratoire(String nom, ArrayList<chercheur> chercheurs) {
        this.nom = nom;
        this.chercheurs = new ArrayList<>(chercheurs);
        for (chercheur chercheur : chercheurs) {
            this.lab_Hindex += chercheur.getH_index();
        }
        this.categorie = mettreAjourCategorie();
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<chercheur> getChercheurs() {
        return chercheurs;
    }

    public void setChercheurs(ArrayList<chercheur> chercheurs) {
        this.chercheurs = chercheurs;
    }

    public int getLab_Hindex() {
        return lab_Hindex;
    }

    public void setLab_Hindex(int lab_Hindex) {
        this.lab_Hindex = lab_Hindex;
    }

    public char getCategorie() {
        return categorie;
    }

    public void setCategorie(char categorie) {
        this.categorie = categorie;
    }

    public void ajouterchercheur(chercheur cher) throws ChercheurDejaExistant {
        if (this.chercheurs.contains(cher))
            throw new ChercheurDejaExistant("deja existant");
        chercheurs.add(cher);
        lab_Hindex += cher.getH_index();
        this.categorie = mettreAjourCategorie();
    }

    public void supprimerchercheur(chercheur cher) throws ChercheurNonExistant {
        if (!this.chercheurs.contains(cher))
            throw new ChercheurNonExistant("non existant");
        chercheurs.remove(cher);
        lab_Hindex -= cher.getH_index();
        this.categorie = mettreAjourCategorie();
    }

    public void trierchercheurs() {
        this.chercheurs.sort(new CompH_Index());
    }

    @Override
    public String toString() {
        return "Laboratoire{" + "nom=" + nom + " Lab_H_Index =" +
                lab_Hindex + ", categorie=" +
                categorie + '}';
    }

    public void afficherChercheurs() {
        for (int i = 0; i < chercheurs.size(); i++) {
            System.out.println(i + 1 + " : " + chercheurs.get(i));
        }


    }
}


