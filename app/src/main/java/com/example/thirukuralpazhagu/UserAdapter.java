package com.example.thirukuralpazhagu;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import static android.widget.Toast.LENGTH_LONG;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UsersAdapter> {
    private Context context;
    private List<RecycleAdapter> usermoderlist;

    public UserAdapter( Context context, List<RecycleAdapter> usermoderlist) {
        this.usermoderlist= usermoderlist;
        this.context=context;
    }
    @NonNull
    @Override
    public UserAdapter.UsersAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {  //get id
        context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.row,parent,false);
        return new UsersAdapter (view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdapter.UsersAdapter holder, final int position) { //encompasses all items to be displayed in view pager
        RecycleAdapter recycleAdapter = usermoderlist.get(position);//get pos of click event
        String name = recycleAdapter.getUsers();
        holder.usertext.setText(name);
        holder.usertext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,activity_fragp1.class);
                intent.putExtra("name",usermoderlist.get(position).getUsers());
                context.startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount()
    {
        return usermoderlist.size();
    } //get total items defined
    public class UsersAdapter extends RecyclerView.ViewHolder {
        TextView usertext;
        public UsersAdapter(@NonNull View itemView) {
            super(itemView);
            context=itemView.getContext();
            usertext= (TextView) itemView.findViewById(R.id.textView2);
            itemView.setClickable(true);
        }
    }
}
