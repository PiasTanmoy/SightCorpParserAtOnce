import java.io.File;
import java.io.IOException;

/**
 * Created by asd on 4/2/2018.
 */
public class Run {

    public static void mainRun(String fileName) throws IOException, InterruptedException {
//        SightCorp parser2 = new SightCorp();
//        parser2.mainParser2(fileName);


//        SkyBio skyBio = new SkyBio();
//        skyBio.mainSkyBio(fileName);

//        MicrosoftAzure microsoftAzure = new MicrosoftAzure();
//        microsoftAzure.mainMicrosoftAzure(fileName);

        Kairos kairos = new Kairos();
        kairos.mainKairos(fileName);

        Thread.sleep(1000);

        Points points = new Points();
        points.mainPoints();

        Thread.sleep(1000);

        PythonArray2 pythonArray2 = new PythonArray2();
        pythonArray2.mainPythonArray2();

        Thread.sleep(1000);


        Average average = new Average();
        average.mainAverage();

        Thread.sleep(1000);


        MinMax minMax = new MinMax();
        minMax.mainMinMax();

        Thread.sleep(1000);


        Threshold threshold = new Threshold();
        threshold.mainThreshold();

        Thread.sleep(1000);


        ThresholdBinary thresholdBinary = new ThresholdBinary();
        thresholdBinary.mainThresholdBinary();

        Thread.sleep(1000);

        MakePySightCorp makePySightCorp = new MakePySightCorp();
        makePySightCorp.mainMakePySightCorp();

        Thread.sleep(1000);

        AverageDiff averageDiff = new AverageDiff();
        averageDiff.mainAverageDiff();

        Thread.sleep(1000);

        MoveFiles moveFiles = new MoveFiles();
        moveFiles.mainMoveFiles(fileName);



    }
}
