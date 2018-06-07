import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;

/**
 * Created by asd on 3/21/2018.
 */
public class PythonArray2 {

    public static void mainPythonArray2() throws IOException {


        String line = null;
        MovingAvg movingAvg = new MovingAvg();


        try (FileWriter output = new FileWriter("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\python_array.txt");
             FileWriter output2 = new FileWriter("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\python_array_diff.txt");
             FileWriter output3 = new FileWriter("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\python_array_SD.txt");
             InputStream fis = new FileInputStream("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\formatted_input.txt");
             InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
             BufferedReader br = new BufferedReader(isr);
        ) {

            int count=0;
            int x = 0;
            String temp="" ;
            int blank=0;

            int fx0=0;
            int fx1=0;
            int d=0;
            ArrayList<Integer> list = new ArrayList<>();
            ArrayList<Integer> diff = new ArrayList<>();
            String name = "";
            String lastEmotion = "";
            //(1, 1), (2, 4), (3, 1), (9, 3)
            while ((line = br.readLine()) != null) {
                // Do your thing with line
                System.out.println(line);

                if(line.length() < 2) {
                    blank++;
                    if(blank == 1 ){
                        temp += "]\n";
                        output.write(temp);

                        output2.write("" + name + " = [");

                        double avg = 0;
                        /**
                         * Differentiation
                         */

                        for(int i=0; i<list.size()-1; i++) {
                            avg+=list.get(i);
                            diff.add(list.get(i+1) - list.get(i));
                            output2.write(diff.get(i)+",");
                        }
                        avg+=list.get(list.size()-1);
                        avg/=list.size();

                        /**
                         * Standard Deviation
                         */
                        double SD = 0;

                        for(int i=0; i<list.size(); i++) {
                            SD += Math.pow((list.get(i) - avg), 2);
                        }

                        SD /= list.size();
                        SD = Math.pow(SD, 0.5);
                        output3.write(name + ": ");
                        output3.write(SD + "\n");

                        SD = 0;
                        avg = 0;

                        output2.write("]\n");
                        movingAvg.printName(lastEmotion);
                        movingAvg.mainMovingAvg(list);

                        list.clear();
                        diff.clear();
                    }

                    if(x == 0) {
                        x = count;
                    }
                    count=0;
                    temp = "";
                    continue;
                }
                blank = 0;

                String[] words = line.split(" ");

                if(words[0].equals("#")) {
                    lastEmotion = words[1];
                    temp += words[1];
                    temp += " = [";
                    name = words[1];
                    continue;
                }

                temp = temp + "" + words[1]  + ",";
                list.add(Integer.parseInt(words[1]));
                count++;
            }

            output.write("x = [");
            output2.write("\nx = [");
            for(int i=1; i<x; i++) {
                output.write("" + i + ",");
                if(i!=1)
                    output2.write("" + i + ",");
            }
            output.write("" + (x)+"]");
            output2.write("" + (x)+"]");
        }
    }
}
