package simple_projects.word_search;

import java.util.logging.Logger;

public class Counter {
    private int counter = 0;
    Logger logger = Logger.getLogger("Counter");

    public void increase() {
        counter++;
    }

    public void logCounted() {
        logger.info(String.valueOf(counter));
    }
}
