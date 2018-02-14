public class Everywhere {
    public static void main(String args[])
    {
        int arr1[]={1,2,1,3,1};
        int value=1;

        for (int i = 0; i < arr1.length ; i++) {
            if(arr1[i]==value || arr1[i+1]==value)
            {
                return true;
            else{
                return false;
            }
            }




        }
    }

}
