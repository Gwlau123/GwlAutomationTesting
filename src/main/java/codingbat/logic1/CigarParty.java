package codingbat.logic1;

public class CigarParty {

	/*
	 * When squirrels get together for a party, they like to have cigars. A squirrel
	 * party is successful when the number of cigars is between 40 and 60,
	 * inclusive. Unless it is the weekend, in which case there is no upper bound on
	 * the number of cigars. Return true if the party with the given values is
	 * successful, or false otherwise.
	 * 
	 * cigarParty(30, false) → false cigarParty(50, false) → true
	 * cigarParty(70,true) → true
	 */

	public static void main(String[] args) {
		CigarParty c = new CigarParty();
		System.out.println(c.cigarParty(30, false));
		System.out.println(c.cigarParty(50, false));
		System.out.println(c.cigarParty(70, true));
	}

	public boolean cigarParty(int cigars, boolean isWeekend) {
		// cigar >> 40 - 60 >> party successful
		// cigar >> 40 - infitiny >> party successfull when isWeekend yes (True)

		if (isWeekend) {

			if (cigars >= 40) {
				return true;
			} else {
				return false;
			}

		} else {

			if (cigars >= 40 && cigars <= 60) {
				return true;
			} else {
				return false;
			}

		}
	}
	
	
	public boolean cigarParty1(int cigars, boolean isWeekend) {
		  if (isWeekend) {
		    return (cigars >= 40);
		    // A longer way to write the above line:
		    // if (cigars >= 40) {
		    //   return true;
		    // } else {
		    //   return false;
		    // }
		  } else {
		    return (cigars >= 40 && cigars <= 60);
		  }
		}

}
