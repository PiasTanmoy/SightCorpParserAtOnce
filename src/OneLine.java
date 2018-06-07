import java.io.*;
import java.nio.charset.Charset;

/**
 * Created by asd on 4/2/2018.
 */
public class OneLine {


    public static void main(String[] args) throws IOException {

        String  line;
        String inputFileName = "input.txt";
        String out = "";
        try (
                FileWriter output = new FileWriter("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\oneLine.txt");
                InputStream fis = new FileInputStream("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\" + inputFileName);
                InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
                BufferedReader br = new BufferedReader(isr);
        ) {
            while ((line = br.readLine()) != null) {
                // Do your thing with line
                //System.out.println(line);
                out+=line;

            }

            out.replace("\n", "");
            output.write(out);


        }
    }
}
