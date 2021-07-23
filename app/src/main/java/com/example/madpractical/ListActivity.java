package com.example.madpractical;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class ListActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ImageView imgView = findViewById(R.id.listImg);
        imgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(ListActivity.this)
                        .setTitle("Profile")
                        .setMessage("MADness")
                        .setNegativeButton("CLOSE", null)
                        .setPositiveButton("VIEW", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                int random = new Random().nextInt(Integer.MAX_VALUE);
                                Intent i = new Intent(ListActivity.this, MainActivity.class);
                                i.putExtra("randomInt", random);
                                startActivity(i);
                            }
                        })
                        .setIcon(android.R.drawable.ic_dialog_alert)
                        .show();
            }
        });
    }
}
