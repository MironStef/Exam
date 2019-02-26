package task1;

public class Counts {
    public static void main(String[] args) {

        int [] array = new int[] {1,2,3,4,5,6,7,8};

        for (int i = 0; i<array.length; i++)
        if (i%2==0)
            System.out.println("Number " + " "+ i + " " +  "is even");
        else
            System.out.println("Number " + " "+ i + " " +  "is odd");
        }
    }

