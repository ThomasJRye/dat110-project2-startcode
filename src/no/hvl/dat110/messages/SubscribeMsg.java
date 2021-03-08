package no.hvl.dat110.messages;

public class SubscribeMsg extends Message {
	private String topic;
	// message sent from client to subscribe on a topic
	
	public SubscribeMsg(String user, String topic2) {
		super(MessageType.SUBSCRIBE, user);
		this.topic = topic2;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	@Override
	public String toString() {
		return "SubscribeMsg [topic=" + topic + ", getTopic()=" + getTopic() + "]";
	}
	
		
}
