import java.io.*;
import java.nio.charset.Charset;

/**
 * Created by asd on 3/21/2018.
 */
public class MinMax {
    public static void mainMinMax() throws IOException {


        String line = null;
        MakeFeatureVector makeFeatureVector = new MakeFeatureVector();


        try (FileWriter output = new FileWriter("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\MinMax.txt");
             InputStream fis = new FileInputStream("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\formatted_input.txt");
             InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
             BufferedReader br = new BufferedReader(isr);
        ) {


            int sum = 0;
            int count = 0;
            int threshold = 50;
            int max = 0;
            int min = 999;
            int blankLine = 0;


            while ((line = br.readLine()) != null) {

                System.out.println(line);

                /**
                 * Write MIN and MAX value
                 */
                if(line.length() < 2) {
                    blankLine++;
                    if(blankLine == 2 ){
                        String temp_min="Min: " +  min ;
                        String temp_max="Max: " +  max ;
                        output.write(temp_min);
                        output.write("\n");
                        output.write(temp_max);
                        output.write("\n");

                        makeFeatureVector.mainMakeFeatureVector(""+min);
                        makeFeatureVector.mainMakeFeatureVector(""+max);

                        sum = 0;
                        int ajaira;
                        max = 0;
                        min = 999;
                        blankLine=0;
                    }
                    continue;
                }

                String[] words = line.split(" ");

                /***
                 * Name of the emotion
                 */

                if(words[0].equals("#")) {
                    output.write(words[1]);
                    output.write("\n");
                    sum = 0;
                    count = 0;
                    String ajaira;
                    continue;

                }


                /**
                 * Calculate MAX and MIN
                 */
                int val = Integer.parseInt(words[1]);
                sum+=val;
                if(val < min) {
                    min = val;
                }
                if(val > max) {
                    max = val;
                }

                count++;
            }
            System.out.println(count);
        }
    }
}
