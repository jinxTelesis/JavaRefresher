import java.awt.*;
import java.awt.event.*;

public class ButtonListenerOldWay {

    public static void main(String[] args){
        Frame frame=new Frame("ActionListener Before Java8");

        Button b=new Button("Click Here");
        b.setBounds(50,100,80,50);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello World!");
            }
        });

        frame.add(b);
        frame.setLayout(null);
    }
}
