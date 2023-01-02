package corejava.json.decode;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class DecodeJSONStringInJava {
    public static void main(String[] args) {
        String s="{\"name\":\"Sid\",\"salary\":88000.50,\"age\":22}";
        Object obj= JSONValue.parse(s);
        JSONObject jsonObject = (JSONObject) obj;
        String name = (String) jsonObject.get("name");
        double salary = (Double) jsonObject.get("salary");
        long age = (Long) jsonObject.get("age");
        System.out.println("Name: " + name + " " + "Salary: " + salary + " " + "Age: " + age);
    }
}
