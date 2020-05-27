package com.cursoandroid.oliveiragabriel.learningenglish.adapter.phrasesadapter;

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
import com.cursoandroid.oliveiragabriel.learningenglish.model.Pharases;

import java.util.List;

public class PhrasesAdapter extends RecyclerView.Adapter<PhrasesViewHolder> {

    private List<Pharases> list;
    private OnClickInterface onClickInterface;

    public PhrasesAdapter(List<Pharases> list, OnClickInterface onClickInterface) {
        this.list = list;
        this.onClickInterface = onClickInterface;

    }

    @NonNull
    @Override
    public PhrasesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.pharaseslayout, parent, false);
        return new PhrasesViewHolder(view, onClickInterface);
    }

    @Override
    public void onBindViewHolder(@NonNull PhrasesViewHolder holder, int position) {
        Pharases pharases = list.get(position);
        holder.txt_ing.setText(pharases.getTxt_ing());
        holder.txt_pt.setText(pharases.getTxt_pt());
        holder.txt_pronunciation.setText(pharases.getTxt_pronunciation());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
