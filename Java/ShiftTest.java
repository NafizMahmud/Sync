import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ShiftTest {
    Map<String, LinkedList<Map<String, Integer>>> exchangeRates = new LinkedHashMap<>();

    ShiftTest() {
        Map<String, Integer> jPYUSD = new HashMap<>();
        jPYUSD.put("USD", 1);
        Map<String, Integer> jPYEURO = new HashMap<>();
        jPYEURO.put("EURO", 2);
        Map<String, Integer> uSDCAD = new HashMap<>();
        uSDCAD.put("CAD", 3);
        Map<String, Integer> uSDAUD = new HashMap<>();
        uSDAUD.put("AUD", 4);
        Map<String, Integer> uSDPOND = new HashMap<>();
        uSDPOND.put("POND", 5);
        Map<String, Integer> pONDSFR = new HashMap<>();
        pONDSFR.put("SFR", 6);
        Map<String, Integer> eUROSFR = new HashMap<>();
        eUROSFR.put("SFR", 7);

        LinkedList<Map<String, Integer>> jPYAdJ = new LinkedList<>();
        jPYAdJ.add(jPYUSD);
        jPYAdJ.add(jPYEURO);
        LinkedList<Map<String, Integer>> uSDAdJ = new LinkedList<>();
        uSDAdJ.add(uSDCAD);
        uSDAdJ.add(uSDAUD);
        uSDAdJ.add(uSDPOND);
        LinkedList<Map<String, Integer>> pONDAdJ = new LinkedList<>();
        pONDAdJ.add(pONDSFR);
        LinkedList<Map<String, Integer>> eUROAdJ = new LinkedList<>();
        eUROAdJ.add(eUROSFR);

        exchangeRates.put("JPY", jPYAdJ);
        exchangeRates.put("USD", uSDAdJ);
        exchangeRates.put("POND", pONDAdJ);
        exchangeRates.put("EURO", eUROAdJ);
   }

    void DFS(String from, String to) {
        //System.out.println("f" + from + "t = "+ to);
        // System.out.println(exchangeRates.toString());
        List<Integer> possibleExchange = new LinkedList<Integer>();
        int finalRate = 1;
        // {JPY=[{USD=1}, {EURO=2}], USD=[{CAD=3}, {AUD=4}, {POND=5}], POND=[{SFR=6}], EURO=[{SFR=7}]}

        LinkedList<Map<String, Integer>> queue = new LinkedList<>(); //
        queue.addAll(exchangeRates.get(from));  // [{USD=1}, {EURO=2}]
        while(queue.size()!=0){
            Map.Entry<String,Integer> entry = queue.get(0).entrySet().iterator().next();

            if(entry.getKey().equals(to)){
                finalRate = finalRate * entry.getValue();
                possibleExchange.add(finalRate);
                // System.out.println(possibleExchange);
                finalRate = 1;
                queue.pop();
            }
            else if(!exchangeRates.containsKey(entry.getKey())) {
                queue.pop();
                finalRate = 1;
            }
            else {
                finalRate = finalRate * entry.getValue();
                LinkedList<Map<String, Integer>> temp = exchangeRates.get(entry.getKey());
                queue.pop();
                for(int i =0; i<temp.size(); i++){queue.push(temp.get(i));}
                // System.out.println(queue.toString());
                }
            }

            // System.out.println(queue.toString());
            System.out.println(possibleExchange);

        }


    public static void main(String[] args) {
        ShiftTest test = new ShiftTest();
        test.DFS("USD", "POND");
    }
}
