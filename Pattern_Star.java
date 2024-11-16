public class Pattern_Star {
    public static void main(String[] args) {
        int num=5;
        // Star Pattern
        for(int i=1;i<=num;i++)
        {
            for(int k=num; k>i;k--)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
