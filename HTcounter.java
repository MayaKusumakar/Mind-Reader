// HTcounter.java
// Raja Sooriamurthi


//Simple class the stores the number of heads and tails
//that have been counted.  
//class should have methods to increment the count of 
//heads and tails as well as return individual counts.

public  class HTcounter 
{
   private int numHeads;
   private int numTails;
   
   public HTcounter(){
      numHeads = 0;
      numTails = 0;
   }
   
   public HTcounter(int nh, int nt){
      numHeads = nh;
      numTails = nt;
   }
   
   public int getHeads(){
      return numHeads;
   }
   
   public int getTails(){
      return numTails;
   }
   
   public void addHead(){
      numHeads++;
   }
   
   public void addTail(){
      numTails++;
   }
   
}
