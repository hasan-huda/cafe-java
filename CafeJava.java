public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffeePrice = 4.1;
        double lattePrice = 4.6;
        double cappuccinoPrice = 5.2;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        System.out.println(customer1+pendingMessage);
        System.out.println(customer4+readyMessage+displayTotalMessage+cappuccinoPrice);
        System.out.println(customer2+", "+displayTotalMessage+(2*lattePrice));
        System.out.println(isReadyOrder2?customer2+readyMessage:customer2+pendingMessage);
        System.out.println(customer3+", "+displayTotalMessage+(lattePrice-dripCoffeePrice));
    }
}
