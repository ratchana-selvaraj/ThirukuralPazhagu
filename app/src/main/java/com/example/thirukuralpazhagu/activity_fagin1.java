package com.example.thirukuralpazhagu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class activity_fagin1 extends AppCompatActivity  {
    ModelAdapter modelAdapter;
    ViewPager viewPager;
    RecyclerView recyclerView;
    ArrayList<Model> user = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragi1);
        setContentView(R.layout.activity_fragp1);
        TextView txthead = (TextView) findViewById(R.id.textHead);
        txthead.setText(getIntent().getStringExtra("name"));
        String pos = txthead.getText().toString();
        String [] names = {"தகை அணங்குறுத்தல்","குறிப்பறிதல்","புணர்ச்சி மகிழ்தல்","நலம் புனைந்து உரைத்தல்","காதற் சிறப்புரைத்தல்","நாணுத் துறவுரைத்தல்","அலர் அறிவுறுத்தல்","பிரிவு ஆற்றாமை","படர்மெலிந் திரங்கல்","கண் விதுப்பழிதல்","பசப்புறு பருவரல்","தனிப்படர் மிகுதி","நினைந்தவர் புலம்பல்","கனவுநிலை உரைத்தல்","பொழுதுகண்டு","இரங்கல்","உறுப்புநலன் அழிதல்","நெஞ்சொடு கிளத்தல்","நிறையழிதல்","அவர்வயின் விதும்பல்","குறிப்பறிவுறுத்தல்","புணர்ச்சி விதும்பல்","நெஞ்சொடு புலத்தல்","புலவி","புலவி நுணுக்கம்","ஊடலுவகை"};
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
        } else if (pos.equals(names[1])) {
            user.add(new Model(R.drawable.ic_speaker, R.drawable.ic_microphone, "KURAL 2", "PORUL", "TEST", "படைகுடி கூழ்அமைச்சு நட்பரண் ஆறும் \n உடையான் அரசருள் ஏறு.", "DESC"));
            user.add(new Model(R.drawable.ic_speaker, R.drawable.ic_microphone, "KURAL 2", "PORUL", "TEST", "படைகுடி கூழ்அமைச்சு நட்பரண் ஆறும் \n உடையான் அரசருள் ஏறு.", "DESC"));
            user.add(new Model(R.drawable.ic_speaker, R.drawable.ic_microphone, "KURAL 2", "PORUL", "TEST", "படைகுடி கூழ்அமைச்சு நட்பரண் ஆறும் \n உடையான் அரசருள் ஏறு.", "DESC"));
            user.add(new Model(R.drawable.ic_speaker, R.drawable.ic_microphone, "KURAL 2", "PORUL", "TEST", "படைகுடி கூழ்அமைச்சு நட்பரண் ஆறும் \n உடையான் அரசருள் ஏறு.", "DESC"));
            user.add(new Model(R.drawable.ic_speaker, R.drawable.ic_microphone, "KURAL 2", "PORUL", "TEST", "படைகுடி கூழ்அமைச்சு நட்பரண் ஆறும் \n உடையான் அரசருள் ஏறு.", "DESC"));
            user.add(new Model(R.drawable.ic_speaker, R.drawable.ic_microphone, "KURAL 2", "PORUL", "TEST", "படைகுடி கூழ்அமைச்சு நட்பரண் ஆறும் \n உடையான் அரசருள் ஏறு.", "DESC"));
        } else {
            user.add(new Model(R.drawable.ic_speaker, R.drawable.ic_microphone, "KURAL 3", "PORUL", "TEST", "படைகுடி கூழ்அமைச்சு நட்பரண் ஆறும் \n உடையான் அரசருள் ஏறு.", "DESC"));
            user.add(new Model(R.drawable.ic_speaker, R.drawable.ic_microphone, "KURAL 3", "PORUL", "TEST", "படைகுடி கூழ்அமைச்சு நட்பரண் ஆறும் \n உடையான் அரசருள் ஏறு.", "DESC"));
            user.add(new Model(R.drawable.ic_speaker, R.drawable.ic_microphone, "KURAL 3", "PORUL", "TEST", "படைகுடி கூழ்அமைச்சு நட்பரண் ஆறும் \n உடையான் அரசருள் ஏறு.", "DESC"));
            user.add(new Model(R.drawable.ic_speaker, R.drawable.ic_microphone, "KURAL 4", "PORUL", "TEST", "படைகுடி கூழ்அமைச்சு நட்பரண் ஆறும் \n உடையான் அரசருள் ஏறு.", "DESC"));
            user.add(new Model(R.drawable.ic_speaker, R.drawable.ic_microphone, "KURAL 4", "PORUL", "TEST", "படைகுடி கூழ்அமைச்சு நட்பரண் ஆறும் \n உடையான் அரசருள் ஏறு.", "DESC"));
            user.add(new Model(R.drawable.ic_speaker, R.drawable.ic_microphone, "KURAL 2", "PORUL", "TEST", "படைகுடி கூழ்அமைச்சு நட்பரண் ஆறும் \n உடையான் அரசருள் ஏறு.", "DESC"));

        }
        modelAdapter = new ModelAdapter(getApplicationContext(), user);
        viewPager = findViewById(R.id.viewpagers);
        viewPager.setAdapter(modelAdapter);

    }
}