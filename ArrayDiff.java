import java.util.ArrayList;

public class ArrayDiff {

    // Your goal in this kata is to implement a difference function, which subtracts one list from another
    // and returns the result.It should remove all values from list a, which are present in list b keeping their order.

    public static void main(String[] args) {

        int[] arrayDiff = findDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2});

        for(int i : arrayDiff){
            System.out.println(i);
        }

    }

    /**
     * Method to find differences between 2 given arrays
     * <p>
     *
     * <pre>
     * Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
     * Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}
     * </pre>
     *
     * @param a int[] first array
     * @param b int[] second array
     * @return int[] with the values presents in only one array
     */
    static int[] findDiff(int[] a, int[] b) {

        ArrayList<Integer> resultList = new ArrayList<>();
        boolean match = false;

        for (int i = 0; i < a.length; i++) {
            match = false;
            for (int x = 0; x < b.length; x++) {

                if (a[i] == b[x]) {
                    match = true;
                }
            }
            if (!match) {
                resultList.add(a[i]);
            }
        }


        int[] resultArray = resultList.stream().mapToInt(i -> i).toArray();
        return resultArray;

    }

}
