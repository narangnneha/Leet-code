import java.util.HashMap;
import java.util.Map;

public class AddAndFind {

   /* Design and implement a TwoSum class. It should support the following operations:addandfind.
            add- Add the number to an internal data structure.
    find- Find if there exists any pair of numbers which sum is equal to the value.
            Example 1:
    add(1); add(3); add(5);
    find(4) -> true
    find(7) -> false*/


    private HashMap<Integer, Integer> map;

    /** Initialize your data structure here. */
    public AddAndFind() {
        map = new HashMap<>();
    }

    /** Add the number to an internal data structure.. */
    public void add(int number) {
        map.put(number, map.getOrDefault(number, 0) + 1);
    }

    /** Find if there exists any pair of numbers which sum is equal to the value. */
    public boolean find(int value) {
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num1 = entry.getKey();
            int num2 = value - num1;
            if ((num1 == num2 && map.get(num2) > 1) || (num1 != num2 && map.containsKey(num2))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        AddAndFind addAndFind = new AddAndFind();
        addAndFind.add(1);
        addAndFind.add(3);
        System.out.println(addAndFind.find(4));

        
    }
}
