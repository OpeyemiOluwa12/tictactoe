package com.example.git.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class FirstPage extends AppCompatActivity {
RadioButton playerType;
RadioButton boardType;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
    }

    public void nextPage(View view){
        RadioGroup player =  findViewById(R.id.player_Group);
        RadioGroup board =  findViewById(R.id.board_Group);

        int selectedPlayer =  player.getCheckedRadioButtonId();
        int selectedBoard =  board.getCheckedRadioButtonId();
        playerType = findViewById(selectedPlayer);
        boardType = findViewById(selectedBoard);

        if (boardType.getText().equals("3 by 3")) {

            Intent intent = new Intent(this, MainActivity.class);
            intent.putExtra("player", playerType.getText().toString());
            this.startActivity(intent);
        }else{
            Intent intent = new Intent(this, Main2Activity.class);
            intent.putExtra("player", playerType.getText().toString());
            this.startActivity(intent);
        }

    }
}
