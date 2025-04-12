package com.xworkz.assignment.internal.element;

public class Element {
    private String name;
    private String symbol;
    private int atomicNumber;

    public Element(String name, String symbol, int atomicNumber) {
        this.name = name;
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
    }

    @Override
    public String toString() {
        return "Element{" +
                "name='" + name + '\'' +
                ", symbol='" + symbol + '\'' +
                ", atomicNumber=" + atomicNumber +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAtomicNumber(int atomicNumber) {
        this.atomicNumber = atomicNumber;
    }

    @Override
    public int hashCode() {
        System.out.println("ElementHashCode:"+super.hashCode());
        return 320;
    }
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Element){
                System.out.println("have ref.will compare..");
                Element element1=this;
                Element element2=(Element) obj;
                if(element1.atomicNumber==element2.atomicNumber && element1.name.equals(element2.name)){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
