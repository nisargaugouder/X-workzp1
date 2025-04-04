package com.xworkz.inheritence.internal.vscode;

public class VSCodeExtension extends VSCode {
    public VSCodeExtension() {
        super();
        System.out.println("VSCodeExtension --child");
    }

    @Override
    public void editor() {
        System.out.println("VSCode extensions enhance the editor --child");
    }

    @Override
    public void extensions() {
        System.out.println("VSCode extensions add new features --child");
    }

    @Override
    public void debug() {
        System.out.println("VSCode extensions improve debugging --child");
    }

    @Override
    public void git() {
        System.out.println("VSCode extensions enhance Git support --child");
    }

    @Override
    public void languages() {
        System.out.println("VSCode extensions add language support --child");
    }
}
