package fr.banque;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String nom;
    private String prenom;
    private int age;
    private int numero;
    private List <Compte> compteClient = new ArrayList<>();

    public Client() {
    }

    public Client(String nom, String prenom, int age, int numero) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.numero = numero;
    }


    public Client(String nom, String prenom, int age, int numero,List<Compte> compteClient) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.numero = numero;
        this.compteClient = compteClient;

    }
    public void ajouterUnCompte(Compte compte){
        if(compteClient.size() <= 4){
            this.compteClient.add(compte);

        }else {
            System.out.println("vous avez atteint le nombre maximum de compte");
        }
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<Compte> getCompteClient() {
        return compteClient;
    }

    public void setCompteClient(List<Compte> compteClient) {
        this.compteClient = compteClient;
    }

    @Override
    public String toString() {
        return "Client{" +
                " Mr ou Mme " + nom
                + "\n"
                + prenom + '\''
                + "\n"
                + "age : " + age
                + "\n"
                + "numero de client" + numero
                + "\n"
                + "compteClient " + compteClient;
    }
}
