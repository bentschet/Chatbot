package chat.controller;

import chat.model.Chatbot;
import chat.view.ChatViewer;

public class ChatbotController
{
	private Chatbot stupidBot;
	private ChatViewer chatView;
	
	public ChatbotController()
	{
		stupidBot = new Chatbot("DMQ");
		chatView = new ChatViewer();
	}
	
	public void start()
	{
		String response = chatView.collectResponse("What do you want to talk about today?");
		
		while(stupidBot.lengthChecker(response))
		{
			chatView.displayMessage(useChatbotCheckers(response));
			response = chatView.collectResponse("Oh, you are interested in " + response);
		}
	}
	
	private String useChatbotCheckers(String input)
	{
		String answer = "";
		
		if(stupidBot.contentChecker(input))
		{
			answer +="\nYou know my special secret\n";
		}
		
	    if(stupidBot.memeChecker(input))
	    {
	    	answer += "\nNice meme, buddy\n";
	    }
	    
	    if(input.length() == 0)
	    {
	    	answer += "Sorry, I don't know about " + input;
	    }
		return answer;
	}
}
