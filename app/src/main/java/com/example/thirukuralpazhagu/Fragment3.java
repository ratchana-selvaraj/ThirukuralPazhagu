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

public class Fragment3 extends Fragment  {
    private RecyclerView recyclerView;
    UserAdapter3 userAdapter;
    public Fragment3() {
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
        String [] names = {"தகை அணங்குறுத்தல்","குறிப்பறிதல்","புணர்ச்சி மகிழ்தல்","நலம் புனைந்து உரைத்தல்","காதற் சிறப்புரைத்தல்","நாணுத் துறவுரைத்தல்","அலர் அறிவுறுத்தல்","பிரிவு ஆற்றாமை","படர்மெலிந் திரங்கல்","கண் விதுப்பழிதல்","பசப்புறு பருவரல்","தனிப்படர் மிகுதி","நினைந்தவர் புலம்பல்","கனவுநிலை உரைத்தல்","பொழுதுகண்டு","இரங்கல்","உறுப்புநலன் அழிதல்","நெஞ்சொடு கிளத்தல்","நிறையழிதல்","அவர்வயின் விதும்பல்","குறிப்பறிவுறுத்தல்","புணர்ச்சி விதும்பல்","நெஞ்சொடு புலத்தல்","புலவி","புலவி நுணுக்கம்","ஊடலுவகை"};
        for (String s : names){  // methos to display all string defined in string array
            RecycleAdapter recycleAdapter = new RecycleAdapter(s);
            usermoderlist.add(recycleAdapter);
        }
        userAdapter = new UserAdapter3(this.getActivity(),usermoderlist);
        recyclerView.setAdapter(userAdapter);
    }
}
