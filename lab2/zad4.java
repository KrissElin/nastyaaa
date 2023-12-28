package lab2;

public class zad4 {
    public static final Double G = 9.8;

    public zad4() {
    }

    public static double vis(double h) {
        double t = Math.sqrt(2.0 * h / G);
        return t;
    }

    public static void main(String[] args) {
        System.out.println(vis(10.0));
    }
}
