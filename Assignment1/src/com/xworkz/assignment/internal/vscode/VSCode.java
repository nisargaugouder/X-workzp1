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
    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("obj is null");
            if(obj instanceof VSCode){
                System.out.println("obj instance of class");
                VSCode vsCode1=this;
                VSCode vsCode2=(VSCode) obj;
                if(vsCode1.language.equals(vsCode2.language) && vsCode1.size==vsCode2.size && vsCode1.version.equals(vsCode2.version)){
                    System.out.println("both are same:");
                    return true;
                }
            }
        }
        return false;
    }
}
