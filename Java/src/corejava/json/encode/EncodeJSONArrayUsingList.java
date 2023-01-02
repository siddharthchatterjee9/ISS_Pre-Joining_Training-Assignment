package corejava.json.encode;

import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONValue;

public class EncodeJSONArrayUsingList {
        public static void main(String args[]) {
            List arr = new ArrayList();
            arr.add("sid");
            arr.add(new Integer(27));
            arr.add(new Double(88000.50));
            String jsonText = JSONValue.toJSONString(arr);
            System.out.print(jsonText);
        }
}
