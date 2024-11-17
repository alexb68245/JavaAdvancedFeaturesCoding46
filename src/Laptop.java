import java.util.Objects;

public class Laptop extends Computer{

    private String battery;

    public Laptop(String processor, String graphicsCard, String company, String model, int ram, String battery) {
        super(processor, graphicsCard, company, model, ram);
        this.battery = battery;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(getGraphicsCard(), laptop.getGraphicsCard()) && Objects.equals(getProcessor(), laptop.getProcessor()) && Objects.equals(getCompany(), laptop.getCompany()) && Objects.equals(getModel(), laptop.getModel()) && Objects.equals(getRam(), getRam()) && Objects.equals(battery, laptop.battery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), battery);
    }

    @Override
    public String toString() {
        return "Laptop has processor: " + getProcessor()
                + ", graphicsCard: " + getGraphicsCard()
                + ", ram: " + getRam()
                + " and battery: " + battery
                + ", is from: " + getCompany()
                +", model: " + getModel();
    }

    public static void main(String[] args) {
        Laptop laptop = new Laptop("laptop", "graphicsCard", "HP", "notebook", 16, "battery");
        System.out.println(laptop);

    }
}
