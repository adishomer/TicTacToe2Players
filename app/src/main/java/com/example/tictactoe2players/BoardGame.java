package com.example.tictactoe2players;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

import androidx.annotation.NonNull;

public class BoardGame extends View {
    public BoardGame(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawCircle(500, 500, 200, new Paint());
    }
}

