import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReversedFile {
    public static void main(String[] args) {
        String name = "hello.txt";
        File file= new File("/Users/admin/IdeaProjects/JavaAdvancedFeaturesCoding46/src/hello.txt");

        try {
            String fileContents = Files.readString(file.toPath());
            int indexOfDot = fileContents.indexOf(".");
            String fileName = name.substring( 0, indexOfDot + 1);
            String fileExtension = file.getName().substring(indexOfDot + 1);


            StringBuilder reversedContent = new StringBuilder(fileContents);
            reversedContent.reverse();
            StringBuilder reversedFileName = new StringBuilder(fileName);
            reversedFileName.reverse();

            Files.writeString(Path.of(reversedFileName + fileExtension), reversedContent);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



}
