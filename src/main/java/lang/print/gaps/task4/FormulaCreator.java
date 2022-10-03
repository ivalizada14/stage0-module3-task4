package lang.print.gaps.task4;

public class FormulaCreator {
    public static void main(String[] args) {
        int a = 2 , b = 3;
        double f = (9 * Math.pow(a, 2) - 5 * b + 2 + a - 7) * ((a + b - 4 * a * b) / 2);
        System.out.println(f);
    }
}
