package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText passwordEditText;
    private TextView messageTextView;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        usernameEditText = findViewById(R.id.username);
        passwordEditText = findViewById(R.id.password);
        messageTextView = findViewById(R.id.message);
        loginButton = findViewById(R.id.loginButton);

        // Set click listener for login button
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleLogin();
            }
        });
    }

    private void handleLogin() {
        // Get user input
        String username = usernameEditText.getText().toString();
        String password = passwordEditText.getText().toString();

        // Basic validation (for demonstration purposes)
        if (username.isEmpty() || password.isEmpty()) {
            messageTextView.setText("Username and Password are required");
        } else {
            // Dummy check: In a real app, you would check this against a database or server
            if (username.equals("akash") && password.equals("akash123")) {
                messageTextView.setText("Login successful");
            } else {
                messageTextView.setText("Invalid username or password");
            }
        }
    }
}
