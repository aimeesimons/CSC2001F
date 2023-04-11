import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame {

    public MyFrame() {
        this.setTitle("TikTok");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setVisible(true);
        this.setBackground(Color.white);
        ImageIcon image_icon = new ImageIcon("8168654_tiktok_social media_video_entertainment_icon.png");
        this.setIconImage(image_icon.getImage());

    }
}
