package collections.framework;

import java.util.Objects;

public class CredittCard
{
private int sno;
private String name;
private int cvv;
public CredittCard(int sno, String name, int cvv) {
	super();
	this.sno = sno;
	this.name = name;
	this.cvv = cvv;
}
public int getSno() {
	return sno;
}
public void setSno(int sno) {
	this.sno = sno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getCvv() {
	return cvv;
}
public void setCvv(int cvv) {
	this.cvv = cvv;
}
@Override
public String toString() {
	return "CredittCard [sno=" + sno + ", name=" + name + ", cvv=" + cvv + "]";
}
@Override
public int hashCode() {
	return Objects.hash(cvv, name, sno);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	CredittCard other = (CredittCard) obj;
	return cvv == other.cvv && Objects.equals(name, other.name) && sno == other.sno;
}

}
