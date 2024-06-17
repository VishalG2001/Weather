package com.example.weather;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class WeatherRVAdapter extends RecyclerView.Adapter<WeatherRVAdapter.ViewHolder>{
    private Context context;
    private ArrayList<WeatherRVmodel> weatherRVmodelArrayList;

    public WeatherRVAdapter(Context context, ArrayList<WeatherRVmodel> weatherRVmodelArrayList) {
        this.context = context;
        this.weatherRVmodelArrayList = weatherRVmodelArrayList;
    }

    @NonNull
    @Override
    public WeatherRVAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.weather_rv_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WeatherRVAdapter.ViewHolder holder, int position) {
        Picasso.get().load().into(holder.conditionIV);
    }

    @Override
    public int getItemCount() {
        return weatherRVmodelArrayList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView windTV, tempratureTV, timeTV;
        private ImageView conditionIV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            windTV= itemView.findViewById(R.id.idTVwindspeed);
            tempratureTV= itemView.findViewById(R.id.temprature);
            timeTV= itemView.findViewById(R.id.idTVtime);
            conditionIV= itemView.findViewById(R.id.idtvcondition);
        }
    }
}
