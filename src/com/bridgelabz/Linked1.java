package com.bridgelabz;

import java.util.LinkedList;

public class Linked1 {
	public static void main(String[] args) {
		LinkedList<Integer> llist = new LinkedList<>();
		llist.add(56);
		llist.add(30);
		llist.add(70);
		System.out.println(llist);
		llist.pop();
		System.out.println(llist);
		llist.pollLast();
		System.out.println(llist);
	}
}
