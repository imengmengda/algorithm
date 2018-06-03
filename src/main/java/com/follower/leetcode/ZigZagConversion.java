package com.follower.leetcode;

/**
 * Created by lin on 18-6-3.
 */
public class ZigZagConversion {

    public static void main(String[] args) {
        System.out.print(new ZigZagConversion().convert("abcde", 4));
    }

    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        int buffersSize;
        int groupNum = s.length() / (2 * numRows - 2);
        int lastGroupNum = s.length() % (2 * numRows - 2);
        if (lastGroupNum == 0) {
            buffersSize = groupNum * (numRows - 1);
        } else if (lastGroupNum <= numRows) {
            buffersSize = groupNum * (numRows - 1) + 1;
        } else {
            buffersSize = groupNum * (numRows - 1) + (lastGroupNum - numRows) + 1;
        }
        StringBuffer[] zipStrings = new StringBuffer[buffersSize];
        for (int i = 0; i != zipStrings.length; ++i) {
            zipStrings[i] = new StringBuffer();
        }
        for (int i = 0; i != s.length(); i++) {
            int columnIndex;
            int groupIndex = i / (2 * numRows - 2);
            int charInGroupIndex = i % (2 * numRows - 2);
            if (charInGroupIndex < numRows) {
                columnIndex = groupIndex * (numRows - 1);
                zipStrings[columnIndex].append(s.charAt(i));
            } else {
                columnIndex = groupIndex * (numRows - 1) + (charInGroupIndex - numRows + 1);
                int lineIndex = numRows - (charInGroupIndex - numRows) - 1;
                for (int j = 0; j < lineIndex - 1; j++) {
                    zipStrings[columnIndex].append(" ");
                }
                zipStrings[columnIndex].append(s.charAt(i));
            }
        }
        return convert2Str(zipStrings, numRows, ' ');
    }

    private static String convert2Str(StringBuffer[] stringBuffers, int numRows, char nullChar) {
        StringBuffer ret = new StringBuffer();
        for (int i = 0; i != numRows; i++) {
            for (int j = 0; j != stringBuffers.length; j ++) {
                if (stringBuffers[j].length() > i && stringBuffers[j].charAt(i) != nullChar) {
                    ret.append(stringBuffers[j].charAt(i));
                }
            }
        }
        return ret.toString();
    }
}
