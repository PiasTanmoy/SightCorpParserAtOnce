/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class MovingAvg {


    ArrayList<Integer> list = new ArrayList<>();
    
    public static float movAvg(int[] array,int n, float x)
    {
        //System.out.println(array[n]);
        if(n==0) return array[0];
        return  (x*array[n]+(1-x)*movAvg(array, n-1, x));
    }


    public static void mainMovingAvg(ArrayList<Integer> list) throws IOException {


        int[] fear = {4,4,4,3,3,11,25,54,60,58,56,45,48,21};
        int emotion[]= new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            emotion[i] = list.get(i);
        }

        //int emotion[]= new int[fear.length];
        for(int i=0; i<list.size(); i++) {
            emotion[i] = list.get(i);
        }



        //int x[] = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,16};
        System.out.print("Moving Average of emotion ");
        float avg=movAvg(emotion,emotion.length-1, (float) 0.5);
        String feature = "" + avg +"\n";

        Files.write(new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\movingAvg.txt").toPath(),
                feature.getBytes(),
                StandardOpenOption.APPEND);


        MakeFeatureVector makeFeatureVector = new MakeFeatureVector();
        makeFeatureVector.mainMakeFeatureVector(avg+"");
    }


    public void printName(String name) throws IOException {
        String n = name + ": ";
        Files.write(new File("C:\\Users\\asd\\IdeaProjects\\SightCorpParserAtOnce\\src\\movingAvg.txt").toPath(),
                n.getBytes(),
                StandardOpenOption.APPEND);
    }
}
