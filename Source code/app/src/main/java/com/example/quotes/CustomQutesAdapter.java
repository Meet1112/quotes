package com.example.quotes;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CustomQutesAdapter extends RecyclerView.Adapter<CustomQutesAdapter.CustomViewHolder> {
    Context context;
    private String[] items;

    public CustomQutesAdapter(Context context, String[] items) {
        this.items = items;
        this.context = context;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.custom_view_quotes, viewGroup, false);

        return new CustomQutesAdapter.CustomViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull final CustomViewHolder customViewHolder, @SuppressLint("RecyclerView") final int i) {
        customViewHolder.t1.setText(items[i]);
        customViewHolder.l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(context, ShareQuotes.class);
                a.putExtra("qut", items[i]);
                a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(a);
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.length;
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        TextView t1;
        LinearLayout l1;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            t1 = (TextView) itemView.findViewById(R.id.txt_quotes);
            l1 = (LinearLayout) itemView.findViewById(R.id.layout_qutoes);
        }
    }
}
