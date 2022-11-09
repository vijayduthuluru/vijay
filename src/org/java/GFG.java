package org.java;

import java.util.ArrayList;
import java.util.List;

class GFG
{
    public static void main(String[] args)
    {
        // Creating the objects of the class named 'Geek'
        // by passing different arguments
 
        // Invoke the constructor with one argument of
    
    	Geek obj = new Geek("Vikram",28);
        
      List<Geek> list= new ArrayList<Geek>();
      
      list.add(obj);
      
      obj = new Geek("Vikram",30);
      
      list.add(obj);
    }
}
