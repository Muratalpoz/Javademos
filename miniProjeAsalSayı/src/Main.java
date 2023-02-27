public class Main {

    public static void main(String[] args) {
	int number=12;
	boolean isPrime=true;

        if (number==1) {
            System.out.println("sayı asal değidir");
            return;
        }

        if(number<1){
            System.out.println("sayı gecersiz");
        }

	for(int i=2;i<number;i++){
	    if(number%2==0){
	        isPrime=false;
        }
    }
    if(isPrime==true){
        System.out.println("sayı asaldır.");
    }
    else{
        System.out.println("sayı asal değildir.");
    }
    }
}
