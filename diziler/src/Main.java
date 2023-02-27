public class Main {

    public static void main(String[] args) {
	String ogrenci1="ayse";
    String ogrenci2="ismail";
    String ogrenci3="kerem";
    String ogrenci4="murat";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("-----------");

        String[] ogrenciler=new String[4];
        ogrenciler[0]="ayse";
        ogrenciler[1]="ismail";
        ogrenciler[2]="kerem";
        ogrenciler[3]="murat";


        for(int i=0;i< ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }
        System.out.println("-----------");

        for(String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }



    }
}
