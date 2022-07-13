package com.rainhu.util;

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
                String[] tmp = input.split(",");
                size = tmp.length;
                if (size == 1){
                    jsonList.add(this);
                } else {
                    for (int i = 0; i < size; i++){
                        jsonList.add(new JsonArray("[" + tmp[i] + "]"));
                    }
                }
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
            if (input.length() == 2) return null;
            return new JsonArray(sb.toString());
        }
        public int size(){

            return size;
        }
        public JsonArray get(int idx){
            if (jsonList.size() == 0) return this;
            return jsonList.get(idx);
        }
        public JsonArray asArray(){
            return readFrom(jsonStr);
        }
        public Integer asInt(){
            return Integer.valueOf(jsonStr.substring(1, jsonStr.length() - 1));
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

    public static TreeNode stringToTreeNode(String input){
        
        // JsonArray jsonArray = JsonArray.readFrom(input);
        // input = jsonArray.jsonStr.trim();

        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return null;
        }
    
        String[] parts = input.split(",");
        Integer[] array = new Integer[parts.length];
        for (int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            if (part.equals("null")){
                continue;
            }
            array[index] = Integer.parseInt(part);
        }
        TreeNode root = TreeNode.buildTree(array);
        return root;
    }

    public static List<Integer> stringToIntegerList(String input){
        JsonArray jsonArray = JsonArray.readFrom(input);
        List<Integer> arr = new ArrayList<>(jsonArray.size());
        for (int i = 0; i < jsonArray.size(); i++){
            arr.add(jsonArray.get(i).asInt());
        }
        return arr;
    }

    public static List<List<Integer>> stringToInt2dList(String input){
        JsonArray jsonArray = JsonArray.readFrom(input);
        if (jsonArray == null || jsonArray.size() == 0){
            return new ArrayList<List<Integer>>();
        }
        List<List<Integer>> list = new ArrayList<>(jsonArray.size());
        for (int i = 0; i < jsonArray.size(); i++){
            JsonArray cols = jsonArray.get(i).asArray();
            list.add(stringToIntegerList(cols.toString()));
        }
        return list;
    }
}
