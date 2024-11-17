import java.util.Objects;

public class Computer {

    private String processor, graphicsCard, company, model;
    private int ram;

    public Computer(String processor, String graphicsCard, String company, String model, int ram){
        this.processor = processor;
        this.graphicsCard = graphicsCard;
        this.company = company;
        this.model = model;
        this.ram = ram;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return ram == computer.ram && Objects.equals(processor, computer.processor) && Objects.equals(graphicsCard, computer.graphicsCard) && Objects.equals(company, computer.company) && Objects.equals(model, computer.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processor, graphicsCard, company, model, ram);
    }

    @Override
    public String toString() {
        return "Computer has processor: " + processor +
                ", graphicsCard: " + graphicsCard
                + ", ram: " + ram
                + ", is from: " + company
                + ", model: " + model;
    }

    public static void main(String[] args) {
        Computer computer = new Computer("computer", "graphicsCard", "HP", "notebook", 16);
        //System.out.println(computer);
        Computer another = new Computer("sdfgh", "graphicsCard", "HP", "notebook", 16);
        //System.out.println(computer.equals(another));
        //System.out.println(computer.hashCode());
    }
}
