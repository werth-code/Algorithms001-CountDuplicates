package hbcu.stay.ready.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountDuplicates {
    /**
     * Example of overloading a function that accepts a Array String
     * @param input
     * @return
     */
    public Integer countDuplicates(String[] input) {
        return counter(input);
    }
    /**
     * Example of overloading a function that accepts a Array of Integers
     * @param input
     * @return
     */
    public Integer countDuplicates(Integer[] input) {
        return counter(input);
    }

    private Integer counter (Object[] input) {
        Arrays.sort(input);
        Integer duplicates = 0;
        Object currentValue = null;
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] == input[i + 1] && input[i] != currentValue) {
                duplicates++;
                currentValue = input[i];
            }
        }
        return duplicates;
    }

//    class Solution {
//        public int firstUniqChar(String s) {
//            if(s.length() == 1) return 0;
//            if(s.length() == 0) return -1;
//
//            char[] split = s.toCharArray();
//            Arrays.sort(split);
//            System.out.println(split);
//
//            for(int i = 0; i < split.length -1; i++) {
//                if(split[i] != split[i+1]) return i;
//            }
//            return -1;
//        }
//    }
//

//        public List<String> fizzBuzz(int n) {
//            if(n == 0) return new ArrayList<>();
//
//            List<String> values = new ArrayList<>();
//
//            for(int i = 0; i <= n; i++) {
//                if (i % 15 == 0) values.add("FizzBuzz");
//                else if (i % 3 == 0) values.add("Fizz");
//                else if (i % 5 == 0) values.add("Buzz");
//                else values.add(String.valueOf(i));
//            }
//            return values;
//        }

}
