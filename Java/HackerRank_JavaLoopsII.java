/*
   My HackerRank: hackerrank.com/jeffgaston59
   My Github: github.com/JeffGaston
*/
import java.util.Scanner;

public class HackerRank_JavaLoopsII{
   public static void main(String[] args){
      Scanner kb= new Scanner(System.in);
      
      int t= kb.nextInt();
      for(int i=0; i< t; i++){
         int a = kb.nextInt();
         int b = kb.nextInt();
         int n = kb.nextInt();
         int sum= a;
         
         for(int counter= 0; counter < n;counter++){
            sum= sum+ (int)Math.pow(2, counter) *b;
            System.out.print(sum + " ");
         }
         System.out.println();
      }
      kb.close();
   }
}