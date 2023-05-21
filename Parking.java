public class Parking {
    
private byte freePlaces;
private Car place1A;
private Car place1B;
private Car place1C;
private Car place2A;
private Car place2B;
private Car place2C;

//HW1: 
public Parking() {
    this.freePlaces = 6;
}
public byte getFreePlaces() {
   return freePlaces;
}     
public void setFreePlaces(byte freePlaces){
    this.freePlaces = freePlaces;
}

//HW2/3:
public void parkCar(Car c,String place){
if (place1A == null && place.equals("1A" )){
    place1A = c;
    System.out.println("The car has been succesfully parked!\n"+"Parking place: " +place+"");
    freePlaces --;
    System.out.println("Remaining free places: "+ freePlaces +"\n"); 

} else if (place2A == null && place.equals("2A" )){
    place2A = c;
    System.out.println("The car has been succesfully parked!\n"+"Parking place: " +place );
    freePlaces --;
    System.out.println("Remaining free places: "+ freePlaces +"\n"); 

} else if (place1B == null && place.equals("1B" )){
    place1B = c;
    System.out.println("The car has been succesfully parked!\n"+"Parking place: " +place );
    freePlaces --;
    System.out.println("Remaining free places: "+ freePlaces+"\n"); 

} else if (place2B == null && place.equals("2B" )){
    place2B = c;
    System.out.println("The car has been succesfully parked!\n"+"Parking place: " +place );
    freePlaces --;
    System.out.println("Remaining free places: "+ freePlaces+"\n"); 

} else if (place1C == null && place.equals("1C" )){
    place1C = c;
    System.out.println("The car has been succesfully parked!\n"+"Parking place: " +place );
    freePlaces --;
    System.out.println("Remaining free places: "+ freePlaces+"\n"); 

} else if (place2C == null && place.equals("2C" )){
    place2C = c;
    System.out.println("The car has been succesfully parked!\n"+"Parking place: " +place );
    freePlaces --;
    System.out.println("Remaining free places: "+ freePlaces+"\n"); 

} else {
    System.out.println("\n"+place + " is busy, try another one. " );
} 
  if (freePlaces == 0){
    System.out.println("There is no more free places");
}
}  
//HW:4
public String toString() {
    String out =
        "-----------------------\n" +
        "| " + getCarString(place1A) + " | " + getCarString(place1B) + " |\n" +
        "-----------------------\n" +
        "-----------------------\n" +
        "| " + getCarString(place2A) + " | " + getCarString(place2B) + " |\n" +
        "-----------------------\n" +
        "-----------------------\n" +
        "| " + getCarString(place1C) + " | " + getCarString(place2C) + " |\n" +
        "-----------------------\n";
    return out;
}


private String getCarString(Car car) {
    if (car == null) {
        return "    0   ";
    } else {
        return car.print();
    }
}
} 


   




