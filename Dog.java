public class Dog extends Pet {
    private int dogSpaceNumber;
    private int dogWeight;
    private boolean grooming;
    
    // Constructor
    public Dog(String petName, int petAge, int dogSpaces, int daysStay, 
    		double amountDue, int dogSpaceNumber, int dogWeight, boolean grooming) {
        setPetName(petName);
        setPetAge(petAge);
        setDogSpaces(dogSpaces);
        setDaysStay(daysStay);
        setAmountDue(amountDue);
        this.dogSpaceNumber = dogSpaceNumber;
        this.dogWeight = dogWeight;
        this.grooming = grooming;
    }
    
    // Setters
    public void setDogSpaceNumber(int number) {
        dogSpaceNumber = number;
    }
    
    public void setDogWeight(int weight) {
        dogWeight = weight;
    }
    
    public void setGrooming(boolean groom) {
        grooming = groom;
    }
    
    // Getters
    public int getDogSpaceNumber() {
        return dogSpaceNumber;
    }
    
    public int getDogWeight() {
        return dogWeight;
    }
    
    public boolean getGrooming() {
        return grooming;
    }
    

}