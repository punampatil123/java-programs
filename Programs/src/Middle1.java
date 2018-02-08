public class Middle1 {
    public static void main(String args[])
    {
        String str ="punam";
        String str1="patil";
        char re=str.charAt(1);
        System.out.println("re = " + re);

        boolean res=str.equals(str==str1);
        System.out.println("res= " + res);

        String result=str.substring(3);
        System.out.println("result = " + result);
        
        int i=str.length();
        System.out.println("i = " + i);

        boolean res1=str.startsWith("p");
        System.out.println("res1 = " + res1);


        boolean res2=str.endsWith("n");
        System.out.println("res1 = " + res1);
        
        int i2=str.compareTo(str1);
        System.out.println("i2 = " + i2);

        int i1=str.indexOf(1);
        System.out.println("i1 = " + i1);
        
        int i3=str.codePointAt(2);
        System.out.println("i3 = " + i3);

        String s2=str.substring(3,5);
        System.out.println("s2 = " + s2);

        boolean b=str.equalsIgnoreCase(str1);
        System.out.println("b = " + b);
    }
}