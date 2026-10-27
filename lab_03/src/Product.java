public class Product{
    private String name;
    private Double price;
    static int numberOfProducts;


    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
        if(numberOfProducts>MAX_PRODUCTS){
            throw new IllegalStateException();
        }
        numberOfProducts++;
    }

    static int getNumberOfProducts(){
        return numberOfProducts;
    }

    ///part 2
    ///
    public static final int MAX_PRODUCTS = 5;
}
