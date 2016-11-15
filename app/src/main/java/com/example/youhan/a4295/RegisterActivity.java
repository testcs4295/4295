package com.example.youhan.a4295;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class RegisterActivity extends AppCompatActivity {
    private EditText txtEmail;
    private EditText txtPassword;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        txtEmail = (EditText) findViewById(R.id.etEmail);
        txtPassword = (EditText) findViewById(R.id.etPassword);
        firebaseAuth = FirebaseAuth.getInstance();
    }

    public void btRegisterUserClick(View v){
        final ProgressDialog progressDialog = ProgressDialog.show(RegisterActivity.this, "Please wait...", "Processing...", true);
        (firebaseAuth.createUserWithEmailAndPassword(txtEmail.getText().toString(),txtPassword.getText().toString())).addOnCompleteListener(new OnCompleteListener<com.google.firebase.auth.AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<com.google.firebase.auth.AuthResult> task) {
                progressDialog.dismiss();

                if(task.isSuccessful()){
                    Toast.makeText(RegisterActivity.this, task.getException().getMessage(), Toast.LENGTH_LONG).show();
                    Intent i = new Intent(RegisterActivity.this, LoginActivity.class);
                    startActivity(i);
                }
                else{
                    Log.e("Error",task.getException().toString());
                    Toast.makeText(RegisterActivity.this, task.getException().getMessage(), Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
