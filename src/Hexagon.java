public class Hexagon extends Shape {

    private double sideLength;

    public Hexagon(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double getPerimeter() {
        return 6 * sideLength;
    }

    @Override
    public double getArea() {
        return (3 * Math.sqrt(3 * Math.pow(sideLength, 2)))/ 2;
    }
}
