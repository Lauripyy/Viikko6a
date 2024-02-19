package main;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class App implements Serializable{
    public static void main( String[] args ) {

        
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
    
        boolean exit = false;
    

        while(!exit) {
            System.out.println("1) Luo uusi kulkuneuvo, 2) Listaa kulkuneuvot 3) Aja autoja, 4) Lennä lentokoneita, 5) Seilaa laivoja, 0) Lopeta ohjelma");

            if(sc.hasNextLine()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch(i) {
                    case 1:
                        System.out.println("Minkä kulkuneuvon haluat rakentaa? 1) Auto, 2) Lentokone, 3) Laiva");
                        if(sc.hasNextLine()) {
                            int j = 0;
                            String stringInput2 = sc.nextLine();
                            j = Integer.parseInt(stringInput2);

                            System.out.println("Anna kulkuneuvon valmistaja:");
                            String manufacturer = sc.nextLine();
                            System.out.println("Anna kulkuneuvon malli:");
                            String model = sc.nextLine();
                            System.out.println("Anna kulkuneuvon huippunopeus:");
                            String maxSpeedString = sc.nextLine();
                            int maxSpeed = Integer.parseInt(maxSpeedString);
                            switch(j) {
                                case 1:
                                    vehicles.add(new Car(manufacturer,model,maxSpeed));
                                    break;
                                case 2:
                                    vehicles.add(new Plane(manufacturer,model,maxSpeed));
                                    break;
                                case 3:
                                    vehicles.add(new Ship(manufacturer,model,maxSpeed));
                                    break;
                                

                            }
                            

                        }
                        break;
                    case 2:
                        for(Vehicle vehicle: vehicles){
                            System.out.println(vehicle.getType()+": "+vehicle.getManufacturer()+" "+vehicle.getModel());
                            System.out.println("Moottori: " +vehicle.getEngine().getName()+" "+vehicle.getEngine().getPower()+"kW");
                            System.out.println("Huippunopeus: "+vehicle.getMaxSpeed()+"km/h");
                            System.out.println("");
                        }
            
                        break;
                    case 3:
                        for(Vehicle vehicle: vehicles){
                            if (vehicle instanceof Car) {
                                ((Car) vehicle).drive();
                            }
                        }
                        
                        break;
                    case 4:
                        for(Vehicle vehicle: vehicles){
                            if (vehicle instanceof Plane) {
                                ((Plane) vehicle).fly();
                            }
                        }
                        
                        break;


                    case 5:
                        for(Vehicle vehicle: vehicles){
                            if (vehicle instanceof Ship) {
                                ((Ship) vehicle).sail();
                            }
                        }
                        break;
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Syöte oli väärä");
                        break;

                }
            }

        }
    sc.close();

    }
    
}
