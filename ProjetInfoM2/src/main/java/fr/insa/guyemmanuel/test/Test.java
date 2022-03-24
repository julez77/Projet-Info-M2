/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.guyemmanuel.test;

//import  fr.insa.guyemmanuel.test.Noeud;

import static fr.insa.guyemmanuel.test.Noeud.entrenoeud;

//salut azaeraesdjhqeesrtyfioipo
/**
 *
 * @author eguy01
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("lol");
      NoeudSimple pessi = new NoeudSimple(8,7);
      NoeudSimple benz;
        benz =  new NoeudSimple(14,5);
       System.out.println(pessi);
Barre penaldo = new Barre(pessi,benz);
System.out.println(penaldo);
System.out.println(penaldo.noeudOppose(benz));
double angl = penaldo.angle();
System.out.println(angl);
Groupe teste = new Groupe();
teste.ajoutbarre(penaldo);

teste.maxIDbarre();
System.out.println(teste.maxIDbarre());
System.out.println(teste.maxIDnoeud());
teste.menutxt();
// TODO code application logic here
    }
    
    
    
}
