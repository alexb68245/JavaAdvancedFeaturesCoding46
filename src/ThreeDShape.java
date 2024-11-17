public abstract class ThreeDShape extends Shape implements Fillable{

    @Override
    public double getPerimeter() {
        return 0;
    }

    public abstract double calculateVolume();

    @Override
    public void fill(double liquid) {
        if (liquid < calculateVolume()){
            System.out.println("Not enough liquids, there is still space");
        }else  if (liquid > calculateVolume()){
            System.out.println("Liquid exceeds maximum volume, you poured too much, it overflowed");
        }else {
            System.out.println("Filled to the brim");
        }
    }
}
