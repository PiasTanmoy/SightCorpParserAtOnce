import java.io.*;
import java.nio.charset.Charset;

/**
 * Created by asd on 4/3/2018.
 */
public class MakePy {
    public static void main(String[] args) throws IOException {

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
                "#pylab.ylim(-1.5, 2.0)\n" +
                "pylab.show()\n" +
                "pylab.savefig('graph.png')\n" +
                "# red dashes, blue squares and green triangles\n" +
                "#plt.plot(x, h, 'r--'label='happy', x, s, 'bs',label='surprise')\n" +
                "#plt.show()\n";

        String line;
        String inputFileName = "python_array.txt";

        try (
                FileWriter output = new FileWriter("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\test.txt");
                InputStream fis = new FileInputStream("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\Microsoft\\" + "mS005_001.doc");
                InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
                BufferedReader br = new BufferedReader(isr);
        ) {
            //output.write(header);
            while ((line = br.readLine()) != null) {
                // Do your thing with line
                output.write(line);
                output.write("\n");
            }
            //output.write(footer);


        }



    }
}
