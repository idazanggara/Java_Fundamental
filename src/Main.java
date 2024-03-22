import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // Variable
        //        int numb = 10;
//        String name = "acong";
//        boolean bool = true;
//        int numb1; numb1 = 9; var numb2 = 10; final double PHI = 3.14;
//        System.out.println(numb);
//        System.out.println(name);
//        System.out.println(bool);
//        System.out.println(numb1);
//        System.out.println(PHI);
//        System.out.println("Hello world!");

/**
        // Tipe Data
        // number
        byte iniByte = 100;
        Byte iniByte1 = 100;
        short iniShort = 1000;
        int iniInt = 128;
        Integer iniInteger = 100000;
        long iniLong = 1000000;
        long iniLong2 = 1000000L;
        System.out.println(10_000_000);
        System.out.println(1e6);

        // floating
        float iniFloat = 10.12F;
        double iniDouble = 12.2424;
        Double iniDoub = 12.00;

        short iniSB= iniByte;
        System.out.println(iniSB);

        byte iniBI = (byte) iniInt;
        System.out.println(iniBI);

        // char
        char i = 'I';
        char d = 'd';
        char a = 'a';
        char z = 'z';

        System.out.println(i+" "+d+a+z);
        System.out.println(i);

        // Boolean
        boolean benar = true;
        boolean salah = false;
        Boolean bnr = true;


        System.out.println(benar);
        System.out.println(salah);

        // String
        String nama = "idaz" ;
        System.out.println(nama);

*/
/*
    // Operator
        // aritmatika
        int a = 100;
        int b = 11;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // Unary
        int c = 100;
        c++;
        c++;
        System.out.println(c);
        c--;
        System.out.println(c);

        // Assignment
        c = c + 10;
        System.out.println(c);

        c -= 20;
        System.out.println(c);

        // Perbandingan
        int value1 = 100;
        int value2 = 100;
        System.out.print("Pengentesan ");
        System.out.println("Pengentesan "+(value1 > value2));
        System.out.println(value1 < value2);
        System.out.println(value1 >= value2);
        System.out.println(value1 <= value2);
        System.out.println(value1 == value2);
        System.out.println(value1 != value2);
        System.out.println(true);
        System.out.println("===");

        var absen = 70;
        var nilaiAkhir = 80;

        boolean luluSAbsen =  absen >= 75;
        boolean lulusNilai = nilaiAkhir >= 75;

        var lulus = luluSAbsen && lulusNilai;
//        var lulus1 =  luluSAbsen || lulusNilai;
        System.out.println( "Semalat anda " + !lulus);
*/
/**
        // Membuat object Scanner dari class Scanner untuk menerima input dari User
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama anda: ");
        String name = scanner.nextLine();

        System.out.print("Masukkan Hobby Anda: ");
        String hobby = scanner.nextLine();

        System.out.print("Masukkan Umur Anda: ");
        int umur = scanner.nextInt();


        System.out.println("Halo, "+ name + "! Selamat Datang!");
        System.out.println("Hobby anda adalah: "+hobby);
        System.out.println(umur);

        // Ubah String Menjadi int primitif
        String num = "3300";
        int intValue = Integer.parseInt(num);
        System.out.println(intValue);

        // Ubah string menjadi Integer non-primitif
        String num1 = "1000";
        Integer integerValue = Integer.valueOf(num1);
        System.out.println(integerValue);

 */
/**
        // Perkondisian
        var absen = 0;
        var nilaiAkhir = 80;

        boolean luluSAbsen =  absen >= 75;
        boolean lulusNilai = nilaiAkhir >= 75;
        String result = "";
        if(absen >= 75){
            if (nilaiAkhir >=75){
                result = "Lulus";
            } else {
                result = "Tidak Lulus";
            }
        } else if (absen == 0) {
            result = "Enggak niat sekolah";
        } else {
            result = "Tidak Lulus";
        }
        System.out.println("Selamat anda " + result);

        var nilai = "B";
//        if(nilai == "A"){
//        } else if (nilai == "B"){
//        }

        // Switch statement, hanya untuk perbandingan sama dengan saja (==)
        switch (nilai ){
            case "A":
                System.out.println("Wow, anda lulus dengan baik");
                break;
            case "B":
            case "C":
                System.out.println("Nilai anda cukup baik");
                break;
            case "D":
                System.out.println("Anda tidak lulus");
                break;
            default:
                System.out.println("Mungkin anda salah jurusan");
        }

        switch (nilai){
            case "A" -> System.out.println("Wow, anda lulus dengan baik");
            case "B","C" -> System.out.println("Nilai anda cukup baik");
            case "D" -> System.out.println("Anda tidak lulus");
            default -> {
                System.out.println("Mungkin anda salah jurusan");
            }

        }

        String ucapan;
        switch (nilai){
            case "A" -> ucapan = "Wow, anda lulus dengan baik";
            case "B","C" -> ucapan = "Nilai anda cukup baik";
            case "D" -> ucapan = "Anda tidak lulus";
            default -> ucapan = "Mungkin anda salah jurusan";
        };
        System.out.println(ucapan + " -----");

        String ucapanYield = switch (nilai){
            case "A" : yield  "Wow, anda lulus dengan baik";
            case "B","C" : yield  "Nilai anda cukup baik";
            case "D" : yield  "Anda tidak lulus";
            default : yield  "Mungkin anda salah jurusan";
        };
        System.out.println(ucapanYield + " ======");

        // Ternary
        var nilaiAkh = 80;
        String ucapanTerIf;
        if(nilaiAkh >= 75){
            ucapanTerIf = "Selamat Anda Lulus";
        } else {
            ucapanTerIf = "Maaf Anda belum lulus";
        }
        System.out.println(ucapanTerIf + " If biasa");

        String ucapanTernary = nilaiAkh >= 75 ? "Selamat Anda Lulus" : "Maaf Anda belum lulus";
        System.out.println(ucapanTernary + " Ternary");

        var newTer = nilaiAkh == 90 ? "Selamat anda lulus" : "coba lagi dong";
        System.out.println(newTer);

        boolean bnr = true;
        int num = 22;
        Integer numIn = 33;
        double doubt = 1.0;
        char kar = 'r';


        String theBnr = "The "+bnr + numIn + num + doubt + kar + 10_000 + (num == 22);
        System.out.println(theBnr);
        String thBnr = ""+doubt;
        System.out.println(thBnr);
*/
/*
        // Perulangan
        // IF
        System.out.println("Sebelum Loop");
        for (int i = 0; i < 10; i++) {

            if (i == 5) {
                continue;
            }
            System.out.println("ini adalah i = "+ i);

            if ( i == 8) {
                break;
            }
        }
        System.out.println("Sesudah Loop");

        String email = "idaz.anggara@gmail.com";
        String result = "";
        boolean flag = false;
        for (int i = 0; i < email.length(); i++) {
            char kar = email.charAt(i);
            System.out.println((kar == '@') + " " + kar +" " + (kar == '.') +"| Ini Flag= " + flag);

            if (kar == '.'){
                flag = false;
            }

            if (flag == true){
                result += kar;
            }


            if (kar == '@'){
                flag = true;
            }
        }
        System.out.println(result + "| Ini dari hasil cuy");
*/
        // While

        var couter = 0;
//        while (couter != 0){
//            couter++;
//            System.out.println("test " + couter);
//        }

        // Do While
/*
        do {
//            couter++;
            System.out.println("test " + couter);
        }while (couter != 0);


        Random random = new Random(); // Membuat instance/object dari Random
        int angkot = 0; // Mendlekarasikan variable angkot

        while (angkot != 7){
            angkot = random.nextInt(10) + 1; // Mendapatkan angka acak dari 1 sampai 10
            System.out.println("Angkot yg sedang lewat adalah angkot nomor : " + angkot);

            if (angkot == 7) {
                System.out.println("yeayyy, angkot kita sudah sampai " + angkot);
            }
        }
        System.out.println("Berhenti " + angkot);

        do {
//            System.out.println(angkot+" ini angka awal");
            angkot = random.nextInt(10) + 1; // Mendapatkan angka acak dari 1 sampai 10
            System.out.println("Angkot yg sedang lewat adalah angkot nomor : " + angkot);

            if (angkot == 7) {
                System.out.println("yeayyy, angkot kita sudah sampai " + angkot);
            }
        }while (angkot != 7);
        System.out.println("Berhenti " + angkot);
*/
/*
        String message = "aaabbbbccccaaabbbdddeee111222aaaaaa";
        // "bbbbccccdddeee111222"
        String tas = "";
        // "a"
        for (int i = 0; i < message.length(); i++) {
            char charak = message.charAt(i);
            boolean flag = false;
            for (int j = 0; j < tas.length(); j++) {
                System.out.println(charak+" == "+tas.charAt(j) + " "+ (charak == tas.charAt(j)));
                if (charak == tas.charAt(j)) {
                    flag = true;
                    break;
                }
            }
            System.out.println(charak + " | " + flag);
            if(flag == false){
                // disini kita masukkan karakter kita ke tas
                tas = tas + charak;
            }
        }
        System.out.println("ini isi tas = "+ tas);

*/
/**
        // Array
        String[] arrayString;
        arrayString = new String[6];

        arrayString[0] = "acong";
        arrayString[2] = "joko";
        arrayString[4] = "sitorus";
        System.out.println(arrayString);

        String addressAlias = Integer.toHexString(System.identityHashCode(arrayString));
        System.out.println(addressAlias);
        System.out.println(arrayString[4]);
        System.out.println(arrayString.length);
        for (int i = 0; i < arrayString.length; i++) {
            System.out.println(arrayString[i]);
        }

        int[] arrInt = new int[]{1,4,5};
        System.out.println(Arrays.toString(arrInt));

        int[] newArrInt = {1,4,5};
        System.out.println(Arrays.toString(newArrInt));

        String[][] members = {
                {"Acong", "Joko", "Sitorus"},
                {"Idaz", "Anggara"},
                {"Ismail", "Bin", "Mail"}
        };

        System.out.println(Arrays.toString(members[2]));

        System.out.println(members);
        System.out.println(members[0]);
        System.out.println(members[1]);
        System.out.println(members[2]);
        System.out.println(members[1][0]);
        System.out.println("FOR EACH");
        byte count = 0;
        for (var member: members ) {
            System.out.println(Arrays.toString(members) + " " + count);
//            System.out.println(members);
            count++;
        }


        // Pass by value
        String a = "idaz";
        String b = a;
        System.out.println(a + " " + b);
        b = "Anggara";
        System.out.println(a + " " + b);

        System.out.println("===");
        // Pass by reference

        String[] c = {"Idaz"};
        String[] d = c;
        System.out.println(c[0] + " " + d[0]);
        d[0] = "Anggara";
        System.out.println(c[0] + " " + d[0]);
        System.out.print(c);
        System.out.print(d);


        String[] names = {"Idaz", "Anggara", "Ismail"};
        String[] newNames = new String[3];
        byte counted = 0;
        for (var name : names ) {
            System.out.println(name);
            newNames[counted] = name;
            counted++;
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println(Arrays.toString(names) + "|" + Arrays.toString(newNames));
        newNames[1] = "=====";
        System.out.println(Arrays.toString(names) + "|" + Arrays.toString(newNames));

**/

    // Method
        sayHello();
        sayHello("Idaz", "Anggara");

        int sumVar = sum(); // 40
        System.out.println(sumVar);

        System.out.println(sum(20,100));

        int[] values = {80, 90, 50,50, 80};

        sayCongrats("Acong", values);
        sayCongrats("Acong", 80, 90, 50,80, 80);


        System.out.println(calculator(100,50, '+'));

        // calculator,
        // inputan operator,
        // inputan int[]
        // return double


    }

   // buat method
    static void sayHello(){
        System.out.println("Hello Aamazing World!!");
        System.out.println("Hello Aamazing World!!");
        System.out.println("Hello Aamazing World!!");
    }

    // method overloading
    static void sayHello(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName );
    }

    static int sum() {
        var total =  10 + 30;
        return total;
    }

    static int sum(int v1, int v2){
        return v1 + v2;
    }

    static void sayCongrats(String name, int... values){

        var total = 0;
        for (var value : values){
            total += value;
        }

        var finalValue = total / values.length;
        System.out.println(finalValue);

        if (finalValue >= 75){
            System.out.println("Selamat " +name + ", Anda lulus");
        }else {
            System.out.println("Maaf " + name + ", Anda tidak lulus");
        }
    }

    static int calculator(int v1, int v2, char operasi){
        if(operasi == '+' ){
            return sum(v1, v2);
        } else if (operasi == '*'){
            return times(v1, v2);
        }
        return 0;
    }

    static int times(int v1, int v2){
        int[] inter = {1,2,3};
        var result = inter[0];
        for (int i = 1; i < inter.length ; i++) {

        }
        return v1 * v2;
    }


}
