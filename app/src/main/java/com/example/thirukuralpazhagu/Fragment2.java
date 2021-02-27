package com.example.thirukuralpazhagu;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class Fragment2 extends Fragment {
    RecyclerView recyclerView;
    UserAdapter2 userAdapter;
    public Fragment2() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_2, container, false);
        recyclerView =(RecyclerView)view.findViewById(R.id.rvv);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        //recyclerView.addItemDecoration(new DividerItemDecoration(getActivity());
        return view;
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        List<RecycleAdapter> usermoderlist = new ArrayList<>();
        String [] names = {"இறைமாட்சி","கல்வி","கல்லாமை","கேள்வி","அறிவுடைமை","குற்றங்கடிதல்","பெரியாரைத் துணைக்கோடல்","சிற்றினஞ்சேராமை","தெரிந்துசெயல்வகை","வலியறிதல்","காலமறிதல்","இடனறிதல்","தெரிந்துதெளிதல்","தெரிந்துவினையாடல்","சுற்றந்தழால்","பொச்சாவாமை","செங்கோன்மை","கொடுங்கோன்மை","வெருவந்தசெய்யாமை","கண்ணோட்டம்","ஒற்றாடல்","ஊக்கம் உடைமை","மடி இன்மை","ஆள்வினை உடைமை","இடுக்கண் அழியாமை","அமைச்சு","சொல்வன்மை","வினைத் தூய்மை","வினைத்திட்பம் வினை செயல்வகை","தூது","மன்னரைச் சேர்ந்து ஒழுகல்","குறிப்பறிதல்","அவை அறிதல்","அவை அஞ்சாமை","நாடு","அரண்","பொருள் செயல்வகை","படை மாட்சி","படைச் செருக்கு","நட்பு","நட்பாராய்தல்","பழைமை","தீ நட்பு","கூடா நட்பு","பேதைமை","புல்லறிவாண்மை","இகல்","பகை மாட்சி","பகைத்திறம் தெரிதல்","உட்பகை”, “பெரியாரைப் பிழையாமை","பெண்வழிச் சேறல்","வரைவின் மகளிர்","கள்ளுண்ணாமை","சூது","மருந்து","குடிமை","மானம்","பெருமை","சான்றாண்மை","பண்புடைமை","நன்றியில் செல்வம்","நாணுடைமை","குடிசெயல் வகை","உழவு","நல்குரவு","இரவு","இரவச்சம்","கயமை”"};
        for (String s : names){  // methos to display all string defined in string array
            RecycleAdapter recycleAdapter = new RecycleAdapter(s);
            usermoderlist.add(recycleAdapter);
        }
        userAdapter = new UserAdapter2(this.getActivity(),usermoderlist);
        recyclerView.setAdapter(userAdapter);
    }
    }