package demo.yqy.org.sortdemo.sort;

/**
 * @author yqy
 * @create 19-7-10
 * @Describe 希尔排序
 * <p>
 * 插入排序的改进版。为了减少数据的移动次数，在初始序列较大时取较大的步长，
 * 通常取序列长度的一半，此时只有两个元素比较，交换一次；之后步长依次减半直至步长为1，
 * 即为插入排序，由于此时序列已接近有序，故插入元素时数据移动的次数会相对较少，效率得到了提高
 * <p>
 * 时间复杂度：通常认为是O(N3/2) ，未验证　　稳定性：不稳定
 */
public class ShellSort {

    public static int[] shellSort(int arr[]) {
        if (arr == null || arr.length == 0) {
            return arr;
        }

        int d = arr.length;

        while (true) {
            d = d / 2;
            for (int x = 0; x < d; x++) {

                for (int i = x + d; i < arr.length; i = i + d) {
                    int temp = arr[i];
                    int j;

                    for (j = i - d; j >= 0 && arr[j] > temp; j = j - d) {
                        arr[j + d] = arr[j];
                    }

                    arr[j + d] = temp;
                }

            }

            if (d == 1) {
                break;
            }
        }
        return arr;
    }
}
