public class Multadd {

    // a * b + c
    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    // x * e^(-x) + sqrt(1 - e^(-x))
    public static double expSum(double x) {
        double eToMinusX = Math.exp(-x);
        double firstPart = x * eToMinusX;
        double secondPart = Math.sqrt(1.0 - eToMinusX);
        // istenirse multadd ile de yazilabilir:
        // return multadd(x, eToMinusX, Math.sqrt(1.0 - eToMinusX));
        return firstPart + secondPart;
    }

    public static void main(String[] args) {
        // 1) Basit test: 2 * 3 + 4 = 10
        double result1 = multadd(2.0, 3.0, 4.0);
        System.out.println("multadd(2, 3, 4) = " + result1);

        // 2) sin(pi/4) + cos(pi/4) / 2
        double sinPart = Math.sin(Math.PI / 4.0);
        double cosPart = Math.cos(Math.PI / 4.0) / 2.0;
        double trigResult = multadd(sinPart, 1.0, cosPart); // sin(pi/4)*1 + cos(pi/4)/2
        System.out.println("sin(pi/4) + cos(pi/4)/2 = " + trigResult);

        // 3) log(10) + log(20)  (dogal log)
        double log10 = Math.log(10.0);
        double log20 = Math.log(20.0);
        double logResult = multadd(log10, 1.0, log20); // log10*1 + log20
        System.out.println("log(10) + log(20) = " + logResult);

        // 4) expSum(x) icin ornek: x = 1.0
        double x = 1.0;
        double expSumResult = expSum(x);
        System.out.println("expSum(" + x + ") = " + expSumResult);
    }
}
