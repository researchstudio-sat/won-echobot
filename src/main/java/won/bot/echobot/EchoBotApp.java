package won.bot.echobot;

import org.springframework.boot.SpringApplication;
import won.bot.framework.bot.utils.BotUtils;

public class EchoBotApp {
    public static void main(String[] args) throws Exception {
        if (!BotUtils.isValidRunConfig()) {
            System.exit(1);
        }
        SpringApplication app = new SpringApplication("classpath:/spring/app/botApp.xml");
        app.setWebEnvironment(false);
        app.run(args);
        // ConfigurableApplicationContext applicationContext = app.run(args);
        // Thread.sleep(5*60*1000);
        // app.exit(applicationContext);
    }
}
