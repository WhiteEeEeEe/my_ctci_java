package chapter1;

/**
 * @author yongrong
 * 请编写一个方法，将字符串中的空格全部替换为“%20”。假定该字符串有足够的空间存放新增的字符，并且知道字符串的真实长度(小于等于1000)，同时保证字符串
 * 由大小写的英文字母组成。给定一个string iniString 为原始的串，以及串的长度 int len, 返回替换后的string。
 */
public class Question1_4 {

    /**
     * 第一次扫描算出字符串中一共有多少个空格，从而算出最终字符串长度；第二次扫描进行反向编辑，如果是空格就用20%替换，否则复制原来字符
     * @param iniString
     * @param length
     * @return
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

    /**
     * 使用正则表达式
     * @param iniString
     * @param length
     * @return
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
