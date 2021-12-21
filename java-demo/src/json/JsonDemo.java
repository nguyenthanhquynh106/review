package json;

import org.json.simple.JSONObject;

public class JsonDemo {
    public static void main(String args[]) {
        JSONObject obj = new JSONObject();
        obj.put("name", "Quynh");
        obj.put("age", new Integer(21));
        obj.put("salary", new Double(1000));
        System.out.print(obj.toJSONString());
    }
}
