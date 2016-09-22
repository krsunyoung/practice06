package prob4;

public class MyStack implements Stack {
	
	public MyStack (int size){
	//.setLength(size);
	}
	
	@Override
	public void push(String item) {
		System.out.println(item);
	}

	@Override
	public String pop() throws MyStackException {
		return null;
	}

	@Override
	public boolean isEmpty() {
		return true;
	}

	@Override
	public int size() {
		
		return 0;
	}

}
