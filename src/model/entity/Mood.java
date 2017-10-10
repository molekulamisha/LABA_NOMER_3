package model.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Михаил on 10.10.2017.
 */
public class Mood {
    private static List<String> moodContainer = new ArrayList();

    public static List<String> getMoodContainer() {
        return moodContainer;
    }

    public static void addMoodToContainer(String str) {
        Mood.moodContainer.add(str);
    }
}
