import java.util.*;

public class hi
{

   public static void main(String[] args)
   {
       int amt , dp = 0;
       String name;
       double dis,netamt;
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter name: ");
       name = sc.next();
       System.out.print("Enter ticket amount: ");
       amt = sc.nextInt();
       if(amt > 70000)
       {
           dp = 18;
       }
       else if(amt >= 55001 && amt <= 70000)
       {
           dp = 16;
       }
       else if(amt >= 35001 && amt <= 55000)
       {
            dp = 12;
       }
       else if (amt >= 25001 && amt <= 35000)
       {
           dp = 10;
       }
       else if (amt < 25001)
       {
           dp = 2;
       }
       dis = dp * amt / 100.0;
       netamt = amt - dis;
       System.out.println("Name \t Charges \t Discount \t Net Amount");
       System.out.println(name + "\t" + amt + "\t" + dis + "\t" + netamt);
   }
}