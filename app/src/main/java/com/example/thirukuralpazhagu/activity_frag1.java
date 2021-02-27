package com.example.thirukuralpazhagu;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

public class activity_frag1 extends AppCompatActivity {
    ModelAdapter modelAdapter;
    ViewPager viewPager;
    private  RecyclerView recyclerView;
    ArrayList<Model>  user = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) { // create a bundle instance
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frag1);
        TextView txthead = (TextView) findViewById(R.id.textHead);
        txthead.setText(getIntent().getStringExtra("name"));
        String pos = txthead.getText().toString();
        String [] names = {"இறைமாட்சி","கல்வி","கல்லாமை","கேள்வி","அறிவுடைமை","குற்றங்கடிதல்","பெரியாரைத் துணைக்கோடல்","சிற்றினஞ்சேராமை","தெரிந்துசெயல்வகை","வலியறிதல்","காலமறிதல்","இடனறிதல்","தெரிந்துதெளிதல்","தெரிந்துவினையாடல்","சுற்றந்தழால்","பொச்சாவாமை","செங்கோன்மை","கொடுங்கோன்மை","வெருவந்தசெய்யாமை","கண்ணோட்டம்","ஒற்றாடல்","ஊக்கம் உடைமை","மடி இன்மை","ஆள்வினை உடைமை","இடுக்கண் அழியாமை","அமைச்சு","சொல்வன்மை","வினைத் தூய்மை","வினைத்திட்பம் வினை செயல்வகை","தூது","மன்னரைச் சேர்ந்து ஒழுகல்","குறிப்பறிதல்","அவை அறிதல்","அவை அஞ்சாமை","நாடு","அரண்","பொருள் செயல்வகை","படை மாட்சி","படைச் செருக்கு","நட்பு","நட்பாராய்தல்","பழைமை","தீ நட்பு","கூடா நட்பு","பேதைமை","புல்லறிவாண்மை","இகல்","பகை மாட்சி","பகைத்திறம் தெரிதல்","உட்பகை”, “பெரியாரைப் பிழையாமை","பெண்வழிச் சேறல்","வரைவின் மகளிர்","கள்ளுண்ணாமை","சூது","மருந்து","குடிமை","மானம்","பெருமை","சான்றாண்மை","பண்புடைமை","நன்றியில் செல்வம்","நாணுடைமை","குடிசெயல் வகை","உழவு","நல்குரவு","இரவு","இரவச்சம்","கயமை”"};
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

    }

}
