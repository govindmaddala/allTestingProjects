public class _1_SingleLinkedList 
{
	public ListNode head;
	public ListNode tail;
	
	public static class ListNode
	{
		public int data;
		public ListNode next;
		
		public ListNode(int data)
		{
			this.data=data;
			this.next=null;
		}	
	}
	
	public void display()
	{
		ListNode temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		System.out.println("null");
	}
	
	public int lengthOfList()
	{
		ListNode temp=head;
		int count=0;
		if(head==null)
		{
			return count;
		}
		else
		{
			while(temp!=null)
			{
				count++;
				temp=temp.next;
			}
			return count;	
		}
	}
	
	public void atBegin(int value)
	{
		ListNode newNode=new ListNode(value);
		newNode.next=head;
		head=newNode;
	}
	
	public void atEnd(int value)
	{
		
		ListNode newNode=new ListNode(value);
		if(head==null)
		{
			head=newNode;
			return;
		}
		ListNode temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=newNode;
//		tail.next=newNode;
//		tail=newNode;
	}
	
	public void atPosition(int i,int value)
	{
		ListNode newNode=new ListNode(value);
		ListNode temp=head;
		
		for(int j=0;j<i;j++)
		{
			temp=temp.next;
		}
		newNode.next=temp.next;
		temp.next=newNode;
	}
	
	public static void main(String[] args) {
		_1_SingleLinkedList link=new _1_SingleLinkedList();
		link.head=new ListNode(10);
		ListNode second=new ListNode(20);
		ListNode third=new ListNode(30);
		ListNode fourth=new ListNode(40);
		//link.tail=fourth;
		
		link.head.next=second;
		second.next=third;
		third.next=fourth;
		
		link.display();
		System.out.println(link.lengthOfList());
		
		//adding at beginning:
		link.atBegin(0);

		link.display();
		System.out.println(link.lengthOfList());
		
		link.atBegin(-10);
		
		link.display();
		System.out.println(link.lengthOfList());
		
		//at ending
		link.atEnd(50);
		link.display();
		System.out.println(link.lengthOfList());
		link.atEnd(60);
		link.atPosition(2, 5);
		link.atPosition(1, 51);
		link.display();
		System.out.println(link.lengthOfList());
		
		System.out.println(second.next.data);
		
		
		
	}
}

// 10-->20-->30-->40-->null

//4

