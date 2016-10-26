package chat.model;

import java.util.ArrayList;

/**
 * Base version of the 2015 Chatbot class. Only stub methods are provided. Students will complete methods as part
 * of the project.
 * @author Benjamin Tschetter
 * @version 1.0 10/14/16
 */
public class Chatbot
{
	private ArrayList<String> memesList;
	private ArrayList<String> politicalTopicList;
	private String userName;
	private String content;
	
	/**
	 * Creates an instance of the Chatbot with the supplied username.
	 * @param userName The username for the chatbot.
	 */
	public Chatbot(String userName)
	{
		this.memesList = new ArrayList<String>();
		this.userName = new String(userName);
		this.content = new String("Language");
		this.buildMemesList();
		
	}
	
	private void buildMemesList()
	{
		memesList.add("harambe");
		memesList.add("willy wonka");
		memesList.add("doge");
		memesList.add("cute animals");
		memesList.add("grumpy cat");
		memesList.add("john cena");
		memesList.add("dat boi");
		memesList.add("ken bone");
		memesList.add("illegal memes");
		memesList.add("b0ss");
		memesList.add("look at it go");
		memesList.add("loss comic");
		memesList.add("burself");
		memesList.add("ppap");
		memesList.add("pen pineapple apple pen");
		memesList.add("clickhole");
		memesList.add("long boy");
		memesList.add("kilroy was here");
		memesList.add("skeleton war");
		
	}
	
	private void buildPoliticalTopicsList()
	{
		politicalTopicList.add("election");
		politicalTopicList.add("Democrat");
		politicalTopicList.add("Republican");
		politicalTopicList.add("liberal");
		politicalTopicList.add("conservative");
		politicalTopicList.add("Clinton");
		politicalTopicList.add("Trump");
		politicalTopicList.add("Kaine");
		politicalTopicList.add("Pence");
		politicalTopicList.add("11/8/2016");
		politicalTopicList.add("Stein");
		politicalTopicList.add("Johnson");
		politicalTopicList.add("James Falls");
		politicalTopicList.add("Misty K Snow");
		politicalTopicList.add("Ken Bone");
		politicalTopicList.add("Aleppo");
		politicalTopicList.add("White House");
		politicalTopicList.add("Obama");
	}
	
	/**
	 * Checks the length of the supplied string. Returns false if the supplied String is empty or null,
	 * otherwise returns true. 
	 * @param currentInput
	 * @return A true or false based on the length of the supplied String.
	 */
	public boolean lengthChecker(String currentInput)
	{
		boolean hasLength = false;
		
		if (currentInput != null && currentInput.length() > 0)
		{
			hasLength = true;
		}
		return hasLength;
	}
	
	/**
	 * Checks if the supplied String matches the content area for this Chatbot instance.
	 * @param currentInput The supplied String to be checked.
	 * @return Whether it matches the content area.
	 */
	public boolean contentChecker(String currentInput)
	{
		boolean hasContent = false;
		
		if (currentInput != null && currentInput.contains(content))
		{
			hasContent = true;
		}
		return hasContent;
	}
	
	/**
	 * Checks if supplied String matches ANY of the topics in the politicalTopicsList. Returns
	 * true if it does find a match and false if it does not match.
	 * @param currentInput The supplied String to be checked.
	 * @return Whether the String is contained in the ArrayList.
	 */
	public boolean politicalTopicChecker(String currentInput)
	{
		boolean hasPoliticalTopic = false;
		
		for(int index = 0; index < politicalTopicList.size(); index++)
		{
			if(currentInput.equals(politicalTopicList.get(index)))
			{
				hasPoliticalTopic = true;
			}
		}
		
		return hasPoliticalTopic;
	}
	
	
	/**
	 * Checks to see that the supplied String value is in the current memesList variable.
	 * @param currentInput The supplied String to be checked.
	 * @return Whether the supplied String is a recognized meme.
	 */
	public boolean memeChecker(String currentInput)
	{
		boolean hasMeme = false;
		
		for(int index = 0; index < memesList.size(); index++)
		{
			if(currentInput.equals(memesList.get(index)))
			{
				hasMeme = true;
			}
		}
		
		return hasMeme;
	}
	
	/**
	 * Returns the username of this Chatbot instance.
	 * @return The username of the Chatbot.
	 */
	public String getUserName()
	{
		return null;
	}
	
	/**
	 * Returns the content area for this Chatbot instance.
	 * @return The content area for this Chatbot instance.
	 */
	public String getContent()
	{
		return null;
	}
	
	/**
	 * Getter method for the memesList object.
	 * @return The reference to the meme list.
	 */
	public ArrayList<String> getMemesList()
	{
		return null;
	}
	
	/**
	 * Getter method for the politicalTopicList object.
	 * @return The reference to the political topic list.
	 */
	public ArrayList<String> getPoliticalTopicList()
	{
		return null;
	}
			
	/**
	 * Updates the content area for this Chatbot instance.
	 * @param content The updated value for the content area.
	 */
	public void setContent(String content)
	{
		
	}

	public boolean inputHTMLChecker(String currentInput)
	{
		return false;
	}

	public boolean keyboardMashChecker(String currentInput)
	{
		return false;
	}

	public boolean twitterChecker(String currentInput)
	{
		return false;
	}

	public boolean quitChecker(String currentInput)
	{
		return false;
	}
}
