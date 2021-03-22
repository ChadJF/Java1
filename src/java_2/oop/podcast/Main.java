package java_2.oop.podcast;

public class Main {

	public static void main(String[] args) {
		/*	Do the following tasks here in the main method, or in methods on this LambdaMain class.
			Create 9 podcasts.
			Create 3 Podcasting Apps
			Load 3 podcasts in each of the podcasting apps
			 - play and stop a podcast in one of the podcasting apps
			 - go to the next() and previous() podcasts in the 2nd podcasting app
			 - stop() the playing podcast on the 2nd podcasting app
			 - put a podcast on repeat() in the 3rd podcasting app.
       		 - show the playlist in the 3rd podcasting app
       		 - remove a podcast from the playlist in the 3rd podcasting app
		 */

		Podcast dnd = new Podcast("Dragons and Dragons", "Tom and Jerry", "3 hours");
		Podcast rnr = new Podcast("Rest and Relaxation", "Don Cheadle", "2 hours");
		Podcast ns = new Podcast("Nature sounds", "N/A", "10 hours");
		Podcast politics = new Podcast("Don't talk about this", "Some Guy", "Too long/2 hours");
		Podcast gn = new Podcast("Gaming News", "Tony Hawk", "2 hours");
		Podcast cs = new Podcast("Cooking Show", "Paula Dean", "2 hours");
		Podcast ne = new Podcast("Nerd Expo", "Albert Einstein", "5 hours");
		Podcast pc = new Podcast("Pod's Cast", "Pod Jones", "1 hour");
		Podcast ph = new Podcast("Program Humor", "Ice. T", "3 hours");

		PodcastingApp luxury = new PodcastingApp("Luxury Podcasts");
		PodcastingApp decent = new PodcastingApp("Decent Podcasts");
		PodcastingApp nerdy = new PodcastingApp("Nerdy Podcasts");

		luxury.addPodcast(cs);
		luxury.addPodcast(ne);
		luxury.addPodcast(politics);

		decent.addPodcast(rnr);
		decent.addPodcast(pc);
		decent.addPodcast(ns);

		nerdy.addPodcast(ph);
		nerdy.addPodcast(dnd);
		nerdy.addPodcast(gn);

		luxury.play(luxury);
		luxury.stop(luxury);

		decent.next(decent);
		decent.previous(decent);

		nerdy.repeat(nerdy);

		nerdy.displayPodcast(nerdy);

		nerdy.remove(ph);
		nerdy.displayPodcast(nerdy);
	}
}
