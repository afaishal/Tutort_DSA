public class PrintEvenNumber {
    public static void main(String[] args){
        printEven(20);
    }
    public static void printEven(int num){
        for(int i=0; i<num; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
