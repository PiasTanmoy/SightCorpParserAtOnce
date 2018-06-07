/**
 * Created by asd on 4/16/2018.
 */


public class PlotMovingAvg {

    public static double movAverage(int[] array,int n, double x, String name)
    {
        double moving=array[0];
        System.out.print(name + " = [ ");
        System.out.print(array[0] + " ,");
        for(int i=1;i<n;i++)
        {
            moving=x*array[i]+(1-x)*moving;
            System.out.print(moving + ", ");
        }
        System.out.print("]\n");
        return moving;

    }

    /**
     *
     happy = [1,0,0,0,1,0,1,1,1,2,2,1,4,2,1,1,5,]
     surprise = [1,0,0,0,1,0,1,2,2,1,1,1,1,1,0,0,1,]
     anger = [2,1,1,1,1,2,4,3,3,4,6,5,5,4,4,5,11,]
     disgust = [2,1,1,1,3,4,20,11,20,54,52,60,62,75,81,81,53,]
     fear = [15,13,12,8,15,9,10,6,7,7,8,4,7,3,3,2,9,]
     sadness = [26,36,36,39,27,28,16,8,11,7,9,5,5,4,3,2,5,]
     x = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17]
     * @param args
     */

    public static void main(String[] args)
    {
        int[] happy = {   1,0,0,0,1,0,1,1,1,2,2,1,4,2,1,1,5,   };
        int[] surprise = {     1,0,0,0,1,0,1,2,2,1,1,1,1,1,0,0,1,   };
        int[] anger = {      2,1,1,1,1,2,4,3,3,4,6,5,5,4,4,5,11, };
        int[] disgust = {     2,1,1,1,3,4,20,11,20,54,52,60,62,75,81,81,53,  };
        int[] fear = {    15,13,12,8,15,9,10,6,7,7,8,4,7,3,3,2,9, };
        int[] sadness = {    26,36,36,39,27,28,16,8,11,7,9,5,5,4,3,2,5,   };
        int[] x = {    1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17  };

        double weight = 0.0;


        for(int j=0; j<10; j++) {
            weight += 0.1;
            System.out.println("weight: " + weight);

            movAverage(happy, happy.length, weight, "happy");
            movAverage(surprise, surprise.length, weight, "surprise");
            movAverage(anger, anger.length, weight, "anger");
            movAverage(disgust, disgust.length, weight, "disgust");
            movAverage(fear, fear.length, weight, "fear");
            movAverage(sadness, sadness.length, weight, "sadness");


            System.out.print("x = [ ");
            for (int i : x) {
                System.out.print(i + " ,");
            }
            System.out.print("]\n");

        }


    }
}
