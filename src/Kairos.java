import java.io.*;
import java.nio.charset.Charset;

/**
 * Created by asd on 4/3/2018.
 */
//u'emotion': {u'sadness': 0.0, u'neutral': 1.0, u'contempt': 0.0, u'disgust': 0.0, u'anger': 0.0, u'surprise': 0.0, u'fear': 0.0, u'happiness': 0.0}},
public class Kairos {
    //u'emotions': {u'joy': 0, u'sadness': 0, u'disgust': 0, u'anger': 0, u'surprise': 0, u'fear': 0},

    public static void mainKairos(String inputFileName) throws IOException {
        String line;
        String joy="joy,";
        String surprise="surprise,";
        String anger = "anger,";
        String disgust="disgust,";
        String fear="fear,";
        String sadness="sadness,";
        String neutral = "neutral,";
        String contempt = "contempt,";
        //String inputFileName = "kS070_001.doc";
        //FileWriter output = null;
        String temptemp;
        try (
                FileWriter output = new FileWriter("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\parsedFile.txt");
                InputStream fis = new FileInputStream("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\Kairos\\" + inputFileName);
                InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
                BufferedReader br = new BufferedReader(isr)

        ) {
            while ((line = br.readLine()) != null) {
                // Do your thing with line
                String[] words = line.split(" ");
                int count=0;
                for (String s : words) {
                    String wordStripped = s;//.replace("/", "");
                    temptemp = "";
                    if (wordStripped.equals("{u'joy':")) {
                        double x = Double.parseDouble(words[count+1].substring(0, words[count+1].length()-1));
                        double y = x*1;
                        int z = (int)Math.round(y);
                        joy+= z;
                        joy+= ",";
                        temptemp = "sadness";
                    }
                    if (wordStripped.equals("u'sadness':")) {
                        double x = Double.parseDouble(words[count+1].substring(0, words[count+1].length()-1));
                        double y = x*1;
                        int z = (int)Math.round(y);
                        sadness+= z;
                        sadness+= ",";
                        temptemp = "neutral";
                    }
                    if (wordStripped.equals("u'disgust':")) {
                        double x = Double.parseDouble(words[count+1].substring(0, words[count+1].length()-1));
                        double y = x*1;
                        int z = (int)Math.round(y);
                        disgust+= z;
                        disgust+= ",";
                        temptemp = "disgust";
                    }
                    if (wordStripped.equals("u'anger':")) {
                        double x = Double.parseDouble(words[count+1].substring(0, words[count+1].length()-1));
                        double y = x*1;
                        int z = (int)Math.round(y);
                        anger+= z;
                        anger+= ",";
                        temptemp = "anger";
                    }
                    if (wordStripped.equals("u'surprise':")) {
                        double x = Double.parseDouble(words[count+1].substring(0, words[count+1].length()-1));
                        double y = x*1;
                        int z = (int)Math.round(y);
                        surprise+= z;
                        surprise+= ",";
                        temptemp = "surprise";
                    }
                    if (wordStripped.equals("u'fear':")) {
                        double x = Double.parseDouble(words[count+1].substring(0, words[count+1].length()-2));
                        double y = x*1;
                        int z = (int)Math.round(y);
                        fear+= z;
                        fear+= ",";
                        temptemp = "fear";
                    }

                    count++;
                }
            }
            output.write(joy);
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
            System.out.println("Done!!!");

        }
    }
}
