public class BreakContinue {
    public static void main(String[] args) {
        //Break example
        // for(int i = 0;i<=10;i++){
        //     if(i == 4){
        //         break;
        //     }
        //     System.out.println(i);
        // }
        //Continue Example
        for (int i = 1; i<=10; i++){
        if (i % 2 == 0){
            continue;
        }
        
        System.out.println(i);
        }    //Output :1 3 5 7 9 
    }
}
//continue :
//if(condition1){
//if(condition2){
//}
//}