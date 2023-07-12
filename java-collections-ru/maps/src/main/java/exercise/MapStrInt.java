package exercise;

import java.util.HashMap;
import java.util.Map;

public class MapStrInt extends HashMap<String, Integer> {
    @Override
    public Integer put(String key, Integer value) {
        if(key == null || key == ""){
            return 0;
        }
        return super.put(key, value);
    }

    @Override
    public String toString() {
        if(this.isEmpty()){
            return "{}";
        }
        String strTotal = "{\n";
        for (Map.Entry<String, Integer> entry : this.entrySet()) {
            strTotal += "  " + entry.getKey() + ": " + entry.getValue() + "\n";
        }
        strTotal = strTotal + "}";
        return strTotal;
    }
}