package com.twitter.analytics;

import com.twitter.analytics.TweetAnalytics;
import com.twitter.model.Tweet;

import com.twitter.service.TweetService;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class TestAnalytics {

    TweetAnalytics ta;

    @Before
    public void setUp(){
        ta = new TweetAnalytics();
    }

    @After
    public void tearDown(){
        ta = null;
    }

    @Test
    public void getAvgTweetLenght_givenManyTweets_calcsAvgCorrectly(){

        // given
        TweetService mockTweetService = mock(TweetService.class);

        Tweet[] allTweets = {
                new Tweet("Hello", "Mindaugas"),
                new Tweet("Good bye cruel world!", "Johny John John")
        };

        when(mockTweetService.getAllTweets())
                .thenReturn(allTweets);

        // when
        double result = ta.getAvgTweetLenght(mockTweetService);

        // then
        Assert.assertEquals(13.0, result, 0);
    }
}