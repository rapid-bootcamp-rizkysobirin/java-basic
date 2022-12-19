import java.util.Arrays;
import java.util.List;

public class Looping {
    public static void main(String[] args) {
        sample01(11);
        sample02(11);
        sample03(7);
        sample04();
    }

    public static void sample01(int n){
        for (int i=0; i<n; i++){
            System.out.println(i);
        }
    }

    public static void sample02(int n){
        for (int i=0; i<n; i++){
            if (i%2 == 0){
                System.out.print("Fizz");
            }else {
                System.out.print(i + "\t");
            }
        }
    }
    public static void sample03(int n){
        for (int i=0; i<n; i++){
            for (int j=0; j<i; j++){
                System.out.println("["+i+","+j+"]");
            }
            System.out.println("\t");
        }
    }

    public static void sample04(){
        List<String> listString = Arrays.asList("Coding", "Reading", "Sport");
        System.out.println("List of Hobby :");
        for(String item: listString){
            System.out.print(item+"\t");
        }
        System.out.println("\n");

        List<Integer> listNumber = Arrays.asList(1,3,4,6,7,8,54,3);
        System.out.println("List of Number :");
        for (Integer item: listNumber){
            System.out.print(item+"\t");
        }
    }
}
