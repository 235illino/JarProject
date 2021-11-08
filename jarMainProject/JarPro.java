package jarMainProject;


import jarLib.Liba;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class JarPro extends JFrame {

    public JarPro() throws IOException {
        super();
        Liba testLib = new Liba();
        URL urlPicture = this.getClass().getResource("/simple.jpg");
        URL urlText = this.getClass().getResource("/text.txt");
        BufferedReader freader = new BufferedReader(new InputStreamReader(new FileInputStream(urlText.getPath()), StandardCharsets.UTF_8));
        String text = freader.readLine();
        freader.close();
        InputStream in = this.getClass().getResourceAsStream("/simple.jpg");
        byte[] buff = new byte[1024*30];
        in.read(buff);
        in.close();
        JLabel jLabel = new JLabel(new ImageIcon(urlPicture));
        JLabel jLabel2 = new JLabel(text);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(2,1));
        jPanel.add(jLabel);
        jPanel.add(jLabel2);
        add(jPanel);
        setSize(1000,1000);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);



    }
    public static void main(String[] args) throws IOException {

        JarPro mainClass = new JarPro();
    }
}
