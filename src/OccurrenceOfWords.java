import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class OccurrenceOfWords {
    public static void main(String[] args){
        File file= new File("/Users/admin/IdeaProjects/JavaAdvancedFeaturesCoding46/src/hello.txt");
        try {
            String fileContent = Files.readString(file.toPath());
            String[] words = fileContent.toLowerCase().replaceAll(" [^a-zA-Z0-9! ]", "").split("\\s+");

            Map<String, Integer> map = new HashMap<>();
            for (String word : words) {
                map.put(word, map.getOrDefault(map.get(word), 0) + 1);
            }

            Files.writeString(Path.of("count.txt"), map.toString());

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
