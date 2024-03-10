

public static void insert1(Node<Task> l, Task task1) {
		Node<Task>p=l;
		Node<Task>l1 = new Node<Task> (null);
		Node<Task>p1=l1;
		int count =0;
		while(p!=null&&count!=1) {
			if(p.getValue().getPriority()<=task1.getPriority()) {
				p1.setNext(new Node <Task> (p.getValue()));	
			}
			else {
				p1.setNext(new Node <Task> (task1));
				count++;
			}
		}
		if(count!=1) {
			p1.setNext(new Node <Task> (task1));	
		}
		while(p1!=null) {
			p1.setNext(new Node <Task> (p.getValue()));	
		}

	}
	public static void update1(Node<Task> l,int c,boolean b) {
		Node<Task>p= new Node(-1,l) ;
		if(b!=true) {
			l.getNext().getValue().subCredit(c);
			if(l.getNext().getValue().getCredit()<10) {
				l.getNext().getValue().addCredit(100);
			}
		}
		else {
			l.setNext(l.getNext().getNext());;
		}
	}
}
			
		}
	}
