package chapter1;

/**
 * @author yongrong
 * �����ַ��ظ����ֵĴ�������дһ��������ʵ�ֻ������ַ���ѹ�����ܡ����磬�ַ�����aabcccccaaa����ѹ�����ɡ�a2b1c5a3������ѹ������ַ���û�б�̣��򷵻�ԭ�ȵ��ַ�����
 * ����һ��string iniStringΪ��ѹ���Ĵ�(����С�ڵ���10000)����֤�����ַ����ɴ�СдӢ����ĸ��ɣ�����һ��string��Ϊ�����ѹ�����δ�仯�Ĵ���
 */
public class Question1_5 {
    public static int countZip(String str) {
        if (str == null || str == "")
            return 0;
        int size = 0;
        char last = str.charAt(0);
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == last) {
                count++;
            } else {
                size += 1 + String.valueOf(count).length();
                last = str.charAt(i);
                count = 1;
            }
        }
        size += 1 + String.valueOf(count).length();

        return size;
    }

    /**
     * ����StringBuffer�����ⷴ�������ַ���ƴ�Ӳ����ĵ�Ч��
     * @param iniString ������ַ���
     * @return ѹ������ַ���
     */
    public static String zipString(String iniString) {
        int size = countZip(iniString);
        if (size >= iniString.length())
            return iniString;
        StringBuffer buffer = new StringBuffer();
        char last = iniString.charAt(0);
        int count = 1;

        for (int i = 1; i < iniString.length(); i++) {
            if (iniString.charAt(i) == last) {
                count++;
            } else {
                buffer.append(last); // �����ַ�
                buffer.append(count); // ����������ͬ���ַ�����
                last = iniString.charAt(i);
                count = 1;
            }
        }
        buffer.append(last);
        buffer.append(count);

        return buffer.toString();
    }

    public static int setChar(char[] array, char c, int count, int index) {
        array[index++] = c;
        char[] countArr = String.valueOf(count).toCharArray();
        for (char x : countArr)
            array[index++] = x;

        return index;
    }

    /**
     * ���������StringBuffer����������������ⷴ�������ַ���ƴ�Ӳ����ĵ�Ч��
     * @param iniString
     */
    public static String zipString2(String iniString) {
        int size = countZip(iniString);
        if (size > iniString.length())
            return iniString;
        int index = 0;
        char[] array = new char[size];
        char last = iniString.charAt(0);
        int count = 1;

        for (int i = 1; i < iniString.length(); i++) {
            if (iniString.charAt(i) == last) {
                count++;
            } else {
                index = setChar(array, last, count, index);
                last = iniString.charAt(i);
                count = 1;
            }
        }
        setChar(array, last, count, index);

        return String.valueOf(array);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str = "abbccccccde";
        String zipString = zipString(str);
        String zipString2 = zipString2(str);
        System.out.println("Old string (len = " + str.length() + "): " + str);
        System.out.println("Compressed string (len = " + zipString.length() + "): " + zipString);
        System.out.println("Compressed string (len = " + zipString2.length() + "): " + zipString2);
    }

}
