public class Main
{
    public static void main(String[] args)
    {
        LandPlot<? super Building> landPlot = new LandPlot<>();

        landPlot.AddItem(new House(56.7, "Dfdfddf"));
        landPlot.AddItem(new House(12, "Dfdfddf"));
        landPlot.AddItem(new Factory(521, "Dfdfddf", "fefe"));
        landPlot.AddItem(new Factory(23, "Dfdfddf", "efefe"));
        landPlot.AddItem(new House(433, "Dfdfddf"));
        landPlot.AddItem(new Factory(43, "Dfdfddf", "efgtrgr"));
        landPlot.AddItem(new House(5435, "Dfdfddf"));
        landPlot.AddItem(new Factory(511, "Dfdfddf", "grgrgr"));

        System.out.println("Min element is: " );
        landPlot.FindMin().PrintInfo();
    }
}