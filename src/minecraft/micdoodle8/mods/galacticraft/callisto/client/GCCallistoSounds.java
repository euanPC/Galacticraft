package micdoodle8.mods.galacticraft.callisto.client;

import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;

/**
 * Copyright 2012-2013, micdoodle8
 * 
 *  All rights reserved.
 *
 */
public class GCCallistoSounds
{
    @ForgeSubscribe
    public void onSound(SoundLoadEvent event)
    {
        try
        {
        }
        catch (final Exception e)
        {
            System.err.println("[GCCallisto] Failed to register one or more sounds.");
        }
    }
}