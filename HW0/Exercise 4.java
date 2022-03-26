public class BreakContinue {
    public static void windowPosSum(int[] a, int n) {

        for(int i = 0; i < a.length; i++){
            //Not do anthing when a[i] is negative.
            if(a[i]>0){
                for(int j=1;j<=n;j++){

                //累加时如果大于length终止循环。n>3时可节省运行时间。
                /* if(j+i>=a.length)
                    break;  */

                //increase progressively  of a[i] when not reach the end of the array.
                //第一次写的时候有一行if(i-(a.length-1)<1)，想不起来什么意思了，发现删了更好hhhh
                if(i+j<a.length)
                    a[i]=a[i]+a[i+j];
                }
             }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a, n);
        // Should print 4, 8, -3, 13, 9, 4
        System.out.println(java.util.Arrays.toString(a));

        int[] b = {1, -1, -1, 10, 5, -1};
        int m = 2;
        windowPosSum(b,m);
        // Should print -1, -1, -1, 14, 4, -1
        System.out.println(java.util.Arrays.toString(b));
    }
}