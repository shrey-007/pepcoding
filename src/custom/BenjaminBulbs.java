package custom;

public class BenjaminBulbs {
    //method 1=har round pr dekho ki kon kon ko toggle kr rha hai vo
     public int toggleBulb(int arr[],int bulb,int count){
         if(arr[bulb]==0){
             arr[bulb]=1;
             return count-1;
         }
         else{
             arr[bulb]=0;
             return count+1;
         }
     }
     public int bulbSwitch(int n) {
         int count=n;     //indicating all are on
         int arr[]=new int[n+1];  //0 means all r on and 1 means all r off
         for(int round=2;round<=n;round++){
             for(int bulb=1;bulb<=n;bulb++){
                 if(bulb%round==0){
                     count=toggleBulb(arr,bulb,count);
                 }
             }
         }

     return count;
     }

     //method2=har bulb ko dekho kitne baar toggle ho rha hai, if eve baar toggle ho rha h then off else on
     public int bulbSwitch2(int n) {
         int ans=n;
         for(int bulb=1;bulb<=n;bulb++){
             int count=0;
             for(int i=2;i<=bulb;i++){
                 if(bulb%i==0){count++;}
             }
             if(count%2!=0){ans--;}
         }

         return ans;
     }

     //method3=only numbers who are perfect squares are on
     //explaination= any number is divided by a then a*b=num
    //than that number is also divided by b coz b*a=num
    //so every number can be written in a*b and b*a form
    //ex=12= 1*12 and 12*1 so there are two factors 1,12
    //       3*4 and 4*3 so there are two factors 4,3
    //       2*6 and 6*2 so there are two factors 2,6
    //so there are always even number of divisors

    //but take example of 36
    //1*36 and 36*1
    //2*18 and 18*2
    //3*6 and 6*3
    //4*9 and 9*4
    //6*6 ye akela aayya hai. isliye perfect square ke odd numbers of divisors hote hai
    //and bulb vahi khule hoge jo odd baar toggle hue hai, means unke odd divisors hai, means voh perfect square hai

    //


    public int func3(int n){
         //ab 0 t0 n tak ye mt check krna ki kon perfect square hai
        //simply dekho 1 ka square hai toh on hoga
        //2 ka square(i.e bulb 4 agar hai toh on hoga)
        //3 ka square(i.e bulb 9 agar hai toh on hoga)
         int count=0;
        for (int i = 1; i <=n ; i++) {
            if(i*i<=n){count++;}
        }
        return count;
    }


    public static void main(String[] args) {

    }
}
