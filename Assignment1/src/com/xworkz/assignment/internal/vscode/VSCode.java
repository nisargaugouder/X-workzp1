package com.xworkz.assignment.internal.vscode;

public class VSCode {
    private String version;
    private String language;
    private int size;

    public VSCode(String version, String language, int size) {
        this.version = version;
        this.language = language;
        this.size = size;
    }

    @Override
    public String toString() {
        return "VSCode{" +
                "version='" + version + '\'' +
                ", language='" + language + '\'' +
                ", size=" + size +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("VSCodeHashCode:"+super.hashCode());
        return 5643;
    }
}
