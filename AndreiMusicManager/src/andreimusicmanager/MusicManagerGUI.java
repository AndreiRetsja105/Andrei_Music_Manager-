/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andreimusicmanager;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;


/**
 *
 * @author arets
 */
public class MusicManagerGUI extends javax.swing.JFrame {

    
    LikedSongsInterface likedSongs = new LikedSongs();
        
    /**
     * Creates new form MusicLibraryGUI
     */
    public MusicManagerGUI() {
    initComponents();
    // Get screen dimensions
    Toolkit toolkit = getToolkit();
    Dimension size = toolkit.getScreenSize();
    // Center the GUI on the screen
    setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    // Set the current date
    date();
    }
    
    public final void date() {
    // Get the current date
    Calendar cal = new GregorianCalendar();
    int day = cal.get(Calendar.DAY_OF_MONTH);
    int month = cal.get(Calendar.MONTH);
    int year = cal.get(Calendar.YEAR);
    // Set the date text
    date.setText(day + "." + (month + 1) + "." + year);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        

        navTABS = new javax.swing.JTabbedPane();
        likedsongsPANEL = new javax.swing.JPanel();
        addBTN = new javax.swing.JButton();
        print_likedBTN = new javax.swing.JButton();
        deleteBTN = new javax.swing.JButton();
        exitBTN = new javax.swing.JButton();
        moveBTN = new javax.swing.JButton();
        titleTF = new javax.swing.JTextField();
        searchBTN = new javax.swing.JButton();
        sizeBTN = new javax.swing.JButton();
        artistLBL = new javax.swing.JLabel();
        titleLBL = new javax.swing.JLabel();
        logoLBL = new javax.swing.JLabel();
        repeatTOGGLE2 = new javax.swing.JToggleButton();
        artistTF = new javax.swing.JTextField();
        albumTF = new javax.swing.JTextField();
        NotesLBL1 = new javax.swing.JLabel();
        notesLBL = new javax.swing.JLabel();
        backgroundLBL = new javax.swing.JLabel();
        colorblindLBL = new javax.swing.JLabel();
        popPANEL = new javax.swing.JPanel();
        deleteBTN1 = new javax.swing.JButton();
        artistLBL1 = new javax.swing.JLabel();
        albumTF1 = new javax.swing.JTextField();
        print_popBTN1 = new javax.swing.JButton();
        artistTF1 = new javax.swing.JTextField();
        sizeBTN1 = new javax.swing.JButton();
        titleTF1 = new javax.swing.JTextField();
        exitBTN1 = new javax.swing.JButton();
        searchBTN1 = new javax.swing.JButton();
        titleLBL1 = new javax.swing.JLabel();
        logoLBL1 = new javax.swing.JLabel();
        backgroundLBL1 = new javax.swing.JLabel();
        colorblindLBL1 = new javax.swing.JLabel();
        rockPANEL = new javax.swing.JPanel();
        print_rockBTN2 = new javax.swing.JButton();
        deleteBTN2 = new javax.swing.JButton();
        albumLBL = new javax.swing.JLabel();
        albumLBL1 = new javax.swing.JLabel();
        albumLBL2= new javax.swing.JLabel();
        albumTF2 = new javax.swing.JTextField();
        artistLBL2 = new javax.swing.JLabel();
        artistTF2 = new javax.swing.JTextField();
        sizeBTN2 = new javax.swing.JButton();
        titleTF2 = new javax.swing.JTextField();
        exitBTN2 = new javax.swing.JButton();
        searchBTN2 = new javax.swing.JButton();
        logoLBL2 = new javax.swing.JLabel();
        titleLBL2 = new javax.swing.JLabel();
        backgroundLBL2 = new javax.swing.JLabel();
        colorblindLBL2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        date = new javax.swing.JMenu();
        colorBlindMode = new javax.swing.JMenu();

    
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        
        
        // (Liked Songs) Main page buttons settings and configurations
        likedsongsPANEL.setLayout(null);
        addBTN.setBackground(new java.awt.Color(51, 51, 51));
        addBTN.setFont(new java.awt.Font("Segoe UI",Font.BOLD, 12)); 
        addBTN.setForeground(new java.awt.Color(255, 255, 255));
        addBTN.setText("Add");
        addBTN.setToolTipText("Add song based on title & artist");
        addBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBTNActionPerformed(evt);
            }
        });
        likedsongsPANEL.add(addBTN);
        addBTN.setBounds(670, 620, 120, 50);
        print_likedBTN.setBackground(new java.awt.Color(51, 51, 51));
        print_likedBTN.setFont(new java.awt.Font("Segoe UI",Font.BOLD, 12)); 
        print_likedBTN.setForeground(new java.awt.Color(255, 255, 255));
        print_likedBTN.setText("Print Liked");
        print_likedBTN.setToolTipText("Print all Songs ");   
        print_likedBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_likedBTNActionPerformed(evt);
            }
        });
        likedsongsPANEL.add(print_likedBTN);
        print_likedBTN.setBounds(400, 620, 150, 50);
        deleteBTN.setBackground(new java.awt.Color(51, 51, 51));
        deleteBTN.setFont(new java.awt.Font("Segoe UI",Font.BOLD, 12)); 
        deleteBTN.setForeground(new java.awt.Color(255, 255, 255));
        deleteBTN.setText("Delete");
        deleteBTN.setToolTipText("Delete Song");
        deleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTNActionPerformed(evt);
            }
        });
        likedsongsPANEL.add(deleteBTN);
        deleteBTN.setBounds(560, 620, 100, 50);
        exitBTN.setBackground(new java.awt.Color(51, 51, 51));
        exitBTN.setFont(new java.awt.Font("Segoe UI",Font.BOLD, 12)); 
        exitBTN.setForeground(new java.awt.Color(255, 255, 255));     
        exitBTN.setText("Exit");
        exitBTN.setToolTipText("Exit from Music_Manager");
        exitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTNActionPerformed(evt);
            }
        });
        likedsongsPANEL.add(exitBTN);
        exitBTN.setBounds(920, 620, 100, 50);
        moveBTN.setBackground(new java.awt.Color(51, 51, 51));
        moveBTN.setFont(new java.awt.Font("Segoe UI",Font.BOLD, 12)); 
        moveBTN.setForeground(new java.awt.Color(255, 255, 255));
        moveBTN.setText("Move");
        moveBTN.setToolTipText("Move songs to genres");
        moveBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveBTNActionPerformed(evt);
            }
        });
        likedsongsPANEL.add(moveBTN);
        moveBTN.setBounds(10, 620, 100, 50);
        searchBTN.setBackground(new java.awt.Color(51, 51, 51));
        searchBTN.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 12)); // NOI18N
        searchBTN.setForeground(new java.awt.Color(255, 255, 255));
        searchBTN.setText("Search");
        searchBTN.setToolTipText("To search based on artist||title");
        searchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTNActionPerformed(evt);
            }
        });
        likedsongsPANEL.add(searchBTN);
        searchBTN.setBounds(120, 620, 130, 50);
        sizeBTN.setBackground(new java.awt.Color(51, 51, 51));
        sizeBTN.setFont(new java.awt.Font("Segoe UI",Font.BOLD, 12)); // NOI18N
        sizeBTN.setForeground(new java.awt.Color(255, 255, 255));
        sizeBTN.setText("Size");
        sizeBTN.setToolTipText("To check how many songs in this list");
        sizeBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizeBTNActionPerformed(evt);
            }
        });
        likedsongsPANEL.add(sizeBTN);
        sizeBTN.setBounds(260, 620, 130, 50);
        
        albumLBL.setBackground(new java.awt.Color(0, 2, 10));
        albumLBL.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 12));
        albumLBL.setForeground(Color.WHITE);
        albumLBL.setText("Album");
        likedsongsPANEL.add(albumLBL);
        albumLBL.setBounds(50, 400, 60, 40);
        albumTF.setToolTipText("Album of the song");
        likedsongsPANEL.add(albumTF);
        albumTF.setBounds(120, 400, 250, 40); // Adjust the bounds as needed
        
        artistLBL.setBackground(new java.awt.Color(0, 2, 10));
        artistLBL.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 12));
        artistLBL.setForeground(Color.WHITE);
        artistLBL.setText("Artist");
        likedsongsPANEL.add(artistLBL);
        artistLBL.setBounds(50, 350, 60, 40);
        artistTF.setToolTipText("Artist of the song");
        likedsongsPANEL.add(artistTF);
        artistTF.setBounds(120, 350, 250, 40);
        
        titleLBL.setBackground(new java.awt.Color(0, 22, 10));
        titleLBL.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 12));
        titleLBL.setForeground(Color.WHITE);
        titleLBL.setText("Title");
        likedsongsPANEL.add(titleLBL);
        titleLBL.setBounds(50, 300, 60, 40);
        titleTF.setToolTipText("Title of the song");
        likedsongsPANEL.add(titleTF);
        titleTF.setBounds(120, 300, 250, 40);
    
        
        likedsongsPANEL.add(logoLBL);
        logoLBL.setBounds(990, 10, 170, 210);

        repeatTOGGLE2.setBackground(new java.awt.Color(51, 51, 51));
        repeatTOGGLE2.setFont(new java.awt.Font("Segoe UI",Font.BOLD, 12)); 
        repeatTOGGLE2.setForeground(new java.awt.Color(255, 255, 255));
        repeatTOGGLE2.setText("Repeat");
        repeatTOGGLE2.setToolTipText("Repeat Song");
        repeatTOGGLE2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repeatTOGGLE2ActionPerformed(evt);
            }
        });
        likedsongsPANEL.add(repeatTOGGLE2);
        repeatTOGGLE2.setBounds(1030, 620, 120, 50);
        repeatTOGGLE2.setEnabled(false);
        NotesLBL1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BackGround.jpg"))); 
        likedsongsPANEL.add(NotesLBL1);
        NotesLBL1.setBounds(-220, -120, 1500, 900);
        likedsongsPANEL.add(notesLBL);
        notesLBL.setBounds(-250, -290, 990, 820);
        likedsongsPANEL.add(backgroundLBL);
        backgroundLBL.setBounds(0, 0, 1200, 870);
        likedsongsPANEL.add(colorblindLBL);
        colorblindLBL.setBounds(0, 10, 1200, 810);
        navTABS.addTab("Main List", likedsongsPANEL);
        
        
        
        //(Pop Songs) Pop page buttons settings and configurations
        popPANEL.setLayout(null);
        deleteBTN1.setBackground(new java.awt.Color(51, 51, 51));
        deleteBTN1.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 12));
        deleteBTN1.setForeground(new java.awt.Color(255, 255, 255));
        deleteBTN1.setText("Delete");
        deleteBTN1.setToolTipText("Delete song");
        deleteBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTN1ActionPerformed(evt);
            }
        });
        popPANEL.add(deleteBTN1);
        deleteBTN1.setBounds(460, 620, 100, 50);  
        
        
        albumLBL1.setBackground(new java.awt.Color(0, 2, 10));
        albumLBL1.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 12));
        albumLBL1.setForeground(Color.WHITE);
        albumLBL1.setText("Album");
        popPANEL.add(albumLBL1);
        albumLBL1.setBounds(50, 400, 60, 40);
        albumTF1.setToolTipText("Album of the song");
        popPANEL.add(albumTF1);
        albumTF1.setBounds(120, 400, 250, 40); // Adjust the bounds as needed
        
        artistLBL1.setBackground(new java.awt.Color(0, 2, 10));
        artistLBL1.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 12));
        artistLBL1.setForeground(Color.WHITE);
        artistLBL1.setText("Artist");
        popPANEL.add(artistLBL1);
        artistLBL1.setBounds(50, 350, 60, 40);
        artistTF1.setToolTipText("Artist ");
        popPANEL.add(artistTF1);
        artistTF1.setBounds(120, 350, 250, 40);
        
        titleLBL1.setBackground(new java.awt.Color(0, 2, 10));
        titleLBL1.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 12));
        titleLBL1.setForeground(Color.WHITE);
        titleLBL1.setText("Title");
        popPANEL.add(titleLBL1);
        titleLBL1.setBounds(50, 300, 60, 40);
        titleTF1.setToolTipText("Title of the song");
        popPANEL.add(titleTF1);
        titleTF1.setBounds(120, 300, 250, 40);
        
        
        print_popBTN1.setBackground(new java.awt.Color(51, 51, 51));
        print_popBTN1.setFont(new java.awt.Font("Segoe UI", 1, 12));
        print_popBTN1.setForeground(new java.awt.Color(255, 255, 255));
        print_popBTN1.setText("Print the Pop Songs List");
        print_popBTN1.setToolTipText("Print all Songs");
        print_popBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_popBTN1ActionPerformed(evt);
            }
        });
        popPANEL.add(print_popBTN1);
        print_popBTN1.setBounds(290, 620, 160, 50);
        sizeBTN1.setBackground(new java.awt.Color(51, 51, 51));
        sizeBTN1.setFont(new java.awt.Font("Segoe UI", 1, 12));
        sizeBTN1.setForeground(new java.awt.Color(255, 255, 255));
        sizeBTN1.setText("Size");
        sizeBTN1.setToolTipText(" Check how many Songs in List ");
        sizeBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizeBTN1ActionPerformed(evt);
            }
        });
        popPANEL.add(sizeBTN1);
        sizeBTN1.setBounds(150, 620, 130, 50);
        exitBTN1.setBackground(new java.awt.Color(51, 51, 51));
        exitBTN1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        exitBTN1.setForeground(new java.awt.Color(255, 255, 255));
        exitBTN1.setText("Exit");
        exitBTN1.setToolTipText("To Shutdown");
        exitBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTN1ActionPerformed(evt);
            }
        });
        popPANEL.add(exitBTN1);
        exitBTN1.setBounds(1030, 620, 120, 50);
        searchBTN1.setBackground(new java.awt.Color(51, 51, 51));
        searchBTN1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        searchBTN1.setForeground(new java.awt.Color(255, 255, 255));
        searchBTN1.setText("Search");
        searchBTN1.setToolTipText(" Search the Artist, Title , Album  ");
        searchBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTN1ActionPerformed(evt);
            }
        });
        popPANEL.add(searchBTN1);
        searchBTN1.setBounds(10, 620, 130, 50);
        popPANEL.add(logoLBL1);
        logoLBL1.setBounds(990, 10, 170, 210);
        backgroundLBL1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/PopBackGround.png"))); 
        popPANEL.add(backgroundLBL1);
        backgroundLBL1.setBounds(-220, -120, 1500, 900);
        popPANEL.add(colorblindLBL1);
        colorblindLBL1.setBounds(-250, -290, 990, 820);
        navTABS.addTab(" Pop ", popPANEL);

        
        
        //(Rock Songs) Rock page buttons settings and configurations
        rockPANEL.setLayout(null);
        print_rockBTN2.setBackground(new java.awt.Color(51, 51, 51));
        print_rockBTN2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        print_rockBTN2.setForeground(new java.awt.Color(255, 255, 255));
        print_rockBTN2.setText("Print Rock Songs List");
        print_rockBTN2.setToolTipText("To print all songs in this list");
        print_rockBTN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_rockBTN2ActionPerformed(evt);
            }
        });
        rockPANEL.add(print_rockBTN2);
        print_rockBTN2.setBounds(290, 620, 130, 50);
        deleteBTN2.setBackground(new java.awt.Color(51, 51, 51));
        deleteBTN2.setFont(new java.awt.Font("Segoe UI", 1, 12));
        deleteBTN2.setForeground(new java.awt.Color(255, 255, 255));
        deleteBTN2.setText("Delete");
        deleteBTN2.setToolTipText(" Delete Song");
        deleteBTN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTN2ActionPerformed(evt);
            }
        });
        rockPANEL.add(deleteBTN2);
        deleteBTN2.setBounds(430, 620, 100, 50);

        albumLBL2.setBackground(new java.awt.Color(0, 2, 10));
        albumLBL2.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 12));
        albumLBL2.setForeground(Color.WHITE);
        albumLBL2.setText("Album");
        rockPANEL.add(albumLBL2);
        albumLBL2.setBounds(50, 400, 60, 40);
        albumTF2.setToolTipText("Album of the song");
        rockPANEL.add(albumTF2);
        albumTF2.setBounds(120, 400, 250, 40);
        
        artistLBL2.setBackground(new java.awt.Color(0, 2, 10));
        artistLBL2.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 12));
        artistLBL2.setForeground(Color.WHITE);
        artistLBL2.setText("Artist");
        rockPANEL.add(artistLBL2);
        artistLBL2.setBounds(50, 350, 60, 40);
        artistTF2.setToolTipText("Artist ");
        rockPANEL.add(artistTF2);
        artistTF2.setBounds(120, 350, 250, 40);
        
        titleLBL2.setBackground(new java.awt.Color(0, 2, 10));
        titleLBL2.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 12));
        titleLBL2.setForeground(Color.WHITE);
        titleLBL2.setText("Title");
        rockPANEL.add(titleLBL2);
        titleLBL2.setBounds(50, 300, 60, 40);
        titleTF2.setToolTipText("Title of the song");
        rockPANEL.add(titleTF2);
        titleTF2.setBounds(120, 300, 250, 40);

        
        
        sizeBTN2.setBackground(new java.awt.Color(51, 51, 51));
        sizeBTN2.setFont(new java.awt.Font("Segoe UI", 1, 12));
        sizeBTN2.setForeground(new java.awt.Color(255, 255, 255));
        sizeBTN2.setText("Size");
        sizeBTN2.setToolTipText("Teh Songs in this List");
        sizeBTN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizeBTN2ActionPerformed(evt);
            }
        });
        rockPANEL.add(sizeBTN2);
        sizeBTN2.setBounds(150, 620, 130, 50);
        exitBTN2.setBackground(new java.awt.Color(51, 51, 51));
        exitBTN2.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        exitBTN2.setForeground(new java.awt.Color(255, 255, 255));
        exitBTN2.setText("Exit");
        exitBTN2.setToolTipText("To shutdown");
        exitBTN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTN2ActionPerformed(evt);
            }
        });
        rockPANEL.add(exitBTN2);
        exitBTN2.setBounds(1030, 620, 120, 50);
        searchBTN2.setBackground(new java.awt.Color(51, 51, 51));
        searchBTN2.setFont(new java.awt.Font("Segoe UI", 1, 12)); 
        searchBTN2.setForeground(new java.awt.Color(255, 255, 255));
        searchBTN2.setText(" Search ");
        searchBTN2.setToolTipText("To search based on artist||title");
        searchBTN2.addActionListener(new java.awt.event.ActionListener() { 
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBTN2ActionPerformed(evt);
            }
        });
        rockPANEL.add(searchBTN2);
        searchBTN2.setBounds(10, 620, 130, 50);
        rockPANEL.add(logoLBL2);
        logoLBL2.setBounds(880, 10, 280, 210);
        rockPANEL.add(titleLBL2);
        backgroundLBL2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RockBackGround.png"))); // NOI18N
        rockPANEL.add(backgroundLBL2);
        backgroundLBL2.setBounds(-220, -120, 1500, 900);
        colorblindLBL2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RockBackGround.png"))); // NOI18N
        rockPANEL.add(colorblindLBL2);
        colorblindLBL2.setBounds(250, -290, 990, 820);
        navTABS.addTab(" Rock ", rockPANEL);

        
        
        jMenuBar1.setToolTipText("View Data ");
        date.setText("DATE");
        jMenuBar1.add(date);
        colorBlindMode.setToolTipText("Toggle between modes ");
        colorBlindMode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                colorBlindModeMouseClicked(evt);
            }
        });
        jMenuBar1.add(colorBlindMode);
        setJMenuBar(jMenuBar1);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navTABS, javax.swing.GroupLayout.PREFERRED_SIZE, 1167, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(navTABS, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }

    private void exitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTNActionPerformed
        JOptionPane.showMessageDialog(null , "Good bye");
        System.exit(0);
        
    }
    private boolean isLightMode = false;
    
    private void colorBlindModeMouseClicked(java.awt.event.MouseEvent evt) {
    // Toggle visibility for components associated with the main page
    backgroundLBL.setVisible(isLightMode);
    colorblindLBL.setVisible(!isLightMode);
    // Toggle visibility for components associated with the Pop page
    backgroundLBL1.setVisible(isLightMode);
    colorblindLBL1.setVisible(!isLightMode);
    // Toggle visibility for components associated with the Rock page
    backgroundLBL2.setVisible(isLightMode);
    colorblindLBL2.setVisible(!isLightMode);
    // Toggle the mode indicator
    isLightMode = !isLightMode;
    }

    
    private void addBTNActionPerformed(java.awt.event.ActionEvent evt) {
    if (titleTF.getText().isEmpty() && artistTF.getText().isEmpty() && albumTF.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null , "Enter the Title, Artist, and Album");
    } else {
        // Call the method to add the song
        likedSongs.addSong();
        // Clear the text fields after adding the song
        titleTF.setText("");
        artistTF.setText("");
        albumTF.setText("");
        }
    }

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {
        if ( titleTF.getText().isEmpty() == true && artistTF.getText().isEmpty() == true && albumTF.getText().isEmpty() == true) {  
            JOptionPane.showMessageDialog(null , "Enter the Title , Artist ,and Album ");    
        } else {
            likedSongs.deleteSong();
            
            // Clear the text fields after deletion
            titleTF.setText("");
            artistTF.setText("");
            albumTF.setText("");
        }
    }
    
    
    private void print_likedBTNActionPerformed(java.awt.event.ActionEvent evt) {
        likedSongs.printPlaylist();    
    }

    
    private void sizeBTNActionPerformed(java.awt.event.ActionEvent evt) {
        likedSongs.countSongs(); 
    }

    
    private void searchBTNActionPerformed(java.awt.event.ActionEvent evt) {
        String title = titleTF.getText();
        String artist = artistTF.getText();
        String album = albumTF.getText();
        likedSongs.searchSong(title, artist, album );          
    }

    
    private void moveBTNActionPerformed(java.awt.event.ActionEvent evt) {
        likedSongs.addLastSongToGenre();
    }

    
    private void repeatTOGGLE2ActionPerformed(java.awt.event.ActionEvent evt) {
        boolean repeat = false;
        
        if (MusicManagerGUI.repeatTOGGLE2.isSelected() == true) {
            repeat = true;
            likedSongs.setRepeat();
            GenrePlaylist.getInstance().setRepeat(repeat);
        } else if (MusicManagerGUI.repeatTOGGLE2.isSelected() == false) {
            repeat = false;
            likedSongs.setNotRepeat();
            GenrePlaylist.getInstance().setRepeat(repeat);
        }
    }

    
    private void deleteBTN1ActionPerformed(java.awt.event.ActionEvent evt) {
    if (titleTF1.getText().isEmpty() || artistTF1.getText().isEmpty() || albumTF1.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Enter the Artist, Title, and Album");
    } else {
        String title = titleTF1.getText();
        String artist = artistTF1.getText();
        String album = albumTF1.getText();
        
        Song songToDelete = new Song(title, artist, album);
        GenrePlaylist.getInstance().deletePopSong(songToDelete);
        
        // Clear the text fields after deletion
        titleTF1.setText("");
        artistTF1.setText("");
        albumTF1.setText("");
    }
    }

    
    private void sizeBTN1ActionPerformed(java.awt.event.ActionEvent evt) {
        
        GenrePlaylist.getInstance().countPopSongs();
                
    }

    
    private void exitBTN1ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null , "Good bye");
        System.exit(0);
        
    }

    
    private void searchBTN1ActionPerformed(java.awt.event.ActionEvent evt) {
        
        String title = titleTF1.getText();
        String artist = artistTF1.getText();
        String album = albumTF1.getText();
        
        GenrePlaylist.getInstance().searchPopSong(title, artist, album);
        
    }

    
    private void deleteBTN2ActionPerformed(java.awt.event.ActionEvent evt) {
        
        if (titleTF2.getText().isEmpty() == true || artistTF2.getText().isEmpty() == true || albumTF2.getText().isEmpty() == true ) {
            JOptionPane.showMessageDialog(null , "Enter the Artist ,Title ,and Album ");
        } else {
            String title = titleTF2.getText ();
            String artist = artistTF2.getText();
            String album = albumTF2.getText();

            Song songToDelete = new Song(title, artist, album);
            GenrePlaylist.getInstance().deleteRockSong(songToDelete);
            
            // Clear the text fields after deletion
            titleTF2.setText("");
            artistTF2.setText("");
            albumTF2.setText("");
            }
                
    }

    
    private void sizeBTN2ActionPerformed(java.awt.event.ActionEvent evt) {
        
        GenrePlaylist.getInstance().countRockSongs();
                
    }

    
    private void exitBTN2ActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null , "Good bye");
        System.exit(0);
        
    }

    
    private void searchBTN2ActionPerformed(java.awt.event.ActionEvent evt) {
        
        String title = titleTF2.getText();
        String artist = artistTF2.getText();
        String album = albumTF2.getText();
        
        GenrePlaylist.getInstance().searchRockSong(title, artist, album );
        
    }

    
    private void print_popBTN1ActionPerformed(java.awt.event.ActionEvent evt) {
        
        GenrePlaylist.getInstance().printPopPlaylist();
        
    }

    
    private void print_rockBTN2ActionPerformed(java.awt.event.ActionEvent evt) {
        GenrePlaylist.getInstance().printRockPlaylist();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MusicManagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MusicManagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MusicManagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MusicManagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MusicManagerGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
   
    private javax.swing.JLabel artistLBL;
    private javax.swing.JLabel artistLBL1;
    private javax.swing.JLabel artistLBL2;
    public static javax.swing.JTextField artistTF;
    public static javax.swing.JTextField artistTF1;
    public static javax.swing.JTextField artistTF2;
    private javax.swing.JLabel titleLBL;
    private javax.swing.JLabel titleLBL1;
    private javax.swing.JLabel titleLBL2;
    public static javax.swing.JTextField titleTF;
    public static javax.swing.JTextField titleTF1;
    public static javax.swing.JTextField titleTF2;
    private javax.swing.JLabel albumLBL;
    private javax.swing.JLabel albumLBL1;
    private javax.swing.JLabel albumLBL2;
    public static javax.swing.JTextField albumTF;
    public static javax.swing.JTextField albumTF1;
    public static javax.swing.JTextField albumTF2;
    private javax.swing.JLabel NotesLBL1;
    private javax.swing.JButton addBTN;
    private javax.swing.JLabel backgroundLBL;
    private javax.swing.JLabel backgroundLBL1;
    private javax.swing.JLabel backgroundLBL2;
    private javax.swing.JMenu colorBlindMode;
    private javax.swing.JLabel colorblindLBL;
    private javax.swing.JLabel colorblindLBL1;
    private javax.swing.JLabel colorblindLBL2;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JButton deleteBTN1;
    private javax.swing.JButton deleteBTN2;
    private javax.swing.JButton exitBTN;
    private javax.swing.JButton exitBTN1;
    private javax.swing.JButton exitBTN2;
    private javax.swing.JPanel popPANEL;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel likedsongsPANEL;
    private javax.swing.JLabel logoLBL;
    private javax.swing.JLabel logoLBL1;
    private javax.swing.JLabel logoLBL2;
    private javax.swing.JButton moveBTN;
    private javax.swing.JTabbedPane navTABS;
    private javax.swing.JLabel notesLBL;
    private javax.swing.JPanel rockPANEL;
    private javax.swing.JButton print_popBTN1;
    private javax.swing.JButton print_rockBTN2;
    private javax.swing.JButton print_likedBTN;
    private javax.swing.JButton print_BTN2;
    public static javax.swing.JToggleButton repeatTOGGLE2;
    private javax.swing.JButton searchBTN;
    private javax.swing.JButton searchBTN1;
    private javax.swing.JButton searchBTN2;
    private javax.swing.JButton sizeBTN;
    private javax.swing.JButton sizeBTN1;
    private javax.swing.JButton sizeBTN2;
    private javax.swing.JMenu date;
 
}

