public class Bike implements Vehicles{
private int speed;
int gear;
public void setspeed(int speed){
this.speed = speed;
}
public int getspeed(){
return this.speed;
}public void Speed_Up(int increment){
speed=speed+increment;
}
public void Gear_Change(int change){
gear = change;
}
public void Apply_Break(){
speed=speed-speed;
}
public void Display(){
System.out.println("\n\nBike Status");
System.out.println("Speed of the Bike is = "+speed+"km/hr");
System.out.println("Gear of the Bike is = "+gear);
}
}
