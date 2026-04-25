package NewAccessibilityWithModules;


import java.awt.datatransfer.Clipboard;

public class MyFirstModule {
    static void main() {

        //now there this error here because we didn't require the java.datatransfer;
        //and clipboard is part of the java.datatransfer;
        Clipboard clipboard = new Clipboard("");
    }
}
