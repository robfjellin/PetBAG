public class Pet {

    private String petType;

    private String petName;

    private int petAge;

    private int dogSpaces;

    private int catSpaces;

    private int daysStay;

    private double amountDue;

   

    public Pet() {
    }

   

    public void setPetType(String type) {

        petType = type;

    }

   

    public void setPetName(String name) {

        petName = name;

    }

   

    public void setPetAge(int age) {

        petAge = age;

    }

   

    public void setDogSpaces(int dogSpace) {

        dogSpaces = dogSpace;

    }

   

    public void setCatSpaces(int catSpace) {

        catSpaces = catSpace;  

    }

   

    public void setDaysStay(int days) {

        daysStay = days;

    }

   

    public void setAmountDue(double amount) {

        amountDue = amount;

    }

   

    public String getPetType() {

        return petType;

    }

   

    public String getPetName() {

        return petName;

    }

   

    public int getPetAge() {

        return petAge;

    }

   

    public int getDogSpaces() {

        return dogSpaces;

    }

   

    public int getCatSpaces() {

        return catSpaces;

    }

   

    public int getDaysStay() {

        return daysStay;

    }

   

    public double getAmountDue() {

        return amountDue;

    }

}

