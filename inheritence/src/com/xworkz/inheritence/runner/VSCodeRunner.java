package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.vscode.VSCode;
import com.xworkz.inheritence.internal.vscode.VSCodeExtension;

public class VSCodeRunner {
    public static void main(String[] args) {
        VSCode vscode = new VSCodeExtension();
        vscode.provideEditor();
        vscode.supportExtensions();
        vscode.enableDebugging();
        vscode.integrateWithGit();
        vscode.supportMultipleLanguages();

        System.out.println("-----------------");
        VSCodeExtension vscodeExtension = new VSCodeExtension();
        vscodeExtension.provideEditor();
        vscodeExtension.supportExtensions();
        vscodeExtension.enableDebugging();
        vscodeExtension.integrateWithGit();
        vscodeExtension.supportMultipleLanguages();
    }
}
