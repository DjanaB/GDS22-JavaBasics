public class ArithmetischeOperationen {

    public static void main(String[] args) {

        /**
         * Ausführung aller arithmetischen Operationen und Ausgabe
         */

        int a = 3;
        int b = 2;
        int result;
        // int plus = a + b;
        // int minus = a - b;
        // int mal = a * b;
        // int durch = a / b;

        result = a + b;
        System.out.println("result = " + result);

        result = a - b;
        System.out.println("result = " + result);

        System.out.println("Multiplikation: " + (a * b));
        //double div = a / (1.0*b);
        double div = (double) a / (double) b;
        System.out.println("Division: " + div);
        System.out.println("Modulo: " + (a % b));


        //System.out.println("Addition: " + plus);
        //System.out.println("Subtraktion: " + minus);
        // System.out.println("Multiplikation: " + mal);
        //System.out.println("Division: " + durch);

    }
}
