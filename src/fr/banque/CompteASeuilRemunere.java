package fr.banque;

public class CompteASeuilRemunere extends CompteRemunere  implements ICompteASeuil {

    public CompteASeuilRemunere() {
        super();
    }


    public CompteASeuilRemunere(int numero, double solde, double taux) {
        super(numero, solde, taux);
    }

    /*
        recuperer la methode en héritage depuis CompteRemunere

     */
    @Override
    public double calculerInterets() {
        double soldeAvantInteret = this.getSolde();
        this.setSolde((this.getSolde() * this.getTaux() * 100) /100);
        double interet = this.getSolde() - soldeAvantInteret;
        System.out.println("le montant de vos interet est de : " + interet + "€");
        return interet;

    }


    @Override
    public void verserInterets() {
        System.out.println("Le total de votre compte avec les intêret est de : " + this.getSolde() + "€");
    }

    @Override
    public void ajouter(double unMontant) {
        super.ajouter(unMontant);
    }

    @Override
    public void retirer(double unMontant) {
        super.retirer(unMontant);
    }

/*    @Override
    public double getTaux() {
        return this.getTaux();
    }

    @Override
    public void setTaux(double unTaux) {
        this.getTaux();
    }*/

    @Override
    public double getSeuil() {
        return this.getSeuil();
    }

    @Override
    public void setSeuil(double unSeuil) {
        this.getSeuil();
    }
}
