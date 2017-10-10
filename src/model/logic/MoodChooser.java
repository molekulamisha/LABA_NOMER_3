package model.logic;

import java.util.Random;

import model.entity.Mood;

/**
 * Created by Михаил on 10.10.2017.
 */
public class MoodChooser {

    private String yourMood;

    public String getYourMood() {
        return yourMood;
    }

    public static String ChooseMood(Mood m) {
        Random randomGenerator = new Random();
        int anyInt = randomGenerator.nextInt(m.getMoodContainer().size());
        return m.getMoodContainer().get(anyInt);
    }
}
