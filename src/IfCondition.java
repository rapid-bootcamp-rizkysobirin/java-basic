import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //sampleConvert(scanner);

        System.out.println("Masukang Angka: ");
        String input  =  scanner.next();
        int nilai = stringConverter(input);
        // cara manggil pertama
        convertNilai(nilai);

        // cara kedua, param method
        convertNilai(stringConverter(input));

        System.out.println("Nilai : "+ convertNilai2(stringConverter(input)));
    }

    public static void convertNilai(int nilai){
        // nilai 0 - 20 => E
        if(nilai >= 0 && nilai <=20){
            System.out.println("E");
        }
        // nilai 21 - 40 => D
        else if (nilai >=21 && nilai <= 40){
            System.out.println("D");
        }
        // nilai 41 - 60 => C
        else if (nilai >= 41 && nilai <= 60){
            System.out.println("C");
        }
        // nilai 61 - 80 => B
        else if (nilai >= 61 && nilai <= 80){
            System.out.println("B");
        }
        // nilai 81 - 100 => A
        else {
            System.out.println("A");
        }
    }

    public static String convertNilai2(int nilai){
        // nilai 0 - 20 => E
        if(nilai <=20){
            return "E";
        }
        // nilai 21 - 40 => D
        else if (nilai <= 40){
            return "D";
        }
        // nilai 41 - 60 => C
        else if (nilai <= 60){
            return "C";
        }
        // nilai 61 - 80 => B
        else if (nilai <= 80){
            return "B";
        }
        // nilai 81 - 100 => A
        else {
            return "A";
        }
    }

    public static Integer stringConverter(String input){
        int result = 0;
        try{
            result = Integer.parseInt(input);
        }catch (Exception e){
            System.out.println("Error: "+ e.getMessage());
        }
        return result;
    }

    public static void sampleConvert(Scanner scanner){
        // input pertama
        System.out.println("Masukan angka : ");
        String input1 = scanner.next();
        System.out.println("Hasil Input1 : "+ input1);

        // input kedua
        System.out.println("Masukan Kata: ");
        String input2 = scanner.next();
        System.out.println("Hasil Input 2: "+ input2);

        System.out.println("convert ....");
        int angka1 = 0;
        int angka2 = 0;
        try {
            angka1 = Integer.parseInt(input1);
            angka2 = Integer.parseInt(input2);
        }catch (Exception e){
            System.out.println("Error: "+ e.getMessage());
        }

        System.out.println("hitung...");
        int hasil = angka1 + angka2;
        System.out.println("Hasil Jumlah "+ hasil);
    }
}
