package com.xworkz.assignment.runner;

import com.xworkz.assignment.internal.vscode.VSCode;

public class VSCodeRunner {
    public static void main(String[] args) {
        VSCode code = new VSCode("1.86", "Java", 500);
        System.out.println(code);
    }
}
