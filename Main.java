// Main.java
// Raja Sooriamurthi

import java.io.*;
import java.util.*;

public class Main 
{
   public static void main(String[] args){
   
   boolean last = false;
   int playerScore = 0;
   int computerScore = 0;
   Scanner input = new Scanner(System.in);
   MindReaderThree mr = new MindReaderThree();
   while(true){
   System.out.println("Guess heads or tails and I'll predict your guess!");
   
   String choice = input.nextLine();
   String choiceWord;
   while(!(choice.equals("h") || choice.equals("t"))){
      System.out.println("Please enter a character that is h or t");
      choice = input.nextLine();
   }
   if(choice.equals("h")){
      choiceWord = "heads";
   } else if(choice.equals("t")) {
      choiceWord = "tails";
   } else {
      choiceWord = "error";
      System.out.println("error");
   }
   //String prediction = mr.getPrediction(choice, last); <-- MindReader
   String prediction = mr.getPrediction(choice);
   
   //System.out.println(prediction);
   if(choice.equals(prediction)){
      System.out.println("I guessed " + choiceWord + ", too!");
      computerScore++;
      last = true;
   } else {
      System.out.println("Oops, I didn't pick " + choiceWord + " :(");
      playerScore++;
      last = false;
   }
   if(playerScore >= 25){
      System.out.println("you win!");
      System.out.println("Final score: " + computerScore + "|" + playerScore);
      break;
   }
   else if (computerScore >= 25){
      System.out.println("I win!");
      System.out.println("Final score: " + computerScore + "|" + playerScore);
      break;
   }
   else {
   System.out.println("Score: " + computerScore + "|" + playerScore);
   }
   
   
   }
 }
   
}
