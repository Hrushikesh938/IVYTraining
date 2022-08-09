public class Strings {
    public static void main(String[] args) {
        String stringOne="First";
        String stringTwo="Second";
        System.out.println("Lenght of string1 "+stringOne.length());
        System.out.println("Lenght of string2 "+stringTwo.length());
        String mergedString=stringOne.concat(stringTwo);
        System.out.println("Merged string is "+mergedString+" and length is "+mergedString.length());
        if(stringOne.equals(stringTwo))
        {
            System.out.println("Both strings are equal");
        }
        else{
            System.out.println("Strings not matching");
        }
        StringBuilder stringOneReverse=new StringBuilder(stringOne);
        stringOneReverse.reverse();
        StringBuilder stringTwoReverse=new StringBuilder(stringTwo);
        stringTwoReverse.reverse();
        System.out.println("Reversed strings are "+stringOneReverse+" "+stringTwoReverse);


    }
}
