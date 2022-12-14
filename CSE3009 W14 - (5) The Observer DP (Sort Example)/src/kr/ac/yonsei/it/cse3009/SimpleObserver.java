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

import kr.ac.yonsei.it.cse3009.sort.observer.ComparisonEvent;
import kr.ac.yonsei.it.cse3009.sort.observer.ISortObserver;
import kr.ac.yonsei.it.cse3009.sort.observer.SwapEvent;

public class SimpleObserver<E extends Comparable<E>> implements
		ISortObserver<E> {

	@Override
	public void valuesCompared(final ComparisonEvent<E> comparisonEvent) {
		System.out.println(comparisonEvent);
	}
	@Override
	public void valuesSwapped(final SwapEvent<E> swapEvent) {
		System.out.println(swapEvent);
	}
}
