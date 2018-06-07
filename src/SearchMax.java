import java.io.*;
import java.nio.charset.Charset;

/**
 * Created by asd on 4/23/2018.
 */
public class SearchMax {

    public static void main(String[] args) throws IOException {
        String line = null;

        try (FileWriter output = new FileWriter("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\max_mva.txt");
             InputStream fis = new FileInputStream("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\featureVector_mva2.txt");
             InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
             BufferedReader br = new BufferedReader(isr)
        ) {


            while ((line = br.readLine()) != null) {

                String[] words = line.split("\t");

                for(String x : words) {
                    System.out.print(x + " ");
                }
                System.out.println("\n");

                /**
                 * Calculate MAX and MIN
                 */
                double max = 0;
                int count = 0;
                int idx = 0;
                for(String word : words) {
                    count++;
                    double val = Double.parseDouble(word);
                    if(val > max) {
                        max = val;
                        idx = count;
                    }
                }
                if(idx == 1) {
                    System.out.print(8);
                    output.write("8");
                }
                if(idx == 2) {
                    System.out.print(1);
                    output.write("1");
                }
                if(idx == 3) {
                    System.out.print(3);
                    output.write("3");
                }
                if(idx == 4) {
                    System.out.print(4);
                    output.write("4");
                }
                if(idx == 5) {
                    System.out.print(5);
                    output.write("5");
                }
                if(idx == 6) {
                    System.out.print(6);
                    output.write("6");
                }
                if(idx == 7) {
                    System.out.print(7);
                    output.write("7");
                }
                if(idx == 8) {
                    System.out.print(8);
                    output.write("7");
                }
                else {
                    //System.out.print(0);
                    //output.write("0");
                }

                System.out.println();
                output.write("\n");

                /**
                 * Write MIN and MAX value
                 */

            }
        }
    }
}
