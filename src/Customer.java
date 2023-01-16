public class Customer {
    private String name;
    private String address;
    private String userName;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Customer(String name, String address, String userName) {
        this.name = name;
        this.address = address;
        this.userName = userName;
    }
}
