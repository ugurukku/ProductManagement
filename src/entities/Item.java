package entities;

import managers.BrandManager;
import managers.CategoryManager;
import managers.SellerManager;

public class Item {

    private int id;

    private String name;

    private boolean isNew;

    private int categoryId;

    private double price;

    private int sellerId;

    private double rate;

    private int brandId;

    public Item() {
    }

    public Item(int id, String name, boolean isNew, int categoryId, double price, int sellerId, double rate, int brandId) {
        this.id = id;
        this.name = name;
        this.isNew = isNew;
        this.categoryId = categoryId;
        this.price = price;
        this.sellerId = sellerId;
        this.rate = rate;
        this.brandId = brandId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    @Override
    public String toString() {

        CategoryManager categoryManager = new CategoryManager();
        SellerManager sellerManager = new SellerManager();
        BrandManager brandManager = new BrandManager();

        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isNew=" + isNew +
                ", category=" + categoryManager.getById(categoryId) +
                ", price=" + price +
                ", seller=" + sellerManager.getById(sellerId) +
                ", rate=" + rate +
                ", brand=" + brandManager.getById(brandId) +
                '}';
    }
}
