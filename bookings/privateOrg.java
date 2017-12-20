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
public class privateOrg extends roomType {
     private double dis;
    public privateOrg() {
    this.dis = 0; 
    }
    
    public void setPri(){
    dis = (super.getPrice()) + super.getPrice() * 0.1 ; // charge extra 10
    
    }
    
    public double getPri(){
      return dis;
    }
}
