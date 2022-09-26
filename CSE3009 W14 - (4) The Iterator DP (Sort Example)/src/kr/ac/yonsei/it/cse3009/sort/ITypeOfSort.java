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
package kr.ac.yonsei.it.cse3009.sort;

import java.util.List;

public interface ITypeOfSort<E extends Comparable<E>> extends ISort<E> {
	public ISortIterator<E> getSortAlgorithms();
	public String getTypeName();
	public List<E> sort(final List<E> aList);
}
