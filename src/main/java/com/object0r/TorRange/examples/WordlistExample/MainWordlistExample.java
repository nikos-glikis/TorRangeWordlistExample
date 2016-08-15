package com.object0r.TorRange.examples.WordlistExample;


public class MainWordlistExample
{
    public static void main(String args[])
    {
        try
        {
            if (args.length == 0)
            {
                System.out.println("No session ini in arguments.");
                System.out.println("Usage: ");
                System.out.println("java -jar target/TorRangeWordlistExample-1.0-SNAPSHOT-jar-with-dependencies.jar parameters.ini");
                System.exit(-1);
            }

            try
            {
                WordlistConsumerWorkerManager wordlistConsumerWorkerManager = new WordlistConsumerWorkerManager(args[0], WordlistConsumerWorkerExample.class);
                wordlistConsumerWorkerManager.startWorkers();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
