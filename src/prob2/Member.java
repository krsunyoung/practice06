package prob2;

public class Member {
	private String id;
	private String name;

	public Member() {

	}

	public Member(String a, String b) {
		this.id = a;
		this.name = b;
	}

	@Override
	public String toString() {
		String a =  getId() + ": "+getName();
		return a;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
