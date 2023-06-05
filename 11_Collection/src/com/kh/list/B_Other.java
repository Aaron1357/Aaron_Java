package com.kh.list;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

import javax.sql.rowset.serial.SQLOutputImpl;

public class B_Other {

	public static void main(String[] args) {

		B_Other b = new B_Other();
         b.method1();
         b.method2();
         b.method3();
	}

	public void method1() {
       //Vector 
		Vector v = new Vector();
		
		
		v.add(0);
		v.add(1);
		v.add(3);
		v.add(4);
	    v.setSize(10);
		v.trimToSize();
		
		v.ensureCapacity(5);
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
		
	}
	
	
	public void method2() {
		//스택 (Stack)
//		-마지막에 저장한 것을 제일 먼저 꺼내는 LIFO 구조
		
		Stack s = new Stack();
		s.push(0);
		s.push(1);
		s.push(2);
		s.pop();
		s.push(4);
		
		System.out.println(s);
	}
	
	public void method3() {
		//큐(Queue) 선입선출 구조
		Queue q = new LinkedList();
		q.offer(0);
		q.poll();
		q.offer(1);
		q.offer(2);
		q.poll();
		q.offer(3);
		q.offer(4);
		q.poll();
		q.offer(5);
		q.offer(6);
		q.add(4);
		System.out.println(q);
	}
}


