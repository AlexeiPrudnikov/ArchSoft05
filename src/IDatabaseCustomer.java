public interface IDatabaseCustomer {
    public Customer[] readCustomers(String name);
    public void  writeCustomers(Customer[] customers);
}
