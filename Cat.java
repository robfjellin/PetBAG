public class Cat extends Pet {
        
        private int catSpaceNumber;
        
        public Cat(String petName, int petAge, int catSpaces, int daysStay, double amountDue, int catSpaceNumber) {
            setPetName(petName);
            setPetAge(petAge);
            setDaysStay(daysStay);      	
        }
        
        public void setCatSpaceNumber(int spaceNumber) {
            catSpaceNumber = spaceNumber;
        }
        
        public int getCatSpaceNumber() {
            return catSpaceNumber;
        }
    }