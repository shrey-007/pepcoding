package Numbers;

import java.util.ArrayList;

public class PrimeFactorisation {
    public static ArrayList<Integer> func(int num,ArrayList<Integer> arrayList){
        for (int i = 2; i <=num ; i++) {
            if(num%i==0){
                arrayList.add(i);
                func(num/i,arrayList);
                break;
            }
        }
        return arrayList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        func(82,arrayList);
        System.out.println(arrayList);
    }
}
