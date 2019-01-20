/*
   My HackerRank: hackerrank.com/jeffgaston59
   My Github: github.com/JeffGaston
*/
import java.util.Scanner;
public class HackerRank_JavaSubstring{
   public static Scanner kb= new Scanner(System.in);
   
   public static void main(String[] args){
      String s= kb.nextLine();
      int Start= kb.nextInt();
      int End= kb.nextInt();
      kb.close();
      System.out.println(s.substring(Start, End));
   }
}