package java_2.oop.podcast;

import java.util.ArrayList;
import java.util.List;

class PodcastingApp {

/*
	   Properties :
	   - appName (Apple Podcasts, Pocket Casts, Overcast, Google Podcasts, etc.)
       - playlist of Podcasts (with a capital P)

       Methods :
       - loadPlaylist (replace the existing playlist with a new one)
       - addPodcast (add a new podcast to the playlist.  order of the playlist should be maintained.
       - play()
       - stop()
       - next()
       - previous()
       - repeat()
       - showPlaylist()
       - removeFromPlaylist(Podcast)
*/

    String appName;
    List<Podcast> playLists = new ArrayList<>();

    public PodcastingApp(String appName) {
        this.appName = appName;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public void addPodcast(Podcast podcast) {
        playLists.add(podcast);
    }

    public void play(PodcastingApp playit) {
        System.out.println("Playing "+playit.appName);
    }

    public void stop(PodcastingApp stopit) {
        System.out.println("Stopping "+stopit.appName);
    }

    public void next(PodcastingApp nextPC) {
        System.out.println("Playing next podcast");
    }

    public void previous(PodcastingApp lastPC) {
        System.out.println("Playing previous podcast");
    }

    public void repeat(PodcastingApp loop) {
        System.out.println("Repeating "+loop.appName);
    }

    public void displayPodcast(PodcastingApp display) {
        display.playLists.stream().forEach(show -> System.out.println(show.title));
    }

    public void remove(Podcast takeAway) {
        playLists.remove(takeAway);

    }
}

