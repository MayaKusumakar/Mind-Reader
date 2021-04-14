// ShiftBuffer.java
// Raja Sooriamurthi

// a shift buffer is implemented simply as an object with
// a string member variable given the 

//take last 3 to predict

public class ShiftBuffer 
{
  private String s;
  public ShiftBuffer (int size) 
  {
      s = "";
      for(int i = 0; i < size;i++){
         s+="*";
      }
  }
  
  public String shift (String x) 
  {
      s = s.substring(1);
      s+=x;
      return s;
  }

  public String toString() 
  {
    return s;
  }
  
  // *************************
  //   main used to test your ShiftBuffer 
  //   constructor and methods. 
  // *************************

  public static void main (String[] args) 
  {
      ShiftBuffer sb = new ShiftBuffer(3);
      sb.shift("h");
      sb.shift("t");
      sb.shift("h");
      sb.shift("t");
      System.out.println(sb.toString());
      
  
  }
}

