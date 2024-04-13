public class pattern3 {
    public static void main(String[] args) {
        for(int i=0;i< 4;i++){
            System.out.println();
        }

        for(int i=0;i<5;i++){
            if(i==1) {
                System.out.print("  ");
                for (int j = 0; j < 8; j++) {

                    if(j==2 || j==4){
                        System.out.print("*"+" ");
                    }
                    else{
                        System.out.print("  ");
                    }

                }
                System.out.println();
            }
            if(i==4) {
                System.out.print("  ");
                for (int j = 0; j < 8; j++) {

                    if(j==0 || j==6){
                        System.out.print("*"+" ");
                    }
                    else{
                        System.out.print("  ");
                    }

                }
                System.out.println();
            }


            if(i==0){
                System.out.print("  ");
                for (int j = 0; j < 8; j++) {
                    if(j==3){
                        System.out.print("*"+" ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }

            if(i==3){
                System.out.print("  ");
                for (int j = 0; j < 8; j++) {
                    if(j>0 && j<6){
                        System.out.print("*"+" ");
                    }

                    else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
        for(int i=0;i< 2;i++){
            System.out.println();
        }

    }
}
