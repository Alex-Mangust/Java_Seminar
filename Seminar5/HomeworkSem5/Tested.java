import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Tested {
    public static void buildTree(int[] arr) {
        int n = arr.length - 1;
        
    }

    public static void main(String[] args) {
        int[] a = { 12, 11, 13, 5, 6, 7};
        buildTree(a);
        System.out.println(Arrays.toString(a));
    }
}

// 12, 11, 13, 5, 6, 7
// 0 1 2 3 4 5

// 12 - 11, 13
// 0 1 2

// 11 - 5, 6
// 1 3 4

// 13 - 7
// 2 5