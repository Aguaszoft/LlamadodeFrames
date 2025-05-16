import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrmPrincipal {
    private JButton button1;
    public JPanel pPrincipal;

    public FrmPrincipal() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Fs");
                frame.setContentPane(new FrmSecundario().pSecundario);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Fp");
        frame.setContentPane(new FrmPrincipal().pPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
