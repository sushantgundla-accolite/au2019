package com.accolite.au.java;

import java.util.Scanner;

public class DataStructures {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("\n1. Stack\n2. LinkedHashMap");
		int choice = scanner.nextInt();

		if (choice == 1) {
			System.out.println("What is the maximum capacity of the Stack?");
			Integer capacity = scanner.nextInt();
			while (capacity < 1) {
				capacity = scanner.nextInt();
			}

			Stack stack1 = new Stack(capacity);

			while (true) {
				System.out.println("\n1. Push\n2. Pop\n3. isEmpty?\n4. isFull?\n5. Size\n6. Display Top\n0. Exit");
				System.out.print("\nWhat You Wanna Do?");
				Integer input = scanner.nextInt();

				switch (input) {
				case 0:
					System.out.println("Bubye!");
					System.exit(1);
				case 1:
					System.out.print("\nValue?");
					Integer value = scanner.nextInt();
					stack1.push(value);
					break;
				case 2:
					System.out.print("\nPopped Element: ");
					System.out.println(stack1.pop());
					break;
				case 3:
					if (stack1.isEmpty()) {
						System.out.println("\nStack is Empty");
					} else {
						System.out.println("\nStack is not Empty");
					}
					break;
				case 4:
					if (stack1.isFull()) {
						System.out.println("\nStack is Full");
					} else {
						System.out.println("\nStack is not Full");
					}
					break;
				case 5:
					System.out.println(stack1.size());
					break;
				case 6:
					stack1.displayTop();
					break;
				default:
					System.out.println("\nWrong Input");
					break;
				}
			}
		}
		if (choice == 2) {
			System.out.println("What are the number of buckets?");
			Integer buckets = scanner.nextInt();
			while (buckets < 1) {
				System.out.println("Buckets should be bigger than 0");
				buckets = scanner.nextInt();
			}
			
			LinkedHashMap lhm1 = new LinkedHashMap(buckets);

			while (true) {
				System.out.println("\n1. Put\n2. Get\n3. Delete\n4. Display\n0. Exit");
				System.out.print("\nWhat You Wanna Do?");
				Integer input = scanner.nextInt();

				switch (input) {
				case 0:
					System.out.println("Bubye!");
					System.exit(1);
				case 1:
					System.out.print("\nKey?");
					Integer key = scanner.nextInt();
					System.out.print("\nValue?");
					String value = scanner.next();
					lhm1.put(key,value);
					break;
				case 2:
					System.out.print("\nKey?");
					Integer key1 = scanner.nextInt();
					Entry entry = lhm1.get(key1);
					System.out.print(entry.key);
					System.out.print("-");
					System.out.println(entry.value);
					break;
				case 3:
					System.out.print("\nKey?");
					Integer key2 = scanner.nextInt();
					lhm1.delete(key2);
					break;
				case 4:
					lhm1.display();
					break;
				default:
					System.out.println("\nWrong Input");
					break;
				}
			}			
		}
		scanner.close();
	}
}

class Stack {

	Integer[] stack;
	Integer top;
	Integer capacity;

	Stack(Integer capacity) {
		this.top = -1;
		this.capacity = capacity;
		this.stack = new Integer[capacity];
	}

	void push(Integer value) {
		if (this.top < capacity - 1) {
			this.top = this.top + 1;
			this.stack[this.top] = value;
		} else {
			System.out.println("\nStack is full - Cannot add more elements");
		}
	}

	Integer pop() {
		if (this.top >= 0) {
			Integer popedElement = this.stack[this.top];
			this.top = this.top - 1;
			return popedElement;
		} else {
			System.out.println("No elements to remove from the stack");
			return -1;
		}
	}

	void displayTop() {
		if (!this.isEmpty()) {
			System.out.println(this.stack[this.top]);
		} else {
			System.out.println("Stack is Empty");
		}
	}

	Boolean isFull() {
		if (this.top == this.capacity - 1) {
			return true;
		} else {
			return false;
		}
	}

	Boolean isEmpty() {
		if (this.top == -1) {
			return true;
		} else {
			return false;
		}
	}

	Integer size() {
		return top + 1;
	}
}

class Queue {
	Integer front, rear, capacity;
	Integer queue[];

	Queue(Integer capacity) {
		this.front = this.rear = 0;
		this.queue = new Integer[capacity];
		this.capacity = capacity;
	}

	void enqueue(Integer value) {
		if (this.rear == this.capacity) {
			System.out.println("Queue full");
		} else {
			this.queue[this.rear] = value;
			this.rear++;
		}
	}

	void dequeue() {
		if (this.front == this.rear) {
			System.out.println("Queue empty");
		} else {
			for (int i = 0; i < this.rear - 1; i++) {
				this.queue[i] = this.queue[i + 1];
			}
			this.queue[this.rear] = 0;
			this.rear--;
		}
		return;
	}

	void display() {
		int i;
		if (this.front == this.rear) {
			System.out.println("Queue is Empty");
		}
		for (i = this.front; i < this.rear; i++) {
			System.out.printf(" %d <-- ", this.queue[i]);
		}
		return;
	}
}

class Entry {
	Integer key;
	String value;
	Entry next;
	Entry after;

	Entry(Integer k, String v) {
		this.key = k;
		this.value = v;
	}
}

class LinkedHashMap {

	Integer buckets, size;
	Entry table[];
	Entry header, last;

	LinkedHashMap(int buckets) {
		this.buckets = buckets;
		this.size = 0;
		this.table = new Entry[buckets];
	}

	Integer generateHash(Integer key) {

		return ((key * 7) + 29) * 7;
	}

	Entry get(Integer key) {
		int hash = generateHash(key) % this.buckets;
		Entry entry = table[hash];

		while (entry != null) {
			if (entry.key.equals(key)) {
				return entry;
			}
			entry = entry.next;
		}
		return null;
	}

	void put(Integer key, String value) {
		int hash = generateHash(key) % this.buckets;
		Entry entry = this.table[hash];

		if (entry == null) {
			Entry new_entry = new Entry(key, value);
			this.table[hash] = new_entry;
			if (size == 0) {
				header = new_entry;
				last = new_entry;
			} else {
				last.after = new_entry;
				last = last.after;
			}
			this.size++;
		} else {
			if (entry.key.equals(key)) {
				entry.value = value;
			} else {
				while (entry.next != null) {
					if (entry.key.equals(key)) {
						entry.value = value;
					}
					if (entry.next.key.equals(key)) {
						this.delete(key);
						this.put(key, value);
						return;
						//entry.next.value = value;
					}
					entry = entry.next;
				}
				Entry new_entry = new Entry(key, value);
				entry.next = new_entry;
				if (size == 0) {
					header = new_entry;
					last = new_entry;
				} else {
					last.after = new_entry;
					last = last.after;
				}
				this.size++;
			}
		}
	}

	void display() {
		Entry temp = this.header;
		if(temp == null){
			System.out.println("Linked Hash Map is empty");
			return;
		}
		while (temp != null) {
			System.out.print(temp.key);
			System.out.print("-");
			System.out.println(temp.value);
			temp = temp.after;
		}
	}

	void delete(Integer key) {
		int hash = generateHash(key) % this.buckets;
		Entry entry = this.table[hash];
		Entry deletedEntry = null;
		if(entry!=null) {
			if(entry.key.equals(key)) {
				deletedEntry = entry;
				table[hash] = entry.next;
			}
			else {
				Entry previous = entry, current = entry.next;
				while(current!= null) {
					if(current.key.equals(key)) {
						deletedEntry = current;
						previous.next = current.next;
					}
					previous = previous.next;
					current = current.next;
				}
			}
		}
		if(deletedEntry==null) {
			System.out.println("\nKey not found");
		}
		
		Entry temp = header;
		if(header.key.equals(key)) {
			header = header.after;
		}
		else {
			while(header!= null && header.after!=null) {
				if(header.after.key.equals(key)) {
					header.after = header.after.after;
				}
				header = header.after;
			}
			header = temp;
		}	
	}
}
