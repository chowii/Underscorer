import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

/**
 * Created by chowii on 6/6/17.
 */
public class Underscorer {

    static String s =
    "99-16-view-saved-profile"
            ;

    public static void main(String[] args){

        s = JOptionPane.showInputDialog("Enter you string");

        String s1 = "";
        char[] c = s.toCharArray();
        for(int i = 0; i < s.length(); i++) {
            if (c[i] == '-')
                c[i] = '_';

        }
        for (char aC : c) {
            s1 += aC;
        }

        System.out.println(s1);

        StringSelection selection = new StringSelection(s1);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, selection);
        System.exit(0);
    }


}

