package ProjectHW1172023;

public class SecondLargest {
    public static void main(String[] args) {
        int [] nums={10,20,30,40,50,60,80};
        int max=0;
        int secondL=0;

        for (int i=0;i< nums.length;i++){
            if (nums[i]>max){
                secondL=max;
                max=nums[i];
             }else if (nums[i]>secondL){
                secondL=nums[i];
            }
        }System.out.println(secondL);

    }
}
