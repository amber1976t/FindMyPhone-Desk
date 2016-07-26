package pushService;

import com.xiaomi.xmpush.server.Constants;
import com.xiaomi.xmpush.server.Message;
import com.xiaomi.xmpush.server.Sender;



public class PushService {
	public void sendMessage(String username, String IMEI) throws Exception {
		Constants.useOfficial();
	    Sender sender = new Sender("hSe1ky+Rvbjec2zg7J7exQ==");
		
	    if(username.equals(""))
	    	username = "����";
	    
	    String PACKAGENAME = "com.ufotosoft.findmyphone";
	    String messagePayload = "���ֻ�";
	    String title = "���ֻ�";
	    String description = "����ֻ�����" + username;
	    Message message = new Message.Builder()
	    		.title(title)
	            .description(description).payload(messagePayload)
	            .restrictedPackageName(PACKAGENAME)
	            .passThrough(0) //��Ϣʹ��֪ͨ����ʽ
	            .notifyType(1)
	            .build();
	    sender.sendToAlias(message, IMEI, 0); //����alias��������Ϣ��ָ���豸�ϣ������ԡ�
	}
	
}
