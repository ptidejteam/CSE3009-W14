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

class MergeSort<E extends Comparable<E>> extends InternalSort<E> implements
		ISort<E> {

	private void mergeSort(final E[] array) {
		final int arraySize = array.length;
		if (arraySize > 1) {
			final int q = arraySize / 2;

			final E[] leftArray = Arrays.copyOfRange(array, 0, q);
			final E[] rightArray = Arrays.copyOfRange(array, q, array.length);

			this.mergeSort(leftArray);
			this.mergeSort(rightArray);

			this.merge(array, leftArray, rightArray);
		}
	}
	private void merge(
		final E[] array,
		final E[] leftArray,
		final E[] rigthArray) {

		final int size = leftArray.length + rigthArray.length;
		int i = 0;
		int li = 0;
		int ri = 0;

		while (i < size) {
			if ((li < leftArray.length) && (ri < rigthArray.length)) {
				if (leftArray[li].compareTo(rigthArray[ri]) < 0) {
					array[i] = leftArray[li];
					i++;
					li++;
				}
				else {
					array[i] = rigthArray[ri];
					i++;
					ri++;
				}
			}
			else {
				if (li >= leftArray.length) {
					while (ri < rigthArray.length) {
						array[i] = rigthArray[ri];
						i++;
						ri++;
					}
				}
				if (ri >= rigthArray.length) {
					while (li < leftArray.length) {
						array[i] = leftArray[li];
						li++;
						i++;
					}
				}
			}
		}
	}
	public String getName() {
		return "MergeSort";
	}
	public List<E> sort(final List<E> aList) {
		final E[] array = this.convertListToArray(aList);
		this.mergeSort(array);
		return Arrays.asList(array);
	}
}
