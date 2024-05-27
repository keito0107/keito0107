
public class Animation extends MyFrame{
	public void run() {
		int y=250;
		int x=100;
		while(y>=20) {
			clear();
			setColor(0,128,0);
			fillRect(x,y,10,100);
			y-=5;
			sleep(0.1);
		}
		while(x<=200) {
			clear();
			setColor(0,128,0);
			fillRect(x,y,10,100);
			x+=5;
			sleep(0.1);
		}	
		}
	}
		

