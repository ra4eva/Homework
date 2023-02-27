package HW2262023;

import java.util.HashMap;
import java.util.Map;

public class BestBuy {
    public static void main(String[] args) {

        Map<Integer,String> bestbuy=new HashMap<>();
        bestbuy.put(7664847,"Printer");
        bestbuy.put(7879885,"TV");
        bestbuy.put(7894556,"Monitor");
        bestbuy.put(7774959,"Keyboard");
        bestbuy.put(8956114,"PC");

        /* Notes for understanding: For loop to go over the entrySet() of bestbuy, on each map.entry object I use getKey()
        for they keys and getValue for the values*/
        for (Map.Entry<Integer, String> entry : bestbuy.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());

        }
    }
}
