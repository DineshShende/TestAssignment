package com.svk.web.type;

public class Person {

		
		private long id;
		private String name;
		private String city;
		
		public Person() {
			// TODO Auto-generated constructor stub
		}
		
		public Person(long id,String name,String city) {
			// TODO Auto-generated constructor stub
			this.id=id;
			this.name=name;
			this.city=city;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}
		
		@Override
		public String toString() {
		// TODO Auto-generated method stub
		return "id="+id+" nmae="+name+" city"+city;
		}
}
