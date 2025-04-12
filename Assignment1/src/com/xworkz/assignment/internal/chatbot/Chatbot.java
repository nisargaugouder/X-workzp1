package com.xworkz.assignment.internal.chatbot;

public class Chatbot {
    private String name;
    private String language;
    private boolean isAI;

    public Chatbot(String name, String language, boolean isAI) {
        this.name = name;
        this.language = language;
        this.isAI = isAI;
    }

    @Override
    public String toString() {
        return "Chatbot{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                ", isAI=" + isAI +
                '}';
    }
    @Override
    public int hashCode() {
        System.out.println("ChatbotHashCode:"+super.hashCode());
        return 76;
    }

    public void setAI(boolean AI) {
        isAI = AI;
    }

    public boolean equals(Object obj) {
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Chatbot){
                System.out.println("have ref.will compare..");
                Chatbot chatbot1=this;
                Chatbot chatbot2=(Chatbot) obj;
                if(chatbot1.isAI==chatbot2.isAI){
                    System.out.println("both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
