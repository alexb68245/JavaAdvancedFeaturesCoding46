public class MeasurementConverter {

    public static double convert(int value, ConversionType conversionType){
        double result = 0;
        switch (conversionType){
            case METERS_TO_YARDS:
                result = (value * ConversionType.METERS_TO_YARDS.getConverter());
                break;
            case YARDS_TO_METERS:
                result = (value * ConversionType.YARDS_TO_METERS.getConverter());
                break;
            case CENTIMETERS_TO_ICHES:
                result = (value * ConversionType.CENTIMETERS_TO_ICHES.getConverter());
                break;
            case INCHES_TO_CENTIMETERS:
                result = (value * ConversionType.INCHES_TO_CENTIMETERS.getConverter());
                break;
            case KILOMETERS_TO_MILES:
                result = (value * ConversionType.KILOMETERS_TO_MILES.getConverter());
                break;
            case MILES_TO_KILOMETERS:
                result = (value * ConversionType.MILES_TO_KILOMETERS.getConverter());
                break;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(convert(10, ConversionType.METERS_TO_YARDS));

    }
}
