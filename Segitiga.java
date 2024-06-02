package nomor1;
import java.lang.Math;

public class Segitiga extends SimpleGeometricObject{
    private double sisi1;
    private double sisi2;
    private double sisi3;

    public Segitiga(){
        this.sisi1 = 1.0; 
        this.sisi2 = 1.0; 
        this.sisi3 = 1.0; 
    }

    public Segitiga(double sisi1, double sisi2, double sisi3){
        this.sisi1 = sisi1; 
        this.sisi2 = sisi2; 
        this.sisi3 = sisi3; 
    }

    public Segitiga(double side1, double side2, double side3, String warna, boolean isi){
        this.sisi1 = side1; 
        this.sisi2 = side2; 
        this.sisi3 = side3;
        super.color = warna;
        super.filled = filled;
    }

    public double getArea(){
        return Math.sqrt((getPerimeter()/2*((getPerimeter()/2)-sisi3)*((getPerimeter()/2)-sisi1)*((getPerimeter()/2)-sisi2)));
    }

    public double getPerimeter(){
        return this.sisi1 + this.sisi2 + this.sisi3;
    }

    public String toString() {
        return "Segitiga:	sisi1	=	"	+	this.sisi1	+	"	sisi2	=	"	+	this.sisi2	+	"	sisi3	=	"	+	this.sisi3
         + "\nwarna = " + getColor() + "\nFilled = " + getFilled();
      }
}
