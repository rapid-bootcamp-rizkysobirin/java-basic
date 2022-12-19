public class Solve2 {
    public static void main(String[] args) {
        int in = 9;
        System.out.println("Logic 2 no 1");
        logic2_1(in);
        System.out.println("Logic 2 no 2");
        logic2_2(in);
        System.out.println("Logic 2 no 3");
        logic2_3(in);
        System.out.println("Logic 2 no 4");
        logic2_4(in);
        System.out.println("Logic 2 no 5");
        logic2_5(in);
    }
    public static void logic2_1(int n){
        int[][] deret = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                deret[i][j] = j+1;
            }
        }

        for(int k=0; k<n; k++){
            for(int l=0; l<n; l++){
                if(k==l || k+l == n-1){
                    System.out.print(deret[k][l]+"\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println("\n");
        }
    }

    public static void logic2_2(int n){
        int[][] deret = new int[n][n];
        int num =-1;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                deret[i][j] = num+2;
                num+=2;
            }
            num=-1;
        }

        for(int k=0; k<n; k++){
            for(int l=0; l<n; l++){
                if(k==0 || l==0 || k==n-1 || l==n-1){
                    System.out.print(deret[k][l]+"\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println("\n");
        }
    }

    public static void logic2_3(int n){
        int[][] deret = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                deret[i][j] = j*2;
            }
        }

        for(int k=0; k<n; k++){
            for(int l=0; l<n; l++){
                if(k==l || k+l == n-1 || k==0 || l==0 || k==n-1 || l==n-1){
                    System.out.print(deret[k][l]+"\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println("\n");
        }
    }

    public static void logic2_4(int n){
        int[][] deret = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(j==0 || j==1){
                    deret[i][j]=1;
                }else{
                    deret[i][j] = deret[i][j-1] + deret[i][j-2];
                }
            }
        }

        for(int k=0; k<n; k++){
            for(int l=0; l<n; l++){
                if(k==(n-1)/2 || l==(n-1)/2 || k==0 || l==0 || k==n-1 || l==n-1){
                    System.out.print(deret[k][l]+"\t");
                }else{
                    System.out.print("\t");
                }
//                System.out.print(deret[k][l]+"\t\t");
            }
            System.out.println("\n");
        }
    }

    public static void logic2_5(int n){
        int[][] deret = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==0 || i==1){
                    deret[i][j]=1;
                }else{
                    deret[i][j] = deret[i-1][j] + deret[i-2][j];
                }
            }
        }

        for(int k=0; k<n; k++){
            for(int l=0; l<n; l++){
//                if(k==(n-1)/2 || l==(n-1)/2 || k==0 || l==0 || k==n-1 || l==n-1){
//                    System.out.print(deret[k][l]+"\t");
//                }else{
//                    System.out.print("\t");
//                }
                System.out.print(deret[k][l]+"\t");
            }
            System.out.println("\n");
        }
    }
}
