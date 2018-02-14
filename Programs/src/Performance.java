

public class Performance {

    public static void main(String[] args) {
        String string= new String("");
        StringBuffer strbuffer = new StringBuffer("");
        StringBuilder stringBuilder = new StringBuilder("");

        long starttime = System.currentTimeMillis();
        for (int i = 0; i <10000 ; i++) {
            string =string.concat(""+i);
        }
        long endtime = System.currentTimeMillis();
        System.out.println("Time taken by String for execution = "+ (endtime-starttime));



        starttime = System.currentTimeMillis();
        for (int i = 0; i <10000 ; i++) {
            strbuffer.append(" "+i);
        }
        endtime = System.currentTimeMillis();
        System.out.println("Time taken by buffer for execution = "+ (endtime-starttime));


        starttime = System.currentTimeMillis();
        for (int i = 0; i <10000 ; i++) {
            stringBuilder.append(" "+i);

        }
        endtime = System.currentTimeMillis();
        System.out.println("Time taken by Builder for execution = "+ (endtime-starttime));

    }
}
