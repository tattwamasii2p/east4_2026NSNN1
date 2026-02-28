package org.east4.helpful_assistant.psyche;

import java.util.List;

import org.east4.avatar.SoftwareCreatureAvatar;
import org.east4.helpful_assistant.brain.Brain;
import org.east4.helpful_assistant.psyche.will.Will;

public interface Psyche {
	Will getWill();
	List<Fantasy> getFantasies();
	Brain getLocalSubBrain();
	List<Psyche> getSubidentitiesForAvatar(SoftwareCreatureAvatar avatar);
	List<SoftwareCreatureAvatar> getAvatars();
	List<Psyche> getSuperidentitiesForAvatar(SoftwareCreatureAvatar avatar);
}
