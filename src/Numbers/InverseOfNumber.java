package Numbers;

public class InverseOfNumber {
    public static int func(int num){
        int ans=0;
        int count=1;
        while(num>0){
            int currDigit=num%10;
            ans=ans+count*(int)Math.pow(10,currDigit-1);
            count++;
            num=num/10;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(func(15234));
    }
}
