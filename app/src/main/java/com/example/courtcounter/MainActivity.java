package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Here we are initializing team A score and team B score which is 0 ;
    int teamascorea =0,teamascoreb = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void threea(View view){
        teamascorea = teamascorea +3 ;
            display("" +teamascorea);
        }
    public void twoa(View view){
        teamascorea = teamascorea +2;
        display("" + teamascorea);
    }
    public void onea(View view){
        teamascorea = teamascorea +1 ;
        display("" + teamascorea);
    }

    private void display(String message){
        TextView text =  findViewById(R.id.teama_score);
        text.setText(message);
    }

    public void reset(View view){
        teamascorea =0;
        teamascoreb = 0;
        display("" +teamascorea);
        displayB(teamascoreb);
    }

    public void threeb(View view){
        teamascoreb = teamascoreb +3 ;
        displayB(teamascoreb);
    }
    public void twob(View view){
        teamascoreb = teamascoreb +2;
        displayB(teamascoreb);
    }
    public void oneb(View view){
        teamascoreb = teamascoreb +1 ;
        displayB(teamascoreb);
    }
    private void displayB(int score){
        TextView text =  findViewById(R.id.teamb_score);
        text.setText(String.valueOf(score));
    }
    public void matchFinished(View view){
        if(teamascorea>0 || teamascoreb>0) {
            if (teamascorea > teamascoreb) {
                teamascorea = 0;
                teamascoreb = 0 ;
                display("" + teamascorea);
                displayB(teamascoreb);
                Toast.makeText(this, "Team A won The Match", Toast.LENGTH_SHORT).show();
            } else if (teamascoreb > teamascorea) {
                teamascorea = 0;
                teamascoreb = 0 ;
                display("" + teamascorea);
                displayB(teamascoreb);
                Toast.makeText(this, "Team B won The Match", Toast.LENGTH_SHORT).show();
            } else {
                teamascorea = 0;
                teamascoreb = 0 ;
                display("" + teamascorea);
                displayB(teamascoreb);
                Toast.makeText(this, "It is a Tie Between Team A and Team B", Toast.LENGTH_SHORT).show();
            }
        }else{
            Toast.makeText(this, "Match is Not Started Yet", Toast.LENGTH_SHORT).show();
        }
    }
}