package Day1;
import java.util.*;
import java.util.Scanner;
public class TwoDArray {
    public static void sortMarks(int arr[][], int col)
    {
        Arrays.sort(arr, new Comparator<int[]>() {

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
        int[][] student=new int[3][6];
        int[][] total=new int[3][2];
        for(int i=0;i< student.length;i++)
        {
            System.out.println("Enter student id");
            student[i][0]=sc.nextInt();
            total[i][0]=student[i][0];
            for(int j=1;j<student[i].length;j++){
                System.out.println("Enter marks of subject "+j);
                student[i][j]=sc.nextInt();
                total[i][1]+=student[i][j];
            }
        }
        sortMarks(total,1);
        for(int i=0;i< total.length;i++)
        {
            System.out.println("student id: "+total[i][0]+", total marks are "+total[i][1]);
        }
        int[] rank=new int[3];
        int ranks=0;
        for(int i=0;i<total.length;i++)
        {
            if(i>0 && total[i][1]==total[i-1][1])
            {
                rank[i]=ranks;
            }
            else{
                ranks+=1;
                rank[i]=ranks;
            }
        }
        for(int i=0;i<rank.length;i++)
        {
            System.out.println("Rank "+rank[i]+" for student id: "+total[i][0]);
        }
        calculateAverage(total);
        for(int i=0;i< student.length;i++)
        {
            System.out.println("Average in each subject for student id : "+student[i][0]);
            calculateAverageEachSubject(student[i]);
        }
    }

    private static void calculateAverageEachSubject(int[] student) {
        double average;
        int sum=0;
        for(int i=1;i< student.length;i++)
        {
            sum+=student[i];
        }
        average=sum/ (student.length-1);
        System.out.println("Student Average is "+average);
    }

    private static void calculateAverage(int[][] total) {
        double average;
        int sum=0;
        for(int i=0;i< total.length;i++)
        {
            sum+=total[i][1];
        }
        average=sum/ total.length;
        System.out.println("Class Average is "+average);
    }
}
