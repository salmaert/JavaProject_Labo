package labo;


public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");

        Universite univ=new Universite("Hassan II");
        Laboratoire lab1=new Laboratoire("LTIM");
        Laboratoire lab2=new Laboratoire("LAMS");
        univ.ajouterLaboratoire(lab1);
        univ.ajouterLaboratoire(lab2);
        chercheur ch1=new chercheur("1", "Alaoui", "Ali", 5);
        chercheur ch2=new chercheur("2", "Omari", "Omar", 3);
        chercheur ch3=new chercheur("3", "Tahiri", "Taha", 9);
        chercheur ch4=new chercheur("4", "Yousfi", "Hassan", 16);
        chercheur ch5=new chercheur("5", "Kadiri", "Hossam", 80);
        try{
            univ.ajouterChercheur(lab1,ch1);
            univ.ajouterChercheur(lab1,ch2);
            univ.ajouterChercheur(lab1,ch3);
            univ.ajouterChercheur(lab2,ch4);
            univ.ajouterChercheur(lab2,ch5);
        }catch (ChercheurDejaExistant e){
            System.out.println(e.getMessage());
        }
        lab1.trierchercheurs();
        System.out.println(lab1);
        lab1.afficherChercheurs();
        lab2.trierchercheurs();
        System.out.println(lab2);
        lab2.afficherChercheurs();
        System.out.println("affichage laboratoires");
        univ.trierLaboratoires();
        univ.afficherLaboratoires();


    }
    }
