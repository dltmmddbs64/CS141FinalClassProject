/**
 * CS 141: Introduction to Programming and Problem Solving
 * Professor: Edwin Rodríguez
 *
 * Programming Assignment #Final (Group Project)
 *
 * <description-of-assignment>
 *
 * Team Liquid 
 *   <Anthony Vu, Victor Darkes, Seungyun Lee, Jeffrey Lee>
 */

package edu.cpp.cs.cs141.prog_assgmnt_final;

import java.io.Serializable;

/**
 * This class represents a power-up called Invincibility. It extends GameEntity
 * class and it uses a super constructor to assign initial values of front,
 * back, row, column of the Invincibility.
 */
public class Invincibility extends GameEntity implements Serializable {

	/**
	 * 
	 * A super constructor for the class. It allows to set initial values for
	 * front, back, row, column.
	 * 
	 */
	public Invincibility() {
		super("I", "*", 0, 0);
	}

	/**
	 * The player will be invincible for 5 turns. The initial value is 6 because
	 * as soon as the player consumes it, it goes down by 1.
	 * 
	 */
	private int numberOfTurns = 6;

	/**
	 * 
	 * This method counts down the invincible turns. + *
	 */
	public void countingTurn() {
		--numberOfTurns;
	}

	/**
	 * This method returns how many invincible turns are left.
	 * 
	 * @return the numberOfTurns that the player is invincible
	 */
	public int getNumberOfTurns() {
		return numberOfTurns;
	}

	/**
	 * This method sets new value for the numberOfTurns field after the player
	 * takes a turn.
	 * 
	 * @param numberOfTurns
	 *            The new value of numberOfTurns after the player consumes the
	 *            invincibility and takes a turn.
	 */
	public void setNumberOfTurns(int numberOfTurns) {
		this.numberOfTurns = numberOfTurns;
	}

}
