import java.io.*;
import java.nio.charset.Charset;

/**
 * Created by asd on 3/20/2018.
 */
public class SightCorp {

    public static void mainParser2(String inputFileName) throws IOException {
        String line;
        String happy="happy,";
        String surprise="surprise,";
        String anger = "anger,";
        String disgust="disgust,";
        String fear="fear,";
        String sadness="sadness,";
        //String inputFileName = "input.txt";
        //FileWriter output = null;
        try (
                FileWriter output = new FileWriter("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\parsedFile.txt");
                InputStream fis = new FileInputStream("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\SightCorp\\" + inputFileName);
                InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
                BufferedReader br = new BufferedReader(isr);
                ) {
            while ((line = br.readLine()) != null) {
                // Do your thing with line
                //System.out.println(line);
                String[] words = line.split(" ");
                int count=0;
                for (String s : words) {
                    System.out.println(s);
                    String wordStripped = s.replace("/", "");

                    if (wordStripped.equals("\"emotions\":")) {
                        System.out.println("Got it");

                        happy = happy + words[count+3];
                        surprise+= words[count+5];
                        anger+= words[count+7];
                        disgust+= words[count+9];
                        fear+= words[count+11];
                        sadness+= words[count+13];
                        sadness+=",";
                        //System.out.println(happy);
                    }
                    count++;
                }
            }
            output.write(happy);
            output.write("\n");
            output.write(surprise);
            output.write("\n");
            output.write(anger);
            output.write("\n");
            output.write(disgust);
            output.write("\n");
            output.write(fear);
            output.write("\n");
            output.write(sadness);



            System.out.println(happy);
            System.out.println(surprise);
            System.out.println(anger);
            System.out.println(disgust);
            System.out.println(fear);
            System.out.println(sadness);


        }
    }
}
