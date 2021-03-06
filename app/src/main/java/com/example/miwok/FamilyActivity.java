package com.example.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("father","әpә"));
        words.add(new Word("mother","әṭa"));
        words.add(new Word("son","angsi"));
        words.add(new Word("daughter","tune"));
        words.add(new Word("old brother","taachi"));
        words.add(new Word("young brother","chalitti"));
        words.add(new Word("old sister","tete"));
        words.add(new Word("young sister","kolliti"));
        words.add(new Word("grandMother","ama"));
        words.add(new Word("grandFather","paapa"));
        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
