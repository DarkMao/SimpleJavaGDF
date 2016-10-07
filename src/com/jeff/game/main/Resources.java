package com.jeff.game.main;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;

public class Resources {
	
	public static BufferedImage welcome, iconimage;
	
	public static void load(){
		// To-do
	}
	
	public static AudioClip loadSound(String filename){
		URL fileURL = Resources.class.getResource("/resources/" + filename);
		return Applet.newAudioClip(fileURL);
	}
	
	public static BufferedImage loadImage(String filename){
		BufferedImage img = null;
		try {
		img = ImageIO.read(Resources.class.getResourceAsStream("/resources/" + filename));
		} catch(Exception e){
			System.out.println("Error while reading: " + filename);
			e.printStackTrace();
		}
		return img;
	}
}
