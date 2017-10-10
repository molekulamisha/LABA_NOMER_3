package controller;

import model.entity.Mood;
import model.logic.MoodChooser;
import util.God;
import view.Display;

/**
 * Created by Михаил on 10.10.2017.
 */
public class Main {
    public static void main(String[] args) {
        Mood m = God.createMood();
        m.addMoodToContainer(":)");
        m.addMoodToContainer(":0");
        m.addMoodToContainer(":(");
        m.addMoodToContainer(":/");
        Display.print("Your mood is -> ");
        Display.print(MoodChooser.ChooseMood(m));
    }

}
