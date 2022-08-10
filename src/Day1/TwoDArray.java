package Day1;
import java.util.*;
import java.util.Scanner;
public class TwoDArray {
    public static void sortMarks(int arr[][], int col)
    {
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(final int[] entry1,
                               final int[] entry2) {
                if (entry1[col] < entry2[col])
                    return 1;
                else
                    return -1;
            }
        });
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] science=new int[3][2];
        int[][] maths=new int[3][2];
        int[][] computerScience=new int[3][2];
        int[][] socialScience=new int[3][2];
        int[][] english=new int[3][2];
        int[][] total=new int[3][2];
        for(int i=0;i<3;i++)
        {
            int id;
            System.out.println("Enter student id");
            id=sc.nextInt();
            science[i][0]=id;
            maths[i][0]=id;
            computerScience[i][0]=id;
            socialScience[i][0]=id;
            english[i][0]=id;
            System.out.println("Enter marks for science");
            science[i][1]=sc.nextInt();
            System.out.println("Enter marks for maths");
            maths[i][1]=sc.nextInt();
            System.out.println("Enter marks for computer science");
            computerScience[i][1]=sc.nextInt();
            System.out.println("Enter marks for social science");
            socialScience[i][1]=sc.nextInt();
            System.out.println("Enter marks for english");
            english[i][1]=sc.nextInt();
            total[i][0]=id;
            total[i][1]=science[i][1]+maths[i][1]+computerScience[i][1]+socialScience[i][1]+english[i][1];
        }
        sortMarks(total,1);
        System.out.println("Ranks along with total marks are: ");
        for(int i=0;i< total.length;i++)
        {
            System.out.println("Rank "+(i+1)+" to student id: "+total[i][0]+", total marks: "+total[i][1]);
        }
    }
}
