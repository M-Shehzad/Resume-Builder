import javax.swing.*;
import java.awt.*;

/**
 * Summarize
 */
public class Summarize2 {
    static dbms place;

    Summarize2(){

        // STRING TO STORE THE DATA RECEIVED FROM DATABASE
        String[] profileReceived = new String[15];
        String[] educationReceived = new String[14];
        String[] skillReceived = new String[7];
        String[] hobbiesReceived = new String[4];

        // MAKING A CONNECTION TO DATABASE AND GETTING DATA
        place = new dbms();
        profileReceived =  place.getProfileData();
        place = new dbms();
        educationReceived = place.getEducationData();
        place = new dbms();
        skillReceived = place.getSkillData();
        place = new dbms();
        hobbiesReceived = place.getHobbiesData();
        //---------------------------------------------------

        JFrame frame = new JFrame();
        frame.setSize(1400, 900);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.darkGray);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        
        //--------------------------------------------------
        //page start
        JPanel panel = new JPanel();
        panel.setBounds(350, 0, 565, 780);
        panel.setBackground(Color.white);
        panel.setLayout(null);

        JLabel line1 = new JLabel();
        line1.setBounds(281, 103, 1, 553);
        panel.add(linepreset(line1));
        
        JPanel greenpanel = new JPanel();
        greenpanel.setBounds(0, 0, 565, 100);
        greenpanel.setBackground(Color.decode("#99D6B9"));
        greenpanel.setLayout(null);
        panel.add(greenpanel);
        
        JLabel sign = new JLabel(profileReceived[1] +" " + profileReceived[2]);
        sign.setBounds(0, 0, 400, 40);
        sign.setFont(new Font("Roboto",Font.PLAIN,36));
        greenpanel.add(sign);
        
        ImageIcon phoneImage = new ImageIcon(System.getProperty("user.dir") + "\\images\\phone-call.png");
        JLabel phoneL = new JLabel(profileReceived[3]);
        phoneL.setIcon(resizer(phoneImage));
        phoneL.setBounds(10, 42, 150, 30);
        phoneL.setIconTextGap(10);
        greenpanel.add(phoneL);

        ImageIcon mailImage = new ImageIcon(System.getProperty("user.dir") + "\\images\\email.png");
        JLabel mailL = new JLabel(profileReceived[4]);
        mailL.setIcon(resizer(mailImage));
        mailL.setBounds(10, 70, 220, 30);
        mailL.setIconTextGap(10);
        greenpanel.add(mailL);

        ImageIcon dobImage = new ImageIcon(System.getProperty("user.dir") + "\\images\\date-of-birth.png");
        JLabel dobL = new JLabel(profileReceived[6]);
        dobL.setIcon(resizer(dobImage));
        dobL.setBounds(10, 110, 220, 30);
        dobL.setIconTextGap(10);
        panel.add(dobL);

        ImageIcon locationImage = new ImageIcon(System.getProperty("user.dir") + "\\images\\pin.png");
        JLabel locationL = new JLabel();
        locationL.setIcon(resizer(locationImage));
        locationL.setBounds(10, 150, 30, 30);
        locationL.setIconTextGap(10);
        panel.add(locationL);

        JTextArea locationArea = new JTextArea(" " +profileReceived[8]+ ",\n " + profileReceived[9] + ", " + profileReceived[10] + ", " +
                                                profileReceived[11] + ",\n " + profileReceived[12] + ", " + profileReceived[13]);
        locationArea.setBounds(45, 155, 220, 75);
        panel.add(textPreset(locationArea));

        JLabel line2 = new JLabel();
        line2.setBounds(10, 240, 260, 1);
        panel.add(linepreset(line2));

        JLabel educationL = new JLabel("EDUCATION");
        educationL.setBounds(10,245,150,20);
        educationL.setFont(new Font("Seriff",Font.BOLD,14));
        panel.add(educationL);

        JTextArea educationArea = new JTextArea(educationReceived[0]+"  "+educationReceived[1]+"  "+educationReceived[2]+"\n"+
                                                educationReceived[3]+"  "+educationReceived[4]+"  "+educationReceived[5]+"\n"+
                                                educationReceived[7]+"  "+educationReceived[10]+"  "+educationReceived[11]+"  "+educationReceived[12]);
        educationArea.setBounds(10, 265, 260, 100);
        panel.add(textPreset(educationArea));

        JLabel line3 = new JLabel();
        line3.setBounds(10, 375, 260, 2);
        panel.add(linepreset(line3));

        JLabel coursesL = new JLabel("COURSES");
        coursesL.setBounds(10,380,150,20);
        coursesL.setFont(new Font("Seriff",Font.BOLD,14));
        panel.add(coursesL);

        JTextArea coursesArea = new JTextArea(skillReceived[2]);
        coursesArea.setBounds(10, 410, 260, 90);
        panel.add(textPreset(coursesArea));

        JLabel line4 = new JLabel();
        line4.setBounds(10, 510, 260, 2);
        panel.add(linepreset(line4));

        JLabel achievementsL = new JLabel("ACHIEVEMENTS");
        achievementsL.setBounds(10,515,150,20);
        achievementsL.setFont(new Font("Seriff",Font.BOLD,14));
        panel.add(achievementsL);

        JTextArea achievementsArea = new JTextArea(skillReceived[5]);
        achievementsArea.setBounds(10, 540, 260, 110);
        panel.add(textPreset(achievementsArea));

        JLabel skillsL = new JLabel("SKILLS");
        skillsL.setBounds(290,105,150,20);
        skillsL.setFont(new Font("Seriff",Font.BOLD,14));
        panel.add(skillsL);

        JTextArea skillsArea = new JTextArea(skillReceived[3]);
        skillsArea.setBounds(290, 130, 250, 80);
        panel.add(textPreset(skillsArea));

        JLabel jobL = new JLabel("JOB/EXPERIENCE");
        jobL.setBounds(290,220,150,20);
        jobL.setFont(new Font("Seriff",Font.BOLD,14));
        panel.add(jobL);

        JTextArea jobArea = new JTextArea(skillReceived[0]);
        jobArea.setBounds(290, 245, 250, 70);
        panel.add(textPreset(jobArea));

        JLabel internshipL = new JLabel("INTERNSHIPS");
        internshipL.setBounds(290,322,150,20);
        internshipL.setFont(new Font("Seriff",Font.BOLD,14));
        panel.add(internshipL);

        JTextArea internshipArea = new JTextArea(skillReceived[1]);
        internshipArea.setBounds(290, 345, 250, 80);
        panel.add(textPreset(internshipArea));

        JLabel portfolioL = new JLabel("PORTFOLIO");
        portfolioL.setBounds(290,432,150,20);
        portfolioL.setFont(new Font("Seriff",Font.BOLD,14));
        panel.add(portfolioL);

        JTextArea portfolioArea = new JTextArea(skillReceived[4]);
        portfolioArea.setBounds(290, 450, 250, 80);
        panel.add(textPreset(portfolioArea));

        JLabel hobbiesL = new JLabel("HOBBIES");
        hobbiesL.setBounds(290,550,150,20);
        hobbiesL.setFont(new Font("Seriff",Font.BOLD,14));
        panel.add(hobbiesL);

        JTextArea hobbiesArea = new JTextArea(hobbiesReceived[0]);
        hobbiesArea.setBounds(290, 570, 250, 80);
        panel.add(textPreset(hobbiesArea));

        JLabel declarationL = new JLabel("DECLARATION");
        declarationL.setBounds(10,655,150,20);
        declarationL.setFont(new Font("Seriff",Font.BOLD,14));
        panel.add(declarationL);

        JTextArea declarationArea = new JTextArea(hobbiesReceived[2]);
        declarationArea.setBounds(10, 680, 530, 60);
        panel.add(textPreset(declarationArea));

        JLabel signL = new JLabel("SIGNATURE");
        signL.setBounds(480,760,70,20);
        signL.setFont(new Font("Seriff",Font.BOLD,12));
        panel.add(signL);
        

        frame.add(panel);
        frame.setVisible(true);
        

    }
    ImageIcon resizer(ImageIcon image){

        Image imageget = image.getImage(); // transform it 
        Image newimg = imageget.getScaledInstance(20, 20,  Image.SCALE_SMOOTH);
        return new ImageIcon(newimg);

    }

    JTextArea textPreset(JTextArea text){
        text.setFont(new Font("Montserrat",Font.PLAIN , 14));
        text.setLineWrap(true);
        text.setWrapStyleWord(true);
        text.setOpaque(true);
        text.setEditable(false);
        return text;
    }
    JLabel linepreset(JLabel line){
        line.setBackground(Color.decode("#000000"));
        line.setOpaque(true);
        return line;
    }
}