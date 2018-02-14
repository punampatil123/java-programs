public class Plusto {
    public static void main(String args[])
    {
        int[] arr1 = {1,2};
        int[] arr2 ={3,2};
        int result[] = plusTow(arr1, arr2);
        System.out.println("Result array: ");
        for (int i = 0; i <result.length ; i++) {
            System.out.print(" "+result[i]);

        }

    }

    private static int[] plusTow(int[] arr1, int[] arr2) {
        int result [] = new int[arr1.length+arr2.length];
        int j=0;

        for (int i = 0; i <arr1.length ; i++, j++) {
            result[j]=arr1[i];
        }

        for (int i = 0; i <arr2.length ; i++,j++) {
            result[j]=arr2[i];
        }
        return result;
    }
}
