package com.cursoandroid.oliveiragabriel.learningenglish.adapter.animaladapter.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cursoandroid.oliveiragabriel.learningenglish.R;
import com.cursoandroid.oliveiragabriel.learningenglish.adapter.onclickinterface.OnClickInterface;

public class AnimalViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView animalName;
    public ImageView animalPhoto;
    public OnClickInterface onClickInterface;
    public AnimalViewHolder(@NonNull View itemView, OnClickInterface onClickInterface) {
        super(itemView);

        animalName = itemView.findViewById(R.id.txt_name);
        animalPhoto = itemView.findViewById(R.id.img_aninal);
        this.onClickInterface = onClickInterface;
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        onClickInterface.onClick(getAdapterPosition());
    }


}
