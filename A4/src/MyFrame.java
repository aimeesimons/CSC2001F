import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

public class MyFrame extends JFrame implements ActionListener {
    JButton LikeBut;
    JPanel panel1;
    JPanel panel2;
    ImageIcon image_icon;
    JScrollBar scrollBar;

    public MyFrame() {
        this.setTitle("TikTok");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        image_icon = new ImageIcon("8168654_tiktok_social media_video_entertainment_icon.png");
        scrollBar = new JScrollBar();
        scrollBar.setBounds(425, 10, 50, 450);
        this.setIconImage(image_icon.getImage());
        this.add(scrollBar);
        scrollBar.setVisible(true);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
