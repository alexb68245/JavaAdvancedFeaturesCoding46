import java.util.Collection;

public class Joiner<T> {

    private String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String join(T... items) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < items.length; i++) {
            sb.append(items[i]);
            if (i < items.length - 1) {
                sb.append(separator);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Joiner<Integer> joiner = new Joiner("-");
        System.out.println(joiner.join(1, 2,3));

        Joiner<String> stringJoiner = new Joiner("/");
        System.out.println(stringJoiner.join("gejahsd", "hxsd", "dgfgh"));

        Joiner<Character> characterJoiner = new Joiner("|");
        System.out.println(characterJoiner.join('a', 'b', 'c'));

        Joiner<Computer> computerJoiner = new Joiner("|");
        System.out.println(computerJoiner.join
                (new Computer("p","g", "c", "m", 1),
                        new Computer("p","g", "c", "m", 1)));
    }
}
