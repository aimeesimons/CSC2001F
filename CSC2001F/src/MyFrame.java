import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener {

    public MyFrame() {
        this.setTitle("TikTok");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(375, 375);
        this.setResizable(false);
        this.setBackground(Color.white);
        ImageIcon image_icon = new ImageIcon("8168654_tiktok_social media_video_entertainment_icon.png");
        this.setIconImage(image_icon.getImage());
        this.getContentPane().setBackground(Color.white);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
