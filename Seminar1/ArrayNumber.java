// 📌Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
// максимальное количество подряд идущих 1.


// public class ArrayNumber {
//     public static void main(String[] args) {
//         int array[] = new int[]{1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 0};
//         int oneCount = 0, count = 0;

//         for (int i = 1; i < array.length; i++){
//             if (array[i] == 1 && array[i-1] == 1) oneCount++;
//             else if (array[i] == 0 && array[i-1] == 1) oneCount++;
//             else if (count < oneCount){
//                 count = oneCount;
//                 oneCount = 0;
//             }
//             else oneCount = 0;
//         }
//         System.out.println(count);
//     }
// }


public class ArrayNumber {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1,0,1,1,1,1};
        System.out.println(getMaxSequenceOnes(nums));
    }

    static int getMaxSequenceOnes(int[] array) {
        int count = 0;
        int maxSequenceOnes = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] == 1) {
                count++;
//                maxSequenceOnes = Math.max(count, maxSequenceOnes);
                maxSequenceOnes = count < maxSequenceOnes ? maxSequenceOnes : count;
            }
            else count = 0;
        }
        return maxSequenceOnes;
    }
}