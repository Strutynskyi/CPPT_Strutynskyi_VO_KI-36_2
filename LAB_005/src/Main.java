public class EquationsApp {
    public static void main(String[] args) {
        CalculateTheEquationInterface calc = new CalculateTheEquation();
        System.out.println("  y=7x/tg(2x-4)    = " + calc.doCalculation(100));
        System.out.println("  y=7x/tg(2x-4)    = " + calc.doCalculation(40));
        System.out.println("  y=7x/tg(2x-4)    = " + calc.doCalculation(-333));

        System.out.println("  y=7x/tg(2x-4)    = " + calc.doCalculationWithInputInside());
    }
}