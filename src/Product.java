public class Product {
    private String name;
    private Category category;
    private int price;

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object obj) {
        Product in = (Product) obj;
        return this.name == in.name && this.category == in.category && this.price == in.price;
    }

    public Product(String name, Category category, int price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }
}
