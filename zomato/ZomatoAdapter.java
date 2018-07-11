package com.example.d.zomato;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class ZomatoAdapter extends RecyclerView.Adapter<ZomatoAdapter.ZomatoHolder> {


    Context context;
    List<com.example.d.zomato.UserReview> listuserReview;

    public ZomatoAdapter(Context context, List<com.example.d.zomato.UserReview> userReviews) {
        listuserReview = userReviews;
        this.context = context;
    }

    @Override
    public ZomatoHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.review_sample, parent, false);
        return new ZomatoHolder(view);
    }

    @Override
    public void onBindViewHolder(ZomatoHolder holder, int position) {
        com.example.d.zomato.UserReview userReview = listuserReview.get(position);
        ReviewSample review = userReview.getReview();
        User_1 user = review.getUser();
        holder.title.setText(user.getName());
        holder.ratings.setText(review.getRating() + " ");
        Glide.with(context).load(user.getProfileImage()).into(holder.image);
        holder.date.setText(review.getReviewTimeFriendly());
        holder.review.setText(review.getReviewText());
        holder.ratings.setBackgroundColor(Color.parseColor("#"+review.getRatingColor()));
    }

    @Override
    public int getItemCount() {
        return listuserReview.size();
    }

    public class ZomatoHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView review;
        TextView ratings;
        TextView date;
        ImageView image;
        Button like,comment;


        public ZomatoHolder(final View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.profile_name);
            review = itemView.findViewById(R.id.profile_comment);
            ratings = itemView.findViewById(R.id.profile_rate);
            date = itemView.findViewById(R.id.profile_date);
            image = itemView.findViewById(R.id.profile_image);
            like=itemView.findViewById ( R.id.buton_like );



        }
    }
}
