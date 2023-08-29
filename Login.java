import javax.swing.*;

public class Login {
    private JLabel LabelFirstName;
    private JTextField textField1;
    private JLabel LabelLastName;
    private JLabel LabelEmail;
    private JTextField textField3;
    private JRadioButton radioButton1Robot;
    private JRadioButton radioButton2RememberMe;
    private JCheckBox rememberMeCheckBox;
    private JCheckBox iHaveReadAndCheckBox;
    private JLabel LabelKieraHaul;
    private JButton submitButton;
    public JPanel kirah;


    public static void main(String[] args){

                SwingUtilities.invokeLater(() -> {
                    JFrame frame = new JFrame("KieraHaul");
                    frame.setSize(1000,1000);
                    frame.setContentPane(new Login().kirah);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.pack();
                    frame.setVisible(true);
                });


            }


    }


