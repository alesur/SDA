package com.twitter.analytics;

import com.twitter.model.Tweet;
import com.twitter.service.TweetService;

public class TweetAnalytics {
    public double getAvgTweetLenght(TweetService tweetService) {
        Tweet[] allTweets = tweetService.getAllTweets();

        // Implement average calculation
        int sumOfLenghts = 0;
        for (int i = 0; i < allTweets.length; i++) {
            sumOfLenghts += (allTweets[i]).getText().length();
        }

        return (double) sumOfLenghts / allTweets.length;
    }

    public double getAvgTweetTagCount(TweetService tweetService) {
        return 0;
    }

    public double getCountOfTweetsByTag(TweetService tweetService) {
        return 0;
    }

    public double getCountOfTweetsWProfanity(TweetService tweetService) {
        return 0;
    }
}