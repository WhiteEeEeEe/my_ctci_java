package chapter1;

import ctciLibrary.AsSortedMethods;

/**
 * @author yongrong
 * ��һ����NxN�����ʾ��ͼ������ÿ��������һ��int��ʾ�����дһ���㷨���ڲ�ռ�ö����ڴ�ռ�������(����ʹ�û������)����ͼ��˳ʱ����ת90�ȡ�
 * ����һ��NxN�ľ��󣬺;���Ľ���N,�뷵����ת���NxN����,��֤NС�ڵ���500��ͼ��Ԫ��С�ڵ���256��
 */

public class Question1_6 {
    /**
     * ������㿪ʼ����ÿһ���ϰ�������һ��һ������ת��
     * @param mat ����
     * @param n ����
     * @return ��ת��ľ���
     */
    public static int[][] transformImage(int[][] mat, int n) {
        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; i++) {
                int offset = i - first;
                // �洢����
                int top = mat[first][i];
                // ����
                mat[first][i] = mat[last - offset][first];
                // �µ���
                mat[last - offset][first] = mat[last][last - offset];
                // �ҵ���
                mat[last][last - offset] = mat[i][last];
                // �ϵ���
                mat[i][last] = top;
            }
        }
        return mat;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[][] matrix = AsSortedMethods.randomMatrix(10, 10, 0, 9);
        AsSortedMethods.printMatrix(matrix);
        System.out.println("After rotation");
        AsSortedMethods.printMatrix(transformImage(matrix, 10));
    }

}
