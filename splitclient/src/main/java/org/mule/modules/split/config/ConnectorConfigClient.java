package org.mule.modules.split.config;

//public class ConnectorConfigClient implements ConnectorConfigClientInterface {
public class ConnectorConfigClient{


    /**
     * Greeting message
     */
    private String greeting;

    /**
     * Reply message
     */
    private String reply;

    /**
     * Set greeting message
     *
     * @param greeting
     *            the greeting message
     */
    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    /**
     * Get greeting message
     */
    public String getGreeting() {
        return this.greeting;
    }

    /**
     * Set reply
     *
     * @param reply
     *            the reply
     */
    public void setReply(String reply) {
        this.reply = reply;
    }

    /**
     * Get reply
     */
    public String getReply() {
        return this.reply;
    }

}