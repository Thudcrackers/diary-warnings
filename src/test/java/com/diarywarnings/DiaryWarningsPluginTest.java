package com.diarywarnings;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class DiaryWarningsPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(DiaryWarningsPlugin.class);
		RuneLite.main(args);
	}
}