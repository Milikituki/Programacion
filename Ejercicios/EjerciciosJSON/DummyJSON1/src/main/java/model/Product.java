package model;
import java.time.OffsetDateTime;
import java.util.List;

@lombok.Data
public class Product {
    private long id;
    private String title;
    private String description;
    private String category;
    private double price;
    private double discountPercentage;
    private double rating;
    private long stock;
    private List<String> tags;
    private String brand;
    private String sku;
    private long weight;
    private Dimensions dimensions;
    private String warrantyInformation;
    private String shippingInformation;
    private String availabilityStatus;
    private List<Review> reviews;
    private String returnPolicy;
    private long minimumOrderQuantity;
    private Meta meta;
    private List<String> images;
    private String thumbnail;

    public void mostrarDatos(){
        System.out.println("id = " + id);
        System.out.println("title = " + title);
        System.out.println("price = " + price);
        System.out.println();
    }
}


@lombok.Data
class Dimensions {
    private double width;
    private double height;
    private double depth;
}

@lombok.Data
class Meta {
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
    private String barcode;
    private String qrCode;
}

@lombok.Data
class Review {
    private long rating;
    private String comment;
    private OffsetDateTime date;
    private String reviewerName;
    private String reviewerEmail;
}


