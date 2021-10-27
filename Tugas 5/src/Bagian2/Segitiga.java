package Bagian2;
public class Segitiga {

    private double alas;
    private double tinggi;
    private float sisi;

    public Segitiga(double alas,double tinggi,float sisi){
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi = sisi;
    }

    public Segitiga(double alas,float sisi){
        this.alas = alas;
        this.sisi = sisi;
    }

    public Segitiga(double alas,double tinggi){
        this(alas,tinggi,0);
    }

    public double getAlas() {
        return alas;
    }

    public double getTinggi(){
        return tinggi;
    }

    public double getSisi(){
        return sisi;
    }

    public double getLuas(){
        if (sisi == 0){
            return (alas*tinggi)/2;
        }else {
            double t = (sisi*Math.sqrt(3))/2;
            return (alas*t)/2;
        }

    }

    public double getKeliling(){
        if (sisi ==0){
            return alas*3;

        }
        else {
            return sisi*3;
        }

    }


}
