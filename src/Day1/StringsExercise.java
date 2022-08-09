package Day1;
import java.util.Scanner;
public class StringsExercise {
    public static StringBuffer swapCase(String string)
    {
        StringBuffer convertCase=new StringBuffer(string);
        for (int i = 0; i < convertCase.length(); i++) {
            Character c = convertCase.charAt(i);
            if (Character.isLowerCase(c))
                convertCase.replace(i, i + 1,Character.toUpperCase(c) + "");
            else
                convertCase.replace(i, i + 1,Character.toLowerCase(c) + "");
        }
        return convertCase;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String string=sc.nextLine();
        System.out.println("String after swapping cases is "+(swapCase(string)));
    }

}
