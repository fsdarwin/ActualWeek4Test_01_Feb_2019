package com.example.actualweek4test_01_feb_2019.adaptors;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.actualweek4test_01_feb_2019.Pojos.Photo;
import com.example.actualweek4test_01_feb_2019.R;
import com.example.actualweek4test_01_feb_2019.activities.Activity3;

import java.util.ArrayList;

public class RvAdapter extends RecyclerView.Adapter<RvAdapter.ViewHolder> {
    ArrayList<com.example.actualweek4test_01_feb_2019.Pojos.Photo> photoArrayList;
    public static final String TAG = "FRANK: ";
    //CallTask result;

    public RvAdapter(ArrayList<com.example.actualweek4test_01_feb_2019.Pojos.Photo> photoArrayList) {
        this.photoArrayList = photoArrayList;
    }

    @NonNull
    @Override
    public RvAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RvAdapter.ViewHolder viewHolder, int position) {

        Photo photo = photoArrayList.get(position);
        if (photo != null) {
            viewHolder.setItem(photo);
            String photoId = photo.getId();
            String photoOwner = photo.getOwner();
            String photoTitle = photo.getTitle();
            Log.d(TAG, "onBindViewHolder: " + photoId + ", " + photoOwner + ", " + photoTitle);

            viewHolder.vPhotoId.setText(photoId);
            viewHolder.vPhotoOwner.setText(photoOwner);
            viewHolder.vPhotoTitle.setText(photoTitle);
        }
    }

    @Override
    public int getItemCount() {
        return photoArrayList != null ? photoArrayList.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView vPhotoId;
        TextView vPhotoOwner;
        TextView vPhotoTitle;
        Photo item;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            vPhotoId = itemView.findViewById(R.id.tvPhotoId);
            vPhotoOwner = itemView.findViewById(R.id.tvPhotoOwner);
            vPhotoTitle = itemView.findViewById(R.id.tvPhotoTitle);
            itemView.setOnClickListener(this);
        }

        public void setItem(Photo item) {
            this.item = item;
        }

        @Override
        public void onClick(View v) {
            Intent intent;
            Context context = itemView.getContext();
            intent = new Intent(context, Activity3.class);
            intent.putExtra("photo", item);
            context.startActivity(intent);

        }
    }
}
