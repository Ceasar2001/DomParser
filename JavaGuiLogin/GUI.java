package JavaGuiLogin;

import java.awt.*;
import java.awt.event.*;

public class GUI extends Frame {
    TextField name, pass;
    Label message;
    Button loginButton;
    Frame home;

    GUI() {
        setLayout(new FlowLayout());
        this.setLayout(null);
        Label username = new Label("Username:", Label.CENTER);
        Label password = new Label("Password:", Label.CENTER);

        name = new TextField(20);
        pass = new TextField(20);
        pass.setEchoChar('*');
        loginButton = new Button("LOGIN");
        loginButton.setBackground(Color.BLUE);
        setBackground(Color.GREEN);

        this.add(username);
        this.add(name);
        this.add(password);
        this.add(pass);
        this.add(loginButton);

        username.setBounds(70, 90, 90, 60);
        password.setBounds(70, 130, 90, 60);
        name.setBounds(200, 100, 90, 20);
        pass.setBounds(200, 150, 90, 20);
        loginButton.setBounds(200, 240, 70, 40);

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = name.getText();
                String password = pass.getText();

                if (username.equals("c") && password.equals("1")) {

                    // Create the home frame
                    home = new Frame();
                    home.setLayout(new FlowLayout());
                    home.add(new Label("Welcome to Home!"));

                    // Add logout button
                    Button logout = new Button("Logout");
                    logout.setBackground(Color.red);
                    logout.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            // Clear username and password fields
                            name.setText("");
                            pass.setText("");

                            // Show login frame and hide home frame
                            setVisible(true);
                            home.dispose();
                        }
                    });
                    home.add(logout);

                    home.setSize(400, 400);
                    home.setTitle("HOME");
                    home.setLocationRelativeTo(null); // center the frame
                    home.setVisible(true);
                    dispose(); // Hide login frame
                }else {
                        message.setText("Invalid username or password.");
                }
            }
        });

        message = new Label("");
        message.setBounds(100, 200, 200, 20);
        add(message);

        // Add WindowListener to handle closing event
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0); // Exit the application
            }
        });
    }

    public static void main(String args[]) {
        GUI ml = new GUI();
        ml.setVisible(true);
        ml.setSize(400, 400);
        ml.setTitle("Login Page");
        ml.setLocationRelativeTo(null);
    }
}