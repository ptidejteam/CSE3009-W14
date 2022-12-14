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
package kr.ac.yonsei.it.cse3009.sort.impl;

import java.util.Arrays;
import java.util.List;
import kr.ac.yonsei.it.cse3009.sort.ISort;

class SelectionSort<E extends Comparable<E>> extends InternalSort<E> implements
		ISort<E> {

	public List<E> sort(final List<E> aList) {
		final E[] array = this.convertListToArray(aList);
		final int arraySize = array.length;

		for (int i = 0; i < array.length; i++) {
			int min = i;
			for (int j = i + 1; j < arraySize; j++) {
				if (array[j].compareTo(array[min]) < 0) {
					min = j;
				}
			}
			if (min != i) {
				final E temp = array[i];
				array[i] = array[min];
				array[min] = temp;
			}
		}

		return Arrays.asList(array);
	}
	public String getName() {
		return "SelectionSort";
	}
}
