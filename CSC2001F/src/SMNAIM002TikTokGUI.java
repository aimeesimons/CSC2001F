import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class SMNAIM002TikTokGUI {

    public static void main(String[] arg) {
        MyFrame frame = new MyFrame();
        JLabel label;

        ImageIcon image = new ImageIcon("7156616_youtube_video_icon.png");
        label = new JLabel();
        label.setIcon(image);
        label.setHorizontalAlignment(JLabel.LEFT);
        frame.add(label);
        frame.pack();

    }

}
