public class LogicFor {
    public static void main(String[] args) {
        soal02(7);
    }

    public static void soal01(int n){
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
    }

    public static void soal02(int n){
        //deklarasi array 2 dimensi
        int[][] deret = new int[n][n];
        int angka = 0;
        //proses mengisi array
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                deret [i][j] = angka;
                angka++;
            }
        }

        //proses menampilkan array
        for (int k=0; k<n; k++){
            for (int l=0; l<n; l++){
                if(k>=l){
                    System.out.print(deret[k][l]+"\t\t");
                }else{
                    System.out.print("\t\t");
                }

//                System.out.print(deret[k][l]+"\t\t");
            }
            System.out.println("\n");
        }
    }
}
