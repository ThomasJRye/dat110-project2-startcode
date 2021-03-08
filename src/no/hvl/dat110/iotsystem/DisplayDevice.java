package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;
import no.hvl.dat110.messages.Message;
import no.hvl.dat110.messages.PublishMsg;
import no.hvl.dat110.common.TODO;

public class DisplayDevice {
	
	private static final int COUNT = 10;
		
	public static void main (String[] args) {
		
		System.out.println("Display starting ...");
		
		// TODO - START
				
		// create a client object and use it to
		Client client = new Client("DisplayDevice", Common.BROKERHOST, Common.BROKERPORT);
		
		// - connect to the broker
		
		client.connect();
		// - create the temperature topic on the broker
		
		
		// - subscribe to the topic
		client.createTopic(Common.TEMPTOPIC);
		
		// - receive messages on the topic
		
		client.subscribe(Common.TEMPTOPIC);
		int i = 0;
		while (i < COUNT) {
			System.out.println("Displaying: " + client.receive());
			i++;
		}
		// - unsubscribe from the topic
		client.unsubscribe(Common.TEMPTOPIC);
		// - disconnect from the broker
		
		// TODO - END
		
		System.out.println("Display stopping ... ");
		
		
	}
}
