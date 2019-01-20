/*
   My HackerRank: hackerrank.com/jeffgaston59
   My Github: github.com/JeffGaston
*/
import java.util.Scanner;

public class HackerRank_JavaEndOfFile{
   public static void main(String[] args){
      
      Scanner file= new Scanner(System.in);
      int counter= 1;
      
      while(file.hasNextLine()){
         String value= file.nextLine();
         System.out.println(counter+ " "+  value);
         counter++;
      }
      file.close();
   }
}