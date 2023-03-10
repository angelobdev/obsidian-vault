package is.simpleRMI.server;

import is.simpleRMI.Message;
import is.simpleRMI.MsgSource;

import java.rmi.RemoteException;
import java.util.ArrayList;

public class SimpleMsgSource implements MsgSource {

    private  final ArrayList<Message> messages=new ArrayList<>();
    private  int index=0;
    @Override
    public Message getMessage() throws RemoteException {
        if(messages.isEmpty()) return  null;
        Message msg=messages.get(index);
        index=(index+1)%messages.size();
        return msg;
    }

    public void addMessage(Message msg){
        messages.add(msg);
    }
}
