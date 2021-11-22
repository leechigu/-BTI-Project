package com.example.catbti;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    FirebaseAuth mAuth;

    GoogleSignInClient mGoogle;
    public static int RC_SIGN_IN = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button mbtiJobButton = findViewById(R.id.mbtiJobButton);

        Button explainMbti = (Button) findViewById(R.id.mbtiButton);
        explainMbti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent explainMbtiIntent = new Intent(MainActivity.this, ExplainMbti.class);
                MainActivity.this.startActivity(explainMbtiIntent);

            }
        });



        Button boardList = (Button) findViewById(R.id.boardButton);
        boardList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent boardListIntent = new Intent(MainActivity.this, PostActivity.class);
                MainActivity.this.startActivity(boardListIntent);

            }
        });

        Button testMbti = (Button) findViewById(R.id.testButton);
        testMbti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent testMbtiIntent = new Intent(MainActivity.this, TestMbti.class);
                MainActivity.this.startActivity(testMbtiIntent);

            }
        });

        mbtiJobButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mbtiJobIntent = new Intent(MainActivity.this, MbtiJobInfo.class);
                MainActivity.this.startActivity(mbtiJobIntent);
            }
        });

        mAuth = FirebaseAuth.getInstance();

        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail()
                .build();

        mGoogle = GoogleSignIn.getClient(MainActivity.this, gso);

        Button logout_btn_google;

        logout_btn_google = (Button) findViewById(R.id.logout_btn_google);

        logout_btn_google.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                mGoogle.signOut();
                mAuth.signOut();
                Intent intent = new Intent(MainActivity.this, SigninActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
            }
        });

    }



}