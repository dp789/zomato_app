package com.example.d.zomato;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

    public class ReviewSample {

        @SerializedName("rating")
        @Expose
        private Double rating;
        @SerializedName("review_text")
        @Expose
        private String reviewText;
        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("rating_color")
        @Expose
        private String ratingColor;
        @SerializedName("review_time_friendly")
        @Expose
        private String reviewTimeFriendly;
        @SerializedName("rating_text")
        @Expose
        private String ratingText;
        @SerializedName("timestamp")
        @Expose
        private Integer timestamp;
        @SerializedName("likes")
        @Expose
        private Integer likes;
        @SerializedName("user")
        @Expose
        private User_1 user;
        @SerializedName("comments_count")
        @Expose
        private Integer commentsCount;

        public Double getRating() {
            return rating;
        }

        public void setRating(Double rating) {
            this.rating = rating;
        }

        public String getReviewText() {
            return reviewText;
        }

        public void setReviewText(String reviewText) {
            this.reviewText = reviewText;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getRatingColor() {
            return ratingColor;
        }

        public void setRatingColor(String ratingColor) {
            this.ratingColor = ratingColor;
        }

        public String getReviewTimeFriendly() {
            return reviewTimeFriendly;
        }

        public void setReviewTimeFriendly(String reviewTimeFriendly) {
            this.reviewTimeFriendly = reviewTimeFriendly;
        }

        public String getRatingText() {
            return ratingText;
        }

        public void setRatingText(String ratingText) {
            this.ratingText = ratingText;
        }

        public Integer getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(Integer timestamp) {
            this.timestamp = timestamp;
        }

        public Integer getLikes() {
            return likes;
        }

        public void setLikes(Integer likes) {
            this.likes = likes;
        }

        public User_1 getUser() {
            return user;
        }

        public void setUser(User_1 user) {
            this.user = user;
        }

        public Integer getCommentsCount() {
            return commentsCount;
        }

        public void setCommentsCount(Integer commentsCount) {
            this.commentsCount = commentsCount;
        }

    }






