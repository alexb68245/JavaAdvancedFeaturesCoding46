import java.util.ArrayList;

public class CustomArrayList<E> extends ArrayList<E> {

    public ArrayList<E> getEveryNthElement(int index, int skip) {
        ArrayList<E> newList = new ArrayList<>();
        if (index < 0 || index > size() - 1 || ((index + skip) > size() - 1)) {
            throw new IndexOutOfBoundsException();
        }else {
            for (int i = index; i < size(); i += skip) {
                newList.add(get(i));
            }
        }
        return newList;
    }


    public static void main(String[] args) {
        CustomArrayList<Integer> list = new CustomArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        System.out.println(list.getEveryNthElement(3,2));
    }
}
