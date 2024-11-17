public class Cube extends ThreeDShape{

    private double side;

    public Cube(double side){
        this.side = side;
    }

    @Override
    public double calculateVolume() {
        return Math.pow(side, 3);
    }

    @Override
    public double getArea() {
        return 6 * Math.pow(side, 2);
    }


}
