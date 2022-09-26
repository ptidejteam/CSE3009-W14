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

import java.util.List;

abstract class AbstractSort<E> {
	protected E[] convertListToArray(final List<E> aList) {
		// See http://stackoverflow.com/a/6522958
		// See http://stackoverflow.com/a/3617972
		@SuppressWarnings("unchecked")
		final E[] array =
			(E[]) java.lang.reflect.Array.newInstance(
				aList.get(0).getClass(),
				aList.size());
		for (int i = 0; i < aList.size(); i++) {
			array[i] = aList.get(i);
		}
		return array;
	}
	
	protected void someHelperMethod() {
		// Some implementation...
	}
}
