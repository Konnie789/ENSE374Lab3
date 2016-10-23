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
			length++;
		}
	}
	
	public 
	
	
}
