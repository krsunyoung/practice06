package prob4;

public class MyStack implements Stack {
	
	//Top 스택에 제일 마지막에 올라간 것에 숫자를 알려준다. 

	String[]  i;
	int top;
	
	public MyStack (int size){
		i = new String[size];
	}
	
	@Override
	public void push(String item) {
//		System.out.println(item);
//		System.out.println(top);
		if(top < size()){
		i[top] = item;
		top++;
		}else if ( top >=size()){
			String[] buffer= new String[size() * 2];
			System.arraycopy(i, 0, buffer, 0, top);
			buffer[top]=item;
			top++;
			i = new String[buffer.length];
			System.arraycopy(buffer, 0, i, 0, top);
		}
	}

	@Override
	public String pop() throws MyStackException {
		if(top<=0){
//			MyStackException i2 = new MyStackException();
			throw new MyStackException("massage");
		}
		top--;
		return i[top];
	}

	@Override
	public boolean isEmpty() {
		if (top != 0){
			return false;
		}
		return true;
	}

	@Override
	public int size() {
		return i.length;
	}

}
