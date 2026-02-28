package org.east4.helpful_assistant.psyche.will;

import java.util.List;

import org.east4.helpful_assistant.psyche.will.desires.Desire;

public interface Will {
	List<Desire> getDesires();
	void addDesire(Desire desire);
	void removeDesire(Desire desire);
}
