package com.follower.leetcode;

import org.omg.PortableInterceptor.Interceptor;

import java.util.*;

/**
 * Created by lin on 19-6-2.
 */
public class Integer2RomainNumber_0012 {

    private Map<Integer, String> romainCharMap = new TreeMap<Integer, String>() {{
        put(1, "I");
        put(5, "V");
        put(10, "X");
        put(50, "L");
        put(100, "C");
        put(500, "D");
        put(1000, "M");
    }};

    private List<Integer> romainKeys = Arrays.asList(1, 5, 10, 50, 100, 500, 1000);


    public String intToRoman(int num) {
        StringBuilder strBuilder = new StringBuilder();
        while (num != 0) {
            int largestKeyIndex = 0;
            for (int i = 0; i < romainKeys.size(); i += 2) {
                if (romainKeys.get(i) <= num) {
                    largestKeyIndex = i;
                }
            }
            int bit = num / romainKeys.get(largestKeyIndex);

            if (bit == 4) {
                strBuilder.append(romainCharMap.get(romainKeys.get(largestKeyIndex)));
                strBuilder.append(romainCharMap.get(romainKeys.get(largestKeyIndex + 1)));
            } else if (bit == 9) {
                strBuilder.append(romainCharMap.get(romainKeys.get(largestKeyIndex)));
                strBuilder.append(romainCharMap.get(romainKeys.get(largestKeyIndex + 2)));
            } else if (bit == 5) {
                strBuilder.append(romainCharMap.get(romainKeys.get(largestKeyIndex + 1)));
            } else if (bit < 5) {
                for (int i = 0; i < bit; i++) {
                    strBuilder.append(romainCharMap.get(romainKeys.get(largestKeyIndex)));
                }
            } else {
                strBuilder.append(romainCharMap.get(romainKeys.get(largestKeyIndex + 1)));
                for (int i = 0; i < bit - 5; i++) {
                    strBuilder.append(romainCharMap.get(romainKeys.get(largestKeyIndex)));
                }
            }

            num %= romainKeys.get(largestKeyIndex);
        }
        return strBuilder.toString();
    }


}
