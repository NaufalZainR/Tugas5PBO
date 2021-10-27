package Bagian1;
public class Lingkaran {
    static float luas(float r){
        return (float) (Math.PI * r * r);
    }

    static double luas(double d){
        double jari = d/2;
        return (Math.PI * jari * jari);
    }

    static float keliling(float r){
        return (float) (2 * Math.PI * r);
    }

    static double keliling(double d){
        double jari = d/2;
        return (Math.PI * jari * jari);
    }
}
