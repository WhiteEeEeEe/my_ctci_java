package chapter1;

/**
 * @author yongrong
 * ��ʵ��һ���㷨���ڲ�ʹ�ö������ݽṹ�ʹ���ռ������£���תһ���������ַ���(����ʹ�õ������̱���)�� ����һ��string
 * iniString���뷵��һ��string��Ϊ��ת����ַ�������֤�ַ����ĳ���С�ڵ���5000��
 */

public class Question1_2 {
    /*
     * ��β�ַ�����
     */
    public static String reverseString(String iniString) {
        char[] charArr = iniString.toCharArray();
        for (int i = 0, j = charArr.length - 1; i < j; i++, j--) {
            char temp = charArr[i];
            charArr[i] = charArr[j];
            charArr[j] = temp;
        }
        return new String(charArr);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[] words = { "hello", "world", "acbdbesy", "This is nowcoder" };
        for (String w : words) {
            System.out.println(w + " ==> " + reverseString(w));
        }
    }

}
