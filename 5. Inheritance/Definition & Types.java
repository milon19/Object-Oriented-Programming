
/*
 * Inheritance is a process in which a class acquires the 
 * accessibility property of another class.
 * 
 *IS-A or Parent-Child Relationship.
 * 
 * */
public class A {
	int n;
}


public class B extends A{
	int a;
}
 // Class B will have both a and n;

/* Types:
 * 
 *	1. Single. ex: A -> B
 *  2. Multilevel. ex: A -> B -> C
 *  3. Hierarchical. ex: A -> C & B -> C
 *  4. Multiple. ex: A -> B & C. Not possible in java if use class. interface support this.
 *  5. Hybrid.
 *  
 * */
