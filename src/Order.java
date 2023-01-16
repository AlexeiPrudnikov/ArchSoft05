import java.util.Date;
import java.util.HashMap;

public class Order {
    private int orderID;

    Database database;

    private Customer customer;
    private Date date;
    private HashMap<Product, Integer> cart;
    private OrderStatus status;

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public int getOrderID() {
        return orderID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Date getDate() {
        return date;
    }

    public HashMap<Product, Integer> getCart() {
        return cart;
    }

    public void addProduct(Product product, int count) {

    }

    public void removeProduct(Product product) {

    }

    public int getOrderPrice() {
        return 0;
    }

    public int buy() {
        return 0;
    }

    public Order(int orderID, Database database, Customer customer, Date date, HashMap<Product, Integer> cart, OrderStatus status) {
        this.orderID = orderID;
        this.database = database;
        this.customer = customer;
        this.date = date;
        this.cart = cart;
        this.status = status;
    }
}
