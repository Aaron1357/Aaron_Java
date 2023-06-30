package asdcasd;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;
public class Food implements Serializable {

	public static void main(String[] args) {
		Food f = new Food();
		f.fileSave("src/food.txt");
	}
	String name;
	int kcal;
	public Food() {
	}
	public Food(String name, int kcal) {
		this.name = name;
		this.kcal = kcal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKcal() {
		return kcal;
	}
	public void setKcal(int kcal) {
		this.kcal = kcal;
	}
	@Override
	public String toString() {
		return "Food [name=" + name + ", kcal=" + kcal + "]";
	}
	
	public void fileSave(String fileName) {
		Food food = new Food("사과",20);
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName,true));
			oos.writeObject(food);
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	}
	



