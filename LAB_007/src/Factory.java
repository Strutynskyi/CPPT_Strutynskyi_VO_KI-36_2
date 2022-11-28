public class Factory implements Building
{
    private double square;
    private String address;
    private String companyName;

    public Factory(double square, String address, String companyName)
    {
        this.square = square;
        this.address = address;
        this.companyName = companyName;
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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public double GetSquare() {
        return square;
    }

    @Override
    public void PrintInfo() {
        System.out.println("Factory { square - " + square + "; address - " + address + "; company name " +  companyName + ";}");
    }
}
