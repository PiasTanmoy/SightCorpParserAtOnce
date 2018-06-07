import java.io.*;
import java.nio.charset.Charset;

/**
 * Created by asd on 3/21/2018.
 */
public class PythonArray {

    public static void main(String[] args) throws IOException {


        String line = null;


        try (FileWriter output = new FileWriter("C:\\Users\\asd\\IdeaProjects\\Test\\src\\python_array.txt");
             InputStream fis = new FileInputStream("C:\\Users\\asd\\IdeaProjects\\Test\\src\\si010001.txt");
             InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
             BufferedReader br = new BufferedReader(isr);
        ) {


            //(1, 1), (2, 4), (3, 1), (9, 3)
            while ((line = br.readLine()) != null) {
                // Do your thing with line
                System.out.println(line);
                //if(line.equals("\n")) continue;
                if(line.length() < 2) continue;

                String[] words = line.split(" ");

                //if(words[0].equals("#")) continue;

                String temp="";

                temp = temp + "(" + words[0] + ", " + words[1] + ")" + ","+"\n";
                output.write(temp);

            }
        }

    }
}
