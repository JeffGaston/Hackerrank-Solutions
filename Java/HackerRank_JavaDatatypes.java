/*
   My HackerRank: hackerrank.com/jeffgaston59
   My Github: github.com/JeffGaston
*/
import java.util.Scanner;

public class HackerRank_JavaDatatypes{
   public static void main(String[] args){
      
      Scanner kb= new Scanner(System.in);
      int t= kb.nextInt();
      
      for(int counter= 0; counter < t; counter++){
         try{
            long lng= kb.nextLong();
            System.out.println(lng+ " can be fitted in: ");
            if(lng >= -128 && lng<= 127)
               System.out.println("* byte");
            if(lng >= -32768  && lng<= 32767)
               System.out.println("* short");
            if(lng >= -2147483648 && lng <= 2147483647)
               System.out.println("* int");
            System.out.println("* long");
         }catch(Exception e){
            System.out.println(kb.next() +" can't be fitted anywhere.");
         }
      }
      kb.close();
   }
}