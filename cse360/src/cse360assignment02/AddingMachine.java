/*
 * Jovita Chauvin
 * October 5, 2020
 * CSE360 - Assignment 2
 */

package cse360assignment02;

public class AddingMachine
{
	private int total;
	StringBuffer past = new StringBuffer();
	
	/**
	 * Constructor
	 * sets total to 0 
	 * adds beginning of past string to 0 
	 */
	public AddingMachine() 
	{
		total = 0;  // not needed - included for clarity
		past.append(0);
	}
  
	/**
	 * method gets the current total
	 * @return the current total
	 */
	public int getTotal()
	{
		return total;
	}
  
	/**
	 * method adds the a value to the total value
	 * @param value  the integer added to total 
	 */
	public void add (int value)
	{
		//appends the value and addition sign to end of "past" string
		past.append(" " + "+" + " " + value);
		
		//adds value to total
		total =  value + total;
	}
		
	/**
	 * method dubtracts value from total value
	 * @param value  the integer subtracted from total
	 */
	public void subtract (int value)
	{
		//appends the value and minus sign to end of "past" string
		past.append(" " + "-" + " " + value);
		
		//subtracts value from total
		total = value - total; 
	}

	/**
	 * method returns a string that has been appended from previous methods
	 * @return string with history of the transactions
	 */
	public String toString () 
	{
		//Initializes string
		String record = " ";
		
		//gets appended string history 
		record = past.toString();
		
		//returns the record of history
		return record;
	}

	/**
	 * clears the "history" that was appended in previous methods
	 */
	public void clear() 
	{
		//deletes the "past" string starting at index 1
		//keeps starting zero
		past.delete(1, past.length());
	}
}