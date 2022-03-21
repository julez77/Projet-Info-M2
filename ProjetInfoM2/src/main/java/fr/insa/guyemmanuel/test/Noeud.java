/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.guyemmanuel.test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eguy01
 */
public abstract class Noeud  extends élements{
//nouveau commentaire
   
  private  double px ;
  private  double  py ;
    private List<Barre> barredebut ;
   private List<Barre> barrefin ;
    private  int id ;
    
   

    /**
     * @return the px
     */
    public double getPx() {
        return px;
    }

    /**
     * @param px the px to set
     */
    public void setPx(double px) {
        this.px = px;
    }

    /**
     * @return the py
     */
    public double getPy() {
        return py;
    }

    /**
     * @param py the py to set
     */
    public void setPy(double py) {
        this.py = py;
    }
 
    @Override
  public String toString(){
      return  "["+px+","+py+"]";
  }
 public static  Noeud entrenoeud(){
   double  type ;
   System.out.println("entrer le type de  noeud 0 pour noueud 1 pour appuisimple  2 pour appui-glissant");
     type = Lire.d();
   System.out.println("abs");
     double px = Lire.d();
     System.out.println("ord");
     double  py = Lire.d();
 //  while (( type  !=0) ||(type !=1)||(type != 2)){
    ///   System.out.println("entrer le type de  noeud 0 pour noueud 1 pour appuisimple  2 pour appui-glissant");
   ///   type = Lire.d();
     
 //  }
     
     if ( type == 0){
         return   new NoeudSimple (px,py);
         
     }
   if  (type == 1){
       return new Appuisimple(px,py);
   }  
     if (type == 2){
         return new Appuiglissant(px,py);
     } else {
        return null ; }
     
 }         
public Noeud (double px , double py){
    this.px = px;
    this.py = py;
    
    this.barredebut = new ArrayList<>();
   this.barrefin  = new ArrayList<>(); 
   this.id=0;
}
    /**
     * @return the barredebut
     */
public List<Barre> getBarredebut() {
    return barredebut;
}

    /**
     * @return the barrefin
     */
    public List<Barre> getBarrefin() {
        return barrefin;
    }
public void addnoeud1(Barre b) {
        if (b.getNoeud1() != this) {
            if (b.getNoeud1() != null) {
                throw new Error("figure déja dans un autre groupe");
            }
            this.barredebut.add(b);
            b.setNoeud1(this);
        }
    }
 public void addnoeud2(Barre b) {
        if (b.getNoeud2() != this) {
            if (b.getNoeud2() != null) {
                throw new Error("figure déja dans un autre groupe");
            }
            this.barrefin.add(b);
            b.setNoeud2(this);
        }
    }
 public List<Barre> barreincidentes(){
     List<Barre> liste = new ArrayList<>(); 
     
     for(int  i = 0;  i < this.barredebut.size(); i++){
     liste.add(barredebut.get(i));
     
 }   
 for(int  i = 0;  i < this.barrefin.size(); i++){
     liste.add(barrefin.get(i));
     
 } 
 return liste ;  

 }

   
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
    
}
