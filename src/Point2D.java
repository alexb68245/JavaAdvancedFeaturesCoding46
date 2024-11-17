
public class Point2D implements Movable{
    private double x;
    private double y;

    public Point2D(){
        this(0,0);
    }
    public Point2D(double x,double y){
        this.x=x;
        this.y=y;
    }

    @Override
    public void move(MoveDirection moveDirection){
        this.x+=moveDirection.getX();
        this.y+=moveDirection.getY();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
