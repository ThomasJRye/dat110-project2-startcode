package no.hvl.dat110.messages;

public class UnsubscribeMsg extends Message {
	@Override
	public String toString() {
		return "UnsubscribeMsg [topic=" + topic + ", getTopic()=" + getTopic() + "]";
	}

	private String topic;

	public UnsubscribeMsg(String user, String topic) {
		super(MessageType.UNSUBSCRIBE, user);
		this.setTopic(topic);
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	// message sent from client to unsubscribe on a topic 

	// TODO:
	// Implement object variables - a topic is required

	// Constructor, get/set-methods, and toString method
	// as described in the project text
	
}
