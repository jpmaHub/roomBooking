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

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class roomType {
    private int price;
    private int hour;
    private int deposit;
    
    public roomType(){
    this.price = 0;
    this.deposit = 100;
    }
      
   public void setHour(int hour){
       this.hour = hour;
   }
   
   public int[] readFile() throws FileNotFoundException{
        File text = new File("C:\\Users\\Jaseera\\Desktop\\room.txt");
      
        //Creating Scanner instnace to read File in Java
      Scanner scnr = new Scanner(text);
      
        //Reading each line of file using Scanner class
      int lineNumber = 0;
  
     
      
     int [] numbersArray = new int[2];
      while(scnr.hasNextLine()){
          String line = scnr.nextLine();  
          int n = Integer.parseInt(line);
           numbersArray[lineNumber]= n;
          lineNumber++;  
      
        } 
return numbersArray;
   }
    
    
    public void setRoom()  {
       try{
           int[]  x = readFile();
           price = x[0]; // 20
       }
       catch(FileNotFoundException ex){
           
       }
    }
   
    public int getPrice(){
    return price * hour;
    }
    
    public int depo(){
        return deposit ;
    }
    
 
    
    public void setHall(){
          try{
           int[]  x = readFile();
           price = x[1];  // 50
       }
       catch(FileNotFoundException ex){
           
       }
    }
    
    
  
   
}

