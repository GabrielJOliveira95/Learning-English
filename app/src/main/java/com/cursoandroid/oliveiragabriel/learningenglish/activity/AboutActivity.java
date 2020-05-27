package com.cursoandroid.oliveiragabriel.learningenglish.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.cursoandroid.oliveiragabriel.learningenglish.R;

import java.net.URI;
import java.security.Permission;
import java.security.Permissions;

public class AboutActivity extends AppCompatActivity {

    private TextView txt_email;
    private TextView txt_git;
    private TextView txt_linkedln;
    private TextView txt_whatsapp;
    private ImageView logo_email;
    private ImageView logo_git;
    private ImageView logo_linkedln;
    private ImageView logo_whatsapp;
    private String[] permissões = {Manifest.permission.CALL_PHONE};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        txt_email = findViewById(R.id.txt_email);
        txt_git = findViewById(R.id.txt_git);
        txt_linkedln = findViewById(R.id.txt_linkedln);
        txt_whatsapp = findViewById(R.id.txt_whatsapp);
        logo_email = findViewById(R.id.logo_email);
        logo_git = findViewById(R.id.logo_git);
        logo_linkedln = findViewById(R.id.logo_linkedln);
        logo_whatsapp = findViewById(R.id.logo_whatsapp);

        getSupportActionBar().setTitle("About");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Send email
        txt_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendEmail();

            }
        });
        logo_email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendEmail();
            }
        });

        //Go to GitHub profile
        txt_git.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gitHub();

            }
        });
        logo_git.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gitHub();
            }
        });

        //Go to Linkedln profile
        txt_linkedln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linkedln();
            }
        });
        logo_linkedln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linkedln();
            }
        });

        //See phone number
        txt_whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                whatsApp();
            }
        });
        logo_whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                whatsApp();
            }
        });
    }


    public void sendEmail() {

        String[] email = {"gabrieljoliveira95@gmail.com"};
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, email);
        intent.putExtra(Intent.EXTRA_SUBJECT, "Desenvolvimento Android");
        intent.setType("message/rfc822");
        startActivity(Intent.createChooser(intent, "Send"));
    }

    public void gitHub() {
        String urlGitHub = "https://github.com/GabrielJOliveira95";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(urlGitHub));
        startActivity(intent);
    }

    public void linkedln() {
        String urlLinkedln = "https://www.linkedin.com/in/gabriel-jesus-de-oliveira-b2b779177";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(urlLinkedln));
        startActivity(intent);
    }

    public void whatsApp(){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://api.whatsapp.com/send?phone=5511959036882&text=Olá, Gabriel!"));
        startActivity(intent);
    }

}
