package arrays;

public class LoopingCount {
    public static void main(String[]args){
        int[]ages = new int[100];
        for (int i =100; i<ages.length;i++){
            ages[i]=i;
            System.out.println(ages[i]);
        }
    }
}
