package net.amigocraft.pore.implementation.conversations;

import org.bukkit.conversations.Conversation;
import org.bukkit.conversations.ConversationCanceller;
import org.bukkit.conversations.ConversationContext;

public class PoreConversationCanceller implements ConversationCanceller {

	// TODO: Bridge
	
	@Override
	public void setConversation(Conversation conversation) {
		
	}

	@Override
	public boolean cancelBasedOnInput(ConversationContext context, String input) {
		return false;
	}


    public ConversationCanceller clone() {
    	return null;
    }
	
}
