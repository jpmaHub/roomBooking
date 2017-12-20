/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookings;

/**
 *
 * @author Jaseera
 */
public class ind extends roomType{
    private double dis;
    
    public ind(){
    this.dis = 0; 
    }
    
    public void setInd(){
    dis = super.getPrice();
    }
    
    public double getInd(){
      return dis;
    }
}
