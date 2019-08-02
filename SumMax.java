package day09;

import java.util.Scanner;

/**
 * @ClassName SumMax
 * @Description TODO
 * @Auther danni
 * @Date 2019/8/2 13:48]
 * @Version 1.0
 **/

public class SumMax {
    public int Max(int[] arr) {
        int sum = 0;
        int num=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0&&i==arr.length-1){
                continue;
            }
            if((sum+arr[i])<0 && i!=arr.length-1){
                    sum=0;
                    continue;
            }
            if(arr[i]<0){
                int j=i;
                while(j<arr.length){
                num+=arr[j];
                if(num>0){
                    sum+=num;
                    j++;
                    return sum; }
                }
                if(num<0){
                    return sum;
                }
            }
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        SumMax max=new SumMax();
        int [] arr={1,2,3,-10,-5,3,1,5};
        System.out.println(max.Max(arr));
    }
}
