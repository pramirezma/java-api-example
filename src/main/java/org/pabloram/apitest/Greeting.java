package org.pabloram.apitest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Greeting {

    private static final Logger logger = LogManager.getLogger("HelloWorld");
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
        logger.info("id:"+ id + " " + "content:" + content);
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}