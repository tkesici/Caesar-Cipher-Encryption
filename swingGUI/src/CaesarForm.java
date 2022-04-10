import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CaesarForm extends JFrame {
    private JPanel Panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton encryptButton;
    private JButton decryptButton;
    private JTextArea textArea1;
    private JTextArea textArea2;

    private void createUIComponents() {

    }

    public CaesarForm() {
        add(Panel1);
        setSize(400, 200);
        setTitle("Caesar Cipher Converter");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        encryptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String encrypt = textField1.getText();
                textArea1.append(caesarEncyrption(encrypt));
            }
        });
        decryptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String decrypt = textField2.getText();
                textArea2.append(caesarDecryption(decrypt));
            }
        });
    }

    public static String caesarEncyrption(String str) {
        String encrypted = "";
        for (int i = 0; i < str.length(); i++) {

            if (((char) ((int) str.charAt(i)) == 65)) {
                encrypted = encrypted + "X";
            } else if (((char) ((int) str.charAt(i)) == 66)) {
                encrypted = encrypted + "Y";
            } else if (((char) ((int) str.charAt(i)) == 67)) {
                encrypted = encrypted + "Z";
            } else if (((char) ((int) str.charAt(i)) == 97)) {
                encrypted = encrypted + "x";
            } else if (((char) ((int) str.charAt(i)) == 98)) {
                encrypted = encrypted + "y";
            } else if (((char) ((int) str.charAt(i)) == 99)) {
                encrypted = encrypted + "z";
            } else if (((char) ((int) str.charAt(i)) == 32)) {
                encrypted = encrypted + " ";
            } else {
                encrypted = encrypted + ((char) ((int) str.charAt(i) - 3));
            }
        }

        return encrypted;
    }

    public static String caesarDecryption(String str) {
        String decrypted = "";
        for (int i = 0; i < str.length(); i++) {

            if (((char) ((int) str.charAt(i)) == 88)) {
                decrypted = decrypted + "A";
            } else if (((char) ((int) str.charAt(i)) == 89)) {
                decrypted = decrypted + "B";
            } else if (((char) ((int) str.charAt(i)) == 90)) {
                decrypted = decrypted + "C";
            } else if (((char) ((int) str.charAt(i)) == 120)) {
                decrypted = decrypted + "a";
            } else if (((char) ((int) str.charAt(i)) == 121)) {
                decrypted = decrypted + "b";
            } else if (((char) ((int) str.charAt(i)) == 122)) {
                decrypted = decrypted + "c";
            } else if (((char) ((int) str.charAt(i)) == 32)) {
                decrypted = decrypted + " ";
            } else {
                decrypted = decrypted + ((char) ((int) str.charAt(i) + 3));
            }
        }

        return decrypted;
    }


}
