public class OracleDatabase extends Database{


    public OracleDatabase(String server, String database) {
        super(server, database);
    }

    @Override
    public Product[] readProducts(String productName) {
        return new Product[0];
    }

    @Override
    public void writeProduct(Product[] products) {

    }

    @Override
    public Customer[] readCustomers(String name) {
        return new Customer[0];
    }

    @Override
    public void writeCustomers(Customer[] customers) {

    }

    @Override
    public Order readOrder(int ID) {
        return null;
    }

    @Override
    public void wtiteOrder(Order order) {

    }
}
