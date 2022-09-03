package edu.clayton.csit.antlab.person;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string 
 *
 * @author Qu
 * @version 1.1
 */
public class Person2 {
    /** Holds the persons real name */
    private String name;
	 	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	 public Person2(String pname) {
	   name = pname;
	 }
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
	  //Person 2 put your implementation here
          List<Character>alpha = input.chars().mapToObj(c->(char)c).collect(Collectors.toList());
          StringBuilder ans = new StringBuilder();
          IntStream.range(0,input.length()).forEach((index) -> {
            int rand = new Random().nextInt(alpha.size());
            ans.append(alpha.get(rand));
            alpha.remove(rand);
         });
         return ans.toString();
	}
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}
}
