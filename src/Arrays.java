import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int size=10;
        int a[]=new int[10];
        int b[]={1,2,3,4,5};
        int c[];
        Scanner sc=new Scanner(System.in);
        int marks=0;
        for(int j=0;j<10;j++){
            marks=sc.nextInt();
            a[j]=marks;
        }

        int minimum=Integer.MAX_VALUE;
        int maximum=Integer.MIN_VALUE;
        int top=0,least=0;
        for(int i=0;i<10;i++){
            if(a[i]>maximum){
                maximum=a[i];
                top=i;
            }
            if(a[i]<minimum){
                minimum=a[i];
                least=i;
            }
        }
        System.out.println("least mark "+minimum+" max mark "+maximum);
        System.out.println("least mark person "+least+" max mark person"+top);
    }
}