import java.awt.*;
class click{
    click(){
        Frame f = new Frame();
        Button b = new Button("BVRITH");
        b.setBounds(30, 50, 70, 40);
        f.add(b);
        f.setSize(200,200);
        f.setLayout(null);
        f.setVisible(true);
    }
}
public class buttons {
    public static void main(String[] args){
        new click();
    }    
}
