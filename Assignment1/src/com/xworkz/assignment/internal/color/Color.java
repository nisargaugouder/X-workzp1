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
}
