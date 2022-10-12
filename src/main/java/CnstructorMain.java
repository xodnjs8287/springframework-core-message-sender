import com.nhnacademy.edu.springframework.messagesender.AppConfig;
import com.nhnacademy.edu.springframework.messagesender.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.MessageSenderService;
import com.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CnstructorMain {
    public static void main(String[] args) {

        //String basePackage ="com.nhnacademy.edu.springframework.messagesender";

        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        MessageSender smsMessageSender = ac.getBean("smsMessageSender", MessageSender.class);
        MessageSender emailMessageSender = ac.getBean("emailMessageSender", MessageSender.class);
        smsMessageSender.sendMessage(new User("123","213"),"hello");
        emailMessageSender.sendMessage(new User("123","23423423"),"bye");

        User user = new User("0101010","xodnjs28");
        MessageSender messageSender = new AppConfig().emailMessageSender();
        messageSender.sendMessage(user,"j");

       MessageSender messageSender1 = new AppConfig().smsMessageSender();
       messageSender1.sendMessage(user, "asdasd");




    }
}