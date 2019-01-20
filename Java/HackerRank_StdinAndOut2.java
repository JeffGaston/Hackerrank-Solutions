/*
   My HackerRank: hackerrank.com/jeffgaston59
   My Github: github.com/JeffGaston
*/
import java.util.Scanner;
public class HackerRank_StdinAndOut2{
   public static void main(String[] args){
      Scanner kb= new Scanner(System.in);

      int in= kb.nextInt();
      double doub= kb.nextDouble();
      kb.nextLine();
      String str= kb.nextLine();
      kb.close();
      
      System.out.println("String: "+ str);
      System.out.println("Double: "+ doub);
      System.out.println("Int: "+ in);
      
   }
}