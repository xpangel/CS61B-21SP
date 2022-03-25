public class Exercise2 {
    public static int max(int[] m) {
        int i;
        int tempmax=0;
        int variable;

        for (i=0; i< m.length-1 ;i++)
        {
            variable=m[i];
            if(tempmax < variable)
                tempmax = variable;
        }
        return tempmax;
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        max(numbers);
    }
}