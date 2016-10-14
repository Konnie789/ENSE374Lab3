package kon;

public class ListElement
{
	private int data;
	private ListElement next;
	
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
	
	
	
}