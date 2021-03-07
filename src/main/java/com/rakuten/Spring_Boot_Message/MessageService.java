package com.rakuten.Spring_Boot_Message;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class MessageService {
	
	private List<Message> messages=new ArrayList<Message>();
	{
		Message m1=new Message(1,"GM bro..","Akshay","01-03-2021");
		Message m2=new Message(2,"India won bro ..","Ali","01-03-2021");
		Message m3=new Message(3,"Going College ...","Arun","02-03-2021");
		Message m4=new Message(4,"Congrats bro ..","Akshay","02-03-2021");
		Message m5=new Message(5,"Bro Send code ..","Ali","02-03-2021");
		Message m6=new Message(6,"Lets go to movie ..","Ali","02-03-2021");
		Message m7=new Message(7,"Thats great ..","Akshay","03-03-2021");
		Message m8=new Message(8,"Got to go bro ..","Arun","04-03-2021");
		Message m9=new Message(9,"Call me ..","Akshay","04-03-2021");
		Message m10=new Message(10,"Lets play crciket..","Ali","04-03-2021");
		messages.add(m1);
		messages.add(m2);
		messages.add(m3);
		messages.add(m4);
		messages.add(m5);
		messages.add(m6);
		messages.add(m7);
		messages.add(m8);
		messages.add(m9);
		messages.add(m10);
		
	}

	public List <Message> getMessage(){
	  return this.messages;
	}
	}