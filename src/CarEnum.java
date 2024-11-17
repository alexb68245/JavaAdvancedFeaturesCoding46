public enum CarEnum {
    FERRARI(20000,571),
    PORSCHE(50000, 811),
    MERCEDES(6900, 281),
    BMW(8900, 456),
    OPEL(7000,144),
    FIAT(3000,192),
    TOYOTA(7000,381);

    private int price;
    private int power;

    CarEnum(int price, int power){
        this.price = price;
        this.power = power;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }

    public void setPower(int power){
        this.power = power;
    }

    public int getPower(){
        return this.power;
    }

    public boolean isRegular(){
        return price <= 20000;
    }

    public boolean isPremium(){
        return !isRegular();
    }

    public boolean isFasterThan(CarEnum car){
        return this.power > car.getPower();
    }
}
