package javaBackend01.hibernateProject;



@javax.persistence.Embeddable
public class Marks {
private int  computer;
private int maths;
private int physics;
public int getComputer() {
	return computer;
}
public void setComputer(int computer) {
	this.computer = computer;
}
public int getMaths() {
	return maths;
}
public void setMaths(int maths) {
	this.maths = maths;
}
public int getPhysics() {
	return physics;
}
public void setPhysics(int physics) {
	this.physics = physics;
}
}
