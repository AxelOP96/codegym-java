import java.util.ArrayList;

public class Solution25_09 {
    public static RedRidingHood hood = new RedRidingHood();
    public static Grandmother grandmother = new Grandmother();
    public static Pie pie = new Pie();
    public static Woodcutter woodcutter = new Woodcutter();
    public static Wolf wolf = new Wolf();

    public static void main(String[] args) {
        wolf.ate.add(grandmother);
        wolf.ate.add(hood);
        woodcutter.killed.add(wolf);

    }

    // Red riding hood
    public static class RedRidingHood extends StoryItem {
    }

    // Grandmother
    public static class Grandmother extends StoryItem {
    }

    // Pie
    public static class Pie extends StoryItem {
    }

    // Woodcutter
    public static class Woodcutter extends StoryItem {
    }

    // Wolf
    public static class Wolf extends StoryItem {
    }

    public static abstract class StoryItem {
        public ArrayList<StoryItem> killed = new ArrayList<>();
        public ArrayList<StoryItem> ate = new ArrayList<>();
    }
}
