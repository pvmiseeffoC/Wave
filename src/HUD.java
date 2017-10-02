import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class HUD {
	public static float HEALTH=100;
	private int greenValue=255;
	private int score=0;
	private int level=1;
	
	public void tick() {
		HEALTH=Base.clamp(HEALTH,0,100);
		greenValue=(int)Base.clamp(greenValue, 0, 255);
		greenValue=(int)HEALTH*2;
		
		score++;
		
	}
	public void render(Graphics g) {
		g.setColor(Color.gray);
		g.fillRect(15,15,300, 32);
		g.setColor(new Color(55,greenValue,0));
		g.fillRect(15,15,3*(int)HEALTH, 32);
		g.setColor(Color.red);
		g.drawRect(15,15,3*(int)HEALTH, 32);
		g.setFont(new Font("Verdana", Font.PLAIN,14));
		g.drawString("Score: "+score,15,64);
		g.drawString("Level: "+level,15,80);
		
	}
	
	public int getScore() {
		return score;
	}
	public int getLevel() {
		return level;
	}
	public void setScore(int score) {
		this.score=score;
	}
	public void setLevel(int level) {
		this.level=level;
	}
}

