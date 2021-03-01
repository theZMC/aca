package com.aca;

public class MyReport {
    public static void main(String[] args){
        String t = "\t";
        String n = "\n";
        
        String header   =   t+  "student name"+ t+  "score" + n +
                            t+  "------------"+ t+  "-----" + n;

        String report   =   t+  "Jones"+    t+  t+  "96" + n +
                            t+  "Smith"+    t+  t+  "84" + n +
                            t+  "Peters"+   t+  t+  "76" + n;

        String totals   =   t+      t+      t+      "-----" + n +
                            t+  "total"+    t+  t+  "\"256\"" + n;

        System.out.print(header + report + totals);
    }
}