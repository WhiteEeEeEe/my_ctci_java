package chapter1;

import java.util.Arrays;

/**
 * @author yongrong
 * ���������ַ��������д����ȷ������һ���ַ������ַ��������к��ܷ�����һ���ַ���������涨��СдΪ��ͬ�ַ����ҿ����ַ����еĿո񡣸���һ��string
 * stringA��һ��string stringB���뷵��һ��bool�����������Ƿ��������к����ͬ����֤�����ĳ��ȶ�С�ڵ���5000��
 */
public class Question1_3 {

    public static String sort(String s) {
        char[] array = s.toCharArray();
        Arrays.sort(array);
        return new String(array);
    }

    /*
     * ������Ȼ��Ƚ�������ַ���
     */
    public static boolean checkSam(String stringA, String stringB) {
        if (stringA == null || stringB == null || stringA.length() != stringB.length())
            return false;
        return sort(stringA).equals(sort(stringB));
    }

    /*
     * �Ƚ������ַ�����ÿ���ַ����ֵĴ����Ƿ���ͬ
     */
    public static boolean checkSam2(String stringA, String stringB) {
        if (stringA == null || stringB == null || stringA.length() != stringB.length())
            return false;

        int[] letters = new int[65536];
        char[] arr = stringA.toCharArray();
        for (char c : arr)
            letters[c]++;
        for (int i = 0; i < stringB.length(); i++) {
            int n = stringB.charAt(i);
            if ((--letters[n]) < 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[][] pairs = { { null, null }, { "apple", "papel" }, { "carrot", "tarroc" }, { "hello", "llloh" } };
        for (String[] pair : pairs) {
            String word1 = pair[0];
            String word2 = pair[1];
            System.out.println(word1 + ", " + word2 + ": " + checkSam(word1, word2) + " " + checkSam2(word1, word2));
        }
    }

}
