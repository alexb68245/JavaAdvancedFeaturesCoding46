public class BasketFullException extends IndexOutOfBoundsException {

    public String message;

    public BasketFullException(String message){
        super(message);
    }


    @Override
    public String getMessage() {
        return "Basket full";
    }
}
