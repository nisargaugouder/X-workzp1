package com.xworkz.assignment.internal.lock;

public class Lock {
    private String brand;
    private String type;
    private int price;

    public Lock(String brand, String type, int price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Lock{brand='" + brand + "', type='" + type + "', price=" + price + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("LockHashCode:"+super.hashCode());
        return 822;
    }
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Lock){
                System.out.println("have ref.will compare..");
                Lock lock1=this;
                Lock lock2=(Lock) obj;
                if(lock1.brand.equals(lock2.brand) && lock2.type.equals(lock1.type)){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
