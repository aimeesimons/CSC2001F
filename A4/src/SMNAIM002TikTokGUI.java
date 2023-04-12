import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.AttributeSet.ColorAttribute;

public class SMNAIM002TikTokGUI {
    static JFrame home, OptionMenu, FindDes, List, Create, AddPosts, Delete, PostsLists, ImportFromDisk;
    static JButton startButton, findDes, listAccounts, createButton, addButton, deleteButton, postButton, imporButton,
            backButton;

    public static void main(String[] arg) {
        createFrames();
        createButtons();
        activateButtons();

    }

    private static void activateButtons() {

    }

    private static void createButtons() {
        startButton = new JButton("Get Started!");
        findDes = new JButton("Get Started!");
        listAccounts = new JButton("Get Started!");
        createButton = new JButton("Get Started!");
        addButton = new JButton("Get Started!");
        deleteButton = new JButton("Get Started!");
        postButton = new JButton("Get Started!");
        imporButton = new JButton("Get Started!");
        backButton = new JButton();

        ImageIcon back = new ImageIcon("216437_back_arrow_icon.png");
        backButton.setIcon(back);

    }

    private static void createFrames() {
        home = new JFrame("TikTok");
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        home.setSize(375, 375);
        home.setResizable(false);
        ImageIcon image_icon = new ImageIcon("8168654_tiktok_social media_video_entertainment_icon.png");
        ImageIcon logo = new ImageIcon("8547041_tiktok_icon.png");
        JLabel label = new JLabel();
        label.setIcon(logo);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);
        home.add(label);
        home.setIconImage(image_icon.getImage());
        home.getContentPane().setBackground(Color.white);
        home.setVisible(true);
        home.setLayout(null);

        OptionMenu = new JFrame("TikTok");
        OptionMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        OptionMenu.setSize(375, 375);
        OptionMenu.setResizable(false);
        image_icon = new ImageIcon("8168654_tiktok_social media_video_entertainment_icon.png");
        OptionMenu.setIconImage(image_icon.getImage());
        OptionMenu.getContentPane().setBackground(Color.white);
        OptionMenu.setVisible(false);
        OptionMenu.setLayout(null);

        FindDes = new JFrame("TikTok");
        FindDes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FindDes.setSize(375, 375);
        FindDes.setResizable(false);
        image_icon = new ImageIcon("8168654_tiktok_social media_video_entertainment_icon.png");
        FindDes.setIconImage(image_icon.getImage());
        FindDes.getContentPane().setBackground(Color.white);
        FindDes.setVisible(false);
        FindDes.setLayout(null);

        List = new JFrame("TikTok");
        List.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        List.setSize(375, 375);
        List.setResizable(false);
        image_icon = new ImageIcon("8168654_tiktok_social media_video_entertainment_icon.png");
        List.setIconImage(image_icon.getImage());
        List.getContentPane().setBackground(Color.white);
        List.setVisible(false);
        List.setLayout(null);

        Create = new JFrame("TikTok");
        Create.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Create.setSize(375, 375);
        Create.setResizable(false);
        image_icon = new ImageIcon("8168654_tiktok_social media_video_entertainment_icon.png");
        Create.setIconImage(image_icon.getImage());
        Create.getContentPane().setBackground(Color.white);
        Create.setVisible(false);
        Create.setLayout(null);

        AddPosts = new JFrame("TikTok");
        AddPosts.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        AddPosts.setSize(375, 375);
        AddPosts.setResizable(false);
        image_icon = new ImageIcon("8168654_tiktok_social media_video_entertainment_icon.png");
        AddPosts.setIconImage(image_icon.getImage());
        AddPosts.getContentPane().setBackground(Color.white);
        AddPosts.setVisible(false);
        AddPosts.setLayout(null);

        Delete = new JFrame("TikTok");
        Delete.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Delete.setSize(375, 375);
        Delete.setResizable(false);
        image_icon = new ImageIcon("8168654_tiktok_social media_video_entertainment_icon.png");
        Delete.setIconImage(image_icon.getImage());
        Delete.getContentPane().setBackground(Color.white);
        Delete.setVisible(false);
        Delete.setLayout(null);

        PostsLists = new JFrame("TikTok");
        PostsLists.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PostsLists.setSize(375, 375);
        PostsLists.setResizable(false);
        image_icon = new ImageIcon("8168654_tiktok_social media_video_entertainment_icon.png");
        PostsLists.setIconImage(image_icon.getImage());
        PostsLists.getContentPane().setBackground(Color.white);
        PostsLists.setVisible(false);
        PostsLists.setLayout(null);

        ImportFromDisk = new JFrame("TikTok");
        ImportFromDisk.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImportFromDisk.setSize(375, 375);
        ImportFromDisk.setResizable(false);
        image_icon = new ImageIcon("8168654_tiktok_social media_video_entertainment_icon.png");
        ImportFromDisk.setIconImage(image_icon.getImage());
        ImportFromDisk.getContentPane().setBackground(Color.white);
        ImportFromDisk.setVisible(false);
        ImportFromDisk.setLayout(null);

    }

}
