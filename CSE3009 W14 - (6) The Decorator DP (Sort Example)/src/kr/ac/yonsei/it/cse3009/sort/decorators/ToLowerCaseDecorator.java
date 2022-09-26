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
package kr.ac.yonsei.it.cse3009.sort.decorators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kr.ac.yonsei.it.cse3009.sort.ISort;
import kr.ac.yonsei.it.cse3009.sort.impl.SortDecorator;

public class ToLowerCaseDecorator extends SortDecorator<String> {
	public ToLowerCaseDecorator(final ISort<String> aSortAlgorithm) {
		super(aSortAlgorithm);
	}

	@Override
	public List<String> sort(final List<String> aList) {
		final List<String> newList = new ArrayList<String>();
		final Iterator<String> iterator = aList.iterator();
		while (iterator.hasNext()) {
			final String s = iterator.next();
			newList.add(s.toLowerCase());
		}
		return this.getDecoratedSortAlgorithm().sort(newList);
	}
}
