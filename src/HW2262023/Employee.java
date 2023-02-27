package HW2262023;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    public static void main(String[] args) {
        Map<String,Double> employee=new HashMap<>();
        employee.put("Hyun Bin",150000.0);
        employee.put("Son Ye-jin",130000.0);
        employee.put("Kim Jung-Hyun",125000.0);

        double highSalary= Collections.max(employee.values());


        employee.entrySet().removeIf(x ->x.getValue()<highSalary);

        for (Map.Entry<String, Double> entry : employee.entrySet()) {
            System.out.println(entry.getKey()+" = "+ entry.getValue());

        }
    }
}
