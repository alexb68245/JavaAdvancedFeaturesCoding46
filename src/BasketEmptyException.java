public class BasketEmptyException extends IndexOutOfBoundsException{

    public String message;

    public BasketEmptyException(String message){
        super(message);
    }

    @Override
    public String getMessage() {
        return "Basket is empty";
    }

}
