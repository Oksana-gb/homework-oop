package less2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        Map<String,String> map = new HashMap<>();
        map.put("1","one");
        List<Integer> num = Arrays.asList(1,2,3,4);
        MutableClass mc = new MutableClass("oneExample",num,map);
        System.out.println(mc);
        map.put("2","two");
        System.out.println(mc);
        mc.getNumbers().add(8);
        mc.getFieldMap().put("2","two");
        System.out.println(mc);
    }
}
