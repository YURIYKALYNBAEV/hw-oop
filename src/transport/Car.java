package transport;

public class Car {
    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }

        @Override
        public String toString() {
            return "Key{" +
                    "remoteEngineStart=" + remoteEngineStart +
                    ", keylessAccess=" + keylessAccess +
                    '}';
        }

    }

    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
    private String gearBox;
    private final String bodyType;
    private String registrationNumber;
    private final int numberSeats;
    private boolean summerTires;
    private Key key;


    private static final String DEFAULT_VALUE = "default";
    private static final double DEFAULT_ENGINE_VOLUME = 1.5;
    private static final String DEFAULT_COLOR = "белый";
    private static final int DEFAULT_YEAR = 2000;
    private static final int DEFAULT_SEATS = 5;

    /**
     * Конструктор класса transport.Car
     *
     * @param brand              - марка
     * @param model              - модель
     * @param engineVolume       - объем двигателя
     * @param color              - цвет
     * @param year               - год производства
     * @param country            - страна сборки
     * @param gearBox            - коробка передач
     * @param bodyType           - тип кузова
     * @param registrationNumber - рег.номер
     * @param numberSeats        - кол-во мест
     * @param summerTires        - признак "Летняя" или "Зимняя" резина
     */
    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int year,
               String country,
               String gearBox,
               String bodyType,
               String registrationNumber,
               int numberSeats,
               boolean summerTires,
               Key key

    ) {
        if (brand.isEmpty() || brand == null) {
            this.brand = DEFAULT_VALUE;
        } else {
            this.brand = brand;
        }
        if (model.isEmpty() || model == null) {
            this.model = DEFAULT_VALUE;
        } else {
            this.model = model;
        }
        if (engineVolume <= 0) {
            this.engineVolume = DEFAULT_ENGINE_VOLUME;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color.isEmpty() || color == null) {
            this.color = DEFAULT_COLOR;
        } else {
            this.color = color;
        }
        if (year <= 0) {
            this.year = DEFAULT_YEAR;
        } else {
            this.year = year;
        }
        if (country.isEmpty() || country == null) {
            this.country = DEFAULT_VALUE;
        } else {
            this.country = country;
        }
        if (gearBox.isEmpty() || gearBox == null) {
            this.gearBox = DEFAULT_VALUE;
        } else {
            this.gearBox = gearBox;
        }
        if (bodyType.isEmpty() || bodyType == null) {
            this.bodyType = DEFAULT_VALUE;
        } else {
            this.bodyType = bodyType;
        }
        if (registrationNumber.isEmpty() || registrationNumber == null) {
            this.registrationNumber = DEFAULT_VALUE;
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (numberSeats <= 0) {
            this.numberSeats = DEFAULT_SEATS;
        } else {
            this.numberSeats = numberSeats;
        }

        this.summerTires = summerTires;

        if (key == null) {
            this.key = new Key(false, false);
        } else {
            this.key = key;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = DEFAULT_ENGINE_VOLUME;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.isEmpty() || color == null) {
            this.color = DEFAULT_COLOR;
        } else {
            this.color = color;
        }
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getGearBox() {
        return gearBox;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public void setGearBox(String gearBox) {
        if (gearBox.isEmpty() || gearBox == null) {
            this.gearBox = DEFAULT_COLOR;
        } else {
            this.gearBox = gearBox;
        }
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber.isEmpty() || registrationNumber == null) {
            this.registrationNumber = DEFAULT_COLOR;
        } else {
            this.registrationNumber = gearBox;
        }
    }

    public boolean isSummerTires() {
        return summerTires;
    }

    public void setSummerTires(boolean summerTires) {
        this.summerTires = summerTires;
    }

    public void changeTires(int monthNumber) {
        if (monthNumber >= 4 && monthNumber <= 10) {
            setSummerTires(true);
        } else {
            setSummerTires(false);
        }

    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", gearBox='" + gearBox + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", numberSeats=" + numberSeats +
                ", summerTires=" + summerTires +
                ", key=" + key +
                '}';
    }
}
