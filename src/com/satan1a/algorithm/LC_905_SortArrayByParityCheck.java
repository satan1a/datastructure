package com.satan1a.algorithm;

/**
 * LC_905_SortArrayByParityCheck
 * 根据奇偶性对数组元素进行排序
 * @author satan1a
 * @date 2018_9_30
 * 第 2 天
 */
public class LC_905_SortArrayByParityCheck {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] A = new int[]{1,2,3,4,5,6,7,8};

        for (int number: solution.sortArrayByParity(A)) {
            System.out.printf(number + " ");

        }

    }

}

class Solution {
    public int[] sortArrayByParity(int[] A) {

        // Create a int type array to contain the sorted number
        int[] intArray = new int[A.length];
        int sum = 0;

        for (int i = 0; i < A.length; i++) {
            if((A[i] % 2) == 0) {
                intArray[sum] = A[i];
                sum++;
                // Make even number equal to zero, then we can operate odd number easily
                A[i] = 0;

            }

        }

        for (int number: A) {
            if (number != 0) {
                intArray[sum] = number;
                sum++;

            }

        }

        return intArray;

    }
}

