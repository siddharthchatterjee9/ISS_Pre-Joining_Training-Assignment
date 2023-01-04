package corejava.json.encode;

import org.json.simple.JSONArray;

public class EncodeJSONArray{
    public static void main(String args[]){
        JSONArray arr = new JSONArray();
        arr.add("sid");
        arr.add(new Integer(27));
        arr.add(new Double(88000.50));
        System.out.print(arr);
    }}