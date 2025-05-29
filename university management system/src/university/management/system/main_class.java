package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_class extends JFrame implements ActionListener {
    public main_class() {
        // Load background image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/thirds.jpg"));
        if(i1.getIconWidth() == -1) {
            System.err.println("Image resource not found!");
        }
        Image i2 = i1.getImage().getScaledInstance(1540, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        add(img);

        // Create menu bar and add JMenuItems (do not add listeners to JMenu objects)
        JMenuBar mb = new JMenuBar();

        // New Information Menu
        JMenu newInfo = new JMenu("New Information");
        newInfo.setForeground(Color.BLACK);
        mb.add(newInfo);

        JMenuItem facultyInfo = new JMenuItem("New Faculty Information");
        facultyInfo.setBackground(Color.WHITE);
        facultyInfo.addActionListener(this);
        newInfo.add(facultyInfo);

        JMenuItem studentInfo = new JMenuItem("New Student Information");
        studentInfo.setBackground(Color.WHITE);
        studentInfo.addActionListener(this);
        newInfo.add(studentInfo);

        // Details Menu
        JMenu details = new JMenu("View Details");
        details.setForeground(Color.BLACK);
        mb.add(details);

        JMenuItem facultydetails = new JMenuItem("View Faculty Details");
        facultydetails.setBackground(Color.WHITE);
        facultydetails.addActionListener(this);
        details.add(facultydetails);

        JMenuItem studentdetails = new JMenuItem("View Student Details");
        studentdetails.setBackground(Color.WHITE);
        studentdetails.addActionListener(this);
        details.add(studentdetails);

        // Leave Menu
        JMenu leave = new JMenu("Apply Leave");
        leave.setForeground(Color.BLACK);
        mb.add(leave);

        JMenuItem facultyLeave = new JMenuItem("Faculty Leave");
        facultyLeave.setBackground(Color.WHITE);
        facultyLeave.addActionListener(this);
        leave.add(facultyLeave);

        JMenuItem studentLeave = new JMenuItem("Student Leave");
        studentLeave.setBackground(Color.WHITE);
        studentLeave.addActionListener(this);
        leave.add(studentLeave);

        // Leave Details Menu
        JMenu leaveDetails = new JMenu("Leave Details");
        leaveDetails.setForeground(Color.BLACK);
        mb.add(leaveDetails);

        JMenuItem facultyleaveDetails = new JMenuItem("Faculty Leave Details");
        facultyleaveDetails.setBackground(Color.WHITE);
        facultyleaveDetails.addActionListener(this);
        leaveDetails.add(facultyleaveDetails);

        JMenuItem studentleaveDetails = new JMenuItem("Student Leave Details");
        studentleaveDetails.setBackground(Color.WHITE);
        studentleaveDetails.addActionListener(this);
        leaveDetails.add(studentleaveDetails);

        // Examination Menu
        JMenu exam = new JMenu("Examination");
        exam.setForeground(Color.BLACK);
        mb.add(exam);

        JMenuItem ExaminationDetails = new JMenuItem("Examination Results");
        ExaminationDetails.setBackground(Color.WHITE);
        ExaminationDetails.addActionListener(this);
        exam.add(ExaminationDetails);

        JMenuItem EnterMarks = new JMenuItem("Enter Marks");
        EnterMarks.setBackground(Color.WHITE);
        EnterMarks.addActionListener(this);
        exam.add(EnterMarks);

        // Update Information Menu
        JMenu updateInfo = new JMenu("Update Details");
        updateInfo.setForeground(Color.BLACK);
        mb.add(updateInfo);

        JMenuItem updatefacultyinfo = new JMenuItem("Update Faculty Details");
        updatefacultyinfo.setBackground(Color.WHITE);
        updatefacultyinfo.addActionListener(this);
        updateInfo.add(updatefacultyinfo);

        JMenuItem updatestudentinfo = new JMenuItem("Update Student Details");
        updatestudentinfo.setBackground(Color.WHITE);
        updatestudentinfo.addActionListener(this);
        updateInfo.add(updatestudentinfo);

        // Fee Details Menu
        JMenu fee = new JMenu("Fee Details");
        fee.setForeground(Color.BLACK);
        mb.add(fee);

        JMenuItem feestructure = new JMenuItem("Fee Structure");
        feestructure.setBackground(Color.WHITE);
        feestructure.addActionListener(this);
        fee.add(feestructure);

        JMenuItem feeForm = new JMenuItem("Student Fee Form");
        feeForm.setBackground(Color.WHITE);
        feeForm.addActionListener(this);
        fee.add(feeForm);

        // Utility Menu
        JMenu utility = new JMenu("Utility");
        utility.setForeground(Color.BLACK);
        mb.add(utility);

        JMenuItem ca = new JMenuItem("Calculator");
        ca.setBackground(Color.WHITE);
        ca.addActionListener(this);
        utility.add(ca);

        JMenuItem notepad = new JMenuItem("Notepad");
        notepad.setBackground(Color.WHITE);
        notepad.addActionListener(this);
        utility.add(notepad);

        // About Menu
        JMenu about = new JMenu("About");
        about.setForeground(Color.BLACK);
        mb.add(about);

        JMenuItem aboutItem = new JMenuItem("About");
        aboutItem.setBackground(Color.WHITE);
        aboutItem.addActionListener(this);
        about.add(aboutItem);

        // Exit Menu
        JMenu exit = new JMenu("Exit");
        exit.setForeground(Color.BLACK);
        mb.add(exit);

        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.setBackground(Color.WHITE);
        exitItem.addActionListener(this);
        exit.add(exitItem);

        setJMenuBar(mb);

        // Adjust the frame size and, if desired, maximize the frame
        // setSize(2140, 950); // or use:
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String sm = e.getActionCommand();
        switch (sm) {
            case "Exit":
                System.exit(0);
                break;
            case "Calculator":
                try {
                    Runtime.getRuntime().exec("calc.exe");
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                break;
            case "Notepad":
                try {
                    Runtime.getRuntime().exec("notepad.exe");
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                break;
            case "New Faculty Information":
                new AddFaculty();
                break;
            case "New Student Information":
                new AddStudent();
                break;
            case "View Faculty Details":
                new TeacherDetails();
                break;
            case "View Student Details":
                new StudentDetails();
                break;
            case "Faculty Leave":
                new TeacherLeave();
                break;
            case "Student Leave":
                new StudentLeave();
                break;
            case "Faculty Leave Details":
                new TeacherLeaveDetails();
                break;
            case "Student Leave Details":
                new StudentLeaveDetails();
                break;
            case "Update Faculty Details":
                new UpdateTeacher();
                break;
            case "Update Student Details":
                new updateStudent();
                break;
            case "Enter Marks":
                new EnterMarks();
                break;
            case "Examination Results":
                new ExaminationDetails();
                break;
            case "Fee Structure":
                new FreeStructure();
                break;
            case "Student Fee Form":
                new StudentFeeForm();
                break;
            case "About":
                new About();
                break;
            default:
                System.out.println("No matching action for: " + sm);
                break;
        }
    }

    public static void main(String[] args) {
        new main_class();
    }
}
