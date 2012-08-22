/**
 * 
 */
package com.waheed.spring.core.basic;

/**
 * @author abdul
 *
 */
public class HelloSpring {
    private String message;

    public HelloSpring() {
        message = "Welcome to Spring(\"Default Constructor\")";
    }

    /**
     * @param message
     *           the message to set
     */
    public HelloSpring(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
