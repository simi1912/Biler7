import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class subiect2 {
    JFrame frame;
    JPanel panel;
    JLabel val;
    JTextField text;
    JButton scrie;
    JButton afis;

    public static void main(String[] args){

        subiect2 s2 = new subiect2();
        s2.start();
    }

    public void start() {

        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);

        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));

        val = new JLabel("Valoare intreaga de inserat", SwingConstants.CENTER);
        text = new JTextField(20);
        scrie = new JButton("Scrie in fisier");
        afis = new JButton("Afiseaza");

        frame.getContentPane().add(BorderLayout.EAST, panel);
        panel.add(val);
        panel.add(text);
        panel.add(scrie);
        panel.add(afis);

        frame.setVisible(true);

        String deScris = "";

        scrie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fileW(text.getText());
            }
        });

        afis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //cititLogic

            }
        });

    }

    public void fileW(String str){

        //System.out.println(str);
        //scrisLogic
    }


}
