import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Q1 extends JFrame{
    MainFrame mf;
    public Q1(MainFrame mf1){
        mf=mf1;

        initComp();
    }

    private void initComp(){
        this.setBounds(200,200,300,300);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                mf.setVisible(true);
                dispose();
            }
        });
    }

}
