import nomor1.Segitiga;
import java.util.Scanner;

public class TestNomor1 {
    public static void main(String[] args) {

        //deklarasi
        Scanner keyboard = new Scanner(System.in);
        double s1, s2, s3;
        String wr;
        boolean fill;

        //input
        System.out.println("INPUT DATA SEGITIGA : ");
        System.out.print("sisi 1 : ");
        s1 = keyboard.nextDouble();
        System.out.print("sisi 2 : ");
        s2 = keyboard.nextDouble();
        System.out.print("sisi 3 : ");
        s3 = keyboard.nextDouble();
        System.out.print("fill[true/false] : ");
        fill = keyboard.nextBoolean();
        System.out.print("warna : ");
        wr = keyboard.next();

        // memanggil class
        Segitiga segitiga1 = new Segitiga();
        Segitiga segitiga2 = new Segitiga(s1,s2,s3,wr,fill);


        //output
        System.err.println("--- SEGITIGA 1 (DEFAULT)---");
        System.err.println(segitiga1.toString());
        System.err.println("Luas = " + segitiga1.getArea());
        System.err.println("Keliling = "+segitiga1.getPerimeter());

        System.err.println("");
        System.err.println("--- SEGITIGA 1 (DEFAULT)---");
        System.err.println(segitiga2.toString());
        System.err.println("Luas = " + segitiga2.getArea());
        System.err.println("Keliling = " + segitiga2.getPerimeter());
    }
}

