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
import kr.ac.yonsei.it.cse3009.sort.ISort;
import kr.ac.yonsei.it.cse3009.sort.ISortExtension;
import kr.ac.yonsei.it.cse3009.sort.observer.ISortObserver;

public abstract class SortDecorator<E extends Comparable<E>> extends
		AbstractSort<E> implements ISort<E> {

	private final ISort<E> decoratedSortAlgorithm;

	public SortDecorator(final ISort<E> aSortAlgorithm) {
		this.decoratedSortAlgorithm = aSortAlgorithm;
	}
	@Override
	public final void addExtension(
		final String anExtensionName,
		final Class<? extends ISortExtension> anExtensionClass) {

		this.decoratedSortAlgorithm.addExtension(
			anExtensionName,
			anExtensionClass);
	}
	@Override
	public final void addObserver(final ISortObserver<E> anObserver) {
		this.decoratedSortAlgorithm.addObserver(anObserver);
	}
	protected List<E> postProcessOutput(final List<E> sortedList) {
		return sortedList;
	}
	protected List<E> preProcessInput(final List<E> aList) {
		return aList;
	}
	@Override
	public final List<E> sort(final List<E> aList) {
		final List<E> preList = this.preProcessInput(aList);
		final List<E> sortedList = this.decoratedSortAlgorithm.sort(preList);
		final List<E> postList = this.postProcessOutput(sortedList);

		return postList;
	}
}
