import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Created by asd on 4/6/2018.
 */
public class MakeFeatureVector {

    public static void mainMakeFeatureVector(String add) throws IOException {

        String feature = "" + add + " ";
        Files.write(new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\featureVector.txt").toPath(),
                feature.getBytes(),
            StandardOpenOption.APPEND);


    }
}
