package com.example.thirukuralpazhagu;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class activity_fragp1 extends AppCompatActivity  {
    ViewPager viewPager;
    ModelAdapter modelAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragp1);
        TextView txthead = (TextView)findViewById(R.id.textHead);
        txthead.setText(getIntent().getStringExtra("name"));
        String pos=txthead.getText().toString();
        ArrayList<Model> user = new ArrayList<>();
        String [] names = {"kkkk","வான்சிறப்பு","நீத்தார் பெருமை","அறன் வலியுறுத்தல்","இல்வாழ்க்கை","வாழ்க்கைத் துணைநலம்","மக்கட்பேறு / புதல்வரைப் பெறுதல்","அன்புடைமை","விருந்தோம்பல்","இனியவைகூறல்","செய்ந்நன்றி அறிதல்","நடுவு நிலைமை","அடக்கமுடைமை","ஒழுக்கமுடைமை","பிறனில் விழையாமை","பொறையுடைமை","அழுக்காறாமை","வெஃகாமை","புறங்கூறாமை","பயனில சொல்லாமை","தீவினையச்சம்","ஒப்புரவறிதல்","ஈகை","புகழ்","அருளுடைமை","புலான்மறுத்தல்","தவம்","கூடாவொழுக்கம்","கள்ளாமை","வாய்மை","வெகுளாமை","இன்னாசெய்யாமை","கொல்லாமை","நிலையாமை","துறவு","மெய்யுணர்தல்","அவாவறுத்தல்","ஊழ்"};
        if (pos.equals(names[0])) {
            user.add(new Model(R.drawable.ic_speaker, R.drawable.ic_microphone, "KURAL N", "PORUL", "TEST", "படைகுடி கூழ்அமைச்சு நட்பரண் ஆறும் \n உடையான் அரசருள் ஏறு.", "DESC"));
            user.add(new Model(R.drawable.ic_speaker, R.drawable.ic_microphone, "KURAL N", "PORUL", "TEST", "படைகுடி கூழ்அமைச்சு நட்பரண் ஆறும் \n உடையான் அரசருள் ஏறு.", "DESC"));
            user.add(new Model(R.drawable.ic_speaker, R.drawable.ic_microphone, "KURAL N", "PORUL", "TEST", "படைகுடி கூழ்அமைச்சு நட்பரண் ஆறும் \n உடையான் அரசருள் ஏறு.", "DESC"));
            user.add(new Model(R.drawable.ic_speaker, R.drawable.ic_microphone, "KURAL N", "PORUL", "TEST", "படைகுடி கூழ்அமைச்சு நட்பரண் ஆறும் \n உடையான் அரசருள் ஏறு.", "DESC"));
            user.add(new Model(R.drawable.ic_speaker, R.drawable.ic_microphone, "KURAL N", "PORUL", "TEST", "படைகுடி கூழ்அமைச்சு நட்பரண் ஆறும் \n உடையான் அரசருள் ஏறு.", "DESC"));
            user.add(new Model(R.drawable.ic_speaker, R.drawable.ic_microphone, "KURAL N", "PORUL", "TEST", "படைகுடி கூழ்அமைச்சு நட்பரண் ஆறும் \n உடையான் அரசருள் ஏறு.", "DESC"));
            user.add(new Model(R.drawable.ic_speaker, R.drawable.ic_microphone, "KURAL N", "PORUL", "TEST", "படைகுடி கூழ்அமைச்சு நட்பரண் ஆறும் \n உடையான் அரசருள் ஏறு.", "DESC"));
            user.add(new Model(R.drawable.ic_speaker, R.drawable.ic_microphone, "KURAL N", "PORUL", "TEST", "படைகுடி கூழ்அமைச்சு நட்பரண் ஆறும் \n உடையான் அரசருள் ஏறு.", "DESC"));
            user.add(new Model(R.drawable.ic_speaker, R.drawable.ic_microphone, "KURAL N", "PORUL", "TEST", "படைகுடி கூழ்அமைச்சு நட்பரண் ஆறும் \n உடையான் அரசருள் ஏறு.", "DESC"));
            user.add(new Model(R.drawable.ic_speaker, R.drawable.ic_microphone, "KURAL N", "PORUL", "TEST", "படைகுடி கூழ்அமைச்சு நட்பரண் ஆறும் \n உடையான் அரசருள் ஏறு.", "DESC"));
        }
        else if (pos.equals(names[1])) {
            user.add(new Model(R.drawable.ic_speaker, R.drawable.ic_microphone, "KURAL 2", "PORUL", "TEST", "படைகுடி கூழ்அமைச்சு நட்பரண் ஆறும் \n உடையான் அரசருள் ஏறு.", "DESC"));
            user.add(new Model(R.drawable.ic_speaker, R.drawable.ic_microphone, "KURAL 2", "PORUL", "TEST", "படைகுடி கூழ்அமைச்சு நட்பரண் ஆறும் \n உடையான் அரசருள் ஏறு.", "DESC"));
            user.add(new Model(R.drawable.ic_speaker, R.drawable.ic_microphone, "KURAL 2", "PORUL", "TEST", "படைகுடி கூழ்அமைச்சு நட்பரண் ஆறும் \n உடையான் அரசருள் ஏறு.", "DESC"));
            user.add(new Model(R.drawable.ic_speaker, R.drawable.ic_microphone, "KURAL 2", "PORUL", "TEST", "படைகுடி கூழ்அமைச்சு நட்பரண் ஆறும் \n உடையான் அரசருள் ஏறு.", "DESC"));
            user.add(new Model(R.drawable.ic_speaker, R.drawable.ic_microphone, "KURAL 2", "PORUL", "TEST", "படைகுடி கூழ்அமைச்சு நட்பரண் ஆறும் \n உடையான் அரசருள் ஏறு.", "DESC"));
            user.add(new Model(R.drawable.ic_speaker, R.drawable.ic_microphone, "KURAL 2", "PORUL", "TEST", "படைகுடி கூழ்அமைச்சு நட்பரண் ஆறும் \n உடையான் அரசருள் ஏறு.", "DESC"));
        }
        else {
            user.add(new Model(R.drawable.ic_speaker, R.drawable.ic_microphone, "KURAL 3", "PORUL", "TEST", "படைகுடி கூழ்அமைச்சு நட்பரண் ஆறும் \n உடையான் அரசருள் ஏறு.", "DESC"));
            user.add(new Model(R.drawable.ic_speaker, R.drawable.ic_microphone, "KURAL 3", "PORUL", "TEST", "படைகுடி கூழ்அமைச்சு நட்பரண் ஆறும் \n உடையான் அரசருள் ஏறு.", "DESC"));
            user.add(new Model(R.drawable.ic_speaker, R.drawable.ic_microphone, "KURAL 3", "PORUL", "TEST", "படைகுடி கூழ்அமைச்சு நட்பரண் ஆறும் \n உடையான் அரசருள் ஏறு.", "DESC"));
            user.add(new Model(R.drawable.ic_speaker, R.drawable.ic_microphone, "KURAL 4", "PORUL", "TEST", "படைகுடி கூழ்அமைச்சு நட்பரண் ஆறும் \n உடையான் அரசருள் ஏறு.", "DESC"));
            user.add(new Model(R.drawable.ic_speaker, R.drawable.ic_microphone, "KURAL 4", "PORUL", "TEST", "படைகுடி கூழ்அமைச்சு நட்பரண் ஆறும் \n உடையான் அரசருள் ஏறு.", "DESC"));
            user.add(new Model(R.drawable.ic_speaker, R.drawable.ic_microphone, "KURAL 2", "PORUL", "TEST", "படைகுடி கூழ்அமைச்சு நட்பரண் ஆறும் \n உடையான் அரசருள் ஏறு.", "DESC"));

        }modelAdapter= new ModelAdapter(getApplicationContext(),user);
        viewPager = findViewById(R.id.viewpagers);
        viewPager.setAdapter(modelAdapter);
        //viewPager.setPadding(100,0,100,0);
    }
}