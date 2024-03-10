

public static void insert1(Node<Task> l, Task task1) {
		public static void insert1(Node<Task> l, Task task1) {
		Node<Task>p=l;
		Node<Task>l1 = new Node<Task> (null);
		Node<Task>p1=l1;
		int count =0;
		while(p!=null&&count!=1) {
			if(p.getValue().getPriority()<=task1.getPriority()) {
				p1.setNext(new Node <Task> (p.getValue()));	
				p1=p1.getNext();
				p=p.getNext();
			}
			else {
				p1.setNext(new Node <Task> (task1));
				count++;
			}
		}
		if(count!=1) {
			p1.setNext(new Node <Task> (task1));	
			p1=p1.getNext();
		}
		while(p!=null) {
			p1.setNext(new Node <Task> (p.getValue()));	
			p1=p1.getNext();
			p=p.getNext();
		}

	}
	public static Node<Task> update1(Node<Task> l,int c,boolean b) {
		Node<Task>p= new Node(task1,l) ;
		if(b!=true) {
			l.getNext().getValue().subCredit(c);
			if(l.getNext().getValue().getCredit()<10) {
				l.getNext().getValue().addCredit(100);
			}
		}
		else {
			l.setNext(l.getNext().getNext());;
		}
		return l.getNext();
	}
			
		}
	}
