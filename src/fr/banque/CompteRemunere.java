package fr.banque;

public class CompteRemunere extends Compte {
    private double taux;

    public CompteRemunere() {
    }

    public CompteRemunere(Compte compte) {

    }

    public CompteRemunere(double taux) {
        this.taux = taux;
    }

    // calcule les intérêts du compte (taux*solde)
    public double calculerInterets(Compte compte) {
       // taux avec 2 nombres apres la virgule avex un taux random entre 0 et 1
        this.setSolde((double) Math.round((compte.getSolde() * this.getTaux()) * 100) / 100);
        System.out.println(this.getTaux()+ " taux effectif");
        System.out.println(this.getSolde() + " solde");
        return this.getSolde();
    }

    //méthode de définition de taux variable entre 0 et 1
    public double getTaux() {
        this.setTaux(1.20);
        taux = (double) Math.round(taux * 100) / 100;
        return taux;
    }

    //méthode de définition de taux variable entre 0 et 1
/*    public double getTaux() {
        double Min = 0;
        double Max = 1;
        taux = Min + (Math.random() * ((Max - Min) + 1));
        taux = (double) Math.round(taux * 100) / 100;
        return taux;
    }*/

    public void setTaux(double taux) {
        this.taux = taux;
    }
}
