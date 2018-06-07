import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

/**
 * Created by asd on 4/5/2018.
 */
public class MoveFiles {

    public static void mainMoveFiles(String name) throws IOException {

        String fileName = name.substring(0, name.indexOf("."));

//        Files.move(new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\Average.txt").toPath(),
//                new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\SightCorp\\"+ fileName + "\\Average.txt").toPath(),
//                StandardCopyOption.REPLACE_EXISTING);
//
//        Files.move(new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\formatted_input.txt").toPath(),
//                new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\SightCorp\\"+ fileName + "\\formatted_input.txt").toPath(),
//                StandardCopyOption.REPLACE_EXISTING);
//
//        Files.move(new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\MinMax.txt").toPath(),
//                new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\SightCorp\\"+ fileName + "\\MinMax.txt").toPath(),
//                StandardCopyOption.REPLACE_EXISTING);
//
//        Files.move(new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\parsedFile.txt").toPath(),
//                new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\SightCorp\\"+ fileName + "\\parsedFile.txt").toPath(),
//                StandardCopyOption.REPLACE_EXISTING);
//
//        Files.move(new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\python_array.txt").toPath(),
//                new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\SightCorp\\"+ fileName + "\\python_array.txt").toPath(),
//                StandardCopyOption.REPLACE_EXISTING);
//
//        Files.move(new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\python_array_diff.txt").toPath(),
//                new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\SightCorp\\"+ fileName + "\\python_array_diff.txt").toPath(),
//                StandardCopyOption.REPLACE_EXISTING);
//
//        Files.move(new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\python_array_SD.txt").toPath(),
//                new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\SightCorp\\"+ fileName + "\\python_array_SD.txt").toPath(),
//                StandardCopyOption.REPLACE_EXISTING);
//
//        Files.move(new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\Threshold_bin_values.txt").toPath(),
//                new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\SightCorp\\"+ fileName + "\\Threshold_bin_values.txt").toPath(),
//                StandardCopyOption.REPLACE_EXISTING);
//
//        Files.move(new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\Threshold_values.txt").toPath(),
//                new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\SightCorp\\"+ fileName + "\\Threshold_values.txt").toPath(),
//                StandardCopyOption.REPLACE_EXISTING);
//
//        Files.move(new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\Average_diff.txt").toPath(),
//                new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\SightCorp\\"+ fileName + "\\Average_diff.txt").toPath(),
//                StandardCopyOption.REPLACE_EXISTING);
//
//        Files.move(new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\Average_diff_mod.txt").toPath(),
//                new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\SightCorp\\"+ fileName + "\\Average_diff_mode.txt").toPath(),
//                StandardCopyOption.REPLACE_EXISTING);
//
//        Files.move(new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\MaxMin_diff.txt").toPath(),
//                new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\SightCorp\\"+ fileName + "\\MaxMin_diff.txt").toPath(),
//                StandardCopyOption.REPLACE_EXISTING);
//
//        Files.move(new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\SD_diff.txt").toPath(),
//                new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\SightCorp\\"+ fileName + "\\SD_diff.txt").toPath(),
//                StandardCopyOption.REPLACE_EXISTING);
//
//
//        Files.move(new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\test.py").toPath(),
//                new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\SightCorp\\"+ fileName + "\\test.py").toPath(),
//                StandardCopyOption.REPLACE_EXISTING);
//
//        Files.move(new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\testDiff.py").toPath(),
//                new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\SightCorp\\"+ fileName + "\\testDiff.py").toPath(),
//                StandardCopyOption.REPLACE_EXISTING);
//
//        Files.move(new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\movingAvg.txt").toPath(),
//                new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\SightCorp\\"+ fileName + "\\movingAvg.txt").toPath(),
//                StandardCopyOption.REPLACE_EXISTING);


        /**
         * Microsoft
         */

        Files.move(new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\Average.txt").toPath(),
                new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\Kairos\\"+ fileName + "\\Average.txt").toPath(),
                StandardCopyOption.REPLACE_EXISTING);

        Files.move(new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\formatted_input.txt").toPath(),
                new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\Kairos\\"+ fileName + "\\formatted_input.txt").toPath(),
                StandardCopyOption.REPLACE_EXISTING);

        Files.move(new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\MinMax.txt").toPath(),
                new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\Kairos\\"+ fileName + "\\MinMax.txt").toPath(),
                StandardCopyOption.REPLACE_EXISTING);

        Files.move(new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\parsedFile.txt").toPath(),
                new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\Kairos\\"+ fileName + "\\parsedFile.txt").toPath(),
                StandardCopyOption.REPLACE_EXISTING);

        Files.move(new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\python_array.txt").toPath(),
                new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\Kairos\\"+ fileName + "\\python_array.txt").toPath(),
                StandardCopyOption.REPLACE_EXISTING);

        Files.move(new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\python_array_diff.txt").toPath(),
                new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\Kairos\\"+ fileName + "\\python_array_diff.txt").toPath(),
                StandardCopyOption.REPLACE_EXISTING);

        Files.move(new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\python_array_SD.txt").toPath(),
                new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\Kairos\\"+ fileName + "\\python_array_SD.txt").toPath(),
                StandardCopyOption.REPLACE_EXISTING);

        Files.move(new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\Threshold_bin_values.txt").toPath(),
                new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\Kairos\\"+ fileName + "\\Threshold_bin_values.txt").toPath(),
                StandardCopyOption.REPLACE_EXISTING);

        Files.move(new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\Threshold_values.txt").toPath(),
                new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\Kairos\\"+ fileName + "\\Threshold_values.txt").toPath(),
                StandardCopyOption.REPLACE_EXISTING);

        Files.move(new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\Average_diff.txt").toPath(),
                new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\Kairos\\"+ fileName + "\\Average_diff.txt").toPath(),
                StandardCopyOption.REPLACE_EXISTING);

        Files.move(new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\Average_diff_mod.txt").toPath(),
                new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\Kairos\\"+ fileName + "\\Average_diff_mode.txt").toPath(),
                StandardCopyOption.REPLACE_EXISTING);

        Files.move(new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\MaxMin_diff.txt").toPath(),
                new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\Kairos\\"+ fileName + "\\MaxMin_diff.txt").toPath(),
                StandardCopyOption.REPLACE_EXISTING);

        Files.move(new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\SD_diff.txt").toPath(),
                new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\Kairos\\"+ fileName + "\\SD_diff.txt").toPath(),
                StandardCopyOption.REPLACE_EXISTING);


        Files.move(new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\test.py").toPath(),
                new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\Kairos\\"+ fileName + "\\test.py").toPath(),
                StandardCopyOption.REPLACE_EXISTING);

        Files.move(new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\testDiff.py").toPath(),
                new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\Kairos\\"+ fileName + "\\testDiff.py").toPath(),
                StandardCopyOption.REPLACE_EXISTING);

        Files.move(new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\movingAvg.txt").toPath(),
                new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\Kairos\\"+ fileName + "\\movingAvg.txt").toPath(),
                StandardCopyOption.REPLACE_EXISTING);






    }
}
