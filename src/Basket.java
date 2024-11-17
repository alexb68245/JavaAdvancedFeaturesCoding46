import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Basket {

    private String[] basketItems = new String[10];
    private int count = 0;

    public Basket(String[] basketItems) {
        this.basketItems = basketItems;
    }

    public void addItem(String item) throws BasketFullException{
        try {
            basketItems[count] = item;
            count++;
        }catch (BasketFullException e){
            throw new BasketFullException( e.getMessage());
        }
    }

    public void addWithoutTryCatch(String item) throws BasketFullException{
        if (count == basketItems.length) {
            throw new BasketFullException("Basket is full");
        }else {
            basketItems[count] = item;
        }
    }
    public void removeItem(String item) throws BasketEmptyException{
        try {
            Arrays.stream(basketItems).toList().remove(item);
        }catch (BasketEmptyException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        String[] items = new String[10];
        Basket basket = new Basket(items);
        basket.addWithoutTryCatch("basket");
        basket.addWithoutTryCatch("basket");
        basket.addWithoutTryCatch("basket");
        basket.addWithoutTryCatch("basket");
        basket.addWithoutTryCatch("basket");
        basket.addWithoutTryCatch("basket");
        basket.addWithoutTryCatch("basket");
        basket.addWithoutTryCatch("basket");
        basket.addWithoutTryCatch("basket");
        basket.addWithoutTryCatch("basket");
        basket.addWithoutTryCatch("basket");
        basket.addWithoutTryCatch("basket");

    }
}
