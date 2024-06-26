package labo;

import java.util.ArrayList;

public class Universite {
    private String nom;
    private ArrayList<Laboratoire> laboratoires;

    public Universite(String nom){
        this.nom=nom;
        this.laboratoires=new ArrayList<>();

    }
    public void ajouterLaboratoire(String nom){
      this.laboratoires.add(new Laboratoire(nom));
    }
    void ajouterLaboratoire(Laboratoire lab) {
        this.laboratoires.add(lab);
    }
    public void ajouterChercheur(Laboratoire laboratoire, chercheur chercheur) throws ChercheurDejaExistant {
        laboratoire.ajouterchercheur(chercheur);
    }
    public void supprimerChercheur(Laboratoire laboratoire, chercheur chercheur) throws ChercheurNonExistant {
        laboratoire.supprimerchercheur(chercheur);
    }
    public void trierLaboratoires(){
        this.laboratoires.sort(new CompLabH_Index());
    }
    public void afficherLaboratoires(){
        for (Laboratoire laboratoire : laboratoires) {
            System.out.println(laboratoire);
        }
    }


}
