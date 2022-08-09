package Day1;

public class Holiday {
    private String name;
    private int day;
    private String month;

    public Holiday(String name,int day,String month)
    {
        this.name=name;
        this.day=day;
        this.month=month;
    }
    public static boolean inSameMonth(Holiday objectOne,Holiday objectTwo)
    {
        return objectOne.month.equals(objectTwo.month);
    }
    public static double avgDate(Holiday[] object)
    {
        int sum=0,i=0;
        double average=0;
        while(i<object.length)
        {
            sum+=object[i].day;
            i++;
        }
        average=sum/object.length;
        return average;
    }

    public static void main(String[] args) {
        Holiday[] object=new Holiday[2];
        object[0]=new Holiday("Independence",4,"july");
        object[1]=new Holiday("Festival",7,"july");
        System.out.println(inSameMonth(object[0],object[1]));
        System.out.println(avgDate(object));
    }
}
