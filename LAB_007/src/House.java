public class House implements Building
{
    private double square;
    private String address;


    public House(double square, String address) {
        this.square = square;
        this.address = address;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public double GetSquare() {
        return square;
    }

    @Override
    public void PrintInfo() {
        System.out.println("House { square - " + square + "; address - " + address + "; }");
    }
}
