/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.guyemmanuel.test;
import java.util.List;
/**
 *
 * @author eguy01
 */
public class AppuiSimple extends NoeudAppui {
    
    
    public AppuiSimple(double px, double py){
        super(px,py);
   

   
                }
    @Override
   public String toString(){
      return  "["+this.getPx()+","+this.getPy()+"]appuisimple ";
  } 
    
    
    
    
    
    
}
