public class Multiple{

    public static void main(String[] args) {
        
        int i;
        int j = 0;

        for(i=1; i<=1000; i++){

            if(i%3 == 0 || i%5 == 0){
                j = j+i;
                System.out.println(i);
            }
        }
        System.out.println("Sum of all multiples is " + j);
    }
}