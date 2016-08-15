package com.object0r.TorRange.examples.WordlistExample;

import com.object0r.TorRange.TorWorker;
import com.object0r.TorRange.helpers.TorRangeHttpHelper;
import com.object0r.toortools.Utilities;
import com.object0r.toortools.http.HttpHelper;
import com.object0r.toortools.http.HttpRequestInformation;
import com.object0r.toortools.http.HttpResult;
import com.sun.deploy.net.URLEncoder;

import java.io.UnsupportedEncodingException;

public class WordlistConsumerWorkerExample extends TorWorker
{
    WordlistConsumerWorkerManager manager;

    public WordlistConsumerWorkerExample(WordlistConsumerWorkerManager manager, int id)
    {
        super(manager, id);
        this.manager = manager;
    }

    public int threadCounter = 0;

    public void process(String entry)
    {
        try
        {
            System.out.println("Entry: " + entry);
            Thread.sleep(500);

            //Change ip every 25 "requests"
            if (threadCounter++ % 25 == 0)
            {
                changeIp();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }


    public void logWinner(String page, String entry)
    {
        try
        {
            System.out.println("We have a winner: " + entry);
            manager.logWinner(page, entry);
            System.exit(0);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
