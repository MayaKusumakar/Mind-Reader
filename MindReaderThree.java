// MindReader.java
// Raja Sooriamurthi

import java.util.*;


//This class is used to implement the AI
//for the MindReader program
public class MindReaderThree
{
   
  private Map<String, HTcounter> map;
  private ShiftBuffer sb;
  private HTcounter ht;
 
  public MindReaderThree() 
  {   
      sb = new ShiftBuffer(3);
      ht = new HTcounter();
      map = new TreeMap<String, HTcounter>();
  }

 
  public String getPrediction(String guess) 
  {
      String ans = "";
      System.out.println("shiftbuffer" + sb.toString());
      HTcounter h = map.get(sb.toString());

      if(map.containsKey(sb.toString())){
        // HTcounter h = map.get(sb.toString());
        HTcounter ht = map.get(sb.toString());
         if(h.getHeads()> h.getTails()){
             ans = "h";
         } else {
             ans = "t";
         }
         
         if(guess.equals("h")){
            ht.addHead();
         } else {
            ht.addTail();
         }
         map.put(sb.toString(), ht);
      }
      
      else {
         HTcounter htc = new HTcounter();
         if(guess.equals("h")){
            htc.addHead();
         } else{
            htc.addTail();
         }
         map.put(sb.toString(), htc);
      }
      sb.shift(guess);
      //HTcounter htc = map.get(sb.toString());
      if(h == null){
      int ran = (int)(Math.random()*2);
         if(ran == 0){
            ans = "h";
         } else {
            ans = "t";
         }

      }
      // else if(h.getHeads()> h.getTails()){
//          ans = "h";
//       } else {
//          ans =  "t";
//       } 
//       
      
      return ans;
  }
   

  
  public void storePlayerGuess (String guess) 
  {

  }

}
