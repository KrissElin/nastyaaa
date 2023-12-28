package lab2;

public class zad5 {
    public zad5() {
    }

    public static double kat(double c, double a) {
        double f = Math.sqrt(c * c - a * a);
        return f;
    }

    public static void main(String[] args) {
        System.out.println(kat(5.0, 3.0));
    }
}
