import java.util.*;
public class Trignometry
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Degree");
        double degree = sc.nextFloat();
        double radian = (22.0/7.0 * 180)/degree;
        System.out.println(radian);
        sc.close();
        
    }
    
}