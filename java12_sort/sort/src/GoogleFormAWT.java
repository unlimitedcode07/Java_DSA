import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

class StudentSurveyForm extends Frame implements ActionListener {

    Label title;

    Label nameLabel, branchLabel, ratingLabel, learnLabel;
    TextField nameField;

    Choice branchChoice;
    Choice ratingChoice;
    Choice learnChoice;

    Button submit, show;

    TextArea display;

    ArrayList<String> responses = new ArrayList<>();

    StudentSurveyForm() {

        setTitle("Student Survey Form");
        setSize(500, 500);
        setLayout(new GridLayout(8,2,10,10));

        title = new Label("STUDENT FEEDBACK SURVEY", Label.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 16));

        nameLabel = new Label("Enter Name:");
        nameField = new TextField();

        branchLabel = new Label("Select Branch:");
        branchChoice = new Choice();
        branchChoice.add("Computer");
        branchChoice.add("IT");
        branchChoice.add("Mechanical");
        branchChoice.add("Civil");

        ratingLabel = new Label("Rate Teaching:");
        ratingChoice = new Choice();
        ratingChoice.add("Excellent");
        ratingChoice.add("Good");
        ratingChoice.add("Average");
        ratingChoice.add("Poor");

        learnLabel = new Label("Learning Mode:");
        learnChoice = new Choice();
        learnChoice.add("Online");
        learnChoice.add("Offline");
        learnChoice.add("Hybrid");

        submit = new Button("Submit");
        show = new Button("Show Responses");

        display = new TextArea();
        display.setEditable(false);

        submit.addActionListener(this);
        show.addActionListener(this);

        add(title); add(new Label(""));

        add(nameLabel); add(nameField);
        add(branchLabel); add(branchChoice);
        add(ratingLabel); add(ratingChoice);
        add(learnLabel); add(learnChoice);

        add(submit); add(show);
        add(display);

        setVisible(true);

        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                dispose();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==submit){

            String name = nameField.getText();

            if(name.isEmpty()){
                display.setText("Please enter your name!");
                return;
            }

            String branch = branchChoice.getSelectedItem();
            String rating = ratingChoice.getSelectedItem();
            String learning = learnChoice.getSelectedItem();

            String result = "Name: " + name +
                    " | Branch: " + branch +
                    " | Rating: " + rating +
                    " | Mode: " + learning;

            responses.add(result);

            nameField.setText("");

            display.setText("✅ Submitted Successfully!");
        }

        if(e.getSource()==show){

            display.setText("");

            if(responses.isEmpty()){
                display.setText("No responses yet!");
                return;
            }

            for(String r : responses){
                display.append(r + "\n");
            }
        }
    }

    public static void main(String args[]){
        new StudentSurveyForm();
    }
}