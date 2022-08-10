package Day2;
import java.util.*;
import java.lang.Exception;

public class Exceptions {
    public static void main(String[] args) {
        int numberOne,numberTwo,result,array[]=new int[]{1,2,3};
        String string=null;
        Scanner sc=new Scanner(System.in);
        try{
            numberOne=sc.nextInt();
            numberTwo=sc.nextInt();
            result=numberOne/numberTwo;
            System.out.println(result);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        try {
            string.toLowerCase();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        try
        {
            int number=Integer.parseInt("jfjfjf");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        try{
            for(int i=0;i<4;i++)
            {
                System.out.println(array[i]);
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
