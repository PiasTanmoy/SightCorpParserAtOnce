/**
 * Created by asd on 6/13/2018.
 */
import java.io.*;
import java.nio.charset.Charset;

/**
 * Created by asd on 3/20/2018.
 */
public class KairosFile2 {


    public static int mainKairosFile2() throws IOException {

        String line = null;

        try (FileWriter output = new FileWriter("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\formatted_input2.txt");
             InputStream fis = new FileInputStream("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\parsedFile.txt");
             InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
             BufferedReader br = new BufferedReader(isr);
        ) {

            while ((line = br.readLine()) != null) {



                String[] words = line.split(",");

                if(words.length < 2) {
                    return 0;
                }

                //int count=0;
                String temp="";
                output.write("# " + words[0]+"\n");
                for (int x=1; x<words.length; x++) {


                    temp = temp + x + " " + words[x] + "\n";
                    output.write(temp);
                    temp = "";
                }
                output.write("\n\n");
            }
        }

        return 1;

    }


}
