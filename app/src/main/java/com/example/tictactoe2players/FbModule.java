package com.example.tictactoe2players;

import android.content.Context;

import androidx.annotation.NonNull;

import com.google.firebase.Firebase;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class FbModule {
    private Context context;
    private FirebaseDatabase database;
    private DatabaseReference reference;

    public FbModule(Context context) {
        this.context = context;

        database = FirebaseDatabase.getInstance();
        reference = database.getReference("play");

        initFirebaseLitener();

    }

    private void initFirebaseLitener() {
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Position position = snapshot.getValue(Position.class);
                if(position!=null)
                    ((GameActivity)context).SetPositionFromFirebase(position);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

    public void setPositionToFirebase(Position position) {
        reference.setValue(position);
    }
}
