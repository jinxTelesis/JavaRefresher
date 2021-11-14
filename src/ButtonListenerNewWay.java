import java.awt.*;

public class ButtonListenerNewWay {

    public static void main(String[] args){
        Frame frame=new Frame("ActionListener java8");

        Button b = new Button();

        b.setBounds(50,100,80,50);

        b.addActionListener(e -> System.out.println("Hello World!"));

        frame.add(b);

        frame.setSize(null);

        frame.setVisible(true);


    }
}
