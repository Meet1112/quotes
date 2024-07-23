package com.example.quotes;


import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomAdapterViewHolder> {

    Context context;
    private String[] items;
    private int[] img;
    private String lang;

    public CustomAdapter(Context context, String[] items, int[] img,String lang)
    {
        this.items=items;
        this.img=img;
        this.context=context;
        this.lang=lang;
    }

    @NonNull
    @Override
    public CustomAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater=LayoutInflater.from(viewGroup.getContext());
        View view=inflater.inflate(R.layout.custom_category,viewGroup,false);

        return new CustomAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CustomAdapterViewHolder CustomAdapterViewHolder, int i) {
        CustomAdapterViewHolder.t1.setText(items[i]);
        CustomAdapterViewHolder.i1.setImageResource(img[i]);
        CustomAdapterViewHolder.l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(context, ""+CustomAdapterViewHolder.t1.getText(), Toast.LENGTH_SHORT).show();
                if(CustomAdapterViewHolder.t1.getText().equals("Birthday"))
                {
                    Intent intent=new Intent(context,ViewQuotes.class);
                    intent.putExtra("heading",CustomAdapterViewHolder.t1.getText());
                    intent.putExtra("language",lang);
                    v.getContext().startActivity(intent);

                }
                if(CustomAdapterViewHolder.t1.getText().equals("Inspiration"))
                {
                    Intent intent=new Intent(context,ViewQuotes.class);
                    intent.putExtra("heading",CustomAdapterViewHolder.t1.getText());
                    intent.putExtra("language",lang);
                    v.getContext().startActivity(intent);
                }
                if(CustomAdapterViewHolder.t1.getText().equals("Cute"))
                {
                    Intent intent=new Intent(context,ViewQuotes.class);
                    intent.putExtra("heading",CustomAdapterViewHolder.t1.getText());
                    intent.putExtra("language",lang);
                    v.getContext().startActivity(intent);
                }
                if(CustomAdapterViewHolder.t1.getText().equals("Funny"))
                {
                    Intent intent=new Intent(context,ViewQuotes.class);
                    intent.putExtra("heading",CustomAdapterViewHolder.t1.getText());
                    intent.putExtra("language",lang);
                    v.getContext().startActivity(intent);
                }
                if(CustomAdapterViewHolder.t1.getText().equals("Sport"))
                {
                    Intent intent=new Intent(context,ViewQuotes.class);
                    intent.putExtra("heading",CustomAdapterViewHolder.t1.getText());
                    intent.putExtra("language",lang);
                    v.getContext().startActivity(intent);
                }
                if(CustomAdapterViewHolder.t1.getText().equals("Friendship"))
                {
                    Intent intent=new Intent(context,ViewQuotes.class);
                    intent.putExtra("heading",CustomAdapterViewHolder.t1.getText());
                    intent.putExtra("language",lang);
                    v.getContext().startActivity(intent);
                }
                if(CustomAdapterViewHolder.t1.getText().equals("GoodMorning"))
                {
                    Intent intent=new Intent(context,ViewQuotes.class);
                    intent.putExtra("heading",CustomAdapterViewHolder.t1.getText());
                    intent.putExtra("language",lang);
                    v.getContext().startActivity(intent);
                }if(CustomAdapterViewHolder.t1.getText().equals("Success"))
                {
                    Intent intent=new Intent(context,ViewQuotes.class);
                    intent.putExtra("heading",CustomAdapterViewHolder.t1.getText());
                    intent.putExtra("language",lang);
                    v.getContext().startActivity(intent);
                }if(CustomAdapterViewHolder.t1.getText().equals("Smile"))
                {
                    Intent intent=new Intent(context,ViewQuotes.class);
                    intent.putExtra("heading",CustomAdapterViewHolder.t1.getText());
                    intent.putExtra("language",lang);
                    v.getContext().startActivity(intent);
                }if(CustomAdapterViewHolder.t1.getText().equals("Angry"))
                {
                    Intent intent=new Intent(context,ViewQuotes.class);
                    intent.putExtra("heading",CustomAdapterViewHolder.t1.getText());
                    intent.putExtra("language",lang);
                    v.getContext().startActivity(intent);
                }if(CustomAdapterViewHolder.t1.getText().equals("Sad"))
                {
                    Intent intent=new Intent(context,ViewQuotes.class);
                    intent.putExtra("heading",CustomAdapterViewHolder.t1.getText());
                    intent.putExtra("language",lang);
                    v.getContext().startActivity(intent);
                }



            }
        });
    }

    @Override
    public int getItemCount() {
        return items.length;
    }

    public class CustomAdapterViewHolder extends RecyclerView.ViewHolder{

        TextView t1;
        ImageView i1;
        LinearLayout l1;
        public CustomAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            i1=(ImageView)itemView.findViewById(R.id.custom_cat_img);
            t1=(TextView)itemView.findViewById(R.id.custom_cat_txt);
            l1=(LinearLayout)itemView.findViewById(R.id.main_cat_cust_layout);

        }
    }

}

