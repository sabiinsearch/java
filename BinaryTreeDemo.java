import java.util.*; 
import java.io.*;

class BinaryTreeDemo {

 
    public static void stringToArray (String str) {
        //int[] members=null;
        List<int[]> list = new ArrayList<int[]>();
        String[] memberString = str.split("\\(\\,\\)\\,");
        for( int r=0; r<memberString.length;r++) {
             System.out.print(" Length : "+memberString +" ");
             System.out.println();
        }
        
     }  

  public static Boolean TreeConstructor(String[] strArr) {
    // code goes here  
    Boolean msg = true;          // to return if Argument is Binary Tree or not

    int index_start=0;
    int index_end=0;
   // StringBuilder sBuilder;
    String subStr="";
    
    String inputStr = Arrays.toString(strArr);

    index_start = inputStr.indexOf("{");
    index_end = inputStr.indexOf("}");
    
    System.out.println(inputStr);
    System.out.println("Start : "+index_start);
    System.out.println("End : "+index_end);
     
    subStr += inputStr.substring(17,(inputStr.length()-2));
    //System.out.println(subStr);
    stringToArray(subStr);


    // List<int []> families = new ArrayList<int[]>();
    // int family_count = 0;
    // for(int n=0; n< (subStr.length()-2);n++) {
    //      int[] family = new int[2];
    //      family[0] = (int)(subStr.charAt(n+1));
    //      family[1] = (int)(subStr.charAt(n+2));
    //      families.add(family);
    //      family_count++;
    // }
 
     return msg;
  }


  public static void main (String[] args) { 
       
        System.out.println(TreeConstructor(args)); 

  } 
    
}