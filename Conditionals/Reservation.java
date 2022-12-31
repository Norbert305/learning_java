public class Reservation {

    //my instance feilds
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;
    
    //my constructor 
    public Reservation(int count, int capacity, boolean open) {
      if (count < 1 || count > 8) {
        System.out.println("Invalid reservation!");
      }
      guestCount = count;
          restaurantCapacity = capacity;
          isRestaurantOpen = open;
    }  
        //remember void means your not returning anything
          //additional method works like a function. can be called in the main method below.
    public void confirmReservation() {
      if (restaurantCapacity >= guestCount && isRestaurantOpen) {
        System.out.println("Reservation confirmed");
        isConfirmed = true;
      } else {
        System.out.println("Reservation denied");
              isConfirmed = false;
      }
    }
    //remember void means your not returning anything
    //additional method works like a function. can be called in the main method below.
    public void informUser() {
      if (!isConfirmed) {
        System.out.println("Unable to confirm reservation, please contact restaurant.");
      } else {
        System.out.println("Please enjoy your meal!");
      }
    }
    //main method. Works with constructor above and created methods that as functions
    public static void main(String[] args) {
        //new instances being called inside of the main
      Reservation partyOfThree = new Reservation(3, 12, true);
      Reservation partyOfFour = new Reservation(4, 3, true);
      partyOfThree.confirmReservation();
      partyOfThree.informUser();
      partyOfFour.confirmReservation();
      partyOfFour.informUser();
    }
  }