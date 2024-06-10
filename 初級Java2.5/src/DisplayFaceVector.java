import java.util.Vector;
public class DisplayFaceVector extends MyFrame{
	public void run() {
		
				
				Vector<Car>cars = new Vector<Car>();
				cars.add(new Car(50,60,1,0));
				cars.add(new Car(50,120,2,0));
				cars.add(new Car(50,180,3,0));
				cars.add(new Car(50,240,4,0));
				cars.add(new Car(50,300,5,0));
				
				int cnt = 0;
				while(true)
				{	
					cnt++;
					clear();
					for(int j = 0; j < cars.size(); j++) {
						cars.get(j).draw(this);
						cars.get(j).move(this);
					}
					sleep(0.1);
				}
			}
		 
	{
		 
		
			int x,y,vx,vy;
			public Car(int x, int y, int vx, int vy) {
				this.x = x;
				this.y = y;
				this.vx = vx;
				this.vy = vy;
			}
			public void draw(MyFrame frame) {
				frame.fillRect(x + 15,y,40,20);
				frame.fillRect(x,y + 20,70,15);
				frame.fillOval(x + 10,y + 35,20,20);
				frame.fillOval(x + 40,y + 35,20,20);
			}
			public void move(MyFrame frame) {
				x += vx;
				y += vy;
			}
		
		 
				
			}
		
	}
