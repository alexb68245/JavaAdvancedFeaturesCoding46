
import java.util.List;

public class Circle implements Movable,Resizable{
    public Point2D center;
    public Point2D point;

    public Circle(Point2D center, Point2D point){
        this.center=center;
        this.point=point;
    }



    public double getRadius(){
        return Math.sqrt(Math.pow(center.getX()- point.getX(),2) + Math.pow(center.getY()-point.getY(),2));
    }
    public double getPerimeter(){
        return 2*Math.PI*getRadius();
    }
    public double getArea(){
        return Math.PI*Math.pow(getRadius(),2);
    }
    public List<Point2D> getSlicePoints(){
        return null;
    }
    //Exercise 10
    @Override
    public void move(MoveDirection moveDirection){
        center.move(moveDirection);
        point.move(moveDirection);
    }
    public boolean validateOffset(MoveDirection moveDirection){
        Point2D originalCenter=this.center;
        Point2D originalPoint=this.point;
        double radius=this.getRadius();

        this.move(moveDirection);
        boolean isValid=(getRadius()==radius);

        this.point=originalPoint;
        this.center=originalCenter;

        return isValid;

    }

    //Exercise 11
    @Override
    public void resize(double resizeFactor){
        point.setX(this.point.getX() * resizeFactor);
        point.setY(this.point.getY() * resizeFactor);
    }

    public boolean resizeValidation(double resizeFactor){
        Point2D originalCenter=this.center;
        Point2D originalPoint=this.point;
        double radius=getRadius();

        resize(resizeFactor);
        boolean isValid=(radius * resizeFactor)==getRadius();
        setCenter(originalCenter);
        setPoint(originalPoint);
        return isValid;
    }

    public Point2D getCenter(){
        return center;
    }
    public Point2D getPoint(){
        return point;
    }
    public void setCenter(Point2D center){
        this.center=center;
    }
    public void setPoint(Point2D point){
        this.point=point;
    }


    public static void main(String[] args) {
        Point2D center=new Point2D(6,6);
        Point2D point=new Point2D(9,4);
        Circle circle=new Circle(center,point);
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        circle.move(new MoveDirection(3,2));
        System.out.println("Perimeter after move: " + circle.getPerimeter());
        System.out.println(circle.validateOffset(new MoveDirection(3,2)));

        circle.resize(0.5);
        System.out.println("Perimeter after resize: " + circle.getPerimeter());

    }
}
