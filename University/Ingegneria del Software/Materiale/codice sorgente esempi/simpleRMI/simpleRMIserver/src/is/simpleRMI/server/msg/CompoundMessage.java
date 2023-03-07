package is.simpleRMI.server.msg;

import is.simpleRMI.Message;

import java.io.Serializable;
import java.util.List;
import java.util.LinkedList;

public final class CompoundMessage implements Message, Serializable {
    private final List<Message> msgList= new LinkedList<>();

    @Override
    public String toString() {
        return "CompoundMessage{" +
                "msgList=" + msgList +
                '}';
    }

    public void add(String msg){
        msgList.add(new SimpleMessage(msg));

    }


}
