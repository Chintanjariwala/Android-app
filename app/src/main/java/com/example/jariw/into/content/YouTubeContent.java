package com.example.jariw.into.content;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A Helper class for providing mock data to the app.
 * In a real world scenario you would either hard code the video ID's in the strings file or
 * retrieve them from a web service.
 */
public class YouTubeContent {

    /**
     * An array of YouTube videos
     */
    public static List<YouTubeVideo> ITEMS = new ArrayList<>();

    /**
     * A map of YouTube videos, by ID.
     */
    public static Map<String, YouTubeVideo> ITEM_MAP = new HashMap<>();

    static {
        addItem(new YouTubeVideo("dQpUcIo5AfQ", "Introducing Samira Gaikwad - Indian Language and Cultural Advisor"));
        addItem(new YouTubeVideo("jBh1ScE7gPk", "Marshall University's 53rd International Festival"));
        addItem(new YouTubeVideo("68JOFTqWtsM", "NTO Marshall Student Workers: Kasun Wijayagurusinghe"));
        addItem(new YouTubeVideo("vqGVKDrElAw", "INTO Marshall Center Tour"));
        addItem(new YouTubeVideo("fOtSRu24y5E", "Marshall University- Statement 2015"));
        addItem(new YouTubeVideo("PqMddF1uafo", "Studying at INTO Marshall and in the US - Maidina Mulati from China (in language)"));
        addItem(new YouTubeVideo("xpOMlG8mcFk", "Tips from Teachers: Overcoming Challenges Part 1 - Shawn"));
        addItem(new YouTubeVideo("wyNOTP8YdCk", "Tips from Teachers: Overcoming Challenges Part 2 - Saba"));
        addItem(new YouTubeVideo("A3dDpDQX278", "We Are the Sons and Daughters of Marshall University"));
        addItem(new YouTubeVideo("tMHgNgBovl4", "Welcome to Marshall University!"));
        addItem(new YouTubeVideo("2kbvZB1nXb0", "Housing & Dining at Marshall University"));
        addItem(new YouTubeVideo("d-61sCqkGk0", "International Student Life at Marshall University"));
    }

    private static void addItem(final YouTubeVideo item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A POJO representing a YouTube video
     */
    public static class YouTubeVideo {
        public String id;
        public String title;

        public YouTubeVideo(String id, String content) {
            this.id = id;
            this.title = content;
        }

        @Override
        public String toString() {
            return title;
        }
    }
}