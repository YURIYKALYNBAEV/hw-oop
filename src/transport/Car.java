package transport;

public class Car extends Transport {
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

    private double engineVolume;
    private String gearBox;
    private final String bodyType;
    private String registrationNumber;
    private final int numberSeats;
    private boolean summerTires;
    private Key key;

    private static final double DEFAULT_ENGINE_VOLUME = 1.5;
    private static final int DEFAULT_SEATS = 5;

    /**
     * Конструктор класса transport.Car
     *
     * @param engineVolume       - объем двигателя
     * @param gearBox            - коробка передач
     * @param bodyType           - тип кузова
     * @param registrationNumber - рег.номер
     * @param numberSeats        - кол-во мест
     * @param summerTires        - признак "Летняя" или "Зимняя" резина
     */
    public Car(
            String brand,
            String model,
            int year,
            String country,
            String color,
            int maxSpeed,
            double engineVolume,
            String gearBox,
            String bodyType,
            String registrationNumber,
            int numberSeats,
            boolean summerTires,
            Key key


    ) {
        super(brand, model, year, country, color, maxSpeed);
        if (engineVolume <= 0) {
            this.engineVolume = DEFAULT_ENGINE_VOLUME;
        } else {
            this.engineVolume = engineVolume;
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
        if (key == null) {
            this.key = new Key(false, false);
        } else {
            this.key = key;
        }
        setEngineVolume(engineVolume);
        setGearBox(gearBox);
        setRegistrationNumber(registrationNumber);
        setSummerTires(summerTires);
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
            this.registrationNumber = registrationNumber;
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
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", color='" + getColor() + '\'' +
                ", year=" + getYear() +
                ", country='" + getCountry() + '\'' +
                ", maxSpeed='" + getMaxSpeed() + '\'' +
                "engineVolume=" + engineVolume +
                ", gearBox='" + gearBox + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", numberSeats=" + numberSeats +
                ", summerTires=" + summerTires +
                ", key=" + key +
                '}';
    }
}
