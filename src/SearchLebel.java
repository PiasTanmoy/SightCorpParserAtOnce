import java.io.*;
import java.nio.charset.Charset;

/**
 * Created by asd on 4/23/2018.
 */
public class SearchLebel {

    public static void main(String[] args) throws IOException {
        File folder = new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\EmotionLebelSight");
        File[] listOfFiles = folder.listFiles(); //S010

        int count = 0;


        for (int i = 0; i <  listOfFiles.length ; i++) {

            File[] subFolders = listOfFiles[i].listFiles(); //001, 002, ..............
            //System.out.print(i + " :");
            //System.out.println(listOfFiles[i].getName());

            for(File file : subFolders) {
                //System.out.println(file.getName());
                count++;
                File[] dataDoc = file.listFiles(); //
                if(dataDoc.length == 0) {
                    System.out.println(0);
                    continue;
                }
                if (dataDoc[0].isFile()) {
                    //System.out.println("File " + dataDoc[0].getName());

                    String line = null;
                    try (FileWriter output = new FileWriter("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\max_mva.txt");
                         InputStream fis = new FileInputStream(dataDoc[0]);
                         InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
                         BufferedReader br = new BufferedReader(isr);
                    ) {
                        while ((line = br.readLine()) != null) {
                            //System.out.println(line);
                            System.out.println(line.charAt(3));
                        }

                    }

                }
                else if (dataDoc[0].isDirectory()) {
                    System.out.println("Directory " + dataDoc[0].getName());
                }
            }
            //System.out.println("count " + count);
        }

        System.out.println("count " +  count);
    }
}
