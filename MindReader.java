// MindReader.java
// Raja Sooriamurthi

import java.util.*;


//This class is used to implement the AI
//for the MindReader program
public class MindReader 
{
   static HTcounter pg;
   private ArrayList<String> al;
   private int count;
   private String prevThree;
   private Map<String, Integer> map;
   private ArrayList<Boolean> prev;
 
 
  public MindReader() 
  {   
      count = 1;
      pg = new HTcounter();
      al = new ArrayList<String>();
      prevThree = "";
      map = new TreeMap<String, Integer>();
      prev = new ArrayList<Boolean>();
      
      al.add("hhht");
      al.add("hhtt");
      al.add("htht");
      al.add("htth");
      al.add("thht");
      al.add("thth");
      al.add("ttth");
      al.add("tthh");
  }

 
  public String getPrediction(String guess, boolean lastRight) 
  {
   //declare some patterns ex: hhh, hht, hth, htt, thh, tht, ttt, tth
   //find which patterns the user falls into in the last 3 guesses
   //predict the next based off of that 
   
   //count the num of h and heads in the last 3 guesses
   //try to be balanced so if hhh, pick t
   //if hht pick t
   //if hth pick t
   //if tth pick h
   
   prevThree+=guess;
   if(prevThree.length()< 3){
      int randNum = (int)(Math.random()*2);
      if(randNum == 0){
         return "h";
    
      } else if(randNum == 1){
         return "t";
      }
   }
   
   if(prevThree.length()>3){
      prevThree = prevThree.substring(1);
   }
   
   prev.add(lastRight);
   if(prev.size()>3){
      prev.remove(0);
   }
   
      
   String fam = getFamily(prevThree);
   String letter = fam.substring(4);
   
   if(prev.get(1)==false && prev.get(2)==false){
      if(letter.equals("h")){
         return "t";
      }
      else {
         return "h";
      }
   }
      
      return "error";
   }
   
   private String getFamily(String word){
      for(int i = 0; i < al.size(); i++){
         if(prevThree.equals(al.get(i).substring(0,3))){
            return al.get(i);
         }
      }
      return "error";
   }
  


  
  public void storePlayerGuess (String guess) 
  {
      if(guess.equals("h")){
         pg.addHead();
      } else {
         pg.addTail();
      }
  }

}
    
