/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.guyemmanuel.test;
import  fr.insa.guyemmanuel.test.Barre;
import static fr.insa.guyemmanuel.test.Noeud.entrenoeud;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author corin
 */
public class Groupe extends élements {
    
   private List<Barre> listebarre ;
   private List<Noeud> listenoeud ;
   
    public Groupe(List<Barre> listebarre,List<Noeud>listenoeud){
       this.listebarre = listebarre ;
        this.listenoeud = listenoeud ;
        
        
    }
    public Groupe(){
       this.listebarre = new ArrayList<>();
   this.listenoeud  = new ArrayList<>();  
        
    }
public int maxIDnoeud(){
   if (this.listenoeud.isEmpty()) {
       return 0;
   }
  int  max = this.listenoeud.get(0).getId();
   Noeud nmax = this.listenoeud.get(0);
    for (int  i = 1 ; i < this.listenoeud.size(); i++){
        if( max < this.listenoeud.get(i).getId()){
           max =  this.listenoeud.get(i).getId();
                   nmax = this.listenoeud.get(i);
        }
        
        
        
    }
    return max ;
    
}
 public int maxIDbarre(){
   if (this.listebarre.isEmpty()) {
       return 0;
   }
  int  max = this.listebarre.get(0).getId();
   Barre nmax = this.listebarre.get(0);
    for (int  i = 1 ; i < this.listebarre.size(); i++){
        if( max < this.listebarre.get(i).getId()){
           max =  this.listebarre.get(i).getId();
                   nmax = this.listebarre.get(i);
        }
        
        
        
    }
    return max ;
    
}      
   public void ajoutnoeud(Noeud  n){
    if (listenoeud.contains(n)== true){
        throw new Error("est deja dans  le groupe");
    }else {
       
       
       n.setId(this.maxIDnoeud()+1);
    listenoeud.add(n);}
    
}
    
    public void ajoutbarre(Barre  b){
   if (listebarre.contains(b)== true){
       throw  new Error("deja dans  le grp");
   }else{
        
        b.setId(this.maxIDbarre()+1);
    listebarre.add(b);
    this.ajoutnoeud(b.getNoeud1());
    this.ajoutnoeud(b.getNoeud2());
   }
}    
        
    


    public int size() {
        return (this.listebarre.size()+ this.listenoeud.size());
    }

   @Override
   public String toString(){
    return "barres du groupe ( et leur noeuds) :" + listebarre.toString()                     ;
}

public void menutxt(){
    
   System.out.println("afficher treillis(1),créer nouveau noeud(2), ajouter barre netre 2 noeud(3),Supprimer une  barre(4),supprimer  un noeud(5),ne rien faire (autre  nombre) ");
   int choice = Lire.i();
 while ((choice==1)||(choice==2)||(choice==3)||(choice==4)||(choice==5) ){
   if ( choice == 1){
       this.toString();
   } 
   if ( choice == 2){
     Noeud n =entrenoeud();
       this.ajoutnoeud(n);
   }
    if ( choice == 3){
        
       this.ajoutbarre(new Barre(this.choisinoeud(),this.choisinoeud()));
   }
    if ( choice == 4){
       this.removebarre(this.choisibarre());
   }
   if ( choice == 5){
       
   }
   System.out.println("afficher treillis(1),créer nouveau noeud(2), ajouter barre netre 2 noeud(3),Supprimer une  barre(4),supprimer  un noeud(5),ne rien faire (autre  nombre) ");
   choice = Lire.i();
   
   
   
 }  
    
    
    
    
}

public Noeud choisinoeud(){
    System.out.println("entrer l'id du  noeud");
        int id1 = Lire.i();
       int i = 0;
    while(id1 !=listenoeud.get(i).getId()){
        i=i+1;
    }
    return listenoeud.get(i); 
    
}
public void removebarre(Barre b) {
        if (b.getGroupe() != this) {
            throw new Error("la figure n'est pas dans le groupe");
        }
        this.listebarre.remove(b);
        b.setGroupe(null);
    }
public Barre choisibarre(){
    System.out.println("entrer l'id de la barre");
        int id1 = Lire.i();
       int i = 0;
    while(id1 !=listebarre.get(i).getId()){
        i=i+1;
    }
    return listebarre.get(i);
}













}
