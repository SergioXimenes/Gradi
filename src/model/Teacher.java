/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Ximenes
 */
public class Teacher {
    //primeiro: criar 3 Atributos:
    private String nom;
    private String prenom;
    private int anciennete;
    //segundo: criar os metodos getters (para ler os atributos) e setters (para modificar os atributos)
    //botao direito, insert code, getter and setter, select all
    //terceiro: criar um constructeur que permite de criar uma instance ou variavel (botao direito, insert code, constructeur, select all)
   //o constructeur pode ser criado vazio ou com 2 parametros ou com tres parametros que devem ser selecionados ou nao.
    //qurto: vou para a aba da classe "maim method" e puxo todas essas classes que foram criadas aqui.
    public Teacher(String nom, String prenom, int anciennete) {
        this.nom = nom;
        this.prenom = prenom;
        this.anciennete = anciennete;
    }


    public Teacher() {
    }
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public string getPrenom() {
        return prenom;
    }

    public void setPrenom(string prenom) {
        this.prenom = prenom;
    }

    public int getAnciennete() {
        return anciennete;
    }

    public void setAnciennete(int anciennete) {
        this.anciennete = anciennete;
    }
}
