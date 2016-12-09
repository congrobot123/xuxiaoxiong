
public class TestTwoArray
{
    public static void main(String[] args)
    {
        int[][] a;
        a = new int[5][];
        for (int i = 0 , len = a.length; i < len; i++ )
        {
            System.out.println(a[i]);
        }

        a[0] = new int[3];
        a[0][1] = 9;
        for (int i = 0 , len = a[0].length ; i < len ; i ++ )
        {
            System.out.println(a[0][i]);
        }

        String[][] str1 = new String[][]{
                                            new String[3],
                                            {    new String("hello"),
                                                new String("world")
                                            }
                                        };
        System.out.println(str1[1][1]);
    }
}