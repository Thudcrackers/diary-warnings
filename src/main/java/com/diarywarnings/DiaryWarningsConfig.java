package com.diarywarnings;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("diarywarnings")
public interface DiaryWarningsConfig extends Config
{

	@ConfigItem(
			keyName = "highlightObjects",
			name = "Highlight game objects?",
			description = "Toggles outlines on game objects in the world that would complete a task"
	)
	default boolean highlightObjects() { return true; }
}
