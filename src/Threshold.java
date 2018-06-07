import java.io.*;
import java.nio.charset.Charset;

/**
 * Created by asd on 3/21/2018.
 */
public class Threshold {

    public static void mainThreshold() throws IOException {


        String line = null;
        MakeFeatureVector makeFeatureVector = new MakeFeatureVector();



        try (FileWriter output = new FileWriter("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\Threshold_values.txt");
             InputStream fis = new FileInputStream("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\formatted_input.txt");
             InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
             BufferedReader br = new BufferedReader(isr);
        ) {


            int sum = 0;
            int count = 0;
            int threshold = 50;
            int blankLine = 0;


            while ((line = br.readLine()) != null) {

                System.out.println(line);
                /**
                 * Write the threshold value
                 */
                if(line.length() < 2) {
                    blankLine++;
                    if(sum !=0 ){
//                        String temp="" +  ((sum*1.0)/count) ;
//                        output.write(temp);
//                        output.write("\n");
//                        makeFeatureVector.mainMakeFeatureVector(temp);
//                        sum = 0;
//                        int ajaira=0;
                    }
                    if(blankLine == 2) {
                        String temp="" +  ((sum*1.0)/count) ;
                        output.write(temp);
                        output.write("\n");
                        makeFeatureVector.mainMakeFeatureVector(temp);
                        sum = 0;
                        int ajaira=0;
                        blankLine = 0;
                    }

                    continue;
                }

                String[] words = line.split(" ");

                /**
                 * Write the name of the emotion
                 */
                if(words[0].equals("#")) {
                    output.write(words[1]);
                    output.write("\n");
                    sum = 0;
                    count = 0;
                    int ajaira=0;
                    continue;

                }

                int val = Integer.parseInt(words[1]);

                if(val > threshold){
                    sum += (val-threshold);
                }

                count++;
            }
            System.out.println(count);
        }
    }
}
