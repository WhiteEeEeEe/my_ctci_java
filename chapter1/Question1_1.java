package chapter1;

/**
 * @author yongrong
 * ��ʵ��һ���㷨��ȷ��һ���ַ����������ַ��Ƿ�ȫ����ͬ����������Ҫ������ʹ�ö���Ĵ洢�ṹ�� ����һ��string
 * iniString���뷵��һ��boolֵ,True���������ַ�ȫ����ͬ��False���������ͬ���ַ�����֤�ַ����е��ַ�ΪASCII�ַ����ַ����ĳ���С�ڵ���3000��
 */
public class Question1_1 {

    /*
     * ����ֵ���鱣���Ƿ��һ�γ��ָ��ַ�
     */
    public static boolean checkDifferent(String iniString) {
        if (iniString.length() > 65536)
            return false;
        boolean[] char_flag = new boolean[65536];
        for (int i = 0; i < iniString.length(); i++) {
            int n = iniString.charAt(i);
            if (char_flag[n])
                return false;
            char_flag[n] = true;
        }
        return true;
    }

    /*
     * ��λ�����Ͳ���ֵ����
     */
    public static boolean checkDifferent2(String iniString) {
        if (iniString.length() > 65536)
            return false;
        long checker = 0;
        for (int i = 0; i < iniString.length(); i++) {
            long n = iniString.charAt(i) - '0';
            if ((checker & (1 << n)) > 0)
                return false;
            checker |= (1 << n);
        }
        return true;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[] words = { "hello", "world", "acbdbesy" };
        for (String w : words) {
            System.out.println(w + ": " + checkDifferent(w) + " " + checkDifferent2(w));
        }
    }

}
