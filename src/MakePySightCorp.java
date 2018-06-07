import java.io.*;
import java.nio.charset.Charset;

/**
 * Created by asd on 4/5/2018.
 */
public class MakePySightCorp {
    public static void mainMakePySightCorp() throws IOException {

        /*
           test.py
         */

        String header = "import numpy as np\n" +
                "import matplotlib.pyplot as plt\n" +
                "import pylab \n" +
                "# evenly sampled time at 200ms intervals\n" +
                "#t = np.arange(0., 5., 0.2)\n";

        String footer = "pylab.plot(x, happy, '-v', label='happy')\n" +
                "pylab.plot(x, surprise, '-b', label='surprise')\n" +
                "pylab.plot(x, anger, '-y', label='anger')\n" +
                "pylab.plot(x, disgust, '-g', label='disgust')\n" +
                "pylab.plot(x, fear, '-p', label='fear')\n" +
                "pylab.plot(x, sadness, '-r', label='sadness')\n" +
                "pylab.plot(x, neutral, '-m', label='neutral')\n" +
                "pylab.plot(x, contempt, '-k', label='contempt')\n"+
                "pylab.legend(loc='upper left')\n" +
                "pylab.savefig('graph.png')\n" +
                "pylab.close(1)\n";

        String line;
        String inputFileName = "python_array.txt";

        try (
                FileWriter output = new FileWriter("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\test.py");
                InputStream fis = new FileInputStream("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\python_array.txt");
                InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
                BufferedReader br = new BufferedReader(isr);
        ) {
            output.write(header);
            while ((line = br.readLine()) != null) {
                // Do your thing with line
                output.write(line);
                output.write("\n");
            }
            output.write("\n");
            output.write(footer);
        }




        String headerDiff = "import numpy as np\n" +
                "import matplotlib.pyplot as plt\n" +
                "import pylab \n" +
                "# evenly sampled time at 200ms intervals\n" +
                "#t = np.arange(0., 5., 0.2)\n";


        String footerDiff = "pylab.plot(x, happy, '-v', label='happy')\n" +
                "pylab.plot(x, surprise, '-b', label='surprise')\n" +
                "pylab.plot(x, anger, '-y', label='anger')\n" +
                "pylab.plot(x, disgust, '-g', label='disgust')\n" +
                "pylab.plot(x, fear, '-p', label='fear')\n" +
                "pylab.plot(x, sadness, '-r', label='sadness')\n" +
                "pylab.plot(x, neutral, '-m', label='neutral')\n" +
                "pylab.plot(x, contempt, '-k', label='contempt')\n"+
                "pylab.legend(loc='upper left')\n" +
                "pylab.savefig('diff_graph.png')\n" +
                "pylab.close(1)\n";




        try (
                FileWriter output = new FileWriter("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\testDiff.py");
                InputStream fis = new FileInputStream("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\python_array_diff.txt");
                InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
                BufferedReader br = new BufferedReader(isr);
        ) {
            output.write(headerDiff);
            while ((line = br.readLine()) != null) {
                // Do your thing with line
                output.write(line);
                output.write("\n");
            }
            output.write("\n");
            output.write(footerDiff);
        }
    }
}
