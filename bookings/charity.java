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
public class charity extends roomType {
    private double dis;

    public charity(){
    this.dis = 0; 
}
    public void setChar(){
    dis = (super.getPrice()) -  super.getPrice() * 0.2; // 20 % off
    }
    
    public double getChar(){
      return dis;
    }
}
