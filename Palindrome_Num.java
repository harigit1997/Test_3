public class Palindrome_Num
{
    public static void main(String[] args) {
        int num=56789;
        int count=0;
        int rem=0, rev=0;
        int original_num=num;
        while(num!=0)
        {
            rem=num%10;
            num=num/10;
            System.out.println(rem);
            rev=rev*10+rem;
            System.out.println(rev);
            count++;
        }
        System.out.println(count);
        if(original_num==rev)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome!");
        }

    }
}

