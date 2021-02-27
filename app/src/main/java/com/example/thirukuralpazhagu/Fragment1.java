package com.example.thirukuralpazhagu;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class Fragment1 extends Fragment {
    private RecyclerView recyclerView;
    UserAdapter userAdapter;
    public Fragment1() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_1, container, false);
        recyclerView =(RecyclerView)view.findViewById(R.id.rvv);
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        //recyclerView.addItemDecoration(new DividerItemDecoration(getActivity());
        return view;

    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        List<RecycleAdapter> usermoderlist = new ArrayList<>();
        String [] names = {"kkkk","வான்சிறப்பு","நீத்தார் பெருமை","அறன் வலியுறுத்தல்","இல்வாழ்க்கை","வாழ்க்கைத் துணைநலம்","மக்கட்பேறு / புதல்வரைப் பெறுதல்","அன்புடைமை","விருந்தோம்பல்","இனியவைகூறல்","செய்ந்நன்றி அறிதல்","நடுவு நிலைமை","அடக்கமுடைமை","ஒழுக்கமுடைமை","பிறனில் விழையாமை","பொறையுடைமை","அழுக்காறாமை","வெஃகாமை","புறங்கூறாமை","பயனில சொல்லாமை","தீவினையச்சம்","ஒப்புரவறிதல்","ஈகை","புகழ்","அருளுடைமை","புலான்மறுத்தல்","தவம்","கூடாவொழுக்கம்","கள்ளாமை","வாய்மை","வெகுளாமை","இன்னாசெய்யாமை","கொல்லாமை","நிலையாமை","துறவு","மெய்யுணர்தல்","அவாவறுத்தல்","ஊழ்"};
        for (String s : names){  // methods to display all string defined in string array
            RecycleAdapter recycleAdapter = new RecycleAdapter(s);
            usermoderlist.add(recycleAdapter);
        }
        userAdapter = new UserAdapter(this.getActivity(),usermoderlist);
        recyclerView.setAdapter(userAdapter);
    }

}



