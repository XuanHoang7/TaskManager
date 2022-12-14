package main;

import configuration.ProjectConfiguration;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import repositories.DBCommentRepository;
import proxies.EmailCommentNotificationProxy;
import services.CommentService;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        var comment = new Comment();
        comment.setAuthor("Laurentiu");
        comment.setText("Demo comment");

        var commentService = context.getBean(CommentService.class);
        var commentServiceCheck = context.getBean(CommentService.class);
        System.out.println(commentService == commentServiceCheck);
        commentService.publishComment(comment);
    }
}
