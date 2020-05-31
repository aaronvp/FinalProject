package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTest {

    private final EndpointsAsyncTask.GetJokeListener mockGetJokeListener = new EndpointsAsyncTask.GetJokeListener() {
        @Override
        public void onJokeFetched(String joke) {
            // No implementation required for test
        }
    };

    @Test
    public void endPointTest() throws InterruptedException, ExecutionException {
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(mockGetJokeListener);
        endpointsAsyncTask.execute();
        String joke = endpointsAsyncTask.get();
        Assert.assertNotEquals("", joke);
    }
}