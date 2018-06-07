/*

public class Projectbig {

    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
*/

import java.io.*;
import java.nio.charset.Charset;

/**
 * Created by asd on 3/20/2018.
 */
public class SkyBio {
    public static void mainSkyBio(String inputFileName) throws IOException {
        String line;
        String[] str = {"neutral_mood", "anger", "disgust", "fear", "happiness", "sadness", "surprise"};
        //int g = 0;
        String string_mix = "";
        //String inputFileName = "input.txt";

        for (String string : str) {

        try (
                FileWriter output = new FileWriter("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\parsedFile.txt");  //("C:\\Users\\asd\\IdeaProjects\\Test\\src\\values.txt");
                InputStream fis = new FileInputStream ("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\SKyfiles\\" + inputFileName);   //("C:\\Users\\asd\\IdeaProjects\\Test\\src\\sightcorp.txt");
                InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
                BufferedReader br = new BufferedReader(isr);
                ) {
        
     
        String m = string;
        m += ",";
        while ((line = br.readLine()) != null) {

        // Do your thing with line
            //System.out.println(line);
            String[] words = line.split("},");

            int count=0;
            for (String s : words) {
                System.out.println(count++ +" " + s);
            }
            //int count=0;
            for (String s : words) {
                System.out.println("s " + s);
                System.out.println("string "+string);
                String wordStripped = null;
                if(s.length() != 0) {
                    wordStripped = s.substring(1, (string.length()) + 1);


                    if (wordStripped.equals(string)) {
                        int idx = s.lastIndexOf(":");
                        if (string.equals("surprise"))
                            m += s.substring(idx + 1, s.length() - 1);
                        else m += s.substring(idx + 1);
                        m += ",";
                    }
                }
            }
        }
        string_mix += m;
        string_mix += "\n";
        //string_mix += ",";
        System.out.println(m);
        output.write(string_mix);
        }
    }
    }
}
