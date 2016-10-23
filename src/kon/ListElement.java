package kon;

public class ListElement
{
	private int data;
	private int length;
	private ListElement head;
	private ListElement next;
	
	
	public Listelement()
	{
		this.data = 0;
		this.length = 0;
		this.head = null;
		this.next = null;
	}
	
	public ListElement(int data, ListElement next)
	{
		this.data = data;
		this.next = next;
	}
	
	public void setData(int data)
	{
		this.data = data;
	}
	
	public int getData()
	{
		return this.data; 
	}
	public void setNext(ListElement le)
	{
		this.next = le;
	}
	
	public ListElement getNext()
	{
		return this.next;
	}
	
	public void addElement(ListElement le)
	{
		listElement addToArray = new listElement();
		
		if(this.head == null)
		{
			this.head = le;
		}
		
		else 
		{
			for(ListElement i = head; i.getNext() != null; i = i.getNext())
			{
				addToArray = i;
			}
			length = length + 1;
		}
	}
	
	public ListElement getElement(int index)
	{
		ListElement result = new ListElement();
		
		if(index < 0 || index >= length)
		{
			result = null;
		}
		
		else 
		{
			result = head;
			for(int i = 0; i <= index; i++)
			{
				result = result.getNext();
			}
		}
		
		return result;
	}
	
	public ListElement deleteElement(int index)
	{
		ListElement temp =   new ListElement();
		ListElement result = new ListElement();
		
		if(index < 0 || index >= length)
		{
			result = null;
		}
		
		if(index == 0)
		{
			head = head.getNext();
			length = length - 1;
		}
		
		else 
		{
			for(int i = 0; i <= length; i++)
			{
				temp = temp.getNext();
			}
			
			temp.setNext(temp.getNext());
			length = length - 1;
		}
		
		return index;
	}
	
	public void printList()
	{
		ListElement temp = new ListElement();
		head = temp;
		
		if(length == 0)
		{
			System.out.println("Empty List");
		}
		
		else 
		{	
			for(int i = 0; i <= length; i++)
			{
				System.out.println("Element selected in this List to print is : " + temp.getData());
			}
		}
	}
}
