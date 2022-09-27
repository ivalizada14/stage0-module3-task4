package lang.print.gaps.task4;

public class FormulaCreator {
    public static void main(String[] args) {
        int a = 1, b = 2;
        //int f = (9*a*a+5*b+2+a-7)*((a+b-4*a*b)/2);
        System.out.printf("(9*%d^2+5*%d+2+%d-7)*((%d+%d-4*%d*%d)/2)", a,b,a,a,b,a,b);
    }
}
