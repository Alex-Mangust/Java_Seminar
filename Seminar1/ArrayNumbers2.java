// 📌 Дан массив nums = [3,2,2,3] и число val = 3.
// 📌 Если в массиве есть числа, равные заданному, нужно перенести
// эти элементы в конец массива.
// 📌 Таким образом, первые несколько (или все) элементов массива
// должны быть отличны от заданного, а остальные - равны ему.

import java.util.Arrays;

// public class ArrayNumbers2 {
//     public static void main(String[] args) {
//         int arrayOne[] = new int[]{3, 2, 1, 3, 2, 3};
//         int arrayTwo[] = new int[arrayOne.length];
//         int val = 3, index = 0;
//         for (int i = 0; i < arrayOne.length; i++){
//             if (arrayOne[i] != val){
//                 arrayTwo[index] = arrayOne[i];
//                 index++;
//             }
//         }
//         for (int i = 0; i < arrayOne.length; i++){
//             if (arrayOne[i] == val){
//                 arrayTwo[index] = arrayOne[i];
//                 index++;
//             }
//         }
//         for (int i = 0; i < arrayTwo.length; i++) {
//             System.out.print(arrayTwo[i]);
//             if (i < arrayTwo.length - 1) System.out.print(", ");
//         }
//     }
// }



// public class ArrayNumbers2 {
//     public static void moveToEnd(int [] array, int val) {
//         for (int i = 1; i < array.length; i++){
//             if (array[i-1] == val){
//                 int j = i;
//                 while (array[j] != val) {
//                     array[i] = array[j];
//                     j++;
//                 }
//                 i = j;
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int array[] = new int[]{3, 2, 2, 3, 3};
//         int val = 3;
//         moveToEnd(array, val);
//         for (int i = 0; i < array.length; i++){
//             System.out.print(array[i]);
//             if (i < array.length - 1) System.out.print(", ");;
//         }
//     }
// }


public class ArrayNumbers2 {
    public static void main(String[] args) {
        int[] array = {3,2,2,3,3,4,5,6,7,8,9,9,1,1,22,3,3,4,-4,4,};
        int val = 22;
        System.out.println(Arrays.toString(array));
        moveToEnd(array, val);
        System.out.println(Arrays.toString(array));
    }
    public static void moveToEnd(int[] array, int val) {
        int leftIndex = 0;
        int rightIndex = array.length - 1;
        while(leftIndex < rightIndex) {
            while(array[rightIndex] == val && rightIndex > leftIndex) {
                rightIndex--;
            }
            if(array[leftIndex] == val){
                int temp = array[leftIndex];
                array[leftIndex] = array[rightIndex];
                array[rightIndex] = temp;
                rightIndex--;
            }
            leftIndex++;
        }
    }
}