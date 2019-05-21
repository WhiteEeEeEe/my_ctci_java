package chapter1;

/**
 * @author yongrong
 * �ٶ����Ƕ�֪���ǳ���Ч���㷨�����һ�������Ƿ�Ϊ�����ַ������Ӵ����뽫����㷨��д��һ�����������������ַ���s1��s2�����д������s2�Ƿ�Ϊs1��ת���ɣ�
 * Ҫ��ֻ�ܵ���һ�μ���Ӵ��ĺ��������������ַ���s1,s2,�뷵��boolֵ����s2�Ƿ���s1��ת���ɡ��ַ������ַ�ΪӢ����ĸ�Ϳո����ִ�Сд���ַ�������С�ڵ���1000��
 */
public class Question1_8 {
    public static boolean isSubstring(String big, String small) {
        if (big.indexOf(small) >= 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * s1=xy��s2=yx��������s1=xyƴ�Ӻ�õ�s1s1=xyxy���ж�s2=yx�Ƿ���s1s1=xyxy���Ӵ�
     * @param s1 �ַ���s1
     * @param s2 �ַ���s2
     * @return s2�Ƿ���s1��ת����
     */
    public static boolean checkReverseEqual(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() != s2.length() || s1.length() == 0)
            return false;
        return isSubstring(s1 + s1, s2);
    }

    public static boolean checkReverseEqual2(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() != s2.length() || s1.length() == 0)
            return false;
        return (s1 + s1).contains(s2);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[][] pairs = { { "apple", "pleap" }, { "waterbottle", "erbottlewat" }, { "camera", "macera" } };
        for (String[] p : pairs)
            System.out.println(p[0] + " " + p[1] + " is reverse equal? " + checkReverseEqual(p[0], p[1]) + " "
                    + checkReverseEqual2(p[0], p[1]));
    }

}
