package com.example.recyclerview.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;
import com.example.recyclerview.models.Tortuga;

import java.util.List;

public class TortugaAdapter extends RecyclerView.Adapter<TortugaAdapter.TortugaHolder> {

    List<Tortuga> listasTortuga;

    public TortugaAdapter(List<Tortuga> listasTortuga) {
        this.listasTortuga = listasTortuga;
    }

    @NonNull
    @Override
    public TortugaHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater ly = LayoutInflater.from(parent.getContext());

        View vistatortuga = ly.inflate(R.layout.itemtortuga, parent, false);

        return new TortugaHolder (vistatortuga);
    }

    @Override
    public void onBindViewHolder(@NonNull TortugaHolder holder, int position) {
        holder.setData(listasTortuga.get(position));
    }

    @Override
    public int getItemCount() {
        return listasTortuga.size();
    }

    public class TortugaHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView txtNombre, txtArma, txtDescripcion;
        ImageView imgTortuga;

        Tortuga tortuga;

        public TortugaHolder(@NonNull View itemView) {
            super(itemView);

            txtNombre = itemView.findViewById(R.id.txtNombre);
            txtArma = itemView.findViewById(R.id.txtArma);
            txtDescripcion = itemView.findViewById(R.id.txtDescripcion);
            imgTortuga = itemView.findViewById(R.id.imgTortuga);
        }

        public void setData(Tortuga tortuga) {
            this.tortuga = tortuga;
            txtNombre.setText(tortuga.getNombre());
            txtDescripcion.setText(tortuga.getDescripcion());
            txtArma.setText(tortuga.getArma());
        }

        @Override
        public void onClick(View view) {
//            tortuga
//            Intent = new Intent(this.TortugaActivity.class)
        }
    }
}
