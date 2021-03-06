package bullshit_paper;

import java.util.LinkedList;
import java.util.List;

public class TVSchedule {
	private String day;
	private List<TVChannel> channels = new LinkedList<TVChannel>();
	
	public TVSchedule(String day){
		this.day = day;
	}
	
	public void addChannel(String name){
		TVChannel channel = new TVChannel(name);
		channel.build();
		channels.add(channel);
	}
	
	public List<TVChannel> getChannels(){
		return channels;
	}
	
	public String getDay(){
		return day;
	}
	
}
