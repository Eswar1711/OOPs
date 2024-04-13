public class EvenOdd {
    public static void main(String[] args) {
        int num =10;
        int EvenCount=0;
        int OddCount=0;
        for(int i=10;i>=num;i--){
            if(num==0){
                break;
            }
            if(num%2==0){
                EvenCount++;
               // System.out.println("Even"+" " +num);
            }
            else {
                OddCount++;
               // System.out.println("odd" + " " + num);
            }
            num--;
        }
        System.out.println("Even Count" + EvenCount + "  "+"   "+ "Odd Count"  + OddCount );
    }
}
