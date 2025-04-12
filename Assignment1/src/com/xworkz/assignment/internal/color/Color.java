package com.xworkz.assignment.internal.color;

public class Color {
    private String name;
    private String code;
    private String type;

    public Color(String name, String code, String type) {
        this.name = name;
        this.code = code;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Color{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("ColorHashCode:"+super.hashCode());
        return 8451;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Color){
                System.out.println("have ref.will compare..");
                Color color1=this;
                Color color2=(Color) obj;
                if(color2.code.equals(color2.code)){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
