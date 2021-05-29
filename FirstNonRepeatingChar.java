/*) Suppose I have "n" chocolates. and "m" children, if i want to distribute each chocolates to all m children in a sequential order by repeating same list of children if excess in     chocolates. how do you distribute?

Note: you can solve either in Python/Java.

example 1: if n=3 (chocolates here is 3) , m=3 (children are 3 you can name children as 1,2,3 ) answer: {1:1,2:1,3:1}

example 2: if n=7 and m=5 then child {1:2, 2:2, 3:1, 4:1, 5:1}

can you write a simple python/java function to resolve this? where n and m are parameter*/

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

public static char get(String str) throws Exception {
    if (str.length() > 0) {
        Map<Character, Integer> m = new LinkedHashMap<Character, Integer>();

        for (int i = 0; i < str.length(); i++) {
            if (m.containsKey(str.charAt(i))) {
                m.put(str.charAt(i), m.get(str.charAt(i)) + 1);
            } else {
                m.put(str.charAt(i), 1);
            }
        }
        for (Map.Entry<Character, Integer> hm : m.entrySet()) {
            if (hm.getValue() == 1) {
                return hm.getKey();
            }
        }
    }
    return 0;
}
    public static void main(String[] args) throws Exception {
    	String str="aabbcaa";
    	char out = get(str);
    	if(out == -1) {
    		System.out.println(out);
    	} else {
    		System.out.println(get(str) +" "+ str.indexOf(get(str)) );
    	}
        }
     }
