/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.BorderFactory;
import javax.swing.SwingConstants;

/**
 *
 * @author vladv
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("ConnHealth");
        
        prepareComponents();

        
        
        
    }
 
    public void prepareComponents(){
        setupAlignment();
        setupPadding();
    }  
    
    public void setupAlignment(){
        mainFrameUsernametxt.setHorizontalAlignment(SwingConstants.CENTER);
        mainFrameUsernametxt.setVerticalAlignment(SwingConstants.CENTER);  
        mainFrameWelcometxt.setHorizontalAlignment(SwingConstants.CENTER);
        mainFrameWelcometxt.setVerticalAlignment(SwingConstants.CENTER);
    }
    
    public void setupPadding(){
        mainFrameEmplyeestxt.setBorder(BorderFactory.createCompoundBorder(mainFrameEmplyeestxt.getBorder(), BorderFactory.createEmptyBorder(0,25,0,0)));
        mainFrameInvoicestxt.setBorder(BorderFactory.createCompoundBorder(mainFrameInvoicestxt.getBorder(), BorderFactory.createEmptyBorder(0,25,0,0)));
        mainFrameAppointmentstxt.setBorder(BorderFactory.createCompoundBorder(mainFrameAppointmentstxt.getBorder(), BorderFactory.createEmptyBorder(0,25,0,0)));
        mainFrameParkingtxt.setBorder(BorderFactory.createCompoundBorder(mainFrameParkingtxt.getBorder(), BorderFactory.createEmptyBorder(0,25,0,0)));
        mainFramePatientstxt.setBorder(BorderFactory.createCompoundBorder(mainFramePatientstxt.getBorder(), BorderFactory.createEmptyBorder(0,25,0,0)));
        mainFramePharmacytxt.setBorder(BorderFactory.createCompoundBorder(mainFramePharmacytxt.getBorder(), BorderFactory.createEmptyBorder(0,25,0,0)));
        mainFrameSettingstxt.setBorder(BorderFactory.createCompoundBorder(mainFrameSettingstxt.getBorder(), BorderFactory.createEmptyBorder(0,25,0,0)));
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainFrameBackground = new javax.swing.JPanel();
        mainFrameGradientMenu = new keeptoo.KGradientPanel();
        mainFrameWelcometxt = new javax.swing.JLabel();
        mainFrameUpperseparator = new javax.swing.JSeparator();
        mainFrameUsernametxt = new javax.swing.JLabel();
        mainFrameEmplyeestxt = new javax.swing.JLabel();
        mainFramePatientstxt = new javax.swing.JLabel();
        mainFrameAppointmentstxt = new javax.swing.JLabel();
        mainFrameInvoicestxt = new javax.swing.JLabel();
        mainFramePharmacytxt = new javax.swing.JLabel();
        mainFrameParkingtxt = new javax.swing.JLabel();
        mainFrameBottomseparator = new javax.swing.JSeparator();
        mainFrameSettingstxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(956, 740));

        mainFrameBackground.setBackground(new java.awt.Color(227, 240, 250));

        mainFrameGradientMenu.setkEndColor(new java.awt.Color(38, 160, 218));
        mainFrameGradientMenu.setkStartColor(new java.awt.Color(49, 71, 85));

        mainFrameWelcometxt.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        mainFrameWelcometxt.setForeground(new java.awt.Color(255, 255, 255));
        mainFrameWelcometxt.setText("Welcome");
        mainFrameWelcometxt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        mainFrameUpperseparator.setForeground(new java.awt.Color(130, 160, 191));
        mainFrameUpperseparator.setPreferredSize(new java.awt.Dimension(0, 1));

        mainFrameUsernametxt.setFont(new java.awt.Font("Segoe UI Symbol", 0, 24)); // NOI18N
        mainFrameUsernametxt.setForeground(new java.awt.Color(255, 255, 255));
        mainFrameUsernametxt.setText("Avenger01");
        mainFrameUsernametxt.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        mainFrameEmplyeestxt.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        mainFrameEmplyeestxt.setForeground(new java.awt.Color(255, 255, 255));
        mainFrameEmplyeestxt.setText("Employees");

        mainFramePatientstxt.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        mainFramePatientstxt.setForeground(new java.awt.Color(255, 255, 255));
        mainFramePatientstxt.setText("Patients");
        mainFramePatientstxt.setPreferredSize(new java.awt.Dimension(81, 25));

        mainFrameAppointmentstxt.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        mainFrameAppointmentstxt.setForeground(new java.awt.Color(255, 255, 255));
        mainFrameAppointmentstxt.setText("Appointments");
        mainFrameAppointmentstxt.setPreferredSize(new java.awt.Dimension(81, 25));

        mainFrameInvoicestxt.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        mainFrameInvoicestxt.setForeground(new java.awt.Color(255, 255, 255));
        mainFrameInvoicestxt.setText("Invoices");
        mainFrameInvoicestxt.setPreferredSize(new java.awt.Dimension(81, 25));

        mainFramePharmacytxt.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        mainFramePharmacytxt.setForeground(new java.awt.Color(255, 255, 255));
        mainFramePharmacytxt.setText("Pharmacy");

        mainFrameParkingtxt.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        mainFrameParkingtxt.setForeground(new java.awt.Color(255, 255, 255));
        mainFrameParkingtxt.setText("Parking");

        mainFrameBottomseparator.setForeground(new java.awt.Color(130, 160, 191));
        mainFrameBottomseparator.setMinimumSize(new java.awt.Dimension(50, 1));
        mainFrameBottomseparator.setPreferredSize(new java.awt.Dimension(0, 1));

        mainFrameSettingstxt.setFont(new java.awt.Font("Segoe UI Semilight", 0, 22)); // NOI18N
        mainFrameSettingstxt.setForeground(new java.awt.Color(255, 255, 255));
        mainFrameSettingstxt.setText("Settings");

        javax.swing.GroupLayout mainFrameGradientMenuLayout = new javax.swing.GroupLayout(mainFrameGradientMenu);
        mainFrameGradientMenu.setLayout(mainFrameGradientMenuLayout);
        mainFrameGradientMenuLayout.setHorizontalGroup(
            mainFrameGradientMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainFrameWelcometxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainFrameGradientMenuLayout.createSequentialGroup()
                .addGroup(mainFrameGradientMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainFrameGradientMenuLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(mainFramePharmacytxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(mainFrameParkingtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainFrameSettingstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainFrameBottomseparator, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainFrameUpperseparator, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainFrameGradientMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(mainFrameEmplyeestxt, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                        .addComponent(mainFrameAppointmentstxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mainFramePatientstxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mainFrameInvoicestxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(39, 39, 39))
            .addComponent(mainFrameUsernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        mainFrameGradientMenuLayout.setVerticalGroup(
            mainFrameGradientMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainFrameGradientMenuLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(mainFrameWelcometxt)
                .addGap(18, 18, 18)
                .addComponent(mainFrameUsernametxt)
                .addGap(34, 34, 34)
                .addComponent(mainFrameUpperseparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(mainFrameEmplyeestxt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(mainFramePatientstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(mainFrameAppointmentstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(mainFrameInvoicestxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(mainFramePharmacytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(mainFrameParkingtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(mainFrameBottomseparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mainFrameSettingstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainFrameBackgroundLayout = new javax.swing.GroupLayout(mainFrameBackground);
        mainFrameBackground.setLayout(mainFrameBackgroundLayout);
        mainFrameBackgroundLayout.setHorizontalGroup(
            mainFrameBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainFrameBackgroundLayout.createSequentialGroup()
                .addComponent(mainFrameGradientMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(761, Short.MAX_VALUE))
        );
        mainFrameBackgroundLayout.setVerticalGroup(
            mainFrameBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainFrameGradientMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainFrameBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainFrameBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel mainFrameAppointmentstxt;
    private javax.swing.JPanel mainFrameBackground;
    private javax.swing.JSeparator mainFrameBottomseparator;
    private javax.swing.JLabel mainFrameEmplyeestxt;
    private keeptoo.KGradientPanel mainFrameGradientMenu;
    private javax.swing.JLabel mainFrameInvoicestxt;
    private javax.swing.JLabel mainFrameParkingtxt;
    private javax.swing.JLabel mainFramePatientstxt;
    private javax.swing.JLabel mainFramePharmacytxt;
    private javax.swing.JLabel mainFrameSettingstxt;
    private javax.swing.JSeparator mainFrameUpperseparator;
    private javax.swing.JLabel mainFrameUsernametxt;
    private javax.swing.JLabel mainFrameWelcometxt;
    // End of variables declaration//GEN-END:variables
}
