package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.tool.Tool;
import com.xworkz.inheritence.internal.tool.Hammer;

public class ToolRunner {
    public static void main(String[] args) {
        Tool tool = new Tool();
        tool.use();
        tool.material();
        tool.grip();
        tool.durability();
        tool.weight();

        System.out.println("-----------");

        Tool tool2 = new Hammer();
        tool2.use();
        tool2.material();
        tool2.grip();
        tool2.durability();
        tool2.weight();

        System.out.println("-----------");

        Hammer hammer = new Hammer();
        hammer.use();
        hammer.material();
        hammer.grip();
        hammer.durability();
        hammer.weight();
    }
}
