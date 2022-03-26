/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.guyemmanuel.test;

/**
 *
 * @author eguy01
 */
public class AppuiGlissant extends NoeudAppui {
   
    
                
   
    

  public AppuiGlissant(double px, double py){
      
      super(px,py);     
      
  }  
 
  
  
  
    @Override
 public String toString(){
      return  "["+this.getPx()+","+this.getPy()+"] appuiglissant";
  }   
    
    
    
    
}
