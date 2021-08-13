package org.dsalgos.linked.list.problem.solutions;

import org.ds.algos.datasructures.node.Node;
import org.ds.algos.datastructures.singlylinked.list.LinkedList;

public class NthNodeFromTail {
	
	public E findNthNodeFromTail(int indexFromTail) {
		Node<E> node = head;
		Node<E> fast = head;
		
		if(indexFromTail < 0 || indexFromTail >= size()) {
			throw new ArrayIndexOutOfBoundsException(indexFromTail);
		}
		
		int index = 0;
		for(; index < indexFromTail; index++) {
			fast = fast.getNext();
		}
		
		for(; fast != null; fast = fast.getNext()) {
			node = node.getNext();
		}
		
		return node.getData();
	}
	
}
