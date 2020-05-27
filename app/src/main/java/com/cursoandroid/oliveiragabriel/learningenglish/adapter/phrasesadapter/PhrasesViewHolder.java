package com.cursoandroid.oliveiragabriel.learningenglish.adapter.phrasesadapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cursoandroid.oliveiragabriel.learningenglish.R;
import com.cursoandroid.oliveiragabriel.learningenglish.adapter.onclickinterface.OnClickInterface;

class PhrasesViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public TextView txt_ing;
    public TextView txt_pt;
    public TextView txt_pronunciation;
    public OnClickInterface onClickInterface;

    public PhrasesViewHolder(@NonNull View itemView, OnClickInterface onClickInterface) {
        super(itemView);
        txt_ing = itemView.findViewById(R.id.txt_ing);
        txt_pt = itemView.findViewById(R.id.txt_pt);
        txt_pronunciation = itemView.findViewById(R.id.txt_pronunciation);
        this.onClickInterface = onClickInterface;
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        onClickInterface.onClick(getAdapterPosition());
    }
}
