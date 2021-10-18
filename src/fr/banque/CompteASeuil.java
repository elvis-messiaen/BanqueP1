package fr.banque;

public class CompteASeuil extends Compte implements ICompteASeuil {
    private double seuil;

    private CompteASeuil() {
    }

    public CompteASeuil(int numero, double solde, double seuil) {
        super(numero, solde);
        this.seuil = seuil;
    }

    public CompteASeuil(int numero, double seuil) {
        super(numero);
        this.seuil = seuil;
    }

    /*
        public void retirer(double uneValeur) : doit faire les vérifications en fonction de la valeur du seuil.
        On ne peut retirer M du solde S si et seulement si on a S-M > Seuil.
     */
    // solde - seuil uneValeur
    // solde - seuil + uneValeur > 0
    @Override
    public void retirer(double uneValeur) {
        if (this.getSolde() - (this.seuil + uneValeur) >= 0) {
            this.setSolde(this.getSolde() - uneValeur);
            System.out.println(getSolde());
        } else {
            System.out.println("vous ne pouvez pas retirer de l'argent en dessous de votre seuil de sécurité");
        }
    }

    @Override
    public double getSeuil() {
        return seuil;
    }

    @Override
    public void setSeuil(double unSeuil) {
        this.seuil = seuil;
    }


    @Override
    public String toString() {
        return "CompteASeuil{" +
                "seuil=" + seuil +
                '}';
    }
}
