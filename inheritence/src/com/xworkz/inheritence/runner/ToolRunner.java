package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.tool.Hammer;
import com.xworkz.inheritence.internal.tool.Tool;

public class ToolRunner {
    public static void main(String[] args) {
        Tool tool=new Hammer();
        tool.use();
        tool.material();
        tool.grip();
        tool.durability();

        System.out.println("-----------");
        Hammer hammer = new Hammer();
        hammer.use();
        hammer.material();
        hammer.grip();
        hammer.durability();
    }
}
