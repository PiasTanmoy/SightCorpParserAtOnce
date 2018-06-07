import java.io.*;
import java.nio.charset.Charset;

/**
 * Created by asd on 4/6/2018.
 */
public class AverageDiff {
    public static void mainAverageDiff() throws IOException {


        String line = null;
        MakeFeatureVector makeFeatureVector = new MakeFeatureVector();



        try (
            FileWriter output = new FileWriter("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\Average_diff.txt");
            FileWriter output_mod = new FileWriter("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\Average_diff_mod.txt");
            FileWriter output_max_min = new FileWriter("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\MaxMin_diff.txt");
            FileWriter output_SD = new FileWriter("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\SD_diff.txt");
             InputStream fis = new FileInputStream("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\python_array_diff.txt");
             InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
             BufferedReader br = new BufferedReader(isr);
        ) {



            while ((line = br.readLine()) != null) {
                // Do your thing with line
                if(line.length() < 2 ) continue;

                String[] words = line.split(" ");
                /**
                 * This is the name fo the emotion
                 */

                if(words[0].equals("x")) {
                    continue;
                }
                output.write(words[0]);
                output.write("\n");

                output_max_min.write(words[0]);
                output_max_min.write("\n");

                output_SD.write(words[0]+": ");

                output_mod.write(words[0]);
                output_mod.write("\n");



                String[] values = words[2].split(",");
                double sum = 0.0;
                double sum_m = 0.0;
                double max = -1000;
                double min = 1000;
                double temp;
                double temp_m;
                double th = 0;
                double th_bin =0;


                for(int i=0; i<values.length-1; i++) {
                    if(i == 0) {
                        temp = Double.parseDouble(values[i].substring(1));
                        sum += temp;

                        temp_m = Math.abs(temp);
                        sum_m += temp_m;

                        if(max < temp) {
                            max = temp;
                        }
                        if(min > temp) {
                            min = temp;
                        }
                    }
                    else {
                        temp = Double.parseDouble(values[i]);
                        sum += temp;

                        temp_m = Math.abs(temp);
                        sum_m += temp_m;

                        if(max < temp) {
                            max = temp;
                        }
                        if(min > temp) {
                            min = temp;
                        }
                    }
                }

                double avg_diff = (sum / (values.length-1));
                output.write(avg_diff + "\n");
                makeFeatureVector.mainMakeFeatureVector(avg_diff+"");
                //System.out.println(values.length-1);


                double avg_diff_m = (sum_m / (values.length-1));
                output_mod.write(avg_diff_m+"\n");
                makeFeatureVector.mainMakeFeatureVector(avg_diff_m+"");





                output_max_min.write("Min: " + min + "\n");
                output_max_min.write("Max: " + max + "\n");

                makeFeatureVector.mainMakeFeatureVector(min+"");
                makeFeatureVector.mainMakeFeatureVector(max+"");


                sum = 0;
                for(int i=0; i<values.length-1; i++) {
                    if (i == 0) {
                        temp = Double.parseDouble(values[i].substring(1));
                        sum += Math.pow((avg_diff - temp), 2.0);
                    }
                    else {
                        temp = Double.parseDouble(values[i]);
                        sum += Math.pow((avg_diff - temp), 2.0);
                    }
                }

                double SD = Math.pow(( sum/(values.length-1) ), 0.5);
                output_SD.write(SD+"\n");
                makeFeatureVector.mainMakeFeatureVector(SD+"");

                /**
                 * Average calculation and write
                 */

            }
        }

    }

}
