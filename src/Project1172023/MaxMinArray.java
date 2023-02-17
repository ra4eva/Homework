package Project1172023;

public class MaxMinArray {
    public static void main(String[] args) {
        int [] nums={10,20,30,40,50,60,80};
        int max=0;
        int min=nums[0];
        for (int i=0;i< nums.length;i++){
            if (nums[i]>max){
                max=nums[i];
            }
        }
        for (int i=0;i< nums.length;i++){
            if (nums[i]<=min){
                min=nums[i];
             }
        }        System.out.println("the max number of this array is: " +max);
                 System.out.println("the max number of this array is: " +min);


    }
}
