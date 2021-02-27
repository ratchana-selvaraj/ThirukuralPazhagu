package com.example.thirukuralpazhagu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ModelAdapter extends PagerAdapter {
    Context context;
    ArrayList<Model> list;
    LayoutInflater layoutInflater;

    public ModelAdapter(Context context, ArrayList<Model> list) {
        this.context = context;
        this.list = list;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.slideview, container, false);
        ImageView img1,img2;
        TextView head1,head3,desc1,desc2;
        TextView head2;
        img1 = view.findViewById(R.id.imageView);
        img2 = view.findViewById(R.id.imageView2);
        head1 = view.findViewById(R.id.textView5);
        desc1 = view.findViewById(R.id.textView4);
        head2 = view.findViewById(R.id.textView6);
        desc2 = view.findViewById(R.id.textView7);
        head3= view.findViewById(R.id.textView8);
        img1.setImageResource(list.get(position).getImg1());
        img2.setImageResource(list.get(position).getImg2());
        head1.setText(list.get(position).getHead1());
        desc1.setText(list.get(position).getDesc1());
        head2.setText(list.get(position).getHead2());
        head3.setText(list.get(position).getHead3());
        desc2.setText(list.get(position).getDesc2());
        container.addView(view,0);
        return  view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
       container.removeView((View)object);
    }
}
