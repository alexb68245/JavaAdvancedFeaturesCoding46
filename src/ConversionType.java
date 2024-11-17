public enum ConversionType {
    METERS_TO_YARDS(1.09),
    YARDS_TO_METERS(0.914),
    CENTIMETERS_TO_ICHES(3.937),
    INCHES_TO_CENTIMETERS(2.54),
    KILOMETERS_TO_MILES(0.621),
    MILES_TO_KILOMETERS(1.609);

    private final double converter;

    ConversionType(double converter) {
        this.converter = converter;
    }

    public double getConverter() {
        return converter;
    }

}
