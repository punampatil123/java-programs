public class Fix {
    public static void main(String args[])
    {
        int[] arr1={1,2,3};
        int indexOfTwo  = getIndexOfTwo(arr1);

        if (indexOfTwo==Integer.MIN_VALUE)
            System.out.println("Array doesnt have 2 in it !!");
        else {

            if (arr1[indexOfTwo + 1] == 3) {
                arr1[indexOfTwo + 1] = 0;
            }
            System.out.println("Result Array: ");
            for (int i = 0; i < arr1.length; i++) {
                System.out.print(" " + arr1[i]);

            }
        }

    }

    private static int getIndexOfTwo(int[] arr1) {
        for(int i=0; i<arr1.length; i++){
            if (arr1[i]==2)
                return i;
        }
        return Integer.MIN_VALUE;
    }
}
