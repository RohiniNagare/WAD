public class Car implements Vehicles{
private int speed;int gear;
public int getspeed(){
return this.speed;
}
public void setspeed(int speed){
this.speed = speed;
}
public void Speed_Up(int increment){
speed = speed+increment;
}
public void Gear_Change(int change){
gear = change;
}
public void Apply_Break(){
speed=speed-speed;
}
public void Display(){
System.out.println("\n\nCar Status");
System.out.println("Speed of the Car is = "+speed+"km/hr");
System.out.println("Gear of the Car is = "+gear);
}
}

