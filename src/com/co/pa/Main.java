package com.co.pa;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    static Map<Character, Integer> control = new TreeMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println(solution(line));
    }

    public static String solution(String line){
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < line.length(); i++){
            if(control.containsKey(line.charAt(i))) control.put(line.charAt(i), (control.get(line.charAt(i)) + 1));
            else control.put(line.charAt(i), 1);
        }

        for(Map.Entry<Character, Integer> index : control.entrySet()){
            String value = index.getValue() > 1 ? String.valueOf(index.getValue()) : "";
            result.append(value).append(index.getKey());
        }

        return result.toString();
    }
}
