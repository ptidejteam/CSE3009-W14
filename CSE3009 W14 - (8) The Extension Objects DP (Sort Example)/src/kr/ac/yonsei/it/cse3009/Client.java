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
import kr.ac.yonsei.it.cse3009.sort.ISortExtension;
import kr.ac.yonsei.it.cse3009.sort.ISortIterator;
import kr.ac.yonsei.it.cse3009.sort.ITypeOfSort;
import kr.ac.yonsei.it.cse3009.sort.decorators.NamingDecorator;
import kr.ac.yonsei.it.cse3009.sort.impl.Factory;

public class Client {
	public static void main(final String[] args) {
		final List<String> l =
			Arrays.asList(new String[] { "Rick Deckard", "Roy Batty",
					"Harry Bryant", "Hannibal Chew", "Gaff", "Holden",
					"Leon Kowalski", "Taffey Lewis", "Pris", "Rachael",
					"J.F. Sebastian", "Dr. Eldon Tyrell", "Zhora", "Hodge",
					"Mary" });
		final CountingObserver<String> observer =
			new CountingObserver<String>();

		final ISort<String> t1 =
			Factory.getInstance().getInternalSortAlgorithms();
		t1.addObserver(observer);
		final ISort<String> d1 = new NamingDecorator(t1);
		d1.addObserver(observer);
		System.out.println(d1.sort(l));

		@SuppressWarnings({ "unchecked", "rawtypes" })
		final ITypeOfSort<String> t2 =
			(ITypeOfSort) Factory.getInstance().getInternalSortAlgorithms();
		t2.addExtension(
			"Statistics",
			(Class<? extends ISortExtension>) CountingExtension.class);
		t2.sort(l);
		final ISortIterator<String> iterator = t2.getSortAlgorithms();
		while (iterator.hasNext()) {
			final ISort<String> sort = iterator.getNext();
			final CountingExtension countingExtension =
				(CountingExtension) sort.getExtension("Statistics");
			System.out.println(countingExtension.getCounts());
		}
	}
}
