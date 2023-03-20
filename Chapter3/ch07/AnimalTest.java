package ch07;

import java.util.ArrayList;

class Animal{

	public void move() {
		System.out.println("동물이 움직입니다.");
	}
	
	public void eating() {
		
	}
}

class Human extends Animal{
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
			
}

class Tiger extends Animal{
	
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal{
	
	public void move() {
		System.out.println("독수리가 하늘을 날아 다닙니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 양날개를 쭉 펴고 날아다닙니다.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal hAnimal = new Human(); //객체 선언
		Animal tAnimal = new Tiger();
		Animal eAnimal = new Eagle();
		
		AnimalTest test = new AnimalTest();
//		test.moveAnimal(hAnimal);
//		test.moveAnimal(tAnimal);
//		test.moveAnimal(eAnimal);
		
		ArrayList<Animal> animalList = new ArrayList<>(); //배열
		animalList.add(hAnimal);
		animalList.add(tAnimal);
		animalList.add(eAnimal);
		
		for(Animal animal : animalList) {
			animal.move();
		}
		
		test.testDownCasting(animalList);
	}
	
	public void testDownCasting(ArrayList<Animal> list) { //다운캐스팅 원래 상태로 돌아감
		
		for(int i = 0; i<list.size(); i++) { //배열 리스트에 있는 목록 반복 
			
			Animal animal = list.get(i);
			
			if(animal instanceof Human) {
				Human human = (Human)animal; //객체 선언
				human.readBook();
			}
			else if(animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
			}
			else if(animal instanceof Eagle) {
				Eagle ealge = (Eagle)animal;
				ealge.flying();
			}
			else {
				System.out.println("unsupported type");
			}
		}
		
	}
	
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}

}
