import java.util.Scanner;

public class ArrayExcercise {
    static int mode(int a[],int n) {
        int maxValue = 0, maxCount = 0, i, j;

        for (i = 0; i < n; ++i) {
            int count = 0;
            for (j = 0; j < n; ++j) {
                if (a[j] == a[i])
                    ++count;
            }

            if (count > maxCount) {
                maxCount = count;
                maxValue = a[i];
            }
        }
        return maxValue;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size ");
        int size=sc.nextInt();
        int[] array=new int[size];
        int sum=0;
        System.out.println("Input array values: ");
        for(int i=0;i<size;i++)
        {
            array[i]=sc.nextInt();
            sum+=array[i];
        }
        int mean=(int)Math.floor(sum/size);
        System.out.println("Mean is "+mean);
        double median;
        if((size%2)!=0){
            median=(double)array[size/2];
        }
        else {
            median=(double)(array[(size-1)/2]+array[size/2])/2.0;
        }
        System.out.println("Median is "+median);
        System.out.println("Mode is "+mode(array,size));
    }
}
