package com.example.DebCovidApp;


import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyHolder> {

    private Context mContext;
    private List<format> mData;

    public RecyclerViewAdapter(Context mContext, List<format> mData){
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view ;
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        view = layoutInflater.inflate(R.layout.cardview_recipe,viewGroup,false);
        return  new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyHolder myHolder, final int i) {

        myHolder.covidTitle.setText(mData.get(i).getTitleName());
        myHolder.img_covid_thumbnail.setImageResource(mData.get(i).getThumbnail());
        myHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, InfoActivity.class);

                intent.putExtra("TitleName",mData.get(i).getTitleName());
                intent.putExtra("Information",mData.get(i).getTextBox());
                intent.putExtra("Explanation",mData.get(i).getTitle2());
                intent.putExtra("Covid19",mData.get(i).getTextBox2());
                intent.putExtra("Thumbnail",mData.get(i).getThumbnail());

                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {

        TextView covidTitle;
        CardView cardView;
        ImageView img_covid_thumbnail;

        public MyHolder(@NonNull View itemView) {
            super(itemView);

            covidTitle = (TextView)itemView.findViewById(R.id.covid_text);
            img_covid_thumbnail = (ImageView)itemView.findViewById(R.id.covid_img_id);
            cardView = (CardView)itemView.findViewById(R.id.cardview_id);


        }
    }
}
