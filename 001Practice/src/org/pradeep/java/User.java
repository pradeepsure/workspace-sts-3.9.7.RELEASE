package org.pradeep.java;

public class User
{
	private String name;
	private int age;
	private String passport;

	
	 /*@Override public boolean equals(Object o) {
	  
	  if (o == this) return true; if (!(o instanceof User)) { return false; }
	  
	  User user = (User) o;
	  
	  return user.name.equals(name) && user.age == age &&
	  user.passport.equals(passport); }
	  
	  // Idea from effective Java : Item 9
	  
	  @Override public int hashCode() { int result = 17; result = 31 * result +
	  name.hashCode(); result = 31 * result + age; result = 31 * result +
	  passport.hashCode(); return result; }*/
	 

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public String getPassport()
	{
		return passport;
	}

	public void setPassport(String passport)
	{
		this.passport = passport;
	}
	public User(String name, int age, String passport)
	{
		this.name = name;
		this.age = age;
		this.passport = passport;
	}
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((passport == null) ? 0 : passport.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (age != other.age)
			return false;
		if (name == null)
		{
			if (other.name != null)
				return false;
		} 
		else if (!name.equals(other.name))
			return false;
		if (passport == null)
		{
			if (other.passport != null)
				return false;
		} else if (!passport.equals(other.passport))
			return false;
		return true;
	}
	public String toString()
	{
		return "{"+name+" "+age+" "+passport+"}";
	}
}