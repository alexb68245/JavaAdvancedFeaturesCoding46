public class Parcel implements Validator {

    private int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    private boolean isExpress;

    public Parcel(int xLength, int zLength, int yLength, float weight) {
        this.xLength = xLength;
        this.zLength = zLength;
        this.yLength = yLength;
        this.weight = weight;
    }

    @Override
    public boolean validate(Parcel input) {
        boolean isValid = true;
        if (xLength < 30) {
            System.out.println("x is less than 30");
            isValid = false;
        }
        if (yLength < 30){
            System.out.println("y is less than 30");
            isValid = false;
        }
        if (zLength < 30){
            System.out.println("z is less than 30");
            isValid = false;
        }

        if (!((xLength + yLength + zLength) >= 300)){
            System.out.println("The sum is " + (xLength + yLength + zLength) + " and does not exceed 300");
        }else {
            System.out.println("The sum is " + (xLength + yLength + zLength) + " and exceed 300");
            isValid = false;
        }


        if (weight > 30.0){
            isExpress = false;
            System.out.println("The parcel is not express");
        }else if (weight < 15.0){
            isExpress = true;
            System.out.println("The parcel is express");
        }else {
            System.out.println("Maybe");
        }

        return isValid;
    }

    public static void main(String[] args) {
        Parcel parcel = new Parcel(50, 90, 83, 33.4f);
        System.out.println("Is parcel valid? " + parcel.validate(parcel));
    }
}
