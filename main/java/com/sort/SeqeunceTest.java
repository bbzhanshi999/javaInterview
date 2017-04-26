package com.sort;

public class SeqeunceTest {

    public static int[] arr = {56, 43, 67, 89, 32, 23, 15};


    public static void main(String[] args) {
        int[] arr = {56, 43, 67, 89, 32, 23, 15};
        for (int data : arr) {
            System.out.print(data + " ");
        }
        System.out.println("排序之前");
        bubbleSort(arr);
        selectSort(arr);
        directInsertSort(arr);
        quickSort(arr, 0, arr.length - 1);
        System.out.print("排序后的数组为：");
        for (int data : arr) {
            System.out.print(data + " ");
        }
    }

    /**
     * 冒泡排序法：相邻两个元素做比较，
     * 优点：稳定简单，缺点：最坏的情况下，是将倒序转为逆序，比较慢
     */
    public static void bubbleSort(int[] arr) {

        for (int a = 1; a < arr.length-1; a++) {
            for (int b = 0; b <= arr.length-1-a; b++) {
                int temp;
                if (arr[b] > arr[b+1]) {
                    temp = arr[b+1];
                    arr[b+1] = arr[b];
                    arr[b] = temp;
                }
            }
        }
        System.out.println("---冒泡排序----");
        for (int i : arr) {
            System.out.print(i + ",");
        }
        System.out.println("");
    }

    /**
     * 选择排序法：每回合选出一个最大最小值，并且将他放置于头或尾，然后第二轮排除这个位置继续排序
     * 优点：移动元素的次数是固定的，都是n—1次，缺点：是不稳定的排序，比较次数较多
     */
    public static void selectSort(int[] arr) {

        for (int a = 0; a < arr.length - 1; a++) {
            for (int b = a + 1; b < arr.length; b++) {
                int temp = arr[a];
                if (arr[a] < arr[b]) {
                    temp = arr[b];
                    arr[b] = arr[a];
                    arr[a] = temp;
                }
            }
        }
        System.out.println("---选择排序----");
        for (int i : arr) {
            System.out.print(i + ",");
        }
        System.out.println("");
    }

    /**
     * 快速排序法：宗旨是数组按大小左右分开，然后再将两边继续左右分开，直至排序完成。（代码细节上需要设置key值，一般将头部第一个值作为key，
     * 替换方式采用哨兵模式。）
     * 优点：速度快，缺点是由于采用递归，因此内存占用量较大，另外是不稳定排序
     *
     * @param arr
     * @param start
     * @param end
     */
    public static void quickSort(int[] arr, int start, int end) {
        if (start > end || end >= arr.length) {
            return;
        }
        int key = arr[start];
        int i = start;
        int j = end;


        while (i != j) {
            while (arr[j] < key && i < j) {
                j--;
            }
            while (arr[i] > key && i < j) {
                i++;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;
        ;

        quickSort(arr, start, j - 1);
        quickSort(arr, j + 1, end);
    }

    /**
     * 直接插入排序法：将已经排序好的数组中的一部分设为排序组，让后将之后的元素纳入进已排序数组，然后继续排序，直至最后一个元素纳入有序组排序完成
     * 优点：稳定，简单
     * 缺点：比较次数不一定
     *
     * @param
     */
    private static void directInsertSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            //待插入元素
            int temp = a[i];
            int j;

            for (j = i - 1; j >= 0; j--) {
                //将大于temp的往后移动一位
                if (a[j] > temp) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
            }
            a[j + 1] = temp;
        }
        System.out.println("---直接插入排序----");
        for (int i : arr) {
            System.out.print(i + ",");
        }
        System.out.println("");
    }
}
