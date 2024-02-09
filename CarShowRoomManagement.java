package project;
import java.util.*;
interface Utility{
    public void get_details();
    public void set_details();
}

	 class Showroom implements Utility{
	    String showroom_name;
	    String showroom_address;
	    int total_employees;
	    int total_cars_in_stock = 0;
	    String manager_name;

	    @Override
	    public void get_details() {
	        System.out.println("Showroom Name: "+showroom_name);
	        System.out.println("Showroom Address: "+showroom_address);
	        System.out.println("Manager Name: "+manager_name);
	        System.out.println("Total Employees: "+total_employees);
	        System.out.println("Total Cars In Stock: "+total_cars_in_stock);

	    }
	    @Override
	    public void set_details(){
	        Scanner sc = new Scanner(System.in);
	        System.out.println("======================= *** ENTER SHOWROOM DETAILS *** =======================");
	        System.out.println();
	        System.out.print("SHOWROOM NAME: ");
	        showroom_name = sc.nextLine();
	        System.out.print(("SHOWROOM ADDRESS: "));
	        showroom_address = sc.nextLine();
	        System.out.print("MANAGER NAME: ");
	        manager_name = sc.nextLine();
	        //System.out.print("TOTAL NO OF EMPLOYEES: ");
	        //total_employees = sc.nextInt();
	        //System.out.print("TOTAL CARS IN STOCK: ");
	        //total_cars_in_stock = sc.nextInt();

	    }
	}
	 class Employees extends Showroom implements Utility{
		    String emp_id;
		    String emp_name;
		    int emp_age;
		    String emp_department;
		    int i=1;


		    @Override
		    public void get_details() {
		        System.out.println("ID: "+emp_id);
		        System.out.println("Name: "+emp_name);
		        System.out.println("Age: "+emp_age);
		        System.out.println("Department: "+emp_department);
		        System.out.println("Showroom Name: "+showroom_name);
		        i++;

		    }
		    @Override
		    public void set_details(){
		        Scanner sc = new Scanner(System.in);
		        UUID uuid = UUID.randomUUID();
		        emp_id = String.valueOf(uuid);
		        System.out.println("======================= *** ENTER EMPLOYEE DETAILS *** =======================");
		        System.out.println();
		        System.out.print("EMPLOYEE NAME: ");
		        emp_name = sc.nextLine();
		        System.out.print(("EMPLOYEE AGE: "));
		        emp_age = sc.nextInt();
		        sc.nextLine();
		        System.out.print("EMPLOYEE DEPARTMENT: ");
		        emp_department = sc.nextLine();
		        System.out.print("SHOWROOM NAME: ");
		        showroom_name = sc.nextLine();
		        System.out.print("no .of emp:"+i);
		       


		    }
		}
	 class Cars extends Showroom implements Utility{
		    String car_name;
		    String car_color;
		    String car_fuel_type;
		    int car_price;
		    String car_type;
		    String car_transmission;
		    

		    @Override
		    public void get_details(){
		        System.out.println("NAME: "+car_name);
		        System.out.println("COLOR: "+car_color);
		        System.out.println("FUEL TYPE: "+car_fuel_type);
		        System.out.println("PRICE: "+car_price);
		        System.out.println("CAR TYPE: "+car_type);
		        System.out.println("TRANSMISSION: "+car_transmission);
		        
		    }

		    @Override
		    public void set_details(){
		        Scanner sc = new Scanner(System.in);
		        System.out.println("======================= *** ENTER CAR DETAILS *** =======================");
		        System.out.println();
		        System.out.print("CAR NAME: ");
		        car_name = sc.nextLine();
		        System.out.print(("CAR COLOR: "));
		        car_color = sc.nextLine();
		        System.out.print("CAR FUEL TYPE(PETROL/DIESEL): ");
		        car_fuel_type = sc.nextLine();
		        System.out.print("CAR PRICE: ");
		        car_price = sc.nextInt();
		        sc.nextLine();
		        System.out.print("CAR TYPE(SEDAN/SUV/HATCHBACK): ");
		        car_type = sc.nextLine();
		        System.out.print("TRANSMISSION TYPE(AUTOMATIC/MANUAL): ");
		        car_transmission = sc.nextLine();
		        total_cars_in_stock++;
		    }
		}

public class CarShowRoomManagement {
	 static void main_menu(){
	        System.out.println();
	        System.out.println("======================= *** WELCOME TO SHOWROOM MANAGEMENT SYSTEM *** =======================");
	        System.out.println();
	        System.out.println("=============================== *** ENTER YOUR CHOICE *** ===============================");
	        System.out.println();
	        System.out.println("1].ADD SHOWROOMS \t\t\t 2].ADD EMPLOYEES \t\t\t 3].ADD CARS");
	        System.out.println();
	        System.out.println("4].GET SHOWROOMS \t\t\t 5].GET EMPLOYEES \t\t\t 6].GET CARS");
	        System.out.println();
	        System.out.println("=============================== *** ENTER 0 TO EXIT *** ===============================");

	    }
	
	 
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    Showroom showroom[] = new Showroom[5];
    Employees employee[] = new Employees[5];
    Cars car[] = new Cars[5];
    int car_counter = 0;
    int showroom_counter = 0;
    int employees_counter = 0;
    int choice = 100;
    while(choice!=0){

        main_menu();
        choice = sc.nextInt();

        while(choice!=9 && choice!=0){
            switch (choice) {
                case 1:
                    showroom[showroom_counter] = new Showroom();
                    showroom[showroom_counter].set_details();
                    showroom_counter++;
                    System.out.println();
                    System.out.println("1].ADD NEW SHOWROOM");
                    System.out.println("9].GO BACK TO MAIN MENU");
                    choice = sc.nextInt();
                    break;
                case 2:
                    employee[employees_counter] = new Employees();
                    employee[employees_counter].set_details();
                    employees_counter++;
                    System.out.println();
                    System.out.println("2].ADD NEW EMPLOYEE");
                    System.out.println("9].GO BACK TO MAIN MENU");
                    choice = sc.nextInt();
                    break;
                case 3:
                    car[car_counter] = new Cars();
                    car[car_counter].set_details();
                    car_counter++;
                    System.out.println();
                    System.out.println("3].ADD NEW CAR");
                    System.out.println("9].GO BACK TO MAIN MENU");
                    choice = sc.nextInt();
                    break;
                case 4:
                    for (int i = 0; i < showroom_counter; i++) {
                        showroom[i].get_details();
                        System.out.println();
                        System.out.println();
                    }
                    System.out.println();
                    System.out.println("9].GO BACK TO MAIN MENU");
                    System.out.println("0].EXIT");
                    choice = sc.nextInt();
                    break;
                case 5:
                    for (int i = 0; i < employees_counter; i++) {
                        employee[i].get_details();
                        System.out.println();
                        System.out.println();
                    }
                    System.out.println();
                    System.out.println("9].GO BACK TO MAIN MENU");
                    System.out.println("0].EXIT");
                    choice = sc.nextInt();
                    break;
                case 6:
                    for (int i = 0; i < car_counter; i++) {
                        car[i].get_details();
                        System.out.println();
                        System.out.println();
                    }
                    System.out.println();
                    System.out.println("9].GO BACK TO MAIN MENU");
                    System.out.println("0].EXIT");
                    choice = sc.nextInt();
                    break;
                default:
                    System.out.println("ENTER VALID CHOICE: ");
                    break;
            }
        }
    }	
}
}
