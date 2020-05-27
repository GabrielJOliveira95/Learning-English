package com.cursoandroid.oliveiragabriel.learningenglish.fragments;


import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;

import com.cursoandroid.oliveiragabriel.learningenglish.R;
import com.cursoandroid.oliveiragabriel.learningenglish.adapter.onclickinterface.OnClickInterface;

import com.cursoandroid.oliveiragabriel.learningenglish.adapter.animaladapter.viewholder.AnimalAdapter;
import com.cursoandroid.oliveiragabriel.learningenglish.model.Animal;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class AnimalsFragment extends Fragment implements OnClickInterface {

    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private AnimalAdapter animalAdapter;
    private List<Animal> list = new ArrayList<>();
    private MediaPlayer mediaPlayer;
    private AudioManager audioManager;

    public AnimalsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_animals, container, false);
        recyclerView = view.findViewById(R.id.recyclerView);

        //Mediaplayer
        mediaPlayer = MediaPlayer.create(getActivity(), R.raw.dog);



        //Recyclerview
        animalAdapter = new AnimalAdapter(addAnimalList(), this);
        recyclerView.setAdapter(animalAdapter);
        linearLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.hasFixedSize();
        return view;
    }

    public List<Animal> addAnimalList() {

        list.add(new Animal("DOG", R.drawable.cao, R.raw.dog));
        list.add(new Animal("CAT", R.drawable.cat, R.raw.cat));
        list.add(new Animal("BIRD", R.drawable.bird, R.raw.bird));
        list.add(new Animal("MONKEY", R.drawable.monkey, R.raw.monkey));
        list.add(new Animal("LION", R.drawable.lion, R.raw.lion));
        list.add(new Animal("COW", R.drawable.cow, R.raw.cow));
        list.add(new Animal("DUCK", R.drawable.duck, R.raw.duck));
        list.add(new Animal("SHEEP", R.drawable.sheep, R.raw.sheep));
        list.add(new Animal("ELEPHANT", R.drawable.elephant, R.raw.elephant));
        list.add(new Animal("HORSE", R.drawable.horse, R.raw.horse));
        list.add(new Animal("TIGER", R.drawable.tiger, R.raw.tiger));
        list.add(new Animal("WOLF", R.drawable.wolf, R.raw.wolf));
        list.add(new Animal("COW", R.drawable.cow, R.raw.cow));
        return list;
    }

    public void playSong(int id){
        audioManager = (AudioManager) getActivity().getSystemService(Context.AUDIO_SERVICE);
        int volume = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);
        if (volume <= 2){
            Toast.makeText(getActivity(), "Turn up the volume", Toast.LENGTH_SHORT).show();
        }
        mediaPlayer = MediaPlayer.create(getActivity(), id);
        mediaPlayer.start();
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mediaPlayer.release();
            }
        });

    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        mediaPlayer.release();
    }
    @Override
    public void onClick(int position) {
        int song = list.get(position).getSong();
        playSong(song);

    }
}

