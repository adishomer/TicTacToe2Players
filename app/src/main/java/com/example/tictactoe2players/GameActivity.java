package com.example.tictactoe2players;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity {

    private FbModule fbModule;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        fbModule = new FbModule(this);

        BoardGame boardGame = new BoardGame(this);
        setContentView(boardGame);
    }

    public void SetPositionToFireBase(int line, int col) {
        fbModule.setPositionToFirebase(new Position());
    }

    public void SetPositionFromFirebase(Position position) {
        Toast.makeText(this, ""+ position.getCol(), Toast.LENGTH_SHORT).show();
    }
}