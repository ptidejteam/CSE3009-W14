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

class QuickSort<E extends Comparable<E>> extends InternalSort<E> implements
		ISort<E> {

	public String getName() {
		return "QuickSort";
	}
	private int partition(final E[] array, int p, int r) {
		final E x = array[p];
		int i = p - 1;
		int j = r + 1;

		while (true) {
			i++;
			while (i < r && array[i].compareTo(x) < 0) {
				i++;
			}
			j--;
			while (j > p && array[j].compareTo(x) > 0) {
				j--;
			}

			if (i < j) {
				this.swap(array, i, j);
			}
			else {
				return j;
			}
		}
	}
	public void quickSort(final E[] array, final int p, final int r) {
		if (p < r) {
			final int q = this.partition(array, p, r);
			this.quickSort(array, p, q);
			this.quickSort(array, q + 1, r);
		}
	}
	public List<E> sort(final List<E> aList) {
		final E[] array = this.convertListToArray(aList);
		this.quickSort(array, 0, array.length - 1);
		return Arrays.asList(array);
	}
	private void swap(final E[] a, int i, int j) {
		final E temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
