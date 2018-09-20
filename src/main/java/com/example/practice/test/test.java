package com.example.practice.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class test {
    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
            List<Integer> res = new ArrayList();
            
            int pointsAlice =  0;
            int pointsBobs = 0;
            for(int i=0; i<a.size();i++){
                pointsAlice = pointsAlice + ((a.get(i) > b.get(i)) ? 1 : 0);
                pointsBobs = pointsBobs + ((a.get(i)<b.get(i)) ? 1 : 0);
            }
        res.add(pointsAlice);
        res.add(pointsBobs);
            return res;
    }

    public static void main(String[] args) throws IOException {
    	List<Integer> a = new ArrayList<Integer>();
    	a.add(5);
    	a.add(6);
    	a.add(7);
    	
    	List<Integer> b = new ArrayList<Integer>();
    	b.add(3);
    	b.add(6);
    	b.add(10);
    	
        List<Integer> result = compareTriplets(a, b);

           System.out.println( result.stream()
                .map(Object::toString)
                .collect(Collectors.joining(" ")));
    }
}
