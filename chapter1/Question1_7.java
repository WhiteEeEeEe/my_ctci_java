package chapter1;

import ctciLibrary.AsSortedMethods;

/**
 * @author yongrong
 * ���дһ���㷨����N�׷�����ĳ��Ԫ��Ϊ0���������ڵ����������㡣����һ��N�׷���int[][](C++��Ϊvector<vector><int>>)mat�;���Ľ���n��
 * �뷵����ɲ������int[][]����(C++��Ϊvector<vector><int>>)����֤nС�ڵ���300�������е�Ԫ��Ϊint��Χ�ڡ�</int></vector></int></vector>
 */
public class Question1_7 {
    /**
     * ��һ�α����ֱ������������¼������Ԫ�ص��к��У��ڶ��α�������Ӧ���к��б��Ϊ��
     * @param mat ����ľ���
     * @param n ����Ľ���
     * @return �����ľ���
     */
    public static int[][] clearZero(int[][] mat, int n) {
        boolean[] rows = new boolean[n];
        boolean[] columns = new boolean[n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (mat[i][j] == 0) {
                    rows[i] = true;
                    columns[j] = true;
                }
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (rows[i] || columns[j])
                    mat[i][j] = 0;
        return mat;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n = 10;
        int[][] matrix = AsSortedMethods.randomMatrix(n, n, 0, 100);
        AsSortedMethods.printMatrix(matrix);
        System.out.println("After set zeros");
        AsSortedMethods.printMatrix(clearZero(matrix, n));
    }

}
