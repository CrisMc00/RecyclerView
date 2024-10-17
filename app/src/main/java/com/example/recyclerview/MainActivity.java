package com.example.recyclerview;

import android.graphics.Color;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.adapters.TortugaAdapter;
import com.example.recyclerview.models.Tortuga;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclertortuga);

        List<Tortuga> tortugas = new ArrayList<>();

        tortugas.add(new Tortuga("Si", "sakjldasjlkdsa kjasdjklasd jklasd ", "ds", "blue"));
        tortugas.add(new Tortuga("Si", "sakjldasjlkdsa kjasdjklasd jklasd ", "ds", "blue"));
        tortugas.add(new Tortuga("Si", "sakjldasjlkdsa kjasdjklasd jklasd ", "ds", "blue"));
        tortugas.add(new Tortuga("Si", "sakjldasjlkdsa kjasdjklasd jklasd ", "ds", "blue"));

        TortugaAdapter tortugaAdapter = new TortugaAdapter(tortugas);

        recyclerView.setAdapter(tortugaAdapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
    }
}