public class IfNested {
    public static void main(String[] args) {
        nestedIf(90);
        pararelIf(15);
    }

    //if yang bertumpuk
    public static void nestedIf(int angka){
        if (angka>0){
            if(angka % 2 == 0){
                int result = angka*4;
                System.out.println("Hasil: "+result);
            }else {
                int result = angka*3;
                System.out.println("Hasil: "+result);
            }
        }else{
            System.out.println("Angka kurang dari 0");
        }
    }

    public static void pararelIf(int angka){
        if(angka > 0){
            System.out.println("Angka lebih dari 0");
        }
        if(angka % 2 == 0){
            System.out.println("Angka Genap");
        }else{
            System.out.println("Angka Ganjil");
        }

        if(angka / 2 >= 5){
            System.out.println("Angka 10 ke atas");
        }else{
            System.out.println("Angka kurang dari 10");
        }
    }
}
