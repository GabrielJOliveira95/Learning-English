package com.cursoandroid.oliveiragabriel.learningenglish.fragments;


import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;

import com.cursoandroid.oliveiragabriel.learningenglish.R;
import com.cursoandroid.oliveiragabriel.learningenglish.adapter.onclickinterface.OnClickInterface;
import com.cursoandroid.oliveiragabriel.learningenglish.adapter.phrasesadapter.PhrasesAdapter;
import com.cursoandroid.oliveiragabriel.learningenglish.model.Pharases;

import java.util.ArrayList;
import java.util.List;

import static androidx.core.content.ContextCompat.getSystemService;

/**
 * A simple {@link Fragment} subclass.
 */
public class PhrasesFragment extends Fragment implements OnClickInterface {

    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private PhrasesAdapter phrasesAdapter;
    private List<Pharases> list = new ArrayList<>();
    private MediaPlayer mediaPlayer;
    private AudioManager audioManager;

    public PhrasesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_phrases, container, false);
        recyclerView = view.findViewById(R.id.recyclerViewPhrases);

        //MediaPlayer
        mediaPlayer = MediaPlayer.create(getActivity(), R.raw.dog);

        //Recyclerview
        phrasesAdapter = new PhrasesAdapter(addPhrasesList(), this);
        recyclerView.setAdapter(phrasesAdapter);
        linearLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);

        return view;
    }


    public List<Pharases> addPhrasesList(){
        list.add(new Pharases("What's your name?", "(uót ês iór nêim?)", "Qual o seu nome", R.raw.whatsyourname));
        list.add(new Pharases("My name is...", "(mái nêim ês)","Meu nome é...", R.raw.mynameis));
        list.add(new Pharases("How are you?", "(ráu áR iú?)", "Como você está?", R.raw.howareyou));
        list.add(new Pharases("I’m fine!", "(áim fáin)","Eu estou bem", R.raw.imfine));
        list.add(new Pharases("Nice to meet you!", "(náis tchú mít iú)","Prazer em conhece-lo!", R.raw.nicetomeetyou));
        list.add(new Pharases("Nice to meet you too!", "(náis tchú mít iú)","Prazer em conhecer você também!", R.raw.nicetomeetyoutoo));
        list.add(new Pharases("My phone number is...","(mái fôun nâmber ês)", "Meu número de telefone é...", R.raw.myphonenumberis));
        list.add(new Pharases("Where are you from?","(uér ár iú fróm)", "De onde você é?", R.raw.whereareyoufrom));
        list.add(new Pharases("I'm from Brazil!","(áim fróm Brasil)", "Eu sou do Brasil!", R.raw.imfrombrazil));
        list.add(new Pharases("Welcome to Brazil!","(uélcâm tchú brasil)", "Bem vindo ao Brasil!", R.raw.welcometobrazil));
        list.add(new Pharases("Have a good time!","(rév â gúd táim)", "Divirta-se!", R.raw.haveagoodtime));
        list.add(new Pharases("Where do you live?","(uér dú iú lêv)", "Onde você vive/mora?", R.raw.wheredoyoulive));
        list.add(new Pharases("I don't know!","(ái dónt nôu)", "Eu não sei!", R.raw.idontknow));
        list.add(new Pharases("Anything else?","(éniTHên éls)", "Mais alguma coisa?", R.raw.anythingelse));
        list.add(new Pharases("How long!","Ráu lóng", "(ráu lóng)", R.raw.howlong));
        list.add(new Pharases("How long will you stay?","(ráu lóng uêl iú stêi)", "Quanto tempo você irá ficar?", R.raw.howlongwillyoustay));
        list.add(new Pharases("How much","(ráu mâtch)", "Quanto(singular)", R.raw.howmuch));
        list.add(new Pharases("How much is it?","(ráu mâtch ês êt)", "Quanto é/custa?", R.raw.howmuchisit));
        list.add(new Pharases("How many?","(ráu méni)", "Quantos/Quantas(pluaral)", R.raw.howmany));
        list.add(new Pharases("Would you like some coffee?","(uúd iú láik sâm cófi)", "Aceitaria um pouco de café?", R.raw.wouldyoulikesomecoffee));
        list.add(new Pharases("I'd like some water!","(áid láik sâm uórar)", "Eu gostaria de um pouco de água!", R.raw.idlikesomewater));
        list.add(new Pharases("Please, speak more slowly!","(plíz spík mór slôuli)", "Por favor, fale mais devagar!", R.raw.pleasespeakmoreslowly));
        list.add(new Pharases("Could you repeat","(cúd iú ripít  plíz)", "Poderia repetir?", R.raw.couldyourepeatplease));
        list.add(new Pharases("This way, please!","(THês uêi plíz)", "Por aqui, por favor!", R.raw.thiswayplease));
        list.add(new Pharases("I beg your pardon!","(ái bég iór párdon)", "Eu peço seu perdão (quando não entender o que alguém diz)", R.raw.ibegyourpardon));
        list.add(new Pharases("How do you say ___ in English?","(ráu dú iú sêi __ ín ínglísh)", "Como se diz EXEMPLO em inglês?", R.raw.howdoyousayexemploinenglish));
        list.add(new Pharases("How can I get to a restaurant?","(ráu kén ái guét tchú â RéstoRant)", "Como eu chego a um restaurante?", R.raw.howcanigettoarestaurant));
        list.add(new Pharases("What does it mean?","(uát dâs ít mín?)", "O que significa?", R.raw.whatdoesitmean));
        list.add(new Pharases("Help! Somebody help me!","(rélp / sâmbári rélp mí)", "Socorro! Alguém me ajude!", R.raw.helpmesomebodyhelpeme));
        list.add(new Pharases("Could you help me, please?","(cúd iú rélp mí plíz)", "Poderia me ajudar, por favor?", R.raw.couldyouhelpmeplease));
        list.add(new Pharases("Are you sure?","(ár iú châr)", "Você tem certeza?", R.raw.areyousure));
        list.add(new Pharases("Excuse me","(ékskiúz mí)", "Com licença/Me desculpe(caso não entenda o que alguém disse)", R.raw.excuseme));
        list.add(new Pharases("Where is","(uér ís)", "Onde é/ Onde fica/ Onde está", R.raw.whereis));
        list.add(new Pharases("Where are","(uér ár)", "Onde estão", R.raw.whereare));
        list.add(new Pharases("Can I help you?","(kén ái rélp iú?)", "Posso ajudar?", R.raw.canihelpyou));
        list.add(new Pharases("Wait a moment, please","(uêit â móment, plíz)", "Espere um momento, por favor", R.raw.waitamomentplease));
        list.add(new Pharases("Come in, please!","(câmín plíz)", "Entre, por favor", R.raw.comeinplease));
        list.add(new Pharases("Make yourself at home!","(mêik iórsélf ét rôum)", "Sinta-se em casa/fique a vontade", R.raw.makeyourselfathome));
        list.add(new Pharases("Once more / One more time","(uóns mór / uón mór táim)", "Mais uma vez", R.raw.onemore));
        list.add(new Pharases(" Are you ready?","(ár iú Rédi?)", "Você está pronto?", R.raw.areyouready));
        list.add(new Pharases("Do you agree?","(dú iú agrí?)", "Você concorda?", R.raw.doyouagree));
        list.add(new Pharases("Come in and sit down","(câmin énd sêt dáun)", "Entre e sente?", R.raw.comeinandsitdown));
        list.add(new Pharases("What do you think?","(uát dú iú THínk)", "O que você acha?", R.raw.whatdoyouthink));
        list.add(new Pharases("What time is it?","(uót táim ês êt?)", "Que horas são?", R.raw.whattimeisit));
        list.add(new Pharases("Wait a minute","(uêit â ménât)", "Espere um minuto", R.raw.waitaminute));
        list.add(new Pharases("Wait for me","(uêit fór mí)", "Espere por mim", R.raw.waitforme));
        list.add(new Pharases("Join me/ us","(djóin mí / âs)", "Junte-se a mim/nós?", R.raw.joinme));
        list.add(new Pharases("It’s enough!","(êts ináf)", "É suficiente! / Chega! / Basta!", R.raw.itsenough));
        list.add(new Pharases("What do you do?","(uót dú iú dú?)", "O que você faz?", R.raw.whatdoyoudo));
        list.add(new Pharases("What do you prefer?","(uát dú iú prifâr)", "O que você prefere?", R.raw.whatdoyouprefer));
        list.add(new Pharases("Don’t worry","(dónt uôRi)", "Não se preocupe", R.raw.dontworry));

        return list;
    }

    @RequiresApi(api = Build.VERSION_CODES.P)
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


    @RequiresApi(api = Build.VERSION_CODES.P)
    @Override
    public void onClick(int position) {
        int song = list.get(position).getAudio();
        playSong(song);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mediaPlayer.release();
    }
}
