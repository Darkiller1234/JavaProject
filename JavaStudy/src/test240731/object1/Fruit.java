package test240731.object1;

public class Fruit extends Farm{
	private String name;

	public Fruit(String kind, String name) {
		super(kind);
		this.name = name;
	}

	public Fruit() {
		super();
	}

	@Override
	public String toString() {
		return super.getKind() + " : " +  name;
	}

	@Override
	public String getKind() {
		// TODO Auto-generated method stub
		return super.getKind();
	}

	@Override
	public void setKind(String kind) {
		// TODO Auto-generated method stub
		super.setKind(kind);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (this.getKind()+this.name).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Fruit) {
			Fruit f = (Fruit)obj;
			if(this.getKind().equals(f.getKind()) && this.name.equals(f.getName())) {
				return true;
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
