package com.rakuten.Spring_Boot_Message;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/messages")
public class MessageController {
	
	@Autowired
	private MessageService message_list;
	
	
	
	@RequestMapping
	public List<Message> display() {
		return message_list.getMessage();
	}
	
	@RequestMapping("/msg/{msgid}")
	public Message getmsg(@PathVariable int msgid) {
		
		List<Message> list = message_list.getMessage();
		return list.stream().filter(p->p.getId()==msgid).findFirst().get();

}
	
	@RequestMapping("/from/{sender}")
	public List<Message> getfrom(@PathVariable String sender) {
		
		List<Message> list = message_list.getMessage();
		List<Message> l = list.stream().filter(p->p.getFrom().equals(sender)).collect(Collectors.toList());
        return l;
}
	
	@RequestMapping("/from/date/{date}")
	public List<Message> getfromdate(@PathVariable String date) {
		
		List<Message> list = message_list.getMessage();
		List<Message> l = list.stream().filter(p->p.getDate().equals(date)).collect(Collectors.toList());
        return l;
}
	
	@RequestMapping("/{from}/date/{date}")
	public List<Message> getmsgfromdate(@PathVariable String from,@PathVariable String date) {
		
		List<Message> list = message_list.getMessage();
		List<Message> l = list.stream().filter(p->p.getFrom().equals(from) && p.getDate().equals(date)).collect(Collectors.toList());
        return l;
}
}