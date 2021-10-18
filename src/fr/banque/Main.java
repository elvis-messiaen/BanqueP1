package fr.banque;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Compte compte1 = new Compte(123456, 300);
        Compte compte2= new Compte(254321, 1200);
        Compte compte3= new Compte(324466, 10);
        Compte compte4 = new Compte(497766, 200);
        Compte compte5 = new Compte(558741, 70);
        Compte compte6 = new Compte(667493, 8888);
        Compte compte7 = new Compte(7554444, 9999);



/*        compte1.ajouter(152.24);
        compte1.retirer(25.08);
        System.out.println(compte1.getSolde());*/

        Client n1 = new Client("louis","luhi",22,114455);
        n1.ajouterUnCompte(compte1);
        n1.ajouterUnCompte(compte2);
        n1.ajouterUnCompte(compte3);
        n1.ajouterUnCompte(compte4);
        n1.ajouterUnCompte(compte5);
        n1.ajouterUnCompte(compte6);
        n1.ajouterUnCompte(compte7);

        System.out.println(n1.getCompteClient());

/*        CompteRemunere compteRemunere = new CompteRemunere(11111,100,1.3);
        compteRemunere.calculerInterets();
        compteRemunere.verserInterets();


        CompteASeuil compteASeuil = new CompteASeuil(252525,300,200);
        compteASeuil.retirer(100);*/

        CompteASeuilRemunere compteASeuilRemunere = new CompteASeuilRemunere(123456,100,1.2);
        compteASeuilRemunere.calculerInterets();
        compteASeuilRemunere.verserInterets();
    }
}
