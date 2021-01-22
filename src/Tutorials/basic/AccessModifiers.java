package Tutorials.basic;

public class AccessModifiers {
	public static void main(String[] args) {
		
	}
	
	//private most restrictive
	//default
	//protected
	//public least protected
	
	private int x;
	public int y;
	
	// public visibility - can be accessed anywhere so long as you use an instance
	//of this class to call it
	public void doSOmethigPublic() {
		
	}
	// private visibility can't be accessed anywhere other then inside this class
	private void doSometingPrivate() {
		
	}
	// protected- this method can only be accessed inside this package and from subclasses of this class
	protected void doSomethingProtected() {
	
	}
	// default visibility means this method can only be accessed inside this package
	void doSomething() {
		
	}

}
