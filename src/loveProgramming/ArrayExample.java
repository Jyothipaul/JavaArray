package loveProgramming;

public class ArrayExample {

    public static void main(String[] args) {

        int a[] = {1,2,3,4,5};
        int []b = {1,2,3,4,5,6};

        char d[];
        d = new char[]{'a', 'b', 'c'};
        d = new char[]{'D'};

        String [] c;
        c = new String[]{"Rajashwari","Sudha","Jaya","Archana","Srini1","Chakri","Srini2","Vijaya","Aparna","Mani"};

//        System.out.println("Length of array is " + a.length);

//        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 2
//        System.out.println("Length of array is " + d[2]);2

        System.out.println("Length of array c is " + c.length);
        for(int i=c.length-1; i>=0; i--) {

            System.out.println("Student Name: " + c[i]);

        }
    }
}
