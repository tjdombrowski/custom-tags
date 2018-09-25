package edu.matc.customtags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class Greeting extends SimpleTagSupport{
    private String messageType;

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();

        String greeting;
        JspWriter out = getJspContext().getOut();

        switch (messageType) {
            case "EveningGreeting":
                greeting = "Good evening!";
                break;
            case "MorningGreeting":
                greeting = "Good morning!";
                break;
            default:
                greeting = "";
                break;
        }

        out.println(greeting);

    }
}
