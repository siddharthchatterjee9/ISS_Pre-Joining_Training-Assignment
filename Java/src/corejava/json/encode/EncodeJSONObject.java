package corejava.json.encode;

import org.json.simple.JSONObject;

public class EncodeJSONObject{
    public static void main(String args[]){
        JSONObject obj=new JSONObject();
        obj.put("name","sid");
        obj.put("age",new Integer(27));
        obj.put("salary",new Double(88000.50));
        System.out.print(obj);
    }}