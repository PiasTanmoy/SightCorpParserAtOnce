import java.io.*;
import java.nio.charset.Charset;

/**
 * Created by asd on 4/3/2018.
 */
public class MicrosoftAzure {

    public static void mainMicrosoftAzure(String inputFileName) throws IOException {
        String line;
        String happiness="happiness,";
        String surprise="surprise,";
        String anger = "anger,";
        String disgust="disgust,";
        String fear="fear,";
        String sadness="sadness,";
        String neutral = "neutral,";
        String contempt = "contempt,";
        //String inputFileName = "input.txt";
        //FileWriter output = null;
        try (
                FileWriter output = new FileWriter("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\parsedFile.txt");
                InputStream fis = new FileInputStream("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\Microsoft\\" + inputFileName);
                InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
                BufferedReader br = new BufferedReader(isr);
        ) {
            while ((line = br.readLine()) != null) {
                // Do your thing with line
                String[] words = line.split(" ");
                int count=0;
                for (String s : words) {
                    String wordStripped = s;//.replace("/", "");

                    if (wordStripped.equals("{u'sadness':")) {
                        double x = Double.parseDouble(words[count+1].substring(0, words[count+1].length()-1));
                        double y = x*100;
                        int z = (int)Math.round(y);
                        sadness+= z;
                        sadness+= ",";
                    }
                    if (wordStripped.equals("u'neutral':")) {
                        double x = Double.parseDouble(words[count+1].substring(0, words[count+1].length()-1));
                        double y = x*100;
                        int z = (int)Math.round(y);
                        neutral+= z;
                        neutral+= ",";
                    }
                    if (wordStripped.equals("u'contempt':")) {
                        double x = Double.parseDouble(words[count+1].substring(0, words[count+1].length()-1));
                        double y = x*100;
                        int z = (int)Math.round(y);
                        contempt+= z;
                        contempt+= ",";
                    }
                    if (wordStripped.equals("u'disgust':")) {
                        double x = Double.parseDouble(words[count+1].substring(0, words[count+1].length()-1));
                        double y = x*100;
                        int z = (int)Math.round(y);
                        disgust+= z;
                        disgust+= ",";
                    }
                    if (wordStripped.equals("u'anger':")) {
                        double x = Double.parseDouble(words[count+1].substring(0, words[count+1].length()-1));
                        double y = x*100;
                        int z = (int)Math.round(y);
                        anger+= z;
                        anger+= ",";
                    }
                    if (wordStripped.equals("u'surprise':")) {
                        double x = Double.parseDouble(words[count+1].substring(0, words[count+1].length()-1));
                        double y = x*100;
                        int z = (int)Math.round(y);
                        surprise+= z;
                        surprise+= ",";
                    }
                    if (wordStripped.equals("u'fear':")) {
                        double x = Double.parseDouble(words[count+1].substring(0, words[count+1].length()-1));
                        double y = x*100;
                        int z = (int)Math.round(y);
                        fear+= z;
                        fear+= ",";
                    }
                    if (wordStripped.equals("u'happiness':")) {
                        //String temp = words[count+1].substring(0, words[count+1].length()-3);
                        double x = Double.parseDouble(words[count+1].substring(0, words[count+1].length()-3));
                        double y = x*100;
                        int z = (int)Math.round(y);
                        happiness+= z;
                        happiness+=",";
                    }

                    count++;
                }
            }
            output.write(happiness);
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
            output.write("\n");
            output.write(neutral);
            output.write("\n");
            output.write(contempt);
            System.out.println("Done!!!");

        }
    }
}
