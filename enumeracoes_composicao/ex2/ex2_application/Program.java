package ex2_application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import ex2_entities.Comment;
import ex2_entities.Post;

public class Program {

	public static void main(String[] args) {
		Post post1 = new Post();
		Post post2 = new Post();
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		post1.setMoment(LocalDateTime.parse("21/06/2018 13:05:44", fmt));
		post1.setTitle("Travelling to New Zealand");
		post1.setContent("I'm going to visit this wonderful country!");
		post1.setLikes(12);
		
		post1.addComment(new Comment("Have a nice trip"));
		post1.addComment(new Comment("Wow that's awesome!"));

		post2.setMoment(LocalDateTime.parse("28/07/2018 23:14:19", fmt));
		post2.setTitle("Good night guys");
		post2.setContent("See you tomorrow");
		post2.setLikes(5);
		
		post2.addComment(new Comment("Good night"));
		post2.addComment(new Comment("May the Force be with you"));
		
		System.out.println(post1);
		System.out.println(post2);
	}

}
