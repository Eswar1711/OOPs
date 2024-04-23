public class Prime {
    public static void main(String[] args) {
        int num = 30;
       for(int i=num; i>=1;i--){
           int count=0;
           for(int j=1; j<=7;j++){
               if(i%j==0){
                   count++;
               }
           }
        /*   if(count==1 || i == 2 ||i== 3 ||i== 5 ||i== 7){
               System.out.print(i);
           }*/

       }
    }
}
