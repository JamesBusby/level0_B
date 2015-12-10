package level0_B;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {
		/*
		 * 1. Ask the user which animal they want, then play the sound of that
		 * animal.
		 */

			for (int i = 0; i < 5; i++) {
				String animal = JOptionPane.showInputDialog(null, "what is your favorite animal?, p.s Llamas and bananas are AWESOME!!");	
			
		if(animal .equalsIgnoreCase("llama"))
		{
			playNoise(llamaFile);
			
		}
		else if(animal .equalsIgnoreCase("banana"))
		{
			playNoise(llamaFile);
		}
		else if(animal .equalsIgnoreCase("cow"))
		{
			playNoise(mooFile);
		}
		else if(animal .equalsIgnoreCase("dog"))
		{
			playNoise(woofFile);
		}
		else if(animal .equalsIgnoreCase("duck"))
		{
			playNoise(quackFile);
		}
		/* 2. Make it so that the user can keep entering new animals. */
	}
	}
	void playMoo() {
		playNoise(mooFile);
	}

	void playllama() {
		playNoise(llamaFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}

	  String quackFile = "/Users/League/Google Drive/league-sounds/quack.wav";
	String mooFile = "/Users/League/Google Drive/league-sounds/moo.wav";
	String woofFile = "/Users/League/Google Drive/league-sounds/woof.wav";
	String meowFile = "/Users/League/Google Drive/league-sounds/meow.wav";
	String llamaFile = "/Users/League/Google Drive/league-sounds/llama.wav";


	/* Ignore this stuff */

	public void playNoise(String soundFile) {
    	try {
   		 AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundFile));
   		 Clip clip = AudioSystem.getClip();
   		 clip.open(audioInputStream);
   		 clip.start();
   		 Thread.sleep(3400);
    	} catch (Exception ex) {
        	ex.printStackTrace();
    	}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}

}

