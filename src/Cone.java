public class Cone extends ThreeDShape{

    private double radius, height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return (Math.PI * Math.pow(radius, 2)) * (height / 3);
    }

    @Override
    public double getArea() {
        return (Math.PI * radius) * Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
    }


}
