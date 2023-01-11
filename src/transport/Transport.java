package transport;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private int maxSpeed;

    public static final String DEFAULT_VALUE = "default";
    public static final String DEFAULT_COLOR = "белый";
    public static final int DEFAULT_YEAR = 2000;
    public static final int DEFAULT_MAX_SPEED = 90;

    public Transport(String brand,
                     String model,
                     int year,
                     String country,
                     String color,
                     int maxSpeed) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = DEFAULT_VALUE;
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = DEFAULT_VALUE;
        } else {
            this.model = model;
        }
        if (year <= 0) {
            this.year = DEFAULT_YEAR;
        } else {
            this.year = year;
        }
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = DEFAULT_VALUE;
        } else {
            this.country = country;
        }
        setColor(color);
        setMaxSpeed(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = DEFAULT_COLOR;
        } else {
            this.color = color;
        }
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0) {
            this.maxSpeed = DEFAULT_MAX_SPEED;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}