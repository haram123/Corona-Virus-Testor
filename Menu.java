 import javax.swing.*;
import java.awt.*;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;
 import java.io.IOException;
 import java.util.ArrayList;
 import java.util.Scanner;

 public class Menu extends JFrame implements ActionListener {

     private JButton btnCovidTest;
     private JButton btnQuarantineLogin;
     private JButton btnQuarantineRegistration;
     private JButton btnCovidTestNo;
     private JButton btnQuarantineNo;

     public Menu() {

         JLabel background;
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setBounds(300,250, 800, 500);
         setResizable(false);
         setTitle("CORONA VIRUS TESTER");
         ImageIcon icon = new ImageIcon("icon.jpg");
         setIconImage(icon.getImage());
         setLayout(null);
         setContentPane(new JLabel(new ImageIcon("BackGround1.jpg")));



         JLabel menuLabel = new JLabel("Coronavirus Testing menu");
         menuLabel.setBounds(130, 25, 280, 30);
         Font font = new Font("Arial", Font.BOLD, 20);
         menuLabel.setFont(font);
         menuLabel.setForeground(Color.WHITE);

         btnCovidTest = new JButton("Covid Test");
         btnCovidTest.setBounds(20, 60, 200, 50);

         btnQuarantineRegistration = new JButton("Quarantine Registration");
         btnQuarantineRegistration.setBounds(120, 125, 200, 50);

         btnQuarantineLogin = new JButton("Quarantine Login");
         btnQuarantineLogin.setBounds(250, 60, 200, 50);
         btnQuarantineLogin.addActionListener(this);
         btnCovidTest.addActionListener(this);
         btnQuarantineRegistration.addActionListener(this);

         btnCovidTestNo = new JButton("No Of Tests Conducted");
         btnCovidTestNo.setBounds(75, 300, 300, 50);


         btnQuarantineNo = new JButton("No Of People in Quarantine");
         btnQuarantineNo.setBounds(75, 360, 300, 50);
         btnCovidTestNo.addActionListener(this);
         btnQuarantineNo.addActionListener(this);
         add(menuLabel);
         add(btnQuarantineLogin);
         add(btnCovidTest);
         add(btnQuarantineRegistration);
         add(btnCovidTestNo);
         add(btnQuarantineNo);
         setVisible(true);

     }

     @Override
     public void actionPerformed(ActionEvent e) {
         Patient P = new Patient();
         ArrayList<Patient> patients = new ArrayList<>();
         if(e.getSource() == btnCovidTest)
         {

             patients.add(P);
             P.QuarantineTest();
             P.CoronaResults();
         }
         else if (e.getSource()==btnQuarantineLogin)
         {
             try {
                 P.ReadQuarantineData();
             } catch (IOException ioException) {
                 ioException.printStackTrace();
             }
         }
         else if(e.getSource()==btnQuarantineRegistration)
         {
             P.QuarantineRegister();
         }
         else if(e.getSource()==btnCovidTestNo)
         {
             try {
                 P.CovidTestNumber();
             } catch (IOException ioException) {
                 ioException.printStackTrace();
             }
         }
         else if(e.getSource()==btnQuarantineNo)
         {
             try {
                 P.QuarantineNumber();
             } catch (IOException ioException) {
                 ioException.printStackTrace();
             }
         }

     }

 }

