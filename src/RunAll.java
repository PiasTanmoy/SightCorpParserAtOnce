import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by asd on 4/5/2018.
 */
public class RunAll {
    public static void main(String[] args) throws IOException, InterruptedException {

        PrintWriter writer = new PrintWriter("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\featureVector.txt",
                "UTF-8");
        writer.print("");
        Thread.sleep(1000);

        MakeFeatureVector makeFeatureVector = new MakeFeatureVector();

        Run run = new Run();

       // File folder = new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\SightCorp");
        //File folder = new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\Microsoft");
        //File folder = new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\SKyfiles");
        File folder = new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\Kairos");
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i <  listOfFiles.length ; i++) {

            PrintWriter writer2 = new PrintWriter("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\movingAvg.txt",
                    "UTF-8");
            writer2.print("");
            writer2.close();
            Thread.sleep(1000);

            if (listOfFiles[i].isFile()) {
                String fileName = listOfFiles[i].getName();
                System.out.println("File " + fileName);

                String dir = fileName.substring(0, fileName.indexOf("."));
                //new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\SightCorp\\" + dir).mkdirs();
                //new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\Microsoft\\" + dir).mkdirs();
                //new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\SKyfiles\\" + dir).mkdirs();
                new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\Kairos\\" + dir).mkdirs();
                Thread.sleep(1000);
                run.mainRun(fileName);

                Thread.sleep(1000);
                //writer.println("\n");
                makeFeatureVector.mainMakeFeatureVector("\n");
                break;
            }
            else if (listOfFiles[i].isDirectory()) {
                System.out.println("Directory " + listOfFiles[i].getName());
            }
        }
    }
}
