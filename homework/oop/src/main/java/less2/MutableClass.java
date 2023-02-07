package less2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class MutableClass {
    private String text;
    private List<Integer> numbers;
    private Map<String, String> fieldMap;

    public MutableClass(String text, List<Integer> numbers, Map<String, String> fieldMap) {
        this.text = text;
        this.numbers = numbers;
        List<Integer> clone = new ArrayList<>((numbers.size()));
        for (int i = 0; i < numbers.size(); i++) {
            clone.add(numbers.get(i));
        }
        this.numbers = clone;
        Map<String, String> deepCopy = new HashMap<>();
        for (String key : fieldMap.keySet()){
            deepCopy.put(key, fieldMap.get(key));
        }
        this.fieldMap = deepCopy;
    }

    public String getText() {
        return text;
    }

    public List<Integer> getNumbers() {
        List<Integer> clone = new ArrayList<>((numbers.size()));
        for (int i = 0; i < numbers.size(); i++) {
            clone.add(numbers.get(i));
        }
        return clone;
    }

    public Map<String, String> getFieldMap() {
        Map<String, String> deepCopy = new HashMap<String, String>();
        for(String key : fieldMap.keySet()) {
            deepCopy.put(key, fieldMap.get(key));
        }
        return deepCopy;
    }

    @Override
    public String toString() {
        return "MutableClass{" +
                "text='" + text + '\'' +
                ", numbers=" + numbers +
                ", fieldMap=" + fieldMap +
                '}';
    }
}
