import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

/**
 * Created by asd on 3/21/2018.
 */
public class Average {

    public static void mainAverage() throws IOException {


        String line = null;
        MakeFeatureVector makeFeatureVector = new MakeFeatureVector();



        try (FileWriter output = new FileWriter("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\Average.txt");
             InputStream fis = new FileInputStream("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\formatted_input.txt");
             InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
             BufferedReader br = new BufferedReader(isr);
        ) {


            //(1, 1), (2, 4), (3, 1), (9, 3)
            int sum = 0;
            int count = 0;
            int blankLine = 0;
            while ((line = br.readLine()) != null) {
                // Do your thing with line
                System.out.println(line);
                //if(line.equals("\n")) continue;
                /**
                 * Average calculation and write
                 */
                if(line.length() < 2) {
                    blankLine++;
                    if(blankLine == 2 ){
                        String temp="" + ( (sum*1.0) / count );
                        output.write(temp);
                        output.write("\n");
                        makeFeatureVector.mainMakeFeatureVector(temp);
                        sum = 0;
                        blankLine = 0;
                    }
                    continue;
                }

                String[] words = line.split(" ");

                /**
                 * This is the name fo the emotion
                 */
                if(words[0].equals("#")) {
                    output.write(words[1]);
                    output.write("\n");
                    sum = 0;
                    count = 0;
                    continue;
                }
                sum += Integer.parseInt(words[1]);
                count++;
            }
            System.out.println(count);
        }

    }
}
