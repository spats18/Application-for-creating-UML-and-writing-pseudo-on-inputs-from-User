package src;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.*;

public class CodePanel extends JPanel implements Observer{

    @Override
    public void update(){
        repaint();
    }
    @Override
    public void paintComponent(Graphics graphic){
        super.paintComponent(graphic);
        System.out.println("Updating Graphics...");
        if(SingletonDataSrc.classList == null)
            return;
        int lineCnt = 15;
        for(String str: SingletonDataSrc.classList){
            graphic.setColor(Color.black);
            graphic.drawString(str, 5 , lineCnt);
            lineCnt +=15;
        }
    }
    CodePanel(){
        setBorder(BorderFactory.createLineBorder(Color.black));
        setBackground(Color.lightGray);
        JScrollPane scrollPane = new JScrollPane(this);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        scrollPane.setBounds(50, 30, 300, 50);
        // JPanel contentPane = new JPanel(null);
        // contentPane.setPreferredSize(new Dimension(500, 400));
        // contentPane.add(scrollPane);
        // frame.setContentPane(contentPane);
        // frame.pack();
        // frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // frame.setVisible(true);
    }
    public JPanel getPanel(){
        return this;
    }
}
