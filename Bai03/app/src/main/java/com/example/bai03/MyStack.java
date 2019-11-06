package com.example.bai03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class MyStack {
    private ArrayList<Integer> values;
    private int maxvalues;

    public MyStack(int maxvalues){
        values = new ArrayList<>();
        this.maxvalues = maxvalues;
    }

    public void pushData(){
        while (true){
            Random r = new Random();
            int s = (new Random().nextInt(maxvalues));
            if (!values.contains(s)){
                values.add(s);
                values.add(s);
                break;
            }
        }
        Collections.shuffle(values);

    }

    public void popData(int activevalue){
        while (values.contains(activevalue))
            values.remove(values.indexOf(activevalue));
    }
    public int selectValue(){
        int index = (new Random().nextInt(values.size()));
        return values.get(index);
    }
    public ArrayList<Integer> getValues() { return values ;}

    public void setValues(ArrayList<Integer> values) { this.values = values;}
}

