public class Solve {
    public static void main(String[] args) {
//        System.out.print(logic1_1(9));
        int in = 9;
        System.out.println("Logic 1 no 1");
        logic1_1(in);
        System.out.println("Logic 1 no 2");
        logic1_2(in);
        System.out.println("Logic 1 no 3");
        logic1_3(in);
        System.out.println("Logic 1 no 4");
        logic1_4(in);
        System.out.println("Logic 1 no 5");
        logic1_5(in);
        //trouble
        System.out.println("Logic 1 no 6");
        logic1_6(in);
        System.out.println("Logic 1 no 7");
        logic1_7(in);
        System.out.println("Logic 1 no 8");
        logic1_8(in);

        System.out.println("Logic 1 no 9");
        logic1_9(in);
        System.out.println("Logic 1 no 10");
        logic1_10(in);
    }

    public static void logic1_1(int n){
        int[] deret = new int[n];
        for (int i=0; i< deret.length; i++){
            deret[i] = i+1;
        }
        printArray(deret);
    }

    public static void logic1_2(int n){
        int[] deret = new int[n];
        deret[0] = 1;
        deret[1] = 3;
        for (int i=2; i< deret.length; i++){
           if(i%2 == 0){
               deret[i] = deret[i-2]+1;
           }else{
               deret[i] = deret[i-2]+3;
           }
        }
        printArray(deret);
    }

    public static void logic1_3(int n){
        int[] deret = new int[n];
        deret[0] = 0;
        for (int i=1; i< deret.length; i++){
            deret[i] = deret[i-1] + 2;
        }

       printArray(deret);
    }

    public static void logic1_4(int n){
        int[] deret = new int[n];
        //1 1 2 3 5 8 13 21
        //0 1 2 3 4 5 6  7
        for (int i=0; i<deret.length; i++){
            if(i == 1 || i == 0){
                //deret ke i => 0,1
                deret[i]=1;
            }else{
                deret[i] = deret[i-1] + deret[i-2];
            }
        }
        printArray(deret);
    }

    public static void logic1_5(int n){
        int[] deret = new int[n];
//        for(int i=0;i<3;i++){
//            deret[i] = 1;
//        }
        for(int i=0; i<n; i++){
            if(i==0||i==1||i==2){
                deret[i] = 1;
            }else{
                deret[i] = deret[i-1]+deret[i-2]+deret[i-3];
            }
        }
        printArray(deret);
    }

    //trouble
    public static void logic1_6(int n){
        int[] deret = new int[n];
//        for(int i=1; i<=20; i++){
        int i = 0;
        while(i!=13){
            int co=0;
            for(int j=1; j<=i; j++){
                if(i%j == 0){
                    co = 1+co;
                }
            }
            if(co == 2){
                System.out.print(i+" ");
                i++;
            }
//            deret[i] = 1;
//            if(co == 2){
//                deret[i] = i;
//            }
            i++;
        }
//        printArray(deret);
    }

    public static void logic1_7(int n){
        char[] deret = new char[n];
        int it = 64;
        for(int i=0; i<n; i++){
            it++;
//            System.out.println(it);
//            System.out.println(i);
            deret[i] = (char)it;
//            System.out.println((char) it);
        }
        printArray(deret);
    }

    public static void logic1_8(int n){
        String[] deret = new String[n];
        int it = 64;
        for(int i=0; i<n; i++){
            it++;
            if(i%2 == 0){
                deret[i] = String.valueOf((char) it);
            }else{
                deret[i] = String.valueOf(i+1);
            }

        }
        printArray(deret);

    }

    public static void logic1_9(int n){
        int[] deret = new int[n];
        for (int i=0; i<deret.length; i++){
            deret[i] = (int)Math.pow(3,i);
        }
        printArray(deret);
    }

    public static void logic1_10(int n){
        int[] deret = new int[n];
        for (int i=0; i<deret.length; i++){
            deret[i] = (int)Math.pow(i,3);
        }
        printArray(deret);
    }

    public static void printArray(int[] intArray){
        for (int j=0; j<intArray.length; j++){
            System.out.print(intArray[j]+"\t");
        }
        System.out.println("\n");
    }
    public static void printArray(String[] StringArray){
        for (int j=0; j<StringArray.length; j++){
            System.out.print(StringArray[j]+"\t");
        }
        System.out.println("\n");
    }

    public static void printArray(char[] charArray){
        for (int j=0; j<charArray.length; j++){
            System.out.print(charArray[j]+"\t");
        }
        System.out.println("\n");
    }

}
