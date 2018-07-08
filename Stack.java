//JAVA
class intStack
{
	private int stacksize=100;
	private int stackarray[]=new int[stacksize];
	private int top;
	intStack()
	{
		top=-1;
	}
	public void push(int num)
	{
		if(isFull() == true)
		{
			return;
		}
		else
		{
			top++;
			stackarray[top]=num;
		}
	} 
	public int pop()
	{
		if(isEmpty() == true)
		{
			return -1;
		}
		else
		{
			int num=stackarray[top];
			top--;
			return num;	
		}
	}

	public boolean isFull()
	{
		return (top==stacksize-1);
	}
	public boolean isEmpty()
	{
		return (top==-1);
	}
}
public class stack{
	public static void main(String[] args){

		intStack s=new intStack();
		s.push(2);
		s.push(3);
		s.push(5);
		System.out.println(s.pop());
		System.out.println(s.pop());
		s.push(10);
	

	}
}
