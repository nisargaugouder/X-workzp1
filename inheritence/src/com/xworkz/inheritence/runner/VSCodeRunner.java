package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.vscode.VSCode;
import com.xworkz.inheritence.internal.vscode.VSCodeExtension;

public class VSCodeRunner {
    public static void main(String[] args) {
        VSCode vscode = new VSCode();
        vscode.editor();
        vscode.extensions();
        vscode.debug();
        vscode.git();
        vscode.languages();

        System.out.println("-----------");

        VSCode vscode2 = new VSCodeExtension();
        vscode2.editor();
        vscode2.extensions();
        vscode2.debug();
        vscode2.git();
        vscode2.languages();

        System.out.println("-----------");

        VSCodeExtension vscodeExtension = new VSCodeExtension();
        vscodeExtension.editor();
        vscodeExtension.extensions();
        vscodeExtension.debug();
        vscodeExtension.git();
        vscodeExtension.languages();
    }
}
