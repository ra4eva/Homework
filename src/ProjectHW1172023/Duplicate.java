package ProjectHW1172023;

public class Duplicate {
    public static void main(String[] args) {
        String[] colors={"Blue","Red","Pink","Purple","Red","Blue"};

        for (int i=0;i< colors.length-1;i++){
            for (int j=i+1;j< colors.length;j++){
                if ((colors[i].equals(colors[j]))&&(i!=j)){
                    System.out.println("The duplicate elemnts from the Array are: " +colors[j]);
                }
            }
        }
    }
}
