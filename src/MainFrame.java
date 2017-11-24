import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
    private JButton jbtns[]= new JButton[10];
    public MainFrame(){
        initComp();
    }
    private void initComp(){
        this.setBounds(200,200,400,400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container cp;
        cp=this.getContentPane();
        cp.setLayout(new GridLayout(3,3,3,3));
        for(int i=1;i<10;i++){
            jbtns[i]=new JButton("Q"+Integer.toString(i));
            jbtns[i].setOpaque(true);
            jbtns[i].setForeground(new Color(253, 17, 33));
            cp.add(jbtns[i]);
            jbtns[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton tmp =(JButton)e.getSource();
                        if(tmp==jbtns[1]){
                            Q1 QQ1=new Q1(MainFrame.this);
                            QQ1.setVisible(true);
                            MainFrame.this.setVisible(false);





                    }

                }
            });
        }





    }
}
