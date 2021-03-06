package edu.matc.customtags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.*;
import java.io.IOException;

public class HolidayGreetingTag extends SimpleTagSupport{
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
            case "ChristmasGreeting":
                greeting = "Merry Christmas!";
                break;
            case "HalloweenGreeting":
                greeting = "Happy Halloween!!!";
                break;
            default:
                greeting = "";
                break;
        }

        out.println(greeting);

    }
}
