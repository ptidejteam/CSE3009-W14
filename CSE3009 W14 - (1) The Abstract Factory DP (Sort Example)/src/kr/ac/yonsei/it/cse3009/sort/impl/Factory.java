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

import kr.ac.yonsei.it.cse3009.sort.ISort;

public class Factory {
	public Factory() {
		// Some implementation if needed...
		// This constructor could take in parameters
		// then getInstance() should have parameters too.
	}

	public <E extends Comparable<E>> ISort<E> getSortAlgorithm() {
		return new InsertionSort<E>();
	}
}
