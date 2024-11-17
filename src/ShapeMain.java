public class ShapeMain {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,7);
        Triangle triangle = new Triangle(8,9,5);
        Hexagon hexagon = new Hexagon(4);
/*
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
        System.out.println("Triangle perimeter: " + triangle.getPerimeter());
        System.out.println("Hexagon perimeter: " + hexagon.getPerimeter());

        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Triangle area: " + triangle.getArea());
        System.out.println("Hexagon area: " + hexagon.getArea());

 */

        Cone cone = new Cone(5,6);
        Cube cube = new Cube(9);
/*
        System.out.println("Area of cone: " + cone.getArea());
        System.out.println("Perimeter of cone: " + cone.getPerimeter());

 */
        System.out.println("Volume of cone: " + cone.calculateVolume());
/*
        System.out.println("Area of cube: " + cube.getArea());
        System.out.println("Perimeter of cube: " + cube.getPerimeter());

 */
        System.out.println("Volume of cube: " + cube.calculateVolume());

        cone.fill(600);
        cube.fill(600);

    }
}
