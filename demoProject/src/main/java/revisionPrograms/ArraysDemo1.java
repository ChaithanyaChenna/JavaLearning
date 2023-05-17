package revisionPrograms;

public class ArraysDemo1 {
    public static void main(String[] args) {
        int[] a=new int[5];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
       // a[4]=5;


        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        String[] str={"Apple","Banana","Grapes"};

        for(int i=0;i<str.length;i++)
        {
            System.out.println(str[i]);
        }

        String[] a1=new String[3];

        a1[0]="abc";
        a1[1]="acr";
        for(int i=0;i<a1.length;i++)
        {
            System.out.println(a1[i]);
        }

    }
}
