package com.example.owner.stories;

/**
 * Created by Owner on 3/7/2018.
 */

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.TextView;

public class Activity extends AppCompatActivity {

    private static final String TAG = "1";
    TextView title, content ,author;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        Stories stories = (Stories) getIntent().getSerializableExtra("topic");

        title = findViewById(R.id.title);
        content = findViewById(R.id.content);
        author = findViewById(R.id.author);
        Typeface typeface1
                = Typeface.createFromAsset(
                getAssets(), "SouthernAire_Personal_Use_Only.ttf");
        title.setTypeface(typeface1);
        Typeface typeface2
                = Typeface.createFromAsset(
                getAssets(), "ahsley.ttf");
        content.setTypeface(typeface2);

//        Html.fromHtml(story.title);
        title.setText(stories.title);
        content.setText(stories.content.replaceAll("\\\\n", "\n"));
        author.setText(stories.author);

    }

}