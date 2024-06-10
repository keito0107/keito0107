
public class Car2 {
int x,y,vx,vy;
public Car2(int x,int y,int vx,int vy ) {
	this.x=x;
	this.y=y;
	this.vx=vx;
	this.x=vy=vy;
}
public void draw(MyFrame frame) {
	frame.fillRect(x+20, y, 40, 20);
	frame.fillRect(x, y+20, 80, 20);
	frame.fillRect(x+10, y+40,20, 20);
	frame.fillRect(x+50, y+40,20, 20);
}
public void move() {
	x+=vx;
	y+=vy;
}
}
