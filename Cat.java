import java.util.Arrays;

public class Cat extends Pet {
		
		public static boolean[] catSpaceAvailable = new boolean[11];
		
		// Initialize all cat spaces as available
		static {
			Arrays.fill(catSpaceAvailable, true);
		}

	
        private int catSpaceNumber;
        
        public Cat(String petName, int petAge, int daysStay, int catSpaceNumber, double amountDue) {
            setPetName(petName);
            setPetAge(petAge);
            setDaysStay(daysStay);     
            this.catSpaceNumber = catSpaceNumber;
            setAmountDue(amountDue);
        }
        
        public void setCatSpaceNumber(int spaceNumber) {
            catSpaceNumber = spaceNumber;
        }
        
        public int getCatSpaceNumber() {
            return catSpaceNumber;
        }
        
        public String toString() {
        	return "Station #: " + getCatSpaceNumber() + 
        	"\nAmount due: $" + getAmountDue();
        }
    }