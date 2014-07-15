
package hangman_mvc;

import javax.swing.JOptionPane;


public class View extends javax.swing.JFrame {

    GameModel gameModel;
    Controller controller;
    LivesBar livesBar;
    HangingMan hangingMan;
    KittenGenerator kittenGenerator;
    MusicPlayer musicPlayer;
    String prevCatagory;

    public View(GameModel gM, Controller controller) {
        initComponents();
        this.gameModel = gM;
        this.controller = controller;
        this.livesBar = new LivesBar(gameModel);
        this.hangingMan = new HangingMan(gameModel);
        this.kittenGenerator = new KittenGenerator();
        this.musicPlayer = new MusicPlayer();
        this.prevCatagory = "";
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basePanel = new javax.swing.JPanel();
        leftPanel = new javax.swing.JPanel();
        Menu_Panel = new javax.swing.JPanel();
        jButton_StartGame = new javax.swing.JButton();
        jButton_Resolve = new javax.swing.JButton();
        catagoryDropDown = new javax.swing.JComboBox();
        soundButton = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTextField_HangManWord = new javax.swing.JTextField();
        jLabel_Lives = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lives = new javax.swing.JLabel();
        Keyboard_Panel = new javax.swing.JPanel();
        jButton_A = new javax.swing.JButton();
        jButton_B = new javax.swing.JButton();
        jButton_C = new javax.swing.JButton();
        jButton_D = new javax.swing.JButton();
        jButton_E = new javax.swing.JButton();
        jButtonF = new javax.swing.JButton();
        jButton_G = new javax.swing.JButton();
        jButton_H = new javax.swing.JButton();
        jButton_I = new javax.swing.JButton();
        jButton_J = new javax.swing.JButton();
        jButton_K = new javax.swing.JButton();
        jButton_L = new javax.swing.JButton();
        jButtonM = new javax.swing.JButton();
        jButtonN = new javax.swing.JButton();
        jButton_O = new javax.swing.JButton();
        jButton_P = new javax.swing.JButton();
        jButton_Q = new javax.swing.JButton();
        jButton_R = new javax.swing.JButton();
        jButton_S = new javax.swing.JButton();
        jButton_T = new javax.swing.JButton();
        jButton_U = new javax.swing.JButton();
        jButton_V = new javax.swing.JButton();
        jButton_W = new javax.swing.JButton();
        jButton_X = new javax.swing.JButton();
        jButton_Y = new javax.swing.JButton();
        jButton_Z = new javax.swing.JButton();
        RightPanel = new javax.swing.JPanel();
        hangmanGraphic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HANGMAN");
        setBackground(new java.awt.Color(255, 255, 255));

        basePanel.setBackground(new java.awt.Color(255, 255, 255));

        leftPanel.setBackground(new java.awt.Color(255, 255, 255));

        Menu_Panel.setBackground(new java.awt.Color(255, 255, 255));
        Menu_Panel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)), "Menu", 0, 0, new java.awt.Font("Arial", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        jButton_StartGame.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_StartGame.setText("START GAME / RESET");
        jButton_StartGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_StartGameActionPerformed(evt);
            }
        });

        jButton_Resolve.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_Resolve.setText("Resolve");
        jButton_Resolve.setPreferredSize(new java.awt.Dimension(79, 23));
        jButton_Resolve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ResolveActionPerformed(evt);
            }
        });

        catagoryDropDown.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        catagoryDropDown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose a Catagory", "Random", "Lord of The Rings", "Philosophers", "Great Hisorical Figures", "Warcraft", "Blade Runner" }));
        catagoryDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catagoryDropDownActionPerformed(evt);
            }
        });

        soundButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        soundButton.setText("Sound On/Off");
        soundButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soundButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Menu_PanelLayout = new javax.swing.GroupLayout(Menu_Panel);
        Menu_Panel.setLayout(Menu_PanelLayout);
        Menu_PanelLayout.setHorizontalGroup(
            Menu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Menu_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Menu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_StartGame, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Resolve, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Menu_PanelLayout.createSequentialGroup()
                        .addComponent(catagoryDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(soundButton, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Menu_PanelLayout.setVerticalGroup(
            Menu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Menu_PanelLayout.createSequentialGroup()
                .addComponent(jButton_StartGame, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_Resolve, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Menu_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(catagoryDropDown)
                    .addComponent(soundButton, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)), "The Word:", 0, 0, new java.awt.Font("Arial", 0, 14), new java.awt.Color(0, 153, 153))); // NOI18N

        jTextField_HangManWord.setEditable(false);
        jTextField_HangManWord.setBackground(new java.awt.Color(0, 0, 0));
        jTextField_HangManWord.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        jTextField_HangManWord.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_HangManWord.setText("  H A N G M A N");
        jTextField_HangManWord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_HangManWordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField_HangManWord)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField_HangManWord, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel_Lives.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lives, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Lives, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Lives, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lives, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        Keyboard_Panel.setBackground(new java.awt.Color(255, 255, 255));
        Keyboard_Panel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)), "Letters", 0, 0, new java.awt.Font("Arial", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        Keyboard_Panel.setLayout(new java.awt.GridLayout(6, 0, -1, -1));

        jButton_A.setText("A");
        jButton_A.setPreferredSize(new java.awt.Dimension(85, 57));
        jButton_A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AActionPerformed(evt);
            }
        });
        Keyboard_Panel.add(jButton_A);

        jButton_B.setText("B");
        jButton_B.setPreferredSize(new java.awt.Dimension(85, 57));
        jButton_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BActionPerformed(evt);
            }
        });
        Keyboard_Panel.add(jButton_B);

        jButton_C.setText("C");
        jButton_C.setPreferredSize(new java.awt.Dimension(85, 57));
        jButton_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CActionPerformed(evt);
            }
        });
        Keyboard_Panel.add(jButton_C);

        jButton_D.setText("D");
        jButton_D.setPreferredSize(new java.awt.Dimension(85, 57));
        jButton_D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DActionPerformed(evt);
            }
        });
        Keyboard_Panel.add(jButton_D);

        jButton_E.setText("E");
        jButton_E.setPreferredSize(new java.awt.Dimension(85, 57));
        jButton_E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EActionPerformed(evt);
            }
        });
        Keyboard_Panel.add(jButton_E);

        jButtonF.setText("F");
        jButtonF.setPreferredSize(new java.awt.Dimension(85, 57));
        jButtonF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFActionPerformed(evt);
            }
        });
        Keyboard_Panel.add(jButtonF);

        jButton_G.setText("G");
        jButton_G.setPreferredSize(new java.awt.Dimension(85, 57));
        jButton_G.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GActionPerformed(evt);
            }
        });
        Keyboard_Panel.add(jButton_G);

        jButton_H.setText("H");
        jButton_H.setPreferredSize(new java.awt.Dimension(85, 57));
        jButton_H.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_HActionPerformed(evt);
            }
        });
        Keyboard_Panel.add(jButton_H);

        jButton_I.setText("I");
        jButton_I.setPreferredSize(new java.awt.Dimension(85, 57));
        jButton_I.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_IActionPerformed(evt);
            }
        });
        Keyboard_Panel.add(jButton_I);

        jButton_J.setText("J");
        jButton_J.setPreferredSize(new java.awt.Dimension(85, 57));
        jButton_J.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_JActionPerformed(evt);
            }
        });
        Keyboard_Panel.add(jButton_J);

        jButton_K.setText("K");
        jButton_K.setPreferredSize(new java.awt.Dimension(85, 57));
        jButton_K.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_KActionPerformed(evt);
            }
        });
        Keyboard_Panel.add(jButton_K);

        jButton_L.setText("L");
        jButton_L.setPreferredSize(new java.awt.Dimension(85, 57));
        jButton_L.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LActionPerformed(evt);
            }
        });
        Keyboard_Panel.add(jButton_L);

        jButtonM.setText("M");
        jButtonM.setPreferredSize(new java.awt.Dimension(85, 57));
        jButtonM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMActionPerformed(evt);
            }
        });
        Keyboard_Panel.add(jButtonM);

        jButtonN.setText("N");
        jButtonN.setPreferredSize(new java.awt.Dimension(85, 57));
        jButtonN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNActionPerformed(evt);
            }
        });
        Keyboard_Panel.add(jButtonN);

        jButton_O.setText("O");
        jButton_O.setPreferredSize(new java.awt.Dimension(85, 57));
        jButton_O.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_OActionPerformed(evt);
            }
        });
        Keyboard_Panel.add(jButton_O);

        jButton_P.setText("P");
        jButton_P.setPreferredSize(new java.awt.Dimension(85, 57));
        jButton_P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PActionPerformed(evt);
            }
        });
        Keyboard_Panel.add(jButton_P);

        jButton_Q.setText("Q");
        jButton_Q.setPreferredSize(new java.awt.Dimension(85, 57));
        jButton_Q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_QActionPerformed(evt);
            }
        });
        Keyboard_Panel.add(jButton_Q);

        jButton_R.setText("R");
        jButton_R.setPreferredSize(new java.awt.Dimension(85, 57));
        jButton_R.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RActionPerformed(evt);
            }
        });
        Keyboard_Panel.add(jButton_R);

        jButton_S.setText("S");
        jButton_S.setPreferredSize(new java.awt.Dimension(85, 57));
        jButton_S.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SActionPerformed(evt);
            }
        });
        Keyboard_Panel.add(jButton_S);

        jButton_T.setText("T");
        jButton_T.setPreferredSize(new java.awt.Dimension(85, 57));
        jButton_T.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_TActionPerformed(evt);
            }
        });
        Keyboard_Panel.add(jButton_T);

        jButton_U.setText("U");
        jButton_U.setPreferredSize(new java.awt.Dimension(85, 57));
        jButton_U.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UActionPerformed(evt);
            }
        });
        Keyboard_Panel.add(jButton_U);

        jButton_V.setText("V");
        jButton_V.setPreferredSize(new java.awt.Dimension(85, 57));
        jButton_V.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VActionPerformed(evt);
            }
        });
        Keyboard_Panel.add(jButton_V);

        jButton_W.setText("W");
        jButton_W.setPreferredSize(new java.awt.Dimension(85, 57));
        jButton_W.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_WActionPerformed(evt);
            }
        });
        Keyboard_Panel.add(jButton_W);

        jButton_X.setText("X");
        jButton_X.setPreferredSize(new java.awt.Dimension(85, 57));
        jButton_X.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_XActionPerformed(evt);
            }
        });
        Keyboard_Panel.add(jButton_X);

        jButton_Y.setText("Y");
        jButton_Y.setPreferredSize(new java.awt.Dimension(85, 57));
        jButton_Y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_YActionPerformed(evt);
            }
        });
        Keyboard_Panel.add(jButton_Y);

        jButton_Z.setText("Z");
        jButton_Z.setPreferredSize(new java.awt.Dimension(85, 57));
        jButton_Z.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ZActionPerformed(evt);
            }
        });
        Keyboard_Panel.add(jButton_Z);

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftPanelLayout.createSequentialGroup()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Keyboard_Panel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Menu_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addComponent(Menu_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Keyboard_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        RightPanel.setBackground(new java.awt.Color(255, 255, 255));
        RightPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        hangmanGraphic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hangman_mvc/Images/hangman_6Lives.png"))); // NOI18N

        javax.swing.GroupLayout RightPanelLayout = new javax.swing.GroupLayout(RightPanel);
        RightPanel.setLayout(RightPanelLayout);
        RightPanelLayout.setHorizontalGroup(
            RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hangmanGraphic, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
        );
        RightPanelLayout.setVerticalGroup(
            RightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hangmanGraphic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout basePanelLayout = new javax.swing.GroupLayout(basePanel);
        basePanel.setLayout(basePanelLayout);
        basePanelLayout.setHorizontalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        basePanelLayout.setVerticalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(basePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_HangManWordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_HangManWordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_HangManWordActionPerformed

   
    //Keyboard button 'E'
    private void jButton_EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EActionPerformed
        controller.tryWith('e');

        updateView();

        jButton_E.setEnabled(false);
    }//GEN-LAST:event_jButton_EActionPerformed

     // <editor-fold defaultstate="collapsed" desc=" THE REST OF THE KEYBOARD BUTTONS">
    private void jButton_JActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_JActionPerformed
        controller.tryWith('j');

        updateView();

        jButton_J.setEnabled(false);
    }//GEN-LAST:event_jButton_JActionPerformed

    private void jButtonNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNActionPerformed
        controller.tryWith('n');

        updateView();

        jButtonN.setEnabled(false);
    }//GEN-LAST:event_jButtonNActionPerformed

    private void jButton_PActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PActionPerformed
        controller.tryWith('p');

        updateView();

        jButton_P.setEnabled(false);
    }//GEN-LAST:event_jButton_PActionPerformed

    private void jButton_XActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_XActionPerformed
        controller.tryWith('x');

        updateView();

        jButton_X.setEnabled(false);
    }//GEN-LAST:event_jButton_XActionPerformed

    private void jButton_UActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UActionPerformed
        controller.tryWith('u');

        updateView();

        jButton_U.setEnabled(false);
    }//GEN-LAST:event_jButton_UActionPerformed

    private void jButton_AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AActionPerformed

        controller.tryWith('a');

        updateView();

        jButton_A.setEnabled(false);
    }//GEN-LAST:event_jButton_AActionPerformed

    private void jButton_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BActionPerformed
        controller.tryWith('b');

        updateView();

        jButton_B.setEnabled(false);
    }//GEN-LAST:event_jButton_BActionPerformed

    private void jButton_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CActionPerformed
        controller.tryWith('c');

        updateView();

        jButton_C.setEnabled(false);
    }//GEN-LAST:event_jButton_CActionPerformed

    private void jButton_DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DActionPerformed
        controller.tryWith('d');

        updateView();

        jButton_D.setEnabled(false);
    }//GEN-LAST:event_jButton_DActionPerformed

    private void jButtonFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFActionPerformed
        controller.tryWith('f');

        updateView();

        jButtonF.setEnabled(false);
    }//GEN-LAST:event_jButtonFActionPerformed

    private void jButton_GActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GActionPerformed
        controller.tryWith('g');

        updateView();

        jButton_G.setEnabled(false);
    }//GEN-LAST:event_jButton_GActionPerformed

    private void jButton_HActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_HActionPerformed
        controller.tryWith('h');

        updateView();

        jButton_H.setEnabled(false);
    }//GEN-LAST:event_jButton_HActionPerformed

    private void jButton_IActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_IActionPerformed
        controller.tryWith('i');

        updateView();

        jButton_I.setEnabled(false);
    }//GEN-LAST:event_jButton_IActionPerformed

    private void jButton_KActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_KActionPerformed
        controller.tryWith('k');

        updateView();

        jButton_K.setEnabled(false);
    }//GEN-LAST:event_jButton_KActionPerformed

    private void jButton_LActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LActionPerformed
        controller.tryWith('l');

        updateView();

        jButton_L.setEnabled(false);
    }//GEN-LAST:event_jButton_LActionPerformed

    private void jButtonMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMActionPerformed
        controller.tryWith('m');

        updateView();

        jButtonM.setEnabled(false);
    }//GEN-LAST:event_jButtonMActionPerformed

    private void jButton_OActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_OActionPerformed
        controller.tryWith('o');

        updateView();

        jButton_O.setEnabled(false);
    }//GEN-LAST:event_jButton_OActionPerformed

    private void jButton_QActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_QActionPerformed
        controller.tryWith('q');

        updateView();

        jButton_Q.setEnabled(false);
    }//GEN-LAST:event_jButton_QActionPerformed

    private void jButton_RActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RActionPerformed
        controller.tryWith('r');

        updateView();

        jButton_R.setEnabled(false);
    }//GEN-LAST:event_jButton_RActionPerformed

    private void jButton_SActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SActionPerformed
        controller.tryWith('s');

        updateView();

        jButton_S.setEnabled(false);
    }//GEN-LAST:event_jButton_SActionPerformed

    private void jButton_TActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_TActionPerformed
        controller.tryWith('t');

        updateView();

        jButton_T.setEnabled(false);
    }//GEN-LAST:event_jButton_TActionPerformed

    private void jButton_VActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VActionPerformed
        controller.tryWith('v');

        updateView();

        jButton_V.setEnabled(false);
    }//GEN-LAST:event_jButton_VActionPerformed

    private void jButton_WActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_WActionPerformed
        controller.tryWith('w');

        updateView();

        jButton_W.setEnabled(false);
    }//GEN-LAST:event_jButton_WActionPerformed

    private void jButton_YActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_YActionPerformed
        controller.tryWith('y');

        updateView();

        jButton_Y.setEnabled(false);
    }//GEN-LAST:event_jButton_YActionPerformed

    private void jButton_ZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ZActionPerformed
        controller.tryWith('z');

        updateView();

        jButton_Z.setEnabled(false);
    }//GEN-LAST:event_jButton_ZActionPerformed
    // </editor-fold>
    
    
    private void jButton_StartGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_StartGameActionPerformed
  
        if (catagoryChanged()) {
            musicPlayer.stop();   
        }
        
        setCatagory();
        
        controller.reset();
        
        activateAllButtons();
               
        updateGraphics();
        
        updateHangmanWord();
        
        
        if (!(soundButton.isSelected()) && (musicPlayer.playing == false)) {   //make here a method isPlaying?
            musicPlayer.play(gameModel.wordCatagory);
        }   

    }//GEN-LAST:event_jButton_StartGameActionPerformed

    private void jButton_ResolveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ResolveActionPerformed
        jTextField_HangManWord.setText(gameModel.getSecretWord());
        controller.setLives(0);
    }//GEN-LAST:event_jButton_ResolveActionPerformed

    private void catagoryDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catagoryDropDownActionPerformed
       // musicPlayer.stop();
    }//GEN-LAST:event_catagoryDropDownActionPerformed

    private void soundButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soundButtonActionPerformed

        if (soundButton.isSelected()) {
            musicPlayer.stop();
        } else {
            musicPlayer.stop();
            musicPlayer.play(gameModel.wordCatagory);
        }
    }//GEN-LAST:event_soundButtonActionPerformed

    private void updateView() {
        updateHangmanWord();
        updateGraphics();
        
        if (gameModel.isTheWholeWordGuessed() == true) {
            handleWin();
        }
    }
    
    private void updateGraphics(){      
        lives.setIcon(livesBar.updateLivesBar());      
        hangmanGraphic.setIcon(hangingMan.updateHangmanGraphic());
    }
    
    private void handleWin(){
        int x = JOptionPane.showConfirmDialog(this, "You Won! Accept your price?", "Wow, such smart",  0);
            if (x == 0) {
                hangmanGraphic.setIcon(kittenGenerator.getKitten());
            }
            deActivateAllButtons();
    }
    
    private void setCatagory(){
        if (catagoryDropDown.getSelectedItem().toString().equals("Choose a Catagory")) {
            controller.setCatagory("Random");
            catagoryDropDown.setSelectedIndex(1);
        } else {
        controller.setCatagory(catagoryDropDown.getSelectedItem().toString());} 
        this.prevCatagory = catagoryDropDown.getSelectedItem().toString();
    }
    
    private void updateHangmanWord(){
        jTextField_HangManWord.setText(gameModel.getHangmanWord());
    }
    
    private boolean catagoryChanged(){
       // return (!(prevCatagory.equals(catagoryDropDown.getSelectedItem().toString())));
        
        if (prevCatagory.equals(catagoryDropDown.getSelectedItem().toString())) {
            return false;
        } return true;
    }

    
    private void activateAllButtons(){
        jButton_A.setEnabled(true);jButton_B.setEnabled(true);jButton_C.setEnabled(true);jButton_D.setEnabled(true);
        jButton_E.setEnabled(true);jButtonF.setEnabled(true);jButton_G.setEnabled(true);jButton_H.setEnabled(true);
        jButton_I.setEnabled(true);jButton_J.setEnabled(true);jButton_K.setEnabled(true);jButton_L.setEnabled(true);
        jButtonM.setEnabled(true);jButtonN.setEnabled(true);jButton_O.setEnabled(true);jButton_P.setEnabled(true);
        jButton_Q.setEnabled(true);jButton_R.setEnabled(true);jButton_S.setEnabled(true);jButton_T.setEnabled(true);
        jButton_U.setEnabled(true);jButton_V.setEnabled(true);jButton_W.setEnabled(true);jButton_X.setEnabled(true);
        jButton_Y.setEnabled(true);jButton_Z.setEnabled(true);
    }
    
    private void deActivateAllButtons(){
        jButton_A.setEnabled(false);jButton_B.setEnabled(false);jButton_C.setEnabled(false);jButton_D.setEnabled(false);
        jButton_E.setEnabled(false);jButtonF.setEnabled(false);jButton_G.setEnabled(false);jButton_H.setEnabled(false);
        jButton_I.setEnabled(false);jButton_J.setEnabled(false);jButton_K.setEnabled(false);jButton_L.setEnabled(false);
        jButtonM.setEnabled(false);jButtonN.setEnabled(false);jButton_O.setEnabled(false);jButton_P.setEnabled(false);
        jButton_Q.setEnabled(false);jButton_R.setEnabled(false);jButton_S.setEnabled(false);jButton_T.setEnabled(false);
        jButton_U.setEnabled(false);jButton_V.setEnabled(false);jButton_W.setEnabled(false);jButton_X.setEnabled(false);
        jButton_Y.setEnabled(false);jButton_Z.setEnabled(false);
    }

   
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Keyboard_Panel;
    private javax.swing.JPanel Menu_Panel;
    private javax.swing.JPanel RightPanel;
    private javax.swing.JPanel basePanel;
    private javax.swing.JComboBox catagoryDropDown;
    private javax.swing.JLabel hangmanGraphic;
    private javax.swing.JButton jButtonF;
    private javax.swing.JButton jButtonM;
    private javax.swing.JButton jButtonN;
    private javax.swing.JButton jButton_A;
    private javax.swing.JButton jButton_B;
    private javax.swing.JButton jButton_C;
    private javax.swing.JButton jButton_D;
    private javax.swing.JButton jButton_E;
    private javax.swing.JButton jButton_G;
    private javax.swing.JButton jButton_H;
    private javax.swing.JButton jButton_I;
    private javax.swing.JButton jButton_J;
    private javax.swing.JButton jButton_K;
    private javax.swing.JButton jButton_L;
    private javax.swing.JButton jButton_O;
    private javax.swing.JButton jButton_P;
    private javax.swing.JButton jButton_Q;
    private javax.swing.JButton jButton_R;
    private javax.swing.JButton jButton_Resolve;
    private javax.swing.JButton jButton_S;
    private javax.swing.JButton jButton_StartGame;
    private javax.swing.JButton jButton_T;
    private javax.swing.JButton jButton_U;
    private javax.swing.JButton jButton_V;
    private javax.swing.JButton jButton_W;
    private javax.swing.JButton jButton_X;
    private javax.swing.JButton jButton_Y;
    private javax.swing.JButton jButton_Z;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_Lives;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField_HangManWord;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JLabel lives;
    private javax.swing.JToggleButton soundButton;
    // End of variables declaration//GEN-END:variables
}
