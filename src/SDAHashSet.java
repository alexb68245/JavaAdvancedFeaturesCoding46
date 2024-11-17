import java.util.HashSet;

public class SDAHashSet<E> extends HashSet<E> {

    public SDAHashSet(){
        super();
    }

    @Override
    public boolean add(E e) {
        return super.add(e);
    }

    @Override
    public boolean remove(Object o) {
        return super.remove(o);
    }

    @Override
    public int size() {
        return super.size();
    }

    @Override
    public boolean contains(Object o){
        return super.contains(o);
    }

    @Override
    public void clear(){
        super.clear();
    }

    public static void main(String[] args) {
        SDAHashSet<String> sdaSet = new SDAHashSet<>();
        sdaSet.add("A");
        sdaSet.add("B");
        sdaSet.add("C");
        System.out.println(sdaSet.contains("A"));
        System.out.println(sdaSet.size());
        sdaSet.remove("B");
        System.out.println(sdaSet.size());
        sdaSet.clear();
        System.out.println(sdaSet.size());
    }
}
