/*******************************************************************************
 * Copyright (c) 2014 Yann-Gaël Guéhéneuc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors:
 *     Yann-Gaël Guéhéneuc - Initial API and implementation for CSE3009 W14
 ******************************************************************************/
package kr.ac.yonsei.it.cse3009;

import java.util.Arrays;
import java.util.List;
import kr.ac.yonsei.it.cse3009.sort.ISort;
import kr.ac.yonsei.it.cse3009.sort.impl.Factory;

public class Client {
	public static void main(final String[] args) {
		final List<String> l =
			Arrays.asList(new String[] { "Rick Deckard", "Roy Batty",
					"Harry Bryant", "Hannibal Chew", "Gaff", "Holden",
					"Leon Kowalski", "Taffey Lewis", "Pris", "Rachael",
					"J.F. Sebastian", "Dr. Eldon Tyrell", "Zhora", "Hodge",
					"Mary" });

		// If InsertionSort is "public".
		//	final InsertionSort<String> s1 = new InsertionSort<String>();
		//	System.out.println(s1.sort(l));

		final ISort<String> s2 = new Factory().getSortAlgorithm();
		System.out.println(s2.sort(l));
	}
}
