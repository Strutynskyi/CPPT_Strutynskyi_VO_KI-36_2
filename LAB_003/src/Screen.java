/**
 * Class Screen
 * @author
 * @version 1.0
 */
public class Screen
{
    private double diagonal;
    private String expansion;

    /**
     * Constructor
     * @param diagonal
     * @param expansion
     */
    public Screen(double diagonal, String expansion) {
        this.diagonal = diagonal;
        this.expansion = expansion;
    }

    /**
     * Getter for Diagonal
     * @return diagonal
     */
    public double getDiagonal() {
        return diagonal;
    }

    /**
     * Setter for diagonal
     * @param diagonal
     */
    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    /**
     * Getter for expansion
     * @return
     */
    public String getExpansion() {
        return expansion;
    }

    /**
     * Setter for expansion
     * @param expansion
     */
    public void setExpansion(String expansion) {
        this.expansion = expansion;
    }

    @Override
    public String toString() {
        return "Screen{ " +
                "diagonal = " + diagonal +
                ", expansion = '" + expansion + '\'' +
                '}';
    }
}
