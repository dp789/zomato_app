package com.example.d.zomato;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class User {

        @SerializedName("reviews_count")
        @Expose
        private Integer reviewsCount;
        @SerializedName("reviews_start")
        @Expose
        private Integer reviewsStart;
        @SerializedName("reviews_shown")
        @Expose
        private Integer reviewsShown;
        @SerializedName("user_reviews")
        @Expose
        private List<com.example.d.zomato.UserReview> userReviews = null;
        @SerializedName("Respond to reviews via Zomato Dashboard")
        @Expose
        private String respondToReviewsViaZomatoDashboard;

        public Integer getReviewsCount() {
            return reviewsCount;
        }

        public void setReviewsCount(Integer reviewsCount) {
            this.reviewsCount = reviewsCount;
        }

        public Integer getReviewsStart() {
            return reviewsStart;
        }

        public void setReviewsStart(Integer reviewsStart) {
            this.reviewsStart = reviewsStart;
        }

        public Integer getReviewsShown() {
            return reviewsShown;
        }

        public void setReviewsShown(Integer reviewsShown) {
            this.reviewsShown = reviewsShown;
        }

        public List<com.example.d.zomato.UserReview> getUserReviews() {
            return userReviews;
        }

        public void setUserReviews(List<com.example.d.zomato.UserReview> userReviews) {
            this.userReviews = userReviews;
        }

        public String getRespondToReviewsViaZomatoDashboard() {
            return respondToReviewsViaZomatoDashboard;
        }

        public void setRespondToReviewsViaZomatoDashboard(String respondToReviewsViaZomatoDashboard) {
            this.respondToReviewsViaZomatoDashboard = respondToReviewsViaZomatoDashboard;
        }

    }


