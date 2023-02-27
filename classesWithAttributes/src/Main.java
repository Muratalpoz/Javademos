public class Main {

    public static void main(String[] args) {
    product product= new product();
        product.name="laptop";
        product.id=1;
        product.description="asus laptop";
        product.price=5000;
        product.stockAmount=3;


        productManager productManager=new productManager();
        productManager.add(product);

    }
}
