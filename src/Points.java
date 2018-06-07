import java.io.*;
import java.nio.charset.Charset;

/**
 * Created by asd on 3/20/2018.
 */
public class Points {


    public static void mainPoints() throws IOException {
//        FileWriter output;
//        InputStream fis;
//        InputStreamReader isr;
//        BufferedReader br;

        String line = null;
        String happy="happy,";
        String surprise="surprise,";
        String anger = "anger,";
        String disgust="disgust,";
        String fear="fear,";
        String sadness="sadness,";

        try (FileWriter output = new FileWriter("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\formatted_input.txt");
             InputStream fis = new FileInputStream("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\parsedFile.txt");
             InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
             BufferedReader br = new BufferedReader(isr);
             ) {



            while ((line = br.readLine()) != null) {
                // Do your thing with line
                System.out.println(line);


                String[] words = line.split(",");

                //int count=0;
                String temp="";
                output.write("# " + words[0]+"\n");
                for (int x=1; x<words.length; x++) {
                    System.out.println(words[x]);
                    //String wordStripped = s.replace("/", "");


                    temp = temp + x + " " + words[x] + "\n";
                    output.write(temp);
                    temp = "";
                    System.out.println(words[x]);
                }
                output.write("\n\n");
            }
        }









    }

}
