package chapter1;

/**
 * @author yongrong
 * ���дһ�����������ַ����еĿո�ȫ���滻Ϊ��%20�����ٶ����ַ������㹻�Ŀռ����������ַ�������֪���ַ�������ʵ����(С�ڵ���1000)��ͬʱ��֤�ַ����ɴ�Сд��Ӣ����ĸ��ɡ�����һ��string
 * iniString Ϊԭʼ�Ĵ����Լ����ĳ��� int len, �����滻���string��
 */
public class Question1_4 {

    /*
     * ��һ��ɨ�������Ҫ�����ַ������ȣ��ڶ��δӺ���ǰ����ɨ�裬���ǿո���滻�ɡ�%20���������Ǿ͸���ԭ�ַ�
     */
    public static String replaceSpace(String iniString, int length) {
        int spaceCount = 0;
        for (int i = 0; i < length; i++)
            if (iniString.charAt(i) == ' ')
                spaceCount++;
        int newLength = length + 2 * spaceCount;
        char[] array = new char[newLength];
        for (int i = length - 1; i >= 0; i--) {
            if (iniString.charAt(i) == ' ') {
                array[--newLength] = '0';
                array[--newLength] = '2';
                array[--newLength] = '%';
            } else {
                array[--newLength] = iniString.charAt(i);
            }
        }
        String result = new String(array);
        return result;
    }

    /*
     * ʹ��������ʽ
     */
    public static String replaceSpace2(String iniString, int length) {
        return iniString.replaceAll(" ", "%20");
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str = "abc d e f";
        System.out.println(str + " ==> " + replaceSpace(str, str.length()) + " || " + replaceSpace2(str, str.length()));
    }

}
