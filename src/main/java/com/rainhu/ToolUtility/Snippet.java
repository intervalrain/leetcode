package com.rainhu.ToolUtility;

import java.util.ArrayList;
import java.util.List;

public class Snippet {

    public static class JsonArray{
        private String jsonStr;
        private List<JsonArray> jsonList;
        private int size;

        private JsonArray(String input){
            jsonStr = input;
            input = input.substring(1, input.length() - 1);
            String[] str;
            jsonList = new ArrayList<>();
            if (input.contains("[")){
                input = input.substring(1, input.length() - 1);
                str = input.split("\\],\\[");
                size = str.length;
                for (int i = 0; i < size; i++){
                    str[i] = "[" + str[i] + "]";
                }
                for (int i = 0; i < size; i++){
                    jsonList.add(new JsonArray(str[i]));
                }
            } else {
                size = 1;
            }
        }

        public static JsonArray readFrom(String input){
            String s = input.trim();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++){
                if (s.charAt(i) != ' '){
                    sb.append(s.charAt(i));
                }
            }
            return new JsonArray(sb.toString());
        }
        public int size(){

            return size;
        }
        public JsonArray get(int idx){
            return jsonList.get(idx);
        }
        public JsonArray asArray(){
            return readFrom(jsonStr);
        }
        public String toString(){
            return jsonStr;
        }
    }

    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return new int[0];
        }
    
        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }

    public static int[][] stringToInt2dArray(String input) {
        JsonArray jsonArray = JsonArray.readFrom(input);
        if (jsonArray.size() == 0) {
            return new int[0][0];
        }
    
        int[][] arr = new int[jsonArray.size()][];
        for (int i = 0; i < arr.length; i++) {
            JsonArray cols = jsonArray.get(i).asArray();
            arr[i] = stringToIntegerArray(cols.toString());
        }
        return arr;
    }
}
