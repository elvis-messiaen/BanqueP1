package fr.banque;

public class CompteRemunere extends Compte implements ICompteRemunere {
    private double taux;

    public CompteRemunere() {
        super();
    }

    public CompteRemunere(int numero, double solde, double taux) {
        super(numero, solde);
        this.taux = taux;
    }

    @Override
    public double calculerInterets() {
        double soldeAvantInteret = this.getSolde();
        this.setSolde((double) Math.round((this.getSolde() * this.getTaux()) * 100) / 100);
        double totalAvecinteret = this.getSolde();
        double interet = totalAvecinteret - soldeAvantInteret;
        return interet;
    }

    public void verserInterets() {
        System.out.println("Le total de votre compte avec les intêret est de : " + this.getSolde() + "€");
    }

    @Override
    public double getTaux() {
        return taux;
    }

    @Override
    public void setTaux(double unTaux) {
        this.taux = taux;
    }

}
