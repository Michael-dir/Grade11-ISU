//Michael Demidov

import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //ArrayLists
        ArrayList<String> serviceNames = new ArrayList<>();
        ArrayList<String> serviceCategories = new ArrayList<>();
        ArrayList<String> serviceRates = new ArrayList<>();
        ArrayList<Boolean> serviceAvailabilities = new ArrayList<>();
        ArrayList<String> cartServices = new ArrayList<>();
        ArrayList<String> cartRates = new ArrayList<>();
        while (true) {

            // Displaying the main 2 options
            System.out.println("Please select one option:");
            System.out.println("Add a Service (1)");
            System.out.println("Book a Service (2)");
            System.out.println("Exit (3)");

            //First option (Add a service)
            int service = sc.nextInt();
            if (service == 1) {
                System.out.println("Please select one option");
                System.out.println("Service Name (1)");
                System.out.println("Category (2)");
                System.out.println("Hourly Rate (3)");
                System.out.println("Back to Main Menu (4)");

                //Adding service
                int serviceAdd = sc.nextInt();
                if (serviceAdd == 1) {
                    System.out.println();
                    System.out.println("Please state the name of the service");
                    String serviceName = sc.next();
                    serviceNames.add(serviceName);
                    serviceAvailabilities.add(true);
                    System.out.println("Service added successfully");
                } else if (serviceAdd == 2) {
                    System.out.println("please state the service category");
                    String serviceCategory = sc.next();
                    serviceCategories.add(serviceCategory);
                    System.out.println("Category added successfully");
                } else if (serviceAdd == 3) {
                    System.out.println("Please state the hourly rate of the service");
                    String serviceRate = sc.next();
                    serviceRates.add(serviceRate);
                    System.out.println("Hourly rate added successfully");
                } else if (serviceAdd == 4) {
                    continue;
                } else {
                    System.out.println("invalid character please enter a number 1 to 4");
                }

                //Second option (Book a service)
            } else if (service == 2) {
                System.out.println("Available Categories:");
                System.out.println("Electrical (1)");
                System.out.println("IT support (2)");
                System.out.println("Cleaning (3)");
                System.out.println();
                System.out.println("View Cart (4)");
                System.out.println("Checkout (5)");
                System.out.println("Back to Main Menu (6)");
                int category = sc.nextInt();
                if (category == 1) {
                    System.out.println("Available Electrical Services:");
                    System.out.println("Outlet Installation (1)");
                    System.out.println("Switch Installation (2)");
                    System.out.println("Installing Wiring (3)");
                    System.out.println();
                    System.out.println("Back to Categories (4)");
                    int electricalCategory = sc.nextInt();
                    if (electricalCategory == 1) {
                        System.out.println("Outlet Installation added to cart");
                        cartServices.add("Outlet Installation");
                        cartRates.add("56");
                    } else if (electricalCategory == 2) {
                        System.out.println("Switch Installation added to cart");
                        cartServices.add("Switch Installation");
                        cartRates.add("42");
                    } else if (electricalCategory == 3) {
                        System.out.println("Installing Wiring added to cart");
                        cartServices.add("Installing Wiring");
                        cartRates.add("60");
                    } else if (electricalCategory == 4) {
                        continue;
                    } else {
                        System.out.println("invalid character please enter a number 1 to 4");
                    }
                }

                //Second option of (Book a service)
                else if (category == 2) {
                    System.out.println("Available IT Support Services:");
                    System.out.println("Network Setup (1)");
                    System.out.println("Software Installation (2)");
                    System.out.println("Data Wipe (3)");
                    System.out.println();
                    System.out.println("Back to Categories (4)");
                    int techCategory = sc.nextInt();
                    if (techCategory == 1) {
                        System.out.println("Network Setup added to cart");
                        cartServices.add("Network Setup");
                        cartRates.add("73");
                    } else if (techCategory == 2) {
                        System.out.println("Software Installation added to cart");
                        cartServices.add("Software Installation");
                        cartRates.add("46");
                    } else if (techCategory == 3) {
                        System.out.println("Data Wipe added to cart");
                        cartServices.add("Data Wipe");
                        cartRates.add("54");
                    } else if (techCategory == 4) {
                        continue;
                    } else {
                        System.out.println("invalid character please enter a number 1 to 4");
                    }
                }

                //Third option of (Book a service)
                else if (category == 3) {
                    System.out.println("Available Cleaning Services:");
                    System.out.println("Floor (1)");
                    System.out.println("Furniture (2)");
                    System.out.println("Window (3)");
                    System.out.println();
                    System.out.println("Back to Categories (4)");
                    int cleanCategory = sc.nextInt();
                    if (cleanCategory == 1) {
                        System.out.println("Floor Cleaning added to cart");
                        cartServices.add("Floor Cleaning");
                        cartRates.add("31");
                    } else if (cleanCategory == 2) {
                        System.out.println("Furniture Cleaning added to cart");
                        cartServices.add("Furniture Cleaning");
                        cartRates.add("32");
                    } else if (cleanCategory == 3) {
                        System.out.println("Window Cleaning added to cart");
                        cartServices.add("Window Cleaning");
                        cartRates.add("24");
                    } else if (cleanCategory == 4) {
                        continue;
                    } else {
                        System.out.println("invalid character please enter a number 1 to 4");
                    }
                }

                //Cart
                else if (category == 4) {
                    System.out.println("Your Cart:");
                    for (int i = 0; i < cartServices.size(); i++) {
                        System.out.println((i+1) + ". " + cartServices.get(i) + " - $" + cartRates.get(i) + " per hour");
                    }
                    System.out.println("Remove Item (1)");
                    System.out.println("Back to Categories (2)");
                    int cartOption = sc.nextInt();
                    if (cartOption == 1) {
                        System.out.println("Enter item number to remove:");
                        int removeItem = sc.nextInt();
                        if (removeItem > 0 && removeItem <= cartServices.size()) {
                            cartServices.remove(removeItem-1);
                            cartRates.remove(removeItem-1);
                            System.out.println("Item removed successfully");
                        } else {
                            System.out.println("Invalid item number");
                        }
                    }
                }

                //Total
                else if (category == 5) {
                    System.out.println("Invoice:");
                    double total = 0;
                    for (int i = 0; i < cartServices.size(); i++) {
                        System.out.println(cartServices.get(i) + " - $" + cartRates.get(i) + " per hour");
                        total += Double.parseDouble(cartRates.get(i));
                    }
                    System.out.println("Total: $" + total);
                    System.out.println("Confirm Order (1)");
                    System.out.println("Cancel (2)");

                    int confirm = sc.nextInt();
                    if (confirm == 1) {
                        System.out.println("Order confirmed");
                    }
                }
                else if (category == 6) {
                    continue;
                }
                else {
                    System.out.println("invalid character please enter a number 1 to 6");
                }
            }
            else if (service == 3) {
                System.out.println("Thank you for using this service");
                break;
            }
            else {
                System.out.println("invalid character please enter a number 1 to 3");
            }
        }
    }
}