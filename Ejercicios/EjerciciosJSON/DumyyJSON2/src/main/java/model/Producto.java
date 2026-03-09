package model;
import com.fasterxml.jackson.annotation.JsonCreator;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;

@lombok.Data
public class Producto {
        private long id;
        private String title;
        private String description;
        private Category category;
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
        private AvailabilityStatus availabilityStatus;
        private List<Review> reviews;
        private ReturnPolicy returnPolicy;
        private long minimumOrderQuantity;
        private Meta meta;
        private List<String> images;
        private String thumbnail;

        public void mostrarDatos(){
            System.out.println("title = " + title);
            System.out.println("description = " + description);
            System.out.println("category = " + category);
        }
}

enum AvailabilityStatus {
        IN_STOCK, LOW_STOCK;

        public String toValue() {
            switch (this) {
                case IN_STOCK: return "In Stock";
                case LOW_STOCK: return "Low Stock";
            }
            return null;
        }

    @JsonCreator
    public static AvailabilityStatus forValue(String value) throws IOException {
            if (value.equals("In Stock")) return IN_STOCK;
            if (value.equals("Low Stock")) return LOW_STOCK;
            throw new IOException("Cannot deserialize AvailabilityStatus");
        }
}

enum Category {
        BEAUTY, FRAGRANCES, FURNITURE, GROCERIES;

        public String toValue() {
            switch (this) {
                case BEAUTY: return "beauty";
                case FRAGRANCES: return "fragrances";
                case FURNITURE: return "furniture";
                case GROCERIES: return "groceries";
            }
            return null;
        }

        @JsonCreator
        public static Category forValue(String value) throws IOException {
            if (value.equals("beauty")) return BEAUTY;
            if (value.equals("fragrances")) return FRAGRANCES;
            if (value.equals("furniture")) return FURNITURE;
            if (value.equals("groceries")) return GROCERIES;
            throw new IOException("Cannot deserialize Category");
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

    enum ReturnPolicy {
        NO_RETURN_POLICY, THE_30_DAYS_RETURN_POLICY, THE_60_DAYS_RETURN_POLICY, THE_7_DAYS_RETURN_POLICY, THE_90_DAYS_RETURN_POLICY;

        public String toValue() {
            switch (this) {
                case NO_RETURN_POLICY: return "No return policy";
                case THE_30_DAYS_RETURN_POLICY: return "30 days return policy";
                case THE_60_DAYS_RETURN_POLICY: return "60 days return policy";
                case THE_7_DAYS_RETURN_POLICY: return "7 days return policy";
                case THE_90_DAYS_RETURN_POLICY: return "90 days return policy";
            }
            return null;
        }

        @JsonCreator
        public static ReturnPolicy forValue(String value) throws IOException {
            if (value.equals("No return policy")) return NO_RETURN_POLICY;
            if (value.equals("30 days return policy")) return THE_30_DAYS_RETURN_POLICY;
            if (value.equals("60 days return policy")) return THE_60_DAYS_RETURN_POLICY;
            if (value.equals("7 days return policy")) return THE_7_DAYS_RETURN_POLICY;
            if (value.equals("90 days return policy")) return THE_90_DAYS_RETURN_POLICY;
            throw new IOException("Cannot deserialize ReturnPolicy");
        }
    }
    @lombok.Data
    class Review {
        private long rating;
        private String comment;
        private OffsetDateTime date;
        private String reviewerName;
        private String reviewerEmail;
    }

