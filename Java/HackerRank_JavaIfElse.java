/*
   My HackerRank: hackerrank.com/jeffgaston59
   My Github: github.com/JeffGaston
*/
import java.util.Scanner;
public class HackerRank_JavaIfElse{
   public static void main(String[] args){
      Scanner kb= new Scanner(System.in);
      
      int n= kb.nextInt();
      kb.close();
      
      if(n%2 != 0)
         System.out.println("Weird");
      else if(n%2 == 0 && 2 <= n && n <= 5)
         System.out.println("Not Weird");
      else if(n%2 == 0 && 6 <= n && n <= 20)
         System.out.println("Weird");
      else if(n%2 ==0 && n > 20)
         System.out.println("Not Weird");
   }
}