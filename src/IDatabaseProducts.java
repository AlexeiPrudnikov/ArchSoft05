public interface IDatabaseProducts{
    public Product[] readProducts(String productName);
    public void writeProduct(Product[] products);
}
