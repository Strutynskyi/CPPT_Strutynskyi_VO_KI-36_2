/**
 * Class Hard Disk
 * @author
 * @version
 */
public class HardDisk
{
    private double capacity;
    private String producer;

    /**
     * Constructor
     * @param capacity
     * @param producer
     */
    public HardDisk(double capacity, String producer)
    {
        this.capacity = capacity;
        this.producer = producer;
    }

    /**
     * Getter for capacity
     * @return capacity
     */
    public double getCapacity() {
        return capacity;
    }

    /**
     * Setter for capacity
     * @param capacity
     */
    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    /**
     * Getter for producer
     * @return producer
     */
    public String getProducer() {
        return producer;
    }

    /**
     * Setter for producer
     * @param producer
     */
    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "HardDisk{ " +
                "capacity = " + capacity + " mb." +
                ", producer = '" + producer + '\'' +
                '}';
    }
}

