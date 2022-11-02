/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gradisystem;

import model.Teacher;

/**
 *
 * @author Ximenes
 */
public class GradiSystem {

    
    public static void main(String[] args) {
        //usei aqui o formato TIPO VARIAVEL = NEW TIPO (ATRIBUTO,ATRIBUTO,ATRIBUTO)
        //sendo Teacher a classe criada na outra aba
        Teacher teacher1 = new Teacher("Christiano", "Ronaldo", 6);
        Teacher teacher2 = new Teacher("Sergio", "Ximenes", 7);
        Teacher teacher3 = new Teacher("Darlon", "Sato", 8);
        Teacher teacher4 = new Teacher("Edgar", "Pomponet", 9);
        Teacher teacher5 = new Teacher("Julia", "Lima", 10);
         //vamos criar um tableu de Teachers
         Teacher[] listTeachers = new Teacher[5];
         //colocam-se agora as variaveis no tableu (nao escreve os nomes, apenas usa as posicoes de 0 a 4 do tableu que ai sera de forma generica)
         //teacher1 e os outros sao as variaveis.
         listTeachers[0] = teacher1;
         listTeachers[1] = teacher2;
         listTeachers[2] = teacher3;
         listTeachers[3] = teacher4;
         listTeachers[4] = teacher5;
         //para afficher o tableau com uma loop:
         for (int i = o; i<listTeachers.length; i++); {
         System.out.println("nom" + listTeachers[i].getNom());
         
         //Enhanced loop - para ir de objeto em objeto
         System.out.println("Impression using enhanced loop");
         for(Teacher t :listTeachers){
         System.out.println(" Nom " + t.getNom());
         
    }
    }
        
    }
   
}
