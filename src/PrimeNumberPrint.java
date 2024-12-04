public class PrimeNumberPrint {
    public static void main(String[] args){
// this one better than second
        for (int i = 2; i <100; i++) {
            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
/*
        for (int i=2;i<100;i++){
            int x=2;
            while (x<=i){
                if(i%x==0 )break;
                x++;
            }
            if(x==i) System.out.println(i);
        }

 */






    }
}
