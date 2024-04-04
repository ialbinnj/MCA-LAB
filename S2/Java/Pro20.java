import java.util.*;

class CheckException extends Exception{
   public CheckException(String input){
      super(input);
   }
}

public class Pro20 {
    public static void main(String[] args) {
        double sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Count of numbers");
        int N = sc.nextInt();
        int count=0;
        int[] numbers = new int[N];
        for(int i =0;i<N; i++){
            System.out.println("Enter the number");
            numbers[i] = sc.nextInt();
        }
        for(int i =0;i<N; i++){
            try {
                if (numbers[i] >= 0) {
                    sum += numbers[i];
                    count+=1;
                } else {
                    throw new CheckException("Negative number : " +numbers[i]);
                }
            }
            catch (CheckException e){
                System.out.println(e.getMessage());
            }
        }
        double avg = sum/count;
        System.out.println("Average of Positive Numbers ="+avg);

    }

}
