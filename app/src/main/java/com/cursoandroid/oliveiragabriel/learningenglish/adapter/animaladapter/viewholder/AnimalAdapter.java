package com.cursoandroid.oliveiragabriel.learningenglish.adapter.animaladapter.viewholder;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.cursoandroid.oliveiragabriel.learningenglish.R;
import com.cursoandroid.oliveiragabriel.learningenglish.adapter.onclickinterface.OnClickInterface;
import com.cursoandroid.oliveiragabriel.learningenglish.model.Animal;

import java.util.List;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalViewHolder> {

    private List<Animal> list;
    private OnClickInterface onClickInterface;

    public AnimalAdapter(List<Animal> list, OnClickInterface onClickInterface) {
        this.list = list;
        this.onClickInterface = onClickInterface;
    }

    @NonNull
    @Override
    public AnimalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.animalslayout, parent, false);

        return new AnimalViewHolder(view, onClickInterface);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalViewHolder holder, int position) {
        Animal animalViewHolder = list.get(position);
        holder.animalName.setText(animalViewHolder.getName());
        holder.animalPhoto.setImageResource(animalViewHolder.getImage());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
