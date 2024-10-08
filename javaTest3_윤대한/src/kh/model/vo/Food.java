package kh.model.vo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;

public class Food implements Serializable{
	private String name;
	private int kcal;
	public Food() {
		super();
	}
	public Food(String name, int kcal) {
		super();
		this.name = name;
		this.kcal = kcal;
	}
	public String getName() {
		return name;
	}
	public int getKcal() {
		return kcal;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setKcal(int kcal) {
		this.kcal = kcal;
	}
	@Override
	public String toString() {
		return "Food 객체 샘플 : \"" + name + "\", " + kcal;
	}
	
	public void fileSave(String fileName) {
		try (FileWriter fw = new FileWriter(fileName, true);){
			fw.write(this.toString());
			fw.write(97);
			fw.write(65);
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
