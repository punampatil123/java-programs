public class Unlucky {
    public static void main(String args[]){
    int[] arr1={3,1,4};
    int arrayofindexone=getindexofone(arr1);
    if (arr1[arrayofindexone+1]==3)
        System.out.println("Luckey");
    else
        System.out.println("Unlukey");
    }

    private static int getindexofone(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {

            if (arr1[i]==1)
                return i;
        }
        return Integer.MIN_VALUE;
    }


}
